package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.HideMonitoringTasksTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.HideMonitoringTasksPage.*;

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
        actor.attemptsTo(Click.on(HomePage.SCROLL_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_HIDE_MONITORING_TASKS_PARAMETERIZATION)
        );
    }

    @And("^I select button create hide monitoring tasks$")
    public void iSelectButtonCreateHideMonitoringTasks() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_HIDE_TASK));
    }


    @And("^I type filters with the line (.*) and the service (.*) and the task type (.*) and select button search hide monitoring task parameterization and select button edition hide monitoring tasks$")
    public void iTypeFiltersWithTheLineAndTheServiceAndTheTaskTypeAndSelectButtonEditionHideMonitoringTasks(String lineFilter, String serviceFilter, String taskTypeFilter) throws InterruptedException {
        actor.attemptsTo(Click.on(INPUT_FILTER_LINE_HIDE_TASK),
                Enter.theValue(lineFilter).into(INPUT_SEARCH_FILTER_LINE_HIDE_TASK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_FILTER_SERVICE_HIDE_TASK),
                Enter.theValue(serviceFilter).into(INPUT_SEARCH_FILTER_SERVICE_HIDE_TASK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_FILTER_TYPE_HIDE_TASK),
                Enter.theValue(taskTypeFilter).into(INPUT_SEARCH_FILTER_TYPE_HIDE_TASK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SEARCH_HIDE_TASK));
                Thread.sleep(5000);
                actor.attemptsTo(Click.on(BUTTON_EDIT_HIDE_TASK));
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
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_HIDE_TASK));
        Thread.sleep(1000);
    }



}
