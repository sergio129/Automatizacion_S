package co.konecta.sura.certificate.Tareas.Parametrizacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.DestinatariosAlertaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DestinatariosAlertaTask implements Task {

    public String nameAlert;
    public String lineAlert;
    public String serviceAlert;
    public String departmentAlert;
    public String municipalityAlert;
    public String emailAlert;

    public DestinatariosAlertaTask(String nameAlert, String lineAlert, String serviceAlert, String departmentAlert, String municipalityAlert, String emailAlert) {
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
                Enter.theValue(lineAlert).into(INPUT_SEARCH_LINE_ALERT),
                Click.on(BOTON_SELECCIONAR_LINEA_DESTINATARIO_ALERTA),
                Hit.the(Keys.ESCAPE).into(INPUT_SEARCH_LINE_ALERT)
        );
        actor.attemptsTo(
                Click.on(INPUT_SERVICE_ALERT),
                Enter.theValue(serviceAlert).into(INPUT_SEARCH_SERVICE_ALERT).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Click.on(INPUT_DEPARTMENT_ALERT),
                Enter.theValue(departmentAlert).into(INPUT_SEARCH_DEPARTMENT_ALERT),
                Click.on(OPTION_SELECT_DEPARTMENT_PARAMETERIZATION),
                Hit.the(Keys.ESCAPE).into(INPUT_SEARCH_DEPARTMENT_ALERT),
                Click.on(INPUT_MUNICIPALITY_ALERT),
                Enter.theValue(municipalityAlert).into(INPUT_SEARCH_MUNICIPALITY_ALERT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Enter.theValue(emailAlert).into(INPUT_EMAIL_ALERT),
                Click.on(BUTTON_SAVE_ALERT_PARAMETERIZATION)
        );
    }

    public static DestinatariosAlertaTask withInformationAlertParameterization(String nameAlert, String lineAlert, String serviceAlert, String departmentAlert, String municipalityAlert, String emailAlert) {
        return instrumented(DestinatariosAlertaTask.class, nameAlert, lineAlert, serviceAlert, departmentAlert, municipalityAlert, emailAlert);
    }
}
