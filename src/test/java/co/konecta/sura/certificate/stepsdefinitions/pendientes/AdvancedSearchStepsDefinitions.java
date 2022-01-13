package co.konecta.sura.certificate.stepsdefinitions.pendientes;

import co.konecta.sura.certificate.Tareas.pendientes.AdvancedSearchTask;
import co.konecta.sura.certificate.Tareas.pendientes.LoginTask;
import co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
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

import static co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage.INPUT_SEARCH_DEPARTMENT;

public class AdvancedSearchStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I am entry in the application with user (.*) and password (.*)$")
    public void iAmEntryInThePageWith(String user, String password) {
            actor.wasAbleTo(Open.browserOn(homePage));
            actor.attemptsTo(LoginTask.whitCredentials(user,password));

    }

    @Given("^I am entry the advanced search case$")
    public void iAmEntryTheAdvancedSearchCase() throws Exception {
            actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
            actor.attemptsTo(Click.on(co.konecta.sura.certificate.Interfaces.HomePage.OPTIONS_MENU_CASE));
            actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_ADVANCED_SEARCH));
    }

    @When("^set case (.*) and license plate (.*) and security code (.*) and click case (.*) and assigned to (.*) and department (.*) and municipality (.*) and line (.*) and case closure status (.*) and class (.*) and case status (.*) and service status (.*) and service (.*) and type service (.*) and special service (.*) and customer type (.*) and supplier (.*)$")
    public void setCaseAndLicensePlateAndSecurityCodeAndClickCaseAndAssignedToAndDepartmentAndMunicipalityAndLineNoAndCaseClosureStatusAndClassAndCaseStatusAndServiceStatusAndServiceAndTypeServiceAndSpecialServiceAndCustomerTypeAndSupplier(String numberCase, String licensePlate, String securityCode, String clickCase, String assignedTo, String department, String municipality, String line, String caseClosureStatus, String classCase, String caseStatus, String serviceStatus, String service, String typeService, String specialService, String customerType, String supplier) {
           actor.attemptsTo(AdvancedSearchTask.withInformationCaseSearch(numberCase,licensePlate,securityCode,clickCase,assignedTo,department,municipality,line,caseClosureStatus,classCase,caseStatus,serviceStatus,service,typeService,specialService,customerType,supplier));
           actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_SEARCH));
    }

    @When("^set search optional case (.*) and license plate (.*) and department (.*) and line (.*) and service (.*)$")
    public void setCaseNumberAndLicensePlateAndDepartmentAndLineAndService(String numberCase, String licensePlate,String department, String line, String service) {
           actor.attemptsTo(Enter.theValue(numberCase).into(INPUT_CASE),
                   Enter.theValue(licensePlate).into(INPUT_LICENSE_PLATE),
                   Click.on(INPUT_DEPARTMENT),
                   Enter.theValue(department).into(INPUT_SEARCH_DEPARTMENT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                   Click.on(INPUT_LINE),
                   Enter.theValue(line).into(INPUT_SEARCH_LINE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                   Click.on(INPUT_SERVICE),
                   Enter.theValue(service).into(INPUT_SEARCH_SERVICE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_SEARCH));
    }

    @Then("^user view the case$")
    public void userViewTheCase( ) throws Exception {
         actor.attemptsTo(Ensure.that(INPUT_CASE_VERIFICATION).isEnabled());
    }


}
