package co.konecta.sura.certificate.Tareas.Casos.documentationcnm;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.documentationcnm.DocumentationCNMPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class DocumentationCNMTask implements Task {
    private String managementPerson;
    private String generatesComplaint;
    private String Radicado;
    private String observation;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_MANAGEMENT_PERSON_DOCUMENTATION),
                Enter.theValue(managementPerson).into(INPUT_SEARCH_MANAGEMENT_PERSON_DOCUMENTATION).thenHit(Keys.ENTER),
                Click.on(INPUT_GENERATES_COMPLAINT_DOCUMENTATION),
                Enter.theValue(generatesComplaint).into(INPUT_SEARCH_GENERATES_COMPLAINT_DOCUMENTATION).thenHit(Keys.ENTER));

        if (INPUT_FILED_COMPLAINT_DOCUMENTATION.resolveFor(actor).isVisible()) {
            actor.has(Enter.theValue(Radicado).into(INPUT_FILED_COMPLAINT_DOCUMENTATION));
        }
        actor.has(
                Enter.theValue(observation).into(INPUT_OBSERVATION_DOCUMENTATION));
    }

    public static DocumentationCNMTask withInformationDocumentationCNM(String managementPerson, String generatesComplaint, String Radicado, String observation) {
        return instrumented(DocumentationCNMTask.class, managementPerson, generatesComplaint, Radicado, observation
        );
    }
}
