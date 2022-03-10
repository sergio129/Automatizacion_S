package co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente.SubCierreExpedientePage.CAMPO_OBSERVACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class CrearExpedienteTask implements Task {

    public String observacion;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_OBSERVACION),
                Enter.theValue(observacion).into(CAMPO_OBSERVACION));
    }
    public static CrearExpedienteTask EsbriboCrearexpediente(String observacion) {
        return instrumented(CrearExpedienteTask.class, observacion);

    }
}


