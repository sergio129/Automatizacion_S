package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.AsignacionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class AsignacionTask implements Task {

    String roleAssignment;
    String userAssignmentedit;
    String lineAssignment;
    String serviceAssignment;
    String departmentAssignment;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_ROLE_ASSIGNMENT),
                Enter.theValue(roleAssignment).into(INPUT_SEARCH_ROLE_ASSIGNMENT).thenHit(Keys.ENTER),
                Click.on(INPUT_USER_ASSIGNMENT),
                Enter.theValue(userAssignmentedit).into(INPUT_SEARCH_USER_ASSIGNMENT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_LINE_ASSIGNMENT),
                Enter.theValue(lineAssignment).into(INPUT_SEARCH_LINE_ASSIGNMENT),
                Click.on(BUTTON_SELECT),//Se Usa para Mapear la posicion del Elemento.
                Hit.the(Keys.ESCAPE).into(INPUT_SEARCH_LINE_ASSIGNMENT));
        actor.attemptsTo(
                Click.on(INPUT_SERVICE_ASSIGNMENT),
                Enter.theValue(serviceAssignment).into(INPUT_SEARCH_SERVICE_ASSIGNMENT).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Click.on(INPUT_DEPARTMENT_ASSIGNMENT),
                Enter.theValue(departmentAssignment).into(INPUT_SEARCH_DEPARTMENT_ASSIGNMENT).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Click.on(INPUT_COORDINATION_MANAGER),
                Click.on(LIST_COORDINATION_MANAGER),
                Click.on(BUTTON_SAVE_ASSIGNMENT)
        );
    }

    public static AsignacionTask withInformationAssignment(String roleAssignment, String userAssignment, String lineAssignment, String serviceAssignment, String departmentAssignment) {
        return instrumented(AsignacionTask.class, roleAssignment, userAssignment, lineAssignment, serviceAssignment, departmentAssignment);
    }

}
