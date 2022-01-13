package co.konecta.sura.certificate.Tareas.Integracion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Integracion.TiemposAltosDeContactoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TiemposAltosdeContactoTask implements Task {
    String line;
    String management;
    String servicio;
    String municipio;
    String familia;


    public TiemposAltosdeContactoTask(String line, String servicio, String municipio, String familia, String management) {
        this.line = line;
        this.servicio = servicio;
        this.municipio = municipio;
        this.familia = familia;
        this.management = management;
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
                Enter.theValue(municipio).into(BUSCAR_MUNICIPIO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
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

    public static TiemposAltosdeContactoTask writeInformationHighContact(String line, String management, String servicio, String municipio, String familia) {
        return instrumented(TiemposAltosdeContactoTask.class, line, management, servicio, municipio, familia);
    }
}
