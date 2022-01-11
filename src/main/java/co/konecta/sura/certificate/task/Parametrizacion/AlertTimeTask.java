package co.konecta.sura.certificate.task.Parametrizacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.Parametrizacion.TiemposdeAlertaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AlertTimeTask implements Task {
    String serviceAlertTime;
    String time;

    public AlertTimeTask(String serviceAlertTime, String time) {
        this.serviceAlertTime = serviceAlertTime;

        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_ALERT_TIME),
                Click.on(OPTION_LINE),
                Hit.the(Keys.ESCAPE).into(OPTION_LINE),
                Click.on(INPUT_SERVICE_ALERT_TIME),
                Enter.theValue(serviceAlertTime).into(INPUT_SEARCH_SERVICE_ALERT_TIME).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Enter.theValue(time).into(INPUT_TIME),
                Click.on(BUTTON_SAVE_ALERT_TIME)

        );
    }


    public static AlertTimeTask withInformationAlertTime(String serviceAlertTime, String time) {
        return instrumented(AlertTimeTask.class, serviceAlertTime, time);
    }

}
