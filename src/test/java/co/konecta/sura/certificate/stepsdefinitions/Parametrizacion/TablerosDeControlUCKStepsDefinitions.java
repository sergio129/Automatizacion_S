package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.TablerosDeControlUCKTask;
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
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosDeControlUCKPage.*;

public class TablerosDeControlUCKStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }
    @Given("Editar UCK")
    public void EditarUCK(){}

    @And("^Entramos a parametrizacion Tables de control uck$")
    public void entramosAParametrizacionTablesDeControlUck() throws InterruptedException {
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.PARAMETRIZACION_TABLEROS_CONTROL_UCK).andThen(actions -> actions.click())
        );
        Thread.sleep(3000);
    }

    @And("^Hacemos una busqueda por fecha de tableros uck(.*)$")
    public void hacemosUnaBusquedaPorFechaDeTablerosUck(String fecha) throws InterruptedException {
        actor.has(
                Click.on(FECHA_TABLERO_CONTROL_UCK),
                Click.on(SELECCIONAR_FECHA_UCK.of(String.valueOf(fecha))),
                Click.on(BOTON_BUSCAR_UCK)
        );
Thread.sleep(1000);
    }

    @And("^Escribimos la informacion de tableros uck(.*),(.*),(.*),(.*)$")
    public void escribimosLaInformacionDeTablerosUckMotivoAseguradoHabilitarObservacion(String motivo,String asegurado,String habilitar,String observacion) {
        actor.has(TablerosDeControlUCKTask.EscribirInformacionUCK(motivo,asegurado, habilitar, observacion));
    }
}
