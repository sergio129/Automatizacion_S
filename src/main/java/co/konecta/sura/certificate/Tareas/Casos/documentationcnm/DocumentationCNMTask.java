package co.konecta.sura.certificate.Tareas.Casos.documentationcnm;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.documentationcnm.DocumentationCNMPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class DocumentationCNMTask implements Task {

    private static final String PERSONA_GESTION = "PersonaGestion";
    private static final String GENERA_QUEJA = "GeneraQueja";
    private static final String RADICADO = "Radicajo";
    private static final String OBSERVACIONES = "Observaciones";

    List<Map<String, String>> InformacionCNM;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_MANAGEMENT_PERSON_DOCUMENTATION),
                Enter.theValue(InformacionCNM.get(0).get(PERSONA_GESTION)).into(INPUT_SEARCH_MANAGEMENT_PERSON_DOCUMENTATION).thenHit(Keys.ENTER),
                Click.on(INPUT_GENERATES_COMPLAINT_DOCUMENTATION),
                Enter.theValue(InformacionCNM.get(0).get(GENERA_QUEJA)).into(INPUT_SEARCH_GENERATES_COMPLAINT_DOCUMENTATION).thenHit(Keys.ENTER));

        if (INPUT_FILED_COMPLAINT_DOCUMENTATION.resolveFor(actor).isVisible()) {
            actor.has(Enter.theValue(InformacionCNM.get(0).get(RADICADO)).into(INPUT_FILED_COMPLAINT_DOCUMENTATION));
        }
        actor.has(
                Enter.theValue(InformacionCNM.get(0).get(OBSERVACIONES)).into(INPUT_OBSERVATION_DOCUMENTATION));
    }

    public static DocumentationCNMTask withInformationDocumentationCNM(List<Map<String, String>> InformacionCNM) {
        return instrumented(DocumentationCNMTask.class, InformacionCNM
        );
    }
}
