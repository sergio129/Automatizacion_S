package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Parametrizacion.BotDeMonitoreoPage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.BotMonitoreoTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
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
                Click.on(BotDeMonitoreoPage.OPCION_BOT_MONITOREO)
        );
        Thread.sleep(3000);
    }

    @And("^Selecionamos el boton Crear Parametrizacion Bot Monitoreo$")
    public void selecionamosElBotonCrearParametrizacionBotMonitoreo() throws InterruptedException {
        actor.has(Click.on(BotDeMonitoreoPage.BOTON_AGREGAR_PARAMETRIZACION_BOT_MONITOREO));
        Thread.sleep(3000);
    }

    @And("^Escribimos datos Parametrizacion Bot de monitoreo: (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosDatosParametrizacionBotDeMonitoreoNombreGestionServicioLineaTipoServicioTipoTareaDepartamentoMunicipioServicioEspecial(String Nombre,String GestionServicio,String Linea,String TipoServicio,String TipoTarea,String Departamento,String Municipio,String ServicioEspecial) {
        actor.has(BotMonitoreoTask.EscribirDatosBotMonitoreo(Nombre,GestionServicio,Linea,TipoServicio,TipoTarea,Departamento,Municipio,ServicioEspecial));
    }

    @And("^Selecionamos el Boton Guardar Parametrizacion bot de monitoreo$")
    public void selecionamosElBotonGuardarParametrizacionBotDeMonitoreo() {
        actor.has(Click.on(BotDeMonitoreoPage.BOTON_GUARDAR));
    }

    @And("^Buscamos por nombre de Parametrizacion:\"([^\"]*)\"$")
    public void buscamosPorNombreDeParametrizacion(String arg0) throws Throwable {
    actor.has(Enter.theValue(arg0).into(BotDeMonitoreoPage.BUSCAR_NOMBRE));
    Thread.sleep(3000);
    }

    @And("^Seleccionamos el boton Editar Parametrizacion bot de monitoreo$")
    public void seleccionamosElBotonEditarParametrizacionBotDeMonitoreo() {
        actor.has(Click.on(BotDeMonitoreoPage.BOTON_EDITAR));
    }

    @And("^Selecionamos el boton de Habilitar/Inhabilitar módulo$")
    public void selecionamosElBotonDeHabilitarInhabilitarMódulo() {
        actor.has(Click.on(BotDeMonitoreoPage.BOTON_HABITAR_INHABILITAR_MODULO),Click.on(BotDeMonitoreoPage.BOTON_CONFIRMACION_HABILITAR_INHABILITAR));
    }

    @And("^Selecionamos el boton de Habilitar/Inhabilitar Parametrizacion$")
    public void selecionamosElBotonDeHabilitarInhabilitarParametrizacion() {
        actor.has(Click.on(BotDeMonitoreoPage.BOTON_HABITAR_INHABILITAR_PARAMETRIZACION));
    }
}
