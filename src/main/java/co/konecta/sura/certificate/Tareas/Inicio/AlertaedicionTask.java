package co.konecta.sura.certificate.Tareas.Inicio;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class AlertaedicionTask implements Task {
    private static final String OBSERVACION = "observacion";
    private static final String VALIDACIONES = "validaciones";
    private static final String MOTIVO = "motivo";
    private static final String TIPO_GESTION = "tipodegestion";

    private final List<Map<String, String>> GestionAlertaUCK;

    @Override
    public <T extends Actor> void performAs(@NotNull T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_OBSERVACION),
                Enter.theValue(GestionAlertaUCK.get(0).get(OBSERVACION)).into(CAMPO_OBSERVACION),
                Click.on(CAMPO_VALIDACIONES),
                Enter.theValue(GestionAlertaUCK.get(0).get(VALIDACIONES)).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_MOTIVO),
                Enter.theValue(GestionAlertaUCK.get(0).get(MOTIVO)).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_TIPO_GESTION),
                Enter.theValue(GestionAlertaUCK.get(0).get(TIPO_GESTION)).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BOTON_GUARDAR_EDICION)
        );
    }

    public static AlertaedicionTask withInformationEdicionAlerta(List<Map<String, String>> GestionAlertaUCK) {
        return instrumented(AlertaedicionTask.class, GestionAlertaUCK);
    }
}


