package co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;

@AllArgsConstructor
public class GestionSaludDificultadTask implements Task {
    List<Map<String, String>> DatosDificultad;
    private static final String DIFICULTAD_SALUD = "DificultadSalud";
    private static final String TIPO_DIFICULTAD = "TipoDificultad";


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (DIFICULTAD_ATENCION_SALUD.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Click.on(DIFICULTAD_ATENCION_SALUD),
                    Enter.theValue(DatosDificultad.get(0).get(DIFICULTAD_SALUD)).into(BUSCAR_DIFICULTAD_ATENCION_SALUD).thenHit(Keys.ENTER));
        }

        if (TIPO_DIFICULTAD_ATENCION_SALUD.resolveFor(actor).isVisible())
            actor.has(
                    Click.on(TIPO_DIFICULTAD_ATENCION_SALUD),
                    Enter.theValue(DatosDificultad.get(0).get(TIPO_DIFICULTAD)).into(BUSCAR_TIPO_DIFICULTAD_ATENCION_SALUD).thenHit(Keys.ENTER));

    }

    public static co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GestionSaludDificultadTask EscribirDatosDificultad(List<Map<String, String>> DatosDificultad) {
        return new co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GestionSaludDificultadTask(DatosDificultad);
    }

}
