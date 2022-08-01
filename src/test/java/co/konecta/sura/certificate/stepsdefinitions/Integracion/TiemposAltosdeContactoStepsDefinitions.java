package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Tareas.Integracion.TiemposAltosdeContactoTask;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;

public class TiemposAltosdeContactoStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Gestion de tiempos altos de contacto$")
    public void IManagementTheHighContactTimeIntegration() {
    }

    @And("^Entro a integracion tiempos altos de contacto$")
    public void IEnterHighContactTimesIntegration() {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_INTEGRATION),
                MoveMouse.to(HomePage.OPTION_HIGH_CONTACT_TIMES_INTEGRATION).andThen(actions -> actions.click())
                //Click.on(HomePage.OPTION_HIGH_CONTACT_TIMES_INTEGRATION)
        );
    }
    @And("^Hacemos un filtro por (.*)y(.*)y(.*)y(.*) y buscamos(.*)$")
    public void weMakeAFilterWeSearchAndManage(String line,String servicio, String municipio, String familia,String management ){
        actor.attemptsTo(TiemposAltosdeContactoTask.writeInformationHighContact(line,servicio,municipio,familia,management));

    }
    @Then("Veo mensaje de gestion exitosa de tiempos altos de contacto(.*)$")
    public void iViewTheModalSaveHideMonitoringTasksParameterizationWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }
}
