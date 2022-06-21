package co.konecta.sura.certificate.Tareas.Casos.EscalamientosSura;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.suraclimbing.SuraClimbingPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class EscalamientosSuraTask implements Task {


    private static final String TIPO_DE_GESTION = "TipoGestion";
    private static final String PERSONA_DE_GESTION = "PersonaGestion";
    private static final String TIPO_DE_RESPUESTA = "TipoRespuesta";
    private static final String GENERA_QUEJA = "GeneraQueja";
    private static final String RADICADO = "Radicado";
    private static final String OBSERVACIONES = "Observaciones";
    List<Map<String, String>> EscalamientoSura;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_MANAGEMENT_TYPE),
                Enter.theValue(EscalamientoSura.get(0).get(TIPO_DE_GESTION)).into(INPUT_SEARCH_MANAGEMENT_TYPE).thenHit(Keys.ENTER),
                WaitUntil.the(INPUT_MANAGEMENT_PERSON, isVisible()).forNoMoreThan(10).milliseconds(),
                Click.on(INPUT_MANAGEMENT_PERSON),
                Enter.theValue(EscalamientoSura.get(0).get(PERSONA_DE_GESTION)).into(INPUT_SEARCH_MANAGEMENT_PERSON).thenHit(Keys.ENTER),
                Click.on(INPUT_RESPONSE_TYPE),
                Enter.theValue(EscalamientoSura.get(0).get(TIPO_DE_RESPUESTA)).into(INPUT_SEARCH_RESPONSE_TYPE).thenHit(Keys.ENTER),
                Click.on(INPUT_GENERATES_COMPLAINT),
                Enter.theValue(EscalamientoSura.get(0).get(GENERA_QUEJA)).into(INPUT_SEARCH_GENERATES_COMPLAINT).thenHit(Keys.ENTER));
        if (INPUT_FILED_COMPLAINT.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Enter.theValue(EscalamientoSura.get(0).get(RADICADO)).into(INPUT_FILED_COMPLAINT));
        }
        actor.attemptsTo(
                Enter.theValue(EscalamientoSura.get(0).get(OBSERVACIONES)).into(INPUT_OBSERVATIONS)

        );
    }

    public static EscalamientosSuraTask withInformationSuraClimbing(List<Map<String, String>> EscalamientoSura) {
        return instrumented(EscalamientosSuraTask.class, EscalamientoSura);
    }


}

