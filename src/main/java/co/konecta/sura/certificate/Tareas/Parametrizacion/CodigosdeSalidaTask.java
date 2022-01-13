package co.konecta.sura.certificate.Tareas.Parametrizacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CodigosdeSalidaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CodigosdeSalidaTask implements Task {
    String line;
    String code;

    public CodigosdeSalidaTask(String line, String code) {
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

    public static CodigosdeSalidaTask withInformationExitCode(String line, String code) {
        return instrumented(CodigosdeSalidaTask.class, line, code);
    }
}
