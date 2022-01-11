package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.task.Casos.suraclimbing.SuraClimbingTask;
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
import static co.konecta.sura.certificate.userinterface.Casos.suraclimbing.SuraClimbingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SuraClimbingStepsDefinitions {


    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a sura climbing for a case$")
    public void iCreateOrEditionASuraClimbingForACase() {
    }



    @And("^I type information in the fields management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*)$")
    public void iTypeInformationInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservations(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations) throws InterruptedException {
            actor.attemptsTo(WaitUntil.the(BUTTON_CREATE_CLIMBING, isVisible()).forNoMoreThan(50).milliseconds(),
                    Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @And("^I type information edition in the fields management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*)$")
    public void iTypeInformationEditionInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservations(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations) throws InterruptedException {
            Thread.sleep(2000);
            actor.attemptsTo(Click.on(MODULE_EXPANSION_CLIMBING));
            actor.attemptsTo(Click.on(BUTTON_EDIT_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @And("^I type information complaint in the fields management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*) and filed complaint (.*)$")
    public void iTypeInformationComplaintInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndFiledComplaintAndObservations(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @And("^I type information edition complaint in the fields management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*) and filed complaint (.*)$")
    public void iTypeInformationEditionComplaintInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservationsAndFiledComplaint(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(MODULE_EXPANSION_CLIMBING));
            actor.attemptsTo(Click.on(BUTTON_EDIT_CLIMBING));
            Thread.sleep(2000);
            actor.attemptsTo(SuraClimbingTask.withInformationSuraClimbing(managementType, managementPerson, responseType, generatesComplaint, observations));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @And("^I no type information sura climbing$")
    public void iNoTypeInformationSuraClimbing() throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @Then("^I view the modal save sura climbing with (.*)$")
    public void iViewTheModalSaveSuraClimbing(String messageModal) throws Exception {
            actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));

    }

}
