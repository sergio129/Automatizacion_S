package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Interfaces.Integracion.TableroControlOfertamientoPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;


public class ModuloIntegracionStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Modulo Integracion")
    public void ModuloIntegracion() {
    }

    @And("^Entramos a el Modulo de Integracion$")
    public void entramosAElModuloDeIntegracion() {
        actor.has(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_INTEGRATION));
    }

    @And("^Ingresamos al SubModulo Tableros de control Ofertamiento y buscamos por Expediente:(.*)$")
    public void ingresamosAlSubModuloTablerosDeControlOfertamientoYBuscamosPorExpedienteExp(String Exp) throws InterruptedException {
        actor.has(
                MoveMouse.to(TableroControlOfertamientoPage.SUBMODULO_TABLERO_CONTROL_OFERTAMIENTO).andThen(actions -> actions.click()),
                Enter.theValue(Exp).into(TableroControlOfertamientoPage.CAMPO_BUSCAR_OFERTAMIENTO),
                Click.on(TableroControlOfertamientoPage.BOTON_BUSCAR_OFERTAMIENTO));
        Thread.sleep(3000);
    }

    @And("^Gestionamos y hacemos el Reofertamiento$")
    public void gestionamosYHacemosElReofertamiento() {
        actor.has(Click.on(TableroControlOfertamientoPage.BOTON_REOFERTAR),
                Click.on(TableroControlOfertamientoPage.BOTON_OK));

    }

    @Then("^Se muestra el mensaje que fue ofertado exitosamente(.*)$")
    public void seMuestraElMensajeQueFueOfertadoExitosamenteMensaje(String Mensaje) {
        actor.has(Ensure.that(TableroControlOfertamientoPage.LISTA_DE_OFERTAMIENTOS.of(String.valueOf(Mensaje))).text().isEqualTo(Mensaje));

    }
}
