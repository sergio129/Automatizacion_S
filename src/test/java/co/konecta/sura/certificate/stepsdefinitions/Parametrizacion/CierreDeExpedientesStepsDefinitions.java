package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CierreDeExpedientePage.*;

public class CierreDeExpedientesStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Gestion la Creacion, Edicion y eliminacion de parametrizacion cierre de expediente")
    public void GestionLaCreacionEdicionEliminacionDeParametrizacionCierreDeExpediente(){}

    @And("^Entramos Parametrizacion Cierre de Expediente$")
    public void entramosParametrizacionCierreDeExpediente() throws InterruptedException {
        Thread.sleep(500);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPCION_CIERRE_EXPEDIENTE).andThen(actions -> actions.click())
        );
    }

    @And("^Seleccionamos el boton crear Parametrizacion Cierre de Expediente$")
    public void seleccionamosElBotonCrearParametrizacionCierreDeExpediente() throws InterruptedException {
        actor.has(Click.on(BOTON_CREAR_CIERRE_EXPEDIENTE));
        Thread.sleep(3000);
    }

    @And("^Escribimos la informacion de parametrizacion Cierre de Expediente(.*),(.*),(.*)$")
    public void escribimosLaInformacionDeParametrizacionCierreDeExpedienteLineaServicioCampo(String linea, String servicio, String Campo) {

    }
}
