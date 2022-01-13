package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Tareas.Casos.advancedsearch.AdvancedSearchTask;
import co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage.*;

public class AdvancedSearchStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I performed a full or optional advanced search for a case$")
    public void iPerformedAFullAdvancedSearchForACase() {
    }

    @And("^I entering the advanced search case$")
    public void iEnteringTheAdvancedSearchCase() throws Exception {
            actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
            actor.attemptsTo(Click.on(HomePage.OPTION_MENU_CASE));
            actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_ADVANCED_SEARCH));
    }

    @And("^I type information in the fields case (.*) and license plate (.*) and security code (.*) and click case (.*) and assigned to (.*) and department (.*) and municipality (.*) and line (.*) and case closure status (.*) and class (.*) and case status (.*) and service status (.*) and service (.*) and type service (.*) and special service (.*) and customer type (.*) and supplier (.*)$")
    public void iTypeInformationInTheFieldsCaseNumberCaseAndLicensePlateLicensePlateAndSecurityCodeSecurityCodeAndClickCaseClickCaseAndAssignedToAssignedToAndDepartmentDepartmentAndMunicipalityMunicipalityAndLineLineAndCaseClosureStatusCaseClosureStatusAndClassClassAndCaseStatusCaseStatusAndServiceStatusServiceStatusAndServiceServiceAndTypeServiceTypeServiceAndSpecialServiceSpecialServiceAndCustomerTypeCustomerTypeAndSupplierSupplier(String numberCase, String licensePlate, String securityCode, String clickCase, String assignedTo, String department, String municipality, String line, String caseClosureStatus, String classCase, String caseStatus, String serviceStatus, String service, String typeService, String specialService, String customerType, String supplier) throws InterruptedException {
            actor.attemptsTo(AdvancedSearchTask.withInformationCaseSearch(numberCase,licensePlate,securityCode,clickCase,assignedTo,department,municipality,line,caseClosureStatus,classCase,caseStatus,serviceStatus,service,typeService,specialService,customerType,supplier));
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_SEARCH));
            Thread.sleep(1000);
    }

    @And("^I type information optional in the fields case (.*) and license plate (.*) and department (.*) and line (.*) and service (.*)$")
    public void iTypeInformationOptionalInTheFieldsCaseNumberAndLicensePlateAndDepartmentAndLineAndService(String numberCase, String licensePlate,String department, String line, String service) throws InterruptedException {
        actor.attemptsTo(Enter.theValue(numberCase).into(INPUT_CASE),
                Enter.theValue(licensePlate).into(INPUT_LICENSE_PLATE),
                Click.on(INPUT_DEPARTMENT),
                Enter.theValue(department).into(INPUT_SEARCH_DEPARTMENT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_LINE),
                Enter.theValue(line).into(INPUT_SEARCH_LINE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_SEARCH));
        Thread.sleep(1000);
    }

    @Then("^I view the case found$")
    public void iViewTheCaseFound( ) throws Exception {
         actor.attemptsTo(Ensure.that(INPUT_CASE_VERIFICATION).isEnabled());
    }
}
