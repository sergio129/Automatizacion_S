package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.ExitCodeParameterizationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ExitCodeParameterizationTask implements Task {
    String line;
    String code;

    public ExitCodeParameterizationTask(String line, String code) {
        this.line = line;
        this.code = code;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_EXIT_CODE),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_EXIT_CODE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Enter.theValue(code).into(EXIT_CODE)

        );

    }

    public static ExitCodeParameterizationTask withInformationExitCode(String line, String code) {
        return instrumented(ExitCodeParameterizationTask.class, line, code);
    }
}
