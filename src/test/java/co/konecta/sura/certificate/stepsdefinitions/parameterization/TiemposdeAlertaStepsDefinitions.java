package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.AlertTimeTask;
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
import static co.konecta.sura.certificate.userinterface.parameterization.TiemposdeAlertaPage.*;


public class TiemposdeAlertaStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete alert time parameterization$")
    public void iCreateEditionOrDeleteAlertTimeParameterization() {
    }

    @And("^I entering alert time parameterization$")
    public void iEnteringAlertTimeParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_ALERT_TIME_PARAMETERIZATION)
        );
    }

    @And("^I select button create alert time$")
    public void iSelectButtonCreateAlertTime() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_ALERT_TIME));
    }

    @And("^I select button edition alert time$")
    public void iSelectButtonEditionAlertTime() {
        actor.attemptsTo(Click.on(BUTTON_EDIT_ALERT_TIME));
    }

    @And("^I select button delete alert time$")
    public void iSelectButtonDeleteAlertTime() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_ALERT_TIME),
                Click.on(OPTION_YES_ALERT_TIME));
    }

    @And("^I type information in the alert time with the service (.*) and the time (.*)$")
    public void iTypeInformationInTheAlertTimeWithTheServiceAndTheTime(String serviceAlertTime, String time) {
        actor.attemptsTo(AlertTimeTask.withInformationAlertTime(serviceAlertTime, time));
    }

    @Then("^I view the modal save alert time parameterization with (.*)$")
    public void iViewTheModalSaveAlertTimeParameterizationWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}
