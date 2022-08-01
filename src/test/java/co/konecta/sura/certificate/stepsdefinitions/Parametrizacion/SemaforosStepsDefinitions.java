package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.SemaforosTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.SemaforosPage.*;


public class SemaforosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a traffic light parameterization$")
    public void iCreateOrEditionATrafficLightParameterization() {
    }


    @And("^I entering traffic light parameterization$")
    public void iEnteringTrafficLightParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.has(MoveMouse.to(HomePage.OPTION_TRAFFIC_LIGHT_PARAMETERIZATION).andThen(actions -> actions.click()));

    }

    @And("^I select button create traffic light parameterization$")
    public void iSelectButtonCreateTrafficLightParameterization() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_TRAFFIC_LIGHT));
    }

    @And("^I type search in the traffic light parameterization with the roles (.*)$")
    public void iSearchEditionTrafficLightParameterization(String roleTrafficLight) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Click.on((INPUT_ROLE_TRAFFIC_LIGHT2)),
                Enter.theValue(roleTrafficLight).into(INPUT_SEARCH_ROLE_TRAFFIC_LIGHT2).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_BUSCAR_TRAFFIC_LIGHT));
    }

    @And("^I select button edition traffic light parameterization$")
    public void iSelectButtonEditionTrafficLightParameterization() throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(Click.on(BUTTON_EDIT_TRAFFIC_LIGHT));
    }

    @And("^I select button delete traffic light parameterization$")
    public void iSelectButtonDeleteTrafficLightParameterization() {
        actor.attemptsTo(
                Click.on(BUTTON_DELETE_TRAFFIC_LIGHT),
                Click.on(OPTION_YES_DELETE_TRAFFIC_LIGHT));
    }

    @And("^I type information in the traffic light parameterization with the roles (.*) and service status (.*) and line (.*) and service (.*) and from1 (.*) and until1 (.*) and from2 (.*) and until2 (.*) and from3 (.*) and until3 (.*) and from4 (.*) and until4 (.*) and from5 (.*) and until5 (.*) and from6 (.*) and until6 (.*)$")
    public void iTypeInformationInTheTrafficLightParameterizationWithTheRolesAndServiceStatusAndLineAndServiceAndFromAndUntilAndFromAndUntilAndUntilAndFromAndUntilAndFromAndUntilAndFromAndUntil(String roleTrafficLight, String serviceStatusTraffic, String lineTrafficLight, String serviceTrafficLight, String from1TrafficLight, String until1TrafficLight, String from2TrafficLight, String until2TrafficLight, String from3TrafficLight, String until3TrafficLight, String from4TrafficLight, String until4TrafficLight, String from5TrafficLight, String until5TrafficLight, String from6TrafficLight, String until6TrafficLight) {
            actor.attemptsTo(SemaforosTask.withInformationTrafficLight(roleTrafficLight,serviceStatusTraffic, lineTrafficLight, serviceTrafficLight, from1TrafficLight, until1TrafficLight, from2TrafficLight, until2TrafficLight, from3TrafficLight, until3TrafficLight, from4TrafficLight, until4TrafficLight, from5TrafficLight, until5TrafficLight, from6TrafficLight, until6TrafficLight));
    }

    @And("^I no type information traffic light parameterization$")
    public void iNoTypeInformationTrafficLightParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_TRAFFIC_LIGHT));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_TRAFFIC_LIGHT));
        Thread.sleep(1000);
    }



}
