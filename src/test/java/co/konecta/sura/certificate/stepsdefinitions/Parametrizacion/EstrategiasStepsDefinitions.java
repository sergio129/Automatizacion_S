package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.EstrategiaTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.EstrategiaPage.*;


public class EstrategiasStepsDefinitions {


    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I edition a strategy parameterization$")
    public void iEditionAStrategyParameterization() {


    }


    @And("^I entering strategy parameterization$")
    public void iEnteringStrategyParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPTION_STRATEGY_PARAMETERIZATION).andThen(actions -> actions.click())
        );


    }

    @And("^I type information in the contingency strategy with the name contingency search (.*) and the description (.*)$")
    public void iTypeInformationInTheContingencyStrategyWithTheDescription(String nameContingencySearch, String contingencyDescription) throws InterruptedException {

        actor.attemptsTo(
                Enter.theValue(nameContingencySearch).into(INPUT_SEARCH_STRATEGY_NAME),
                Click.on(BUTTON_SEARCH_STRATEGY));
        Thread.sleep(3000);
        actor.attemptsTo(
                Click.on(BUTTON_EDIT_CONTINGENCY_STRATEGY),
                EstrategiaTask.withInformationStrategy(contingencyDescription));

    }


    @And("^I type information in the coordination strategy with the description (.*) and the time assignment (.*) and the first expiration (.*) and the second expiration (.*)$")
    public void iTypeInformationInTheCoordinationStrategyWithTheDescriptionAndTheTimeAssignmentAndTheFirstExpirationAndTheSecondExpiration(String contingencyDescription, String timeAssignment, String firstExpiration, String secondExpiration) {
        actor.attemptsTo(

                EstrategiaTask.withInformationStrategy(contingencyDescription),
               // Click.on(INPUT_COORDINATION_STRATEGY),
                //Hit.the(Keys.ARROW_UP).into(INPUT_COORDINATION_STRATEGY),
                Enter.theValue(timeAssignment).into(INPUT_TIME_ASSIGNMENT),
                Enter.theValue(firstExpiration).into(INPUT_FIRST_EXPIRATION_TIME),
                Enter.theValue(secondExpiration).into(INPUT_SECOND_EXPIRATION_TIME),
                Click.on(BUTTON_SAVE_STRATEGY)
        );
    }

    @And("^I type information in the monitoring strategy with the description (.*) and the preventive time (.*) and the time monitoring site (.*) and the time monitoring completion (.*)$")
    public void iTypeInformationInTheMonitoringStrategyWithTheDescriptionAndThePreventiveTimeAndTheTimeMonitoringSiteAndTheTimeMonitoringCompletion(String contingencyDescription, String preventiveTime, String timeMonitoringSite, String timeMonitoringCompletion) {
        actor.attemptsTo(
                //Click.on(BUTTON_EDIT_MONITORING_STRATEGY),
                EstrategiaTask.withInformationStrategy(contingencyDescription),
                //Click.on(INPUT_MONITORING_STRATEGY),
                //Hit.the(Keys.ENTER).into(INPUT_MONITORING_STRATEGY),
                Enter.theValue(preventiveTime).into(INPUT_PREVENTIVE_MONITORING_TIME_),
                Enter.theValue(timeMonitoringSite).into(INPUT_TIME_MONITORING_SITE),
                Enter.theValue(timeMonitoringCompletion).into(INPUT_TIME_MONITORING_COMPLETION)
        );

    }

    @And("^I type information in the task monitoring strategy with the description (.*)$")
    public void iTypeInformationInTheTaskMonitoringStrategyWithTheDescriptionAndTheTaskMonitoring(String contingencyDescription) {
        actor.attemptsTo(Click.on(BUTTON_EDIT_TASK_STRATEGY),
                EstrategiaTask.withInformationStrategy(contingencyDescription),
                Click.on(INPUT_MONITORING_TASK),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ENTER).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ENTER).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ENTER).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ENTER).into(INPUT_MONITORING_TASK),
                Hit.the(Keys.ESCAPE).into(INPUT_MONITORING_TASK),
                Click.on(BUTTON_SAVE_STRATEGY)
        );

    }

    @And("^I type information in the services strategy with the description (.*) and the services (.*)$")
    public void iTypeInformationInTheServicesStrategyWithTheDescriptionAndTheServices(String contingencyDescription, String service) {
        actor.attemptsTo(Click.on(BUTTON_EDIT_SERVICES_STRATEGY),
                EstrategiaTask.withInformationStrategy(contingencyDescription),
                Click.on(INPUT_SERVICES_STRATEGY),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICES_STRATEGY).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SAVE_STRATEGY)
        );
    }

    @And("^I type information in the notification strategy with the name contingency search (.*) and the description (.*) and the notification message (.*) and the notification time (.*)$")
    public void iTypeInformationInTheNotificationStrategyWithTheDescriptionAndTheNotificationMessageAndTheNotificationTime(String nameContingencySearch2, String contingencyDescription, String notificationMessage, String notificationTime) {
        actor.attemptsTo(Click.on(BUTTON_EDIT_NOTIFICATION_STRATEGY),
                EstrategiaTask.withInformationStrategy(contingencyDescription),
                Click.on(INPUT_NOTIFICATION_MESSAGE_STATUS),
                Hit.the(Keys.ENTER).into(INPUT_NOTIFICATION_MESSAGE_STATUS),
                Enter.theValue(notificationMessage).into(INPUT_NOTIFICATION_MESSAGE),
                Enter.theValue(notificationTime).into(INPUT_NOTIFICATION_TIME),
                Click.on(BUTTON_SAVE_STRATEGY)
        );

    }
    @And("^I save button strategy parameterization$")
    public void ISaveButtonStrategyParameterization(){
        actor.attemptsTo(Click.on(BUTTON_SAVE_STRATEGY));
    }

}


