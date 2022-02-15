package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Tareas.Casos.taskmonitoring.TaskMonitoring;
import co.konecta.sura.certificate.Tareas.Casos.taskmonitoring.TaskMonitoringModel;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Casos.TareasDeMonitoreo.TaskMonitoringPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Casos.TareasDeMonitoreo.TaskMonitoringPage.INPUT_STATE;

public class TaskMonitoringStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    private TaskMonitoringModel taskMonitoringModel = new TaskMonitoringModel();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I create or edition a task monitoring for a case$")
    public void iCreateATaskMonitoringForACase() {
    }

    @And("^I select button create monitoring task$")
    public void iCreateMonitoringTask() {
        actor.attemptsTo(Click.on(TaskMonitoringPage.BUTTON_CREATE_MONITORING));
    }

    @And("^I select button edition monitoring task$")
    public void iSelectButtonEditionMonitoringTask() {
        actor.attemptsTo(Click.on(TaskMonitoringPage.MODULE_EXPANSION_MONITORING));
        actor.attemptsTo(Click.on(TaskMonitoringPage.BUTTON_EDIT_MONITORING),
                Click.on(INPUT_STATE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_STATE),
                Hit.the(Keys.ENTER).into(INPUT_STATE)
        );
    }

    @And("^I type information in the field name (.*)$")
    public void iTypeInformationInTheFieldName(String name) throws Exception {
         this.taskMonitoringModel.setName(name);
            actor.attemptsTo(Enter.theValue( taskMonitoringModel.getName()).into(TaskMonitoringPage.INPUT_NAME));

    }

    @And("^I type information in the field state (.*)$")
    public void iEnterEditInformationInTheFieldState(String state) throws Exception {
        this.taskMonitoringModel.setState(state);
    }

    @And("^I type information in the field type (.*)$")
    public void iTypeInformationInTheFieldType(String type) throws Exception {
        this.taskMonitoringModel.setType(type);
    }

    @And("^I type information in the field date (.*)$")
    public void iTypeInformationInTheFieldDate(String date) throws Exception {
        this.taskMonitoringModel.setDate(date);
    }

    @And("^I type information in the field expired hour (.*)$")
    public void iTypeInformationInTheFieldExpiredHour(String hour) throws Exception {
        this.taskMonitoringModel.setHour(hour);
    }

    @And("^I type information in the field user (.*)$")
    public void iTypeInformationInTheFieldUser(String user) throws Exception {
        this.taskMonitoringModel.setUser(user);
        actor.attemptsTo(TaskMonitoring.whitData(taskMonitoringModel));
    }

    @And("^I no type information task monitoring$")
    public void noSetInformationTaskMonitoring() throws InterruptedException {
        actor.attemptsTo(Click.on(TaskMonitoringPage.BUTTON_CREATE_MONITORING));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(TaskMonitoringPage.BUTTON_SAVE_MONITORING));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save task monitoring (.*)")
    public void userViewInTheInputMonitoring(String message) throws Exception {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }


}
