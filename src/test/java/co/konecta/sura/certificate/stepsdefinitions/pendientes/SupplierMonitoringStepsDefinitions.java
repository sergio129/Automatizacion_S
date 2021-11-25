package co.konecta.sura.certificate.stepsdefinitions.pendientes;

import co.konecta.sura.certificate.task.pendientes.LoginTask;
import co.konecta.sura.certificate.task.pendientes.SupplierMonitoringTask;
import co.konecta.sura.certificate.userinterface.pendientes.AdvancedSearchPage;
import co.konecta.sura.certificate.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.pendientes.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.userinterface.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.pendientes.SupplierMonitoringPage.*;
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


    @Given("^I am entry in the application supplier monitoring with user (.*) and password (.*)$")
    public void iAmEntryInTheApplicationSupplierMonitoringWithUserAndPassword(String user, String password) {
            actor.wasAbleTo(Open.browserOn(homePage));
            actor.attemptsTo(LoginTask.whitCredentials(user,password));
    }

    @And("^I am entry for supplier monitoring and set number case (.*)$")
    public void iAmEntryForSupplierMonitoringAndSetNumberCase(String numberCase) throws InterruptedException {
            Thread.sleep(3000);
            actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
            actor.attemptsTo(Click.on(HomePage.OPTIONS_MENU_CASE));
            actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
            Thread.sleep(2000);
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
            actor.attemptsTo(Enter.theValue(numberCase).into(INPUT_CASE));
            actor.attemptsTo(Click.on(BUTTON_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_CASE_DETAIL_VIEW));
            Thread.sleep(5000);

    }

    @When("^set information monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*)$")
    public void setInformationMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_TASK),
                    Click.on(BUTTON_EDIT_TASK),
                    WaitUntil.the(BUTTON_CREATE_MONITORING, isVisible()).forNoMoreThan(4).milliseconds(),
                    Click.on(BUTTON_CREATE_MONITORING));
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Click.on(INPUT_GENERATES_COMPLAINT_MONITORING),
                    Click.on(INPUT_GENERATES_OPTION_NO));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(1000);
    }

    @When("^set information edition monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*)$")
    public void setInformationEditionMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_EDIT_TASK),
                    WaitUntil.the(BUTTON_EDIT_MONITORING, isVisible()).forNoMoreThan(4).milliseconds(),
                    Click.on(BUTTON_EDIT_MONITORING));
            Thread.sleep(2000);
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(1000);
    }

    @When("^set information complaint monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*) and filed complaint (.*)$")
    public void setInformationComplaintMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_TASK),
                    Click.on(BUTTON_EDIT_TASK),
                    WaitUntil.the(BUTTON_CREATE_MONITORING, isVisible()).forNoMoreThan(4).milliseconds(),
                    Click.on(BUTTON_CREATE_MONITORING));
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Click.on(INPUT_GENERATES_COMPLAINT_MONITORING),
                    Click.on(INPUT_GENERATES_OPTION_SI));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT_MONITORING));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(1000);
    }

    @When("^set information edition complaint monitoring with (.*) and time of service (.*) and response to monitoring (.*) and generates complaint (.*) and adviser observation (.*) and supplier observation (.*) and filed complaint (.*)$")
    public void setInformationEditionComplaintMonitoringWithAndTimeOfServiceAndResponseToMonitoringAndGeneratesComplaintAndAdviserObservationAndSupplierObservation(String monitoringwith, String timeofservice, String responsetomonitoring, String generatescomplaint, String adviserobservation, String supplierobservation, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_TASK),
                    Click.on(BUTTON_EDIT_TASK),
                    WaitUntil.the(BUTTON_EDIT_MONITORING, isVisible()).forNoMoreThan(4).milliseconds(),
                    Click.on(BUTTON_EDIT_MONITORING));
            actor.attemptsTo(SupplierMonitoringTask.withInformationSupplierMonitoring(monitoringwith, timeofservice, responsetomonitoring, generatescomplaint, adviserobservation, supplierobservation));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT_MONITORING));
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(1000);
    }

    @When("^No set information supplier monitoring$")
    public void noSetInformationSupplierMonitoring() throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_MONITORING));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_SAVE_MONITORING));
            Thread.sleep(1000);

    }

    @Then("^user view the modal save supplier monitoring with (.*)$")
    public void userViewTheModalSaveSupplierMonitoringWithModalmessage(String messageModal) {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));
    }

}
