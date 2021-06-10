package co.konecta.sura.certificate.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.SupplierMonitoringPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SupplierMonitoringTask implements Task {

    public String monitoringwith;
    public String timeofservice;
    public String responsetomonitoring;
    public String generatescomplaint;
    public String adviserobservation;
    public String supplierobservation;

    public SupplierMonitoringTask(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation) {
        this.monitoringwith = monitoringwith;
        this.timeofservice = timeofservice;
        this.responsetomonitoring = responsetomonitoring;
        this.generatescomplaint = generatescomplaint;
        this.adviserobservation = adviserobservation;
        this.supplierobservation = supplierobservation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_MONITORING_WITH),
                Enter.theValue(monitoringwith).into(INPUT_SEARCH_MONITORING_WITH).thenHit(Keys.ENTER),
                Click.on(INPUT_TIME_SERVICE),
                Enter.theValue(timeofservice).into(INPUT_SEARCH_TIME_SERVICE).thenHit(Keys.ENTER),
                WaitUntil.the(INPUT_RESPONSE_MONITORING, isVisible()).forNoMoreThan(3).milliseconds(),
                Click.on(INPUT_RESPONSE_MONITORING),
                Enter.theValue(responsetomonitoring).into(INPUT_SEARCH_RESPONSE_MONITORING).thenHit(Keys.ENTER),
                Enter.theValue(adviserobservation).into(INPUT_ADVISER_OBSERVATION),
                Enter.theValue(supplierobservation).into(INPUT_SUPPLIER_OBSERVATION)
        );

    }

    public static SupplierMonitoringTask withInformationSupplierMonitoring(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation) {
        return instrumented(SupplierMonitoringTask.class, monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation
        );
    }

}
