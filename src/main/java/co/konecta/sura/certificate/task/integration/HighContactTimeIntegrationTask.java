package co.konecta.sura.certificate.task.integration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.integration.HighContactTimesIntegrationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HighContactTimeIntegrationTask implements Task {
    String line;
    String management;

    public HighContactTimeIntegrationTask(String line, String management) {
        this.line = line;
        this.management = management;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_INTEGRATION),
                Enter.theValue(line).into(INPUT_SEARCH_LINE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SEARCH_INTEGRATION),
                WaitUntil.the(BUTTON_ACTIONS_INTEGRATION, isVisible()).forNoMoreThan(500).milliseconds(),
                Click.on(BUTTON_ACTIONS_INTEGRATION),
                Click.on(INPUT_MANAGEMENT_INTEGRATION),
                Enter.theValue(management).into(INPUT_SEARCH_MANAGEMENT_INTEGRATION).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_INTEGRATION)

        );

    }
    public static HighContactTimeIntegrationTask writeInformationHighContact(String line, String management){
        return instrumented(HighContactTimeIntegrationTask.class,line,management);
    }
}
