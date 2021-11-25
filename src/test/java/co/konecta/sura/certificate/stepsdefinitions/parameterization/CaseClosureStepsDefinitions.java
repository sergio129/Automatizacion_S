package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.CaseClosureTask;
import co.konecta.sura.certificate.userinterface.home.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.home.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.parameterization.CaseClosurePage.*;

public class CaseClosureStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete a case closure parameterization$")
    public void iCreateOrEditionACaseClosureParameterization() {
    }

    @And("^I entering case closure parameterization$")
    public void iEnteringCaseClosureParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_CASE_CLOSURE_PARAMETERIZATION));
    }

    @And("^I select button create case closure parameterization$")
    public void iSelectButtonCreateCaseClosureParameterization() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_CLOSURE));
    }

    @And("^I select button edition case closure parameterization$")
    public void iSelectButtonEditionCaseClosureParameterization() {
        actor.attemptsTo(Click.on(BUTTON_EDIT_CLOSURE));
    }

    @And("^I select button delete case closure parameterization$")
    public void iSelectButtonDeleteCaseClosureParameterization() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_CLOSURE),
                Click.on(OPTION_YES_CLOSURE_PARAMETERIZATION));
    }

    @And("^I type information in the case closure parameterization with the line (.*) and service (.*) and field (.*)$")
    public void iTypeInformationInTheCaseClosureParameterizationWithTheLineAndServiceAndField(String lineClosure, String serviceClosure, String fieldClosure) {
        actor.attemptsTo(CaseClosureTask.withInformationClosureParameterization(lineClosure,serviceClosure,fieldClosure));
    }

    @And("^I no type information case closure parameterization$")
    public void iNoTypeInformationCaseClosureParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_CLOSURE));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_CLOSURE));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save case closure parameterization with (.*)$")
    public void iViewTheModalSaveCaseClosureParameterizationWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}
