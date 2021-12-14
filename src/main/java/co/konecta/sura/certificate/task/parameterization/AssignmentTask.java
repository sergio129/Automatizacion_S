package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.AssignmentPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AssignmentTask implements Task {

    String roleAssignment;
    String userAssignment;
    String lineAssignment;
    String serviceAssignment;
    String departmentAssignment;

    public AssignmentTask(String roleAssignment, String userAssignment, String lineAssignment, String serviceAssignment, String departmentAssignment) {
        this.roleAssignment = roleAssignment;
        this.userAssignment = userAssignment;
        this.lineAssignment = lineAssignment;
        this.serviceAssignment = serviceAssignment;
        this.departmentAssignment = departmentAssignment;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_ROLE_ASSIGNMENT),
                Enter.theValue(roleAssignment).into(INPUT_SEARCH_ROLE_ASSIGNMENT).thenHit(Keys.ENTER),
                Click.on(INPUT_USER_ASSIGNMENT),
                Enter.theValue(userAssignment).into(INPUT_SEARCH_USER_ASSIGNMENT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_LINE_ASSIGNMENT),
                Enter.theValue(lineAssignment).into(INPUT_SEARCH_LINE_ASSIGNMENT).thenHit(Keys.ENTER),
                Click.on(INPUT_SERVICE_ASSIGNMENT),
                Enter.theValue(serviceAssignment).into(INPUT_SEARCH_SERVICE_ASSIGNMENT).thenHit(Keys.ENTER),
                Click.on(INPUT_DEPARTMENT_ASSIGNMENT),
                Enter.theValue(departmentAssignment).into(INPUT_SEARCH_DEPARTMENT_ASSIGNMENT).thenHit(Keys.ENTER),
                Click.on(INPUT_COORDINATION_MANAGER),
                Hit.the(Keys.ENTER).into(INPUT_COORDINATION_MANAGER),
                Click.on(BUTTON_SAVE_ASSIGNMENT)
        );
    }

    public static AssignmentTask withInformationAssignment( String roleAssignment, String userAssignment, String lineAssignment, String serviceAssignment, String departmentAssignment){
        return instrumented(AssignmentTask.class, roleAssignment, userAssignment, lineAssignment, serviceAssignment, departmentAssignment);
    }

}
