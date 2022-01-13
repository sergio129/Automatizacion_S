package co.konecta.sura.certificate.task.Integracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.Integracion.TiemposAltosDeContactoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HighContactTimeIntegrationTask implements Task {
    String line;
    String management;
    String servicio;
    String municipio;
    String familia;


    public HighContactTimeIntegrationTask(String line, String management, String servicio, String municipio, String familia) {
        this.line = line;
        this.management = management;
        this.servicio = servicio;
        this.municipio = municipio;
        this.familia = familia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_INTEGRATION),
                Enter.theValue(line).into(INPUT_SEARCH_LINE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(SELECCION_CAMPO_SERVICIO),
                Enter.theValue(servicio).into(BUSCAR_SERVICIO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(SELECCION_CAMPO_MUNICIPIO),
                WaitUntil.the(BUSCAR_MUNICIPIO, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(municipio).into(BUSCAR_MUNICIPIO).thenHit(Keys.ENTER).thenHit(Keys.SPACE),
                Click.on(SELECCION_CAMPO_FAMILIA),
                Enter.theValue(familia).into(BUSCAR_FAMILIA).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SEARCH_INTEGRATION),
                WaitUntil.the(BUTTON_ACTIONS_INTEGRATION, isVisible()).forNoMoreThan(500).milliseconds(),
                Click.on(BUTTON_ACTIONS_INTEGRATION),
                Click.on(INPUT_MANAGEMENT_INTEGRATION),
                Enter.theValue(management).into(INPUT_SEARCH_MANAGEMENT_INTEGRATION).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_INTEGRATION)

        );

    }

    public static HighContactTimeIntegrationTask writeInformationHighContact(String line, String management, String servicio, String municipio, String familia) {
        return instrumented(HighContactTimeIntegrationTask.class, line, management, servicio,municipio,familia);
    }
}
