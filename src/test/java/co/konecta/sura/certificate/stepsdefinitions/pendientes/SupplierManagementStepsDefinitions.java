package co.konecta.sura.certificate.stepsdefinitions.pendientes;

import co.konecta.sura.certificate.task.pendientes.LoginTask;
import co.konecta.sura.certificate.task.pendientes.SupplierManagementTask;
import co.konecta.sura.certificate.userinterface.HomePage;
import co.konecta.sura.certificate.userinterface.pendientes.AdvancedSearchPage;
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
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.pendientes.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.userinterface.pendientes.SupplierManagementPage.*;

public class SupplierManagementStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("^I am entry in the application supplier with user (.*) and password (.*)$")
    public void iAmEntryInThePageSupplierWith(String user, String password) {
            actor.wasAbleTo(Open.browserOn(homePage));
            actor.attemptsTo(LoginTask.whitCredentials(user,password));
    }

    @And("^I am entry the advanced search case and set (.*)$")
    public void iAmEntryTheAdvancedSearchCaseAndSetNumberCase(String numberCase) throws InterruptedException {
            Thread.sleep(5000);
            actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
            actor.attemptsTo(Click.on(HomePage.OPTIONS_MENU_CASE));
            actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
            Thread.sleep(2000);
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
            actor.attemptsTo(Enter.theValue(numberCase).into(INPUT_CASE));
            actor.attemptsTo(Click.on(BUTTON_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_CASE_DETAIL_VIEW));
            Thread.sleep(7000);
    }

    @When("^set information supplier name (.*) and supplier response (.*) and time monitoring site (.*) and time monitoring destination (.*) and technical cellphone (.*) and central phone (.*) and central phone (.*) and observations (.*)$")
    public void setInformationSupplierNameAndSupplierResponseAndTimeMonitoringSiteAndTimeMonitoringDestinationAndTechnicalCellphoneAndCentralPhoneAndCentralPhoneAndObservations(String supplierName,String supplierResponse, String timeMonitoringSite, String timeMonitoringDestination, String technicalCellPhone, String centralPhone1, String centralPhone2, String observations) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
            Thread.sleep(1000);
            actor.attemptsTo(SupplierManagementTask.withInformationSupplier(supplierName,supplierResponse,timeMonitoringSite,timeMonitoringDestination,technicalCellPhone,centralPhone1,centralPhone2,observations));
            actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
            Thread.sleep(2000);
    }

    @When("^set information edition supplier name (.*) and supplier response (.*) and time monitoring site (.*) and time monitoring destination (.*) and technical cellphone (.*) and central phone (.*) and central phone (.*) and observations (.*)$")
    public void setInformationEditionSupplierNameAndSupplierResponseAndTimeMonitoringSiteAndTimeMonitoringDestinationAndTechnicalCellphoneAndCentralPhoneAndCentralPhoneAndObservations(String supplierName,String supplierResponse, String timeMonitoringSite, String timeMonitoringDestination, String technicalCellPhone, String centralPhone1, String centralPhone2, String observations) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_SUPPLIER));
            actor.attemptsTo(Click.on(BUTTON_EDIT_SUPPLIER));
            Thread.sleep(2000);
            actor.attemptsTo(SupplierManagementTask.withInformationSupplier(supplierName,supplierResponse,timeMonitoringSite,timeMonitoringDestination,technicalCellPhone,centralPhone1,centralPhone2,observations));
            actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
            Thread.sleep(2000);
    }

    @When("^set information supplier not service name (.*) and supplier response (.*) and observations (.*)$")
    public void setInformationSupplierNameAndSupplierResponseAndObservations(String supplierName,String supplierResponse, String observations) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(INPUT_SUPPLIER_NAME),
                    Enter.theValue(supplierName).into(INPUT_SEARCH_SUPPLIER_NAME).thenHit(Keys.ENTER),
                    Click.on(INPUT_SUPPLIER_RESPONSE),
                    Enter.theValue(supplierResponse).into(INPUT_SEARCH_SUPPLIER_RESPONSE).thenHit(Keys.ENTER),
                    Enter.theValue(observations).into(INPUT_OBSERVATIONS));
            actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
            Thread.sleep(2000);

    }

    @When("^set information case appointment supplier name (.*) and supplier response (.*) and time monitoring destination (.*) and technical cellphone (.*) and central phone 1 (.*) and central phone 2 (.*) and observations (.*)$")
    public void setInformationCaseAppointmentSupplierNameAndSupplierResponseAndTimeMonitoringDestinationAndTechnicalCellphoneAndCentralPhoneAndCentralPhoneAndObservations(String supplierName,String supplierResponse, String timeMonitoringDestination, String technicalCellPhone, String centralPhone1, String centralPhone2, String observations) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
            Thread.sleep(2000);
            actor.attemptsTo(
                Click.on(INPUT_SUPPLIER_NAME),
                Enter.theValue(supplierName).into(INPUT_SEARCH_SUPPLIER_NAME).thenHit(Keys.ENTER),
                Click.on(INPUT_SUPPLIER_RESPONSE),
                Enter.theValue(supplierResponse).into(INPUT_SEARCH_SUPPLIER_RESPONSE).thenHit(Keys.ENTER),
                Enter.theValue(timeMonitoringDestination).into(INPUT_TIME_MONITORING_DESTINATION),
                Enter.theValue(technicalCellPhone).into(INPUT_TECHNICAL_CELLPHONE),
                Enter.theValue(centralPhone1).into(INPUT_CENTRAL_PHONE1),
                Enter.theValue(centralPhone2).into(INPUT_CENTRAL_PHONE2),
                Enter.theValue(observations).into(INPUT_OBSERVATIONS));
                Thread.sleep(3000);
                actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
            Thread.sleep(1000);
        }

    @When("^No set information supplier$")
    public void noSetInformationSupplier() throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
            Thread.sleep(1000);
    }

    @Then("^user view the modal save supplier with (.*)$")
    public void userViewTheCase(String messageModal) throws Exception {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).textContent().isEqualTo(messageModal));
    }
}
