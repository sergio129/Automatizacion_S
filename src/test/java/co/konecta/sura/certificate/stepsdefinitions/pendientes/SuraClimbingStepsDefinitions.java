package co.konecta.sura.certificate.stepsdefinitions.pendientes;

import co.konecta.sura.certificate.Tareas.pendientes.LoginTask;
import co.konecta.sura.certificate.Tareas.pendientes.SuraClimbingTask;
import co.konecta.sura.certificate.Interfaces.HomePage;
import co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
import static co.konecta.sura.certificate.Interfaces.pendientes.SuraClimbingPage.*;


public class SuraClimbingStepsDefinitions {


    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("^I am entry in the application sura climbing with user (.*) and password (.*)$")
    public void iAmEntryInThePageSupplierWith(String user, String password) {
            actor.wasAbleTo(Open.browserOn(homePage));
            actor.attemptsTo(LoginTask.whitCredentials(user,password));
    }

    @And("^I am entry and set number case (.*)$")
    public void iAmEntryAndSetNumberCaseClimbing(String numberCase) throws InterruptedException {
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

    @When("^set information sura climbing management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*)$")
    public void setInformationSuraClimbingManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservations(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @When("^set information edition sura climbing management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*)$")
    public void setInformationEditionSuraClimbingManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservations(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_CLIMBING));
            actor.attemptsTo(Click.on(BUTTON_EDIT_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @When("^set information sura climbing with complaint management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*) and filed complaint (.*)$")
    public void setInformationSuraClimbingWithComplaintManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndFiledComplaintAndObservations(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @When("^set information edition sura climbing with complaint management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*) and filed complaint (.*)$")
    public void setInformationEditionSuraClimbingWithComplaintManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservationsAndFiledComplaint(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_CLIMBING));
            actor.attemptsTo(Click.on(BUTTON_EDIT_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @When("^No set information sura climbing$")
    public void noSetInformationSuraClimbing() throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @Then("^user view the modal save sura climbing with (.*)$")
    public void userViewTheModalSuraClimbing(String messageModal) throws Exception {
            actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));

    }

}
