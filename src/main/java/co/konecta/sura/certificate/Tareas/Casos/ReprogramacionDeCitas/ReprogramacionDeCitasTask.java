package co.konecta.sura.certificate.Tareas.Casos.ReprogramacionDeCitas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.ReprogramacionDeCitas.ReprogramacionDeCitasPage.*;

@AllArgsConstructor
public class ReprogramacionDeCitasTask implements Task {
    private String Motivo, Solicitante, NuevaCita, Hora, Observacion;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Click.on(CAMPO_MOTIVO_REPROGRAMACION_CITAS),
                Enter.theValue(Motivo).into(BUSCAR_MOTIVO_REPROGRAMACION_CITAS).thenHit(Keys.ENTER),
                Click.on(CAMPO_SOLICITANTE_REPROGRAMACION_CITAS),
                Enter.theValue(Solicitante).into(BUSCAR_SOLICITANTE_REPROGRAMACION_CITAS).thenHit(Keys.ENTER),
                Click.on(NUEVA_CITA_REPROGRAMACION_CITAS),
                //Enter.keyValues(NuevaCita).into(NUEVA_CITA_REPROGRAMACION_CITAS).thenHit(Keys.ENTER).thenHit(Keys.ENTER),
                Click.on(SELECCIONAR_FECHA_REPROGRAMACION_CITAS.of(String.valueOf(NuevaCita))),
                Enter.theValue(Hora).into(CAMPO_HORA_REPROGRAMACION_CITAS),
                Enter.theValue(Observacion).into(CAMPO_OBSERVACIONES_REPROGRAMACION_CITAS)
        );

    }
    public static ReprogramacionDeCitasTask EscribirInformacionReprogramacion(String Motivo,String Solicitante, String NuevaCita, String Hora, String Observacion){
        return new ReprogramacionDeCitasTask(Motivo, Solicitante, NuevaCita, Hora, Observacion);
    }
}
