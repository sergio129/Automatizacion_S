package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.DialingCodesParameterizationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DialingCodesParameterizationTask implements Task {
    String department;
    String municipality;
    String indicative;

    public DialingCodesParameterizationTask(String department, String municipality, String indicative) {
        this.department = department;
        this.municipality = municipality;
        this.indicative = indicative;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_DEPARTMENT_DEALING),
                Enter.theValue(department).into(INPUT_SEARCH_DEPARTMENT_DEALING),
                Click.on(BUTTON_SELECT_DEALING));
        actor.attemptsTo(Click.on(INPUT_MUNICIPALITY_DEALING),
                Enter.theValue(municipality).into(INPUT_SEARCH_MUNICIPALITY_DEALING).thenHit(Keys.ENTER),
                Enter.theValue(indicative).into(WHITE_INDICATIVE_DEALING),
                Click.on(BUTTON_SAVE_DEALING));

    }

    public static DialingCodesParameterizationTask WriteInformationDialingCodesParameterizationTask(String department, String municipality, String indicative) {
        return instrumented(DialingCodesParameterizationTask.class, department, municipality, indicative);
    }
}
