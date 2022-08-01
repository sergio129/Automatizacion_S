package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;

public class ServiciosDuplicadosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Se hace la gestion de los servicios que se crean duplicados")
    public void SeHaceGestionServiciosDuplicados() {
    }


    @And("^Entramos a Integracion Servicios Duplicados y Gestionamos$")
    public void entramosAIntegracionServiciosDuplicadosYGestionamos() throws InterruptedException {
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_INTEGRATION),
                Click.on(OPCION_SERVICIOS_DUPLICADOS));
        Thread.sleep(3000);
        actor.has(Click.on(GESTION_SERVICIOS_DUPLICADOS)

        );
    }

    @Then("^Se visualiza la ventana nuevamente para gestionar otro servicio(.*)$")
    public void seVisualizaLaVentanaNuevamenteParaGestionarOtroServicioModalmensaje(String modalmensaje) throws InterruptedException {
            actor.attemptsTo(
                    Ensure.that(BUTTON_INITIAL_TAB).text().isEqualTo(modalmensaje));
            Thread.sleep(3000);
        }

    }

