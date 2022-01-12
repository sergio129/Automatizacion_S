package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.task.Parametrizacion.PrefijosTask;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.userinterface.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.Parametrizacion.PrefijosPage.BOTON_CREAR_PREFIJOS;
import static co.konecta.sura.certificate.userinterface.Parametrizacion.PrefijosPage.BOTON_GUARDAR_PREFIJOS;


public class PrefijosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Creo, Edito y elimino Prefijos$")
    public void CreoEditoEliminoPrefijos() {
    }

    @And("^Entramos a parametrizacion prefijos$")
    public void EntramosParametrizacionPrefijos() throws InterruptedException {
        Thread.sleep(500);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.PARAMETRIZACION_PREFIJOS).andThen(actions -> actions.click())
        );
    }

    @And("^Selecionamos el boton creacion prefijos$")
    public void SelecionamosBotonCreacionPrefijos() {
        actor.attemptsTo(
                Click.on(BOTON_CREAR_PREFIJOS)
        );
    }

    @And("^Escribimos la informacion de prefijos linea(.*), servicio(.*), prefijos(.*)$")
    public void EscribimosInformacionLineaServicioPrefijos(String linea, String servicio, String prefijos) {
        actor.attemptsTo(PrefijosTask.EscriboInformacionPrefijos(linea, servicio, prefijos));

    }

    @And("^Selecionamos el boton guardar prefijos$")
    public void SelecionamosBotonGuardarPrefijos() {
        actor.attemptsTo(Click.on(BOTON_GUARDAR_PREFIJOS));
    }

    @Then("^Se visualiza mensaje de la modal parametrizacion prefijos (.*)$")
    public void SeVisualizaMensajeModalParametrizacionPrefijos(String message) throws InterruptedException {
        Thread.sleep(4000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }
}
