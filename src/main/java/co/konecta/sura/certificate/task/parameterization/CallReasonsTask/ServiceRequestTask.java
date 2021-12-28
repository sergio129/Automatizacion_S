package co.konecta.sura.certificate.task.parameterization.CallReasonsTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.CallReasonsParameterizationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ServiceRequestTask implements Task {
    public String name;
    public String line;

    public ServiceRequestTask(String name, String line) {
        this.name = name;
        this.line = line;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME_CALL_REASONS),
                Click.on(INPUT_SELECT_TYPE_CALL_REASONS),
                Click.on(SELECT_SERVICE_REQUEST_CALL_REASONS),
                Click.on(INPUT_LINE_CALL_REASONS),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_CALL_REASONS).thenHit(Keys.ESCAPE),
                Click.on(SELECT_VALIDATION_CALL_REASONS),
                Click.on(BUTTON_AMOUNT_CALL_REASONS)
        );

    }

    public static ServiceRequestTask writeInformationServiceRequest(String name, String line) {
        return instrumented(ServiceRequestTask.class, name, line);
    }

}
