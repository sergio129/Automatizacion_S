package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.TiemposDeAlertaTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TiemposdeAlertaPage.*;


public class TiemposdeAlertaStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


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
        actor.attemptsTo(TiemposDeAlertaTask.withInformationAlertTime(serviceAlertTime, time));
    }



}
