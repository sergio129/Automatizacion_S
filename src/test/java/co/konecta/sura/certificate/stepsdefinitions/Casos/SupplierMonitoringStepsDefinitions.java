package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.task.Casos.suppliermonitoring.SupplierMonitoringTask;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.Casos.suppliermonitoring.SupplierMonitoringPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SupplierMonitoringStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a supplier monitoring for a case$")
    public void iCreateASupplierMonitoringForACase() {
    }

    @And("^I type information in the fields monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*)$")
    public void iTypeInformationInTheFieldsMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation) throws InterruptedException {
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(MODULE_EXPANSION_TASK),
                    WaitUntil.the(BUTTON_EDIT_TASK, isVisible()).forNoMoreThan(8).milliseconds(),
                    Click.on(BUTTON_EDIT_TASK),
                    Click.on(BUTTON_CREATE_MONITORING));
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Click.on(INPUT_GENERATES_COMPLAINT_MONITORING),
                    Click.on(INPUT_GENERATES_OPTION_NO));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(3000);
            actor.attemptsTo(Click.on(BUTTON_CANCEL_TASK));
            Thread.sleep(1000);
    }

    @And("^I type information edition in the fields monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*)$")
    public void iTypeInformationEditionInTheFieldsMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation) throws InterruptedException {
            actor.attemptsTo(
                    WaitUntil.the(BUTTON_EDIT_TASK, isVisible()).forNoMoreThan(8).milliseconds(),
                    Click.on(BUTTON_EDIT_TASK),
                    Click.on(MODULE_EXPANSION_MONITORING),
                    Click.on(BUTTON_EDIT_MONITORING));
            Thread.sleep(2000);
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            actor.attemptsTo(WaitUntil.the(BUTTON_CANCEL_TASK, isVisible()).forNoMoreThan(5).milliseconds(),
                    Click.on(BUTTON_CANCEL_TASK));
            Thread.sleep(1000);
    }

    @And("^I type information complaint in the fields monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*) and filed complaint (.*)$")
    public void iTypeInformationComplaintInTheFieldsMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation, String filedComplaint) throws InterruptedException {
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(MODULE_EXPANSION_TASK),
                    WaitUntil.the(BUTTON_EDIT_TASK, isVisible()).forNoMoreThan(4).milliseconds(),
                    Click.on(BUTTON_EDIT_TASK),
                    Click.on(BUTTON_CREATE_MONITORING));
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Click.on(INPUT_GENERATES_COMPLAINT_MONITORING),
                    Click.on(INPUT_GENERATES_OPTION_SI));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT_MONITORING));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            actor.attemptsTo(WaitUntil.the(BUTTON_CANCEL_TASK, isVisible()).forNoMoreThan(5).milliseconds(),
                    Click.on(BUTTON_CANCEL_TASK));
            Thread.sleep(1000);
    }

    @And("^I type information edition complaint in the fields monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*) and filed complaint (.*)$")
    public void iTypeInformationEditionComplaintInTheFieldsMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation, String filedComplaint) throws InterruptedException {
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(MODULE_EXPANSION_TASK),
                    WaitUntil.the(BUTTON_EDIT_TASK, isVisible()).forNoMoreThan(4).milliseconds(),
                    Click.on(BUTTON_EDIT_TASK),
                    Click.on(BUTTON_EDIT_MONITORING));
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT_MONITORING));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            actor.attemptsTo(WaitUntil.the(BUTTON_CANCEL_TASK, isVisible()).forNoMoreThan(5).milliseconds(),
                    Click.on(BUTTON_CANCEL_TASK));
            Thread.sleep(1000);
    }

    @And("^I no type information supplier monitoring$")
    public void iNoTypeInformationSupplierMonitoring() throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_MONITORING));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(1000);

    }

    @Then("^I view the modal save supplier monitoring with (.*)$")
    public void iViewTheModalSaveSupplierMonitoringWith(String messageModal) {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));
    }

}
