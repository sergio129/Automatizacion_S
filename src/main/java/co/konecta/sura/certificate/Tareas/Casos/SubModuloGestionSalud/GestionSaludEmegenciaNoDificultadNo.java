package co.konecta.sura.certificate.Tareas.Casos.SubModuloGestionSalud;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


@AllArgsConstructor
public class GestionSaludEmegenciaNoDificultadNo implements Task {

    private String AtencionSalud;
    private String Observaciones;

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(DIFICULTAD_ATENCION_SALUD),
            Enter.theValue(AtencionSalud).into(BUSCAR_DIFICULTAD_ATENCION_SALUD).thenHit(Keys.ENTER),
            Enter.theValue(Observaciones).into(OBSERVACIONES)
    );

    }
    public static GestionSaludEmegenciaNoDificultadNo EscribirEmergenciaNo(String AtencionSalud, String Observaciones) {
        return instrumented(GestionSaludEmegenciaNoDificultadNo.class, AtencionSalud, Observaciones );
    }
}
