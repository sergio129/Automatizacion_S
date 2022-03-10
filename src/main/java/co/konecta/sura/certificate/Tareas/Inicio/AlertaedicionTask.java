package co.konecta.sura.certificate.Tareas.Inicio;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class AlertaedicionTask implements Task {

    public String observacion;
    public String validaciones;
    public String motivo;
    public String tipodegestion;

    @Override
    public <T extends Actor> void performAs(@NotNull T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_OBSERVACION),
                Enter.theValue(observacion).into(CAMPO_OBSERVACION),
                Click.on(CAMPO_VALIDACIONES),
                Enter.theValue(validaciones).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_MOTIVO),
                Enter.theValue(motivo).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_TIPO_GESTION),
                Enter.theValue(tipodegestion).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BOTON_GUARDAR_EDICION)
        );
    }
    public static AlertaedicionTask withInformationEdicionAlerta(String observacion, String validaciones, String motivo, String tipogestion) {
        return instrumented(AlertaedicionTask.class, observacion, validaciones, motivo, tipogestion);
    }
}


