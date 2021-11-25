package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.HideMonitoringTasksTask;
import co.konecta.sura.certificate.userinterface.home.HomePage;
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
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.home.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.parameterization.HideMonitoringTasksPage.*;

public class HideMonitoringTasksStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete a hide monitoring tasks parameterization$")
    public void iCreateEditionOrDeleteHideMonitoringTasksParameterization() {
    }

    @And("^I entering hide monitoring tasks parameterization$")
    public void iEnteringHideMonitoringTasksParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_HIDE_MONITORING_TASKS_PARAMETERIZATION)
        );
    }

    @And("^I select button create hide monitoring tasks$")
    public void iSelectButtonCreateHideMonitoringTasks() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_HIDE_TASK));
    }


    @And("^I type filters with the line (.*) and the service (.*) and the task type (.*) and select button edition hide monitoring tasks$")
    public void iTypeFiltersWithTheLineAndTheServiceAndTheTaskTypeAndSelectButtonEditionHideMonitoringTasks(String lineFilter, String serviceFilter, String taskTypeFilter) {
        actor.attemptsTo(Click.on(INPUT_FILTER_LINE_HIDE_TASK),
                Enter.theValue(lineFilter).into(INPUT_SEARCH_FILTER_LINE_HIDE_TASK),
                Click.on(INPUT_FILTER_SERVICE_HIDE_TASK),
                Enter.theValue(serviceFilter).into(INPUT_SEARCH_FILTER_SERVICE_HIDE_TASK),
                Click.on(INPUT_FILTER_TYPE_HIDE_TASK),
                Enter.theValue(serviceFilter).into(INPUT_SEARCH_FILTER_TYPE_HIDE_TASK),
                Click.on(BUTTON_SEARCH_HIDE_TASK),
                Click.on(BUTTON_EDIT_HIDE_TASK));
    }

    @And("^I select button delete hide monitoring tasks$")
    public void iSelectButtonDeleteHideMonitoringTasks() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_HIDE_TASK),
                Click.on(OPTION_YES_HIDE_TASK));
    }

    @And("^I type information in the hide monitoring tasks with the line (.*) and the service (.*) and the task type (.*)$")
    public void iTypeInformationInTheHideMonitoringTasksWithTheLineAndTheServiceAndTheTaskType(String lineTask, String serviceTask, String taskType) {
        actor.attemptsTo(HideMonitoringTasksTask.withInformationHideMonitoringTask(lineTask, serviceTask, taskType));
    }

    @And("^I no type information hide monitoring tasks$")
    public void iNoTypeInformationHideMonitoringTasks() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_HIDE_TASK));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_HIDE_TASK));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save hide monitoring tasks parameterization with (.*)$")
    public void iViewTheModalSaveHideMonitoringTasksParameterizationWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}
