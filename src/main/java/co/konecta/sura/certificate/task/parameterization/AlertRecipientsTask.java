package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.AlertRecipientsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AlertRecipientsTask implements Task {

    public String nameAlert;
    public String lineAlert;
    public String serviceAlert;
    public String departmentAlert;
    public String municipalityAlert;
    public String emailAlert;

    public AlertRecipientsTask(String nameAlert, String lineAlert, String serviceAlert, String departmentAlert, String municipalityAlert, String emailAlert) {
        this.nameAlert = nameAlert;
        this.lineAlert = lineAlert;
        this.serviceAlert = serviceAlert;
        this.departmentAlert = departmentAlert;
        this.municipalityAlert = municipalityAlert;
        this.emailAlert = emailAlert;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameAlert).into(INPUT_NAME_ALERT),
                Click.on(INPUT_LINE_ALERT),
                Enter.theValue(lineAlert).into(INPUT_SEARCH_LINE_ALERT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_ALERT),
                Enter.theValue(serviceAlert).into(INPUT_SEARCH_SERVICE_ALERT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_DEPARTMENT_ALERT),
                Enter.theValue(departmentAlert).into(INPUT_SEARCH_DEPARTMENT_ALERT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_MUNICIPALITY_ALERT),
                Enter.theValue(serviceAlert).into(INPUT_SEARCH_MUNICIPALITY_ALERT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Enter.theValue(emailAlert).into(INPUT_EMAIL_ALERT)
        );
    }

    public static AlertRecipientsTask withInformationAlertParameterization (String nameAlert, String lineAlert, String serviceAlert, String departmentAlert, String municipalityAlert, String emailAlert){
        return instrumented(AlertRecipientsTask.class, nameAlert, lineAlert, serviceAlert, departmentAlert, municipalityAlert, emailAlert);
    }
}
