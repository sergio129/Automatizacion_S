package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.NotificacionesPushPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class NotificacionesPushTask implements Task {
    public String line;
    public String service;
    public String servicestatus;
    public String roles;
    public String timetomoment1;
    public String timetomoment2;
    public String appointmenttime1;
    public String appointmenttime2;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_PUSH_NOTIFICATIONS),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_PUSH_NOTIFICATIONS),
                //Click.on(INPUT_SERVICE_PUSH_NOTIFICATIONS),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_STATUS_PUSH_NOTIFICATIONS),
                Enter.theValue(servicestatus).into(INPUT_SEARCH_STATUS_SERVICE_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Click.on(INPUT_ROLES_PUSH_NOTIFICATIONS),
                Enter.theValue(roles).into(INPUT_SEARCH_ROLES_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Enter.theValue(timetomoment1).into(INPUT_MOMENT1_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Enter.theValue(timetomoment2).into(INPUT_MOMENT2_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER),
                Enter.theValue(appointmenttime1).into(INPUT_QUOTE1_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Enter.theValue(timetomoment1).into(INPUT_QUOTE2_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.TAB),
                Click.on(BUTTON_SAVE_PUSH_NOTIFICATIONS)
        );

    }


    public static NotificacionesPushTask withPushNotificationParameterization(String line, String service, String servicestatus, String roles, String timetomoment1, String timetomoment2, String appointmenttime1, String appointmenttime2) {
        return instrumented(NotificacionesPushTask.class, line, service, servicestatus, roles, timetomoment1, timetomoment2, appointmenttime1, appointmenttime2);
    }
}
