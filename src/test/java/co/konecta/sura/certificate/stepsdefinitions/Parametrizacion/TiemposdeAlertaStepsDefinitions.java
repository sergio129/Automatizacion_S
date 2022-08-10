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

    @And("^Entramos el el modulo de parametrizacion tiempos de alertas$")
    public void iEnteringAlertTimeParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_ALERT_TIME_PARAMETERIZATION)
        );
    }

    @And("^Seleccionamos el boton creacion tiempos de alertas$")
    public void iSelectButtonCreateAlertTime() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_ALERT_TIME));
    }

    @And("^Seleccionamos el boton editar tiempos de alertas$")
    public void iSelectButtonEditionAlertTime() {
        actor.attemptsTo(Click.on(BUTTON_EDIT_ALERT_TIME));
    }

    @And("^Seleccionamos el boton eliminar tiempos de alertas$")
    public void iSelectButtonDeleteAlertTime() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_ALERT_TIME),
                Click.on(OPTION_YES_ALERT_TIME));
    }


    @And("^Escribimos la informacion de parametrizacion tiempos alerta, (.*), (.*), (.*)$")
    public void escribimosLaInformacionDeParametrizacionTiemposAlertaLineaServicioTiempo(String Linea, String Servicio, String Tiempo) {
        actor.attemptsTo(TiemposDeAlertaTask.withInformationAlertTime(Linea, Servicio,Tiempo));

    }
}
