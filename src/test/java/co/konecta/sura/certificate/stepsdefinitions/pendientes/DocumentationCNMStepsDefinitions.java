package co.konecta.sura.certificate.stepsdefinitions.pendientes;

import co.konecta.sura.certificate.Tareas.pendientes.DocumentationCNMTask;
import co.konecta.sura.certificate.Tareas.pendientes.LoginTask;
import co.konecta.sura.certificate.Interfaces.HomePage;
import co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage;
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
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.Interfaces.pendientes.DocumentationCNMPage.*;
public class DocumentationCNMStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I am entry in the application documentation with user (.*) and password (.*)$")
    public void iAmEntryInTheApplicationSupplierMonitoringWithUserAndPassword(String user, String password) {
            actor.wasAbleTo(Open.browserOn(homePage));
            actor.attemptsTo(LoginTask.whitCredentials(user,password));
    }

    @And("^I am entry for documentation CNM and set number case (.*)$")
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
            Thread.sleep(7000);

    }

    @When("^set information management person (.*) and generates complaint (.*) and observation (.*)$")
    public void setInformationManagementPersonAndGeneratesComplaintAndObservation(String managementPerson, String generatesComplaint, String observation) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_DOCUMENTATION));
            Thread.sleep(2000);
            actor.attemptsTo(DocumentationCNMTask.withInformationDocumentationCNM(managementPerson, generatesComplaint,observation));
            actor.attemptsTo(Click.on(BUTTON_SAVE_DOCUMENTATION));
            Thread.sleep(1000);

    }

    @When("^set information with complaint management person (.*) and generates complaint (.*) and observation (.*) and filed complaint (.*)$")
    public void setInformationWithComplaintManagementPersonAndGeneratesComplaintAndObservationAndFiledComplaint(String managementPerson, String generatesComplaint, String observation, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_DOCUMENTATION));
            Thread.sleep(2000);
            actor.attemptsTo(DocumentationCNMTask.withInformationDocumentationCNM(managementPerson, generatesComplaint,observation));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT_DOCUMENTATION));
            actor.attemptsTo(Click.on(BUTTON_SAVE_DOCUMENTATION));
            Thread.sleep(1000);

    }

    @When("^No set information documentation CNM$")
    public void noSetInformationDocumentationCNM() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_DOCUMENTATION));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_DOCUMENTATION));
        Thread.sleep(1000);
    }

    @Then("^user view the modal save documentation CNM with (.*)$")
    public void userViewTheModalSaveDocumentationCNMWith(String messageModal) {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));
    }

}
