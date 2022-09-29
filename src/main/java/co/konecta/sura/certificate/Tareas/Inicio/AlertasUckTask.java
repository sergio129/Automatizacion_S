package co.konecta.sura.certificate.Tareas.Inicio;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


@AllArgsConstructor
    public class AlertasUckTask implements Task {

    public String nombrealerta;
    public String linea;
    public String servicio;
    public String estadoservicio;
    public String guardianes;
    public String flujosespeciales;
    public String tipomonitoreo;




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NOMBRE_ALERTA_UCK),
                Enter.theValue(nombrealerta).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_LINEA),
                Enter.theValue(linea).into(BUSCAR_ALERTA_UCK),
                Click.on(SELECCIONAR_LINEA_ALERTA_UCK.of(String.valueOf(linea))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA),
                Click.on(CAMPO_SERVICIO),
                Enter.theValue(servicio).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_ESTADOO_SERVICIO),
                Enter.theValue(estadoservicio).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_GUARDIANES),
                Enter.theValue(guardianes).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_FLUJO_ESPECIALES),
                Enter.theValue(flujosespeciales).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_TIPO_MONITOREO),
                Enter.theValue(tipomonitoreo).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)

        );
    }

    public static AlertasUckTask withInformationAlerta(String nombrealerta, String linea, String servicio, String estadoservicio, String guardianes, String flujosespeciales, String tipomonitoreo) {
        return instrumented(AlertasUckTask.class, nombrealerta, linea, servicio, estadoservicio, guardianes, flujosespeciales, tipomonitoreo);
    }



    }
