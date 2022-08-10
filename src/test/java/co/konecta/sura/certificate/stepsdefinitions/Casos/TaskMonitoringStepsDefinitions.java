package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Casos.TareasDeMonitoreo.TaskMonitoringPage;
import co.konecta.sura.certificate.Tareas.Casos.taskmonitoring.TaskMonitoring;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
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

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I create or edition a task monitoring for a case$")
    public void iCreateATaskMonitoringForACase() {
    }

    @And("^Seleccionamos el boton crear tarea de monitoreo$")
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


    @And("^I no type information task monitoring$")
    public void noSetInformationTaskMonitoring() throws InterruptedException {
        actor.attemptsTo(Click.on(TaskMonitoringPage.BUTTON_CREATE_MONITORING));
        Thread.sleep(1000);

    }

    @Then("^I view the modal save task monitoring (.*)")
    public void userViewInTheInputMonitoring(String message) throws Exception {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }


    @And("^Seleccionamos el Boton Guardar Tarea de Monitoreo$")
    public void seleccionamosElBotonGuardarTareaDeMonitoreo() throws InterruptedException {
        actor.attemptsTo(Click.on(TaskMonitoringPage.BUTTON_SAVE_MONITORING));
        Thread.sleep(1000);
    }

    @And("^Escribimos los datos de la tare de monitoreo(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosLosDatosDeLaTareDeMonitoreoNombreTipoTareaFechaVencimientoHoraVencimientoUsuario(String Nombre, String TipoTarea, String FechaVencimiento, String HoraVencimiento, String Usuario) {
        actor.attemptsTo(TaskMonitoring.whitData(Nombre, TipoTarea, FechaVencimiento, HoraVencimiento, Usuario));
    }
}
