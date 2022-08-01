package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.Tareas.Casos.suppliermanagement.SupplierManagementTask;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.ToString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Casos.suppliermanagement.SupplierManagementPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GestionProveedoresStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a provider for a case$")
    public void iCreateAProviderForACase() {
    }

    @And("^I type information in the fields supplier name (.*) and supplier response (.*) and time monitoring site (.*) and time monitoring destination (.*) and technical cellphone (.*) and central phone (.*) and central phone (.*) and observations (.*)$")
    public void iTypeInformationInTheFieldsSupplierNameAndSupplierResponseAndTimeMonitoringSiteAndTimeMonitoringDestinationAndTechnicalCellphoneAndCentralPhoneAndCentralPhoneAndObservations(List<Map<String, String>> informacion) throws InterruptedException {
        Thread.sleep(7000);
        actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
        Thread.sleep(1000);
        actor.attemptsTo(SupplierManagementTask.withInformationSupplier(informacion));
        actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
        Thread.sleep(2000);
    }

    @And("^I type information edition in the fields supplier name (.*) and supplier response (.*) and time monitoring site (.*) and time monitoring destination (.*) and technical cellphone (.*) and central phone (.*) and central phone (.*) and observations (.*)$")
    public void iTypeInformationEditionInTheFieldsSupplierNameAndSupplierResponseAndTimeMonitoringSiteAndTimeMonitoringDestinationAndTechnicalCellphoneAndCentralPhoneAndCentralPhoneAndObservations(List<Map<String, String>> informacion) throws InterruptedException {
        Thread.sleep(3000);
        actor.attemptsTo(Click.on(MODULE_EXPANSION_SUPPLIER));
        actor.attemptsTo(Click.on(BUTTON_EDIT_SUPPLIER));
        Thread.sleep(2000);
        actor.attemptsTo(SupplierManagementTask.withInformationSupplier(informacion));
        actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
        Thread.sleep(2000);
    }

    @And("^I type information not service in the fields supplier name (.*) and supplier response (.*) and observations (.*)$")
    public void iTypeInformationSupplierNameAndSupplierResponseAndObservations(String supplierName, String supplierResponse, String observations) throws InterruptedException {
        actor.attemptsTo(WaitUntil.the(BUTTON_CREATE_SUPPLIER, isVisible()).forNoMoreThan(10).milliseconds(),
                Click.on(BUTTON_CREATE_SUPPLIER));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(INPUT_SUPPLIER_NAME),
                Enter.theValue(supplierName).into(INPUT_SEARCH_SUPPLIER_NAME).thenHit(Keys.ENTER),
                Click.on(INPUT_SUPPLIER_RESPONSE),
                Enter.theValue(supplierResponse).into(INPUT_SEARCH_SUPPLIER_RESPONSE).thenHit(Keys.ENTER),
                Enter.theValue(observations).into(INPUT_OBSERVATIONS));
        actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
        Thread.sleep(1000);

    }

    @And("^I type information case appointment in the fields supplier name (.*) and supplier response (.*) and time monitoring destination (.*) and technical cellphone (.*) and central phone 1 (.*) and central phone 2 (.*) and observations (.*)$")
    public void iTypeInformationCaseAppointmentSupplierNameAndSupplierResponseAndTimeMonitoringDestinationAndTechnicalCellphoneAndCentralPhoneAndCentralPhoneAndObservations(String supplierName, String supplierResponse, String timeMonitoringDestination, String technicalCellPhone, String centralPhone1, String centralPhone2, String observations) throws InterruptedException {
        actor.attemptsTo(WaitUntil.the(BUTTON_CREATE_SUPPLIER, isVisible()).forNoMoreThan(11).milliseconds(),
                Click.on(BUTTON_CREATE_SUPPLIER));
        Thread.sleep(2000);
        actor.attemptsTo(
                Click.on(INPUT_SUPPLIER_NAME),
                Enter.theValue(supplierName).into(INPUT_SEARCH_SUPPLIER_NAME).thenHit(Keys.ENTER),
                Click.on(INPUT_SUPPLIER_RESPONSE),
                Enter.theValue(supplierResponse).into(INPUT_SEARCH_SUPPLIER_RESPONSE).thenHit(Keys.ARROW_UP).thenHit(Keys.ENTER),
                Enter.theValue(timeMonitoringDestination).into(INPUT_TIME_MONITORING_DESTINATION),
                Enter.theValue(technicalCellPhone).into(INPUT_TECHNICAL_CELLPHONE),
                Enter.theValue(centralPhone1).into(INPUT_CENTRAL_PHONE1),
                Enter.theValue(centralPhone2).into(INPUT_CENTRAL_PHONE2),
                Enter.theValue(observations).into(INPUT_OBSERVATIONS));
        Thread.sleep(3000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
        Thread.sleep(1000);
    }

    @And("^I no type information supplier$")
    public void iNoTypeInformationSupplier() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save supplier with (.*)$")
    public void iViewTheModalSaveSupplierWith(String messageModal) throws Exception {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).textContent().isEqualTo(messageModal));
    }

    @And("Hacemos Gestion de proveedor")
    public void hacemosGestionDeProveedor(List<Map<String, String>> informacion) throws InterruptedException {
        Thread.sleep(4000);
        actor.attemptsTo(Click.on(BUTTON_CREATE_SUPPLIER));
        Thread.sleep(1000);
        actor.attemptsTo(SupplierManagementTask.withInformationSupplier(informacion));
        actor.attemptsTo(Click.on(BUTTON_SAVE_SUPPLIER));
        Thread.sleep(2000);
    }

    @And("Hacemos Busqueda del caso: {string}")
    public void hacemosBusquedaDelCaso(String NumeroCaso) throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_CASE));
        actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
        actor.attemptsTo(Enter.theValue(NumeroCaso).into(INPUT_CASE));
        actor.attemptsTo(Click.on(BUTTON_SEARCH));
        actor.attemptsTo(Click.on(BUTTON_CASE_DETAIL_VIEW));
        Thread.sleep(7000);
    }


}
