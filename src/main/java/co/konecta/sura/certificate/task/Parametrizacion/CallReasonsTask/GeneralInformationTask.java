package co.konecta.sura.certificate.task.Parametrizacion.CallReasonsTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.Parametrizacion.CallReasonsParameterizationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GeneralInformationTask implements Task {
    public String name;
    public String line;
    public String finalmanagement;



    public GeneralInformationTask(String name, String line, String finalmanagement) {
        this.name = name;
        this.line = line;
        this.finalmanagement=finalmanagement;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME_CALL_REASONS),
                Click.on(INPUT_SELECT_TYPE_CALL_REASONS),
                Click.on(SELECT_GENERAL_INFORMATION_CALL_REASONS),
                Click.on(INPUT_LINE_CALL_REASONS),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_CALL_REASONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SELECT_FINAL_MANAGE_CALL_REASONS));
        actor.attemptsTo(
                Ensure.that(OPTION_FINAL_MANAGE_CALL_REASONS).text().contains((finalmanagement)),
            Click.on(SELECT_FINAL_MANAGE_CALL_REASONS)

        );

                actor.attemptsTo(
                        Ensure.that(OPTION_FINAL_MANAGE_CALL_REASONS).text().isNotEqualTo(finalmanagement),
                        Click.on(OPTION_FINAL_MANAGE_CALL_REASONS)

                        );

               actor.attemptsTo(Click.on(BUTTON_ADD_CALL_REASONS),
                Click.on(OPTION_YES_SELECT_VALIDATION_CALL_REASONS));

    }

    public static GeneralInformationTask whiteGeneralInformation(String name, String line, String finalmanagement) {
        return instrumented(GeneralInformationTask.class, name, line, finalmanagement);
    }
}
