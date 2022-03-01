package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.AlertasUCKPage.*;

@AllArgsConstructor
public class AlertasUCKTask implements Task {
    private String Nombre, Linea, Servicio, Guardianes, FlujoE, EstadoS, TMonitoreo, Cordinacion, EstadoExp, Proveedor, TareasM;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Enter.theValue(Nombre).into(CAMPO_NOMBRE_PARAMETRIZACION_ALERTAS_UCK),
                Click.on(TITULO),
                Click.on(CAMPO_LINEA_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(Linea).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK),
                Click.on(SELECCIONAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK.of(String.valueOf(Linea))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA_PARAMETRIZACION_ALERTAS_UCK),
                Click.on(CAMPO_TIPO_SERVICIO_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(Servicio).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_GUARDIANES_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(Guardianes).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_FLUJO_ESPECIAL_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(FlujoE).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_ESTADO_SERVICIO_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(EstadoS).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK),
                Click.on(SELECCIONAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK.of(String.valueOf(EstadoS))),
                Hit.the(Keys.ESCAPE).into(CAMPO_ESTADO_SERVICIO_PARAMETRIZACION_ALERTAS_UCK),
                Click.on(CAMPO_TIPO_MONITOREO_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(TMonitoreo).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_GESTOR_CORDINACION_PARAMETRIZACION_ALERTAS_UCK),
                Enter.theValue(Cordinacion).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        if (CAMPO_ESTADO_CIERRE_EXPEDIENTE_PARAMETRIZACION_ALERTAS_UCK.resolveFor(actor).isVisible()) {
            actor.has(
                    Click.on(CAMPO_ESTADO_CIERRE_EXPEDIENTE_PARAMETRIZACION_ALERTAS_UCK),
                    Enter.theValue(EstadoExp).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                    Click.on(CAMPO_PROVEEDOR_PARAMETRIZACION_ALERTAS_UCK),
                    Enter.theValue(Proveedor).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                    Click.on(CAMPO_TAREAS_MONITOREO_PARAMETRIZACION_ALERTAS_UCK),
                    Enter.theValue(TareasM).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
            actor.has(
                    Click.on(CAMPO_PROVEEDOR_PARAMETRIZACION_ALERTAS_UCK),
                    Enter.theValue(Proveedor).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                    Click.on(CAMPO_TAREAS_MONITOREO_PARAMETRIZACION_ALERTAS_UCK),
                    Enter.theValue(TareasM).into(BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)
            );
        }




    public static AlertasUCKTask EscribirInformacionAlertaUCK(String Nombre, String Linea, String Servicio, String Guardianes, String FlujoE, String EstadoS, String TMonitoreo, String Cordinacion, String EstadoExp, String Proveedor, String TareasM) {
        return new AlertasUCKTask(Nombre, Linea, Servicio, Guardianes, FlujoE, EstadoS, TMonitoreo, Cordinacion, EstadoExp, Proveedor, TareasM);
    }
}
