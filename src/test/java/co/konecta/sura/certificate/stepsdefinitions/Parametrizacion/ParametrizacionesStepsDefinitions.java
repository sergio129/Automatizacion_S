package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Parametrizacion.BotDeOfertamientoPage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.BotMonitoreoTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;

public class ParametrizacionesStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Modulo Parametrizaciones")
    public void ModuloParametrizaciones(){};

    @And("^Entramos a Parametrizacion Bot de monitoreo$")
    public void entramosAParametrizacionBotDeMonitoreo() throws InterruptedException {
        actor.has(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                Click.on(BotDeOfertamientoPage.OPCION_BOT_MONITOREO)
        );
        Thread.sleep(3000);
    }

    @And("^Selecionamos el boton Crear Parametrizacion Bot Monitoreo$")
    public void selecionamosElBotonCrearParametrizacionBotMonitoreo() throws InterruptedException {
        actor.has(Click.on(BotDeOfertamientoPage.BOTON_AGREGAR_PARAMETRIZACION_BOT_MONITOREO));
        Thread.sleep(3000);
    }

    @And("^Escribimos datos Parametrizacion Bot de monitoreo: (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosDatosParametrizacionBotDeMonitoreoNombreGestionServicioLineaTipoServicioTipoTareaDepartamentoMunicipioServicioEspecial(String Nombre,String GestionServicio,String Linea,String TipoServicio,String TipoTarea,String Departamento,String Municipio,String ServicioEspecial) {
        actor.has(BotMonitoreoTask.EscribirDatosBotMonitoreo(Nombre,GestionServicio,Linea,TipoServicio,TipoTarea,Departamento,Municipio,ServicioEspecial));
    }

    @And("^Selecionamos el Boton Guardar Parametrizacion bot de monitoreo$")
    public void selecionamosElBotonGuardarParametrizacionBotDeMonitoreo() {
        actor.has(Click.on(BotDeOfertamientoPage.BOTON_GUARDAR));
    }
}
