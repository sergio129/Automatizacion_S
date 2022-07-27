package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Interfaces.Integracion.TableroCitasReprogramadosPage;
import co.konecta.sura.certificate.Interfaces.Integracion.TableroControlOfertamientoPage;
import co.konecta.sura.certificate.Tareas.Integracion.TableroCitasReprogramadasTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

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


    @And("Entramos a Citas Reprogramadas, Buscamos por filtros, Estado del servicio: {string}, linea: {string} y Departamento: {string}")
    public void entramosACitasReprogramadasBuscamosPorFiltrosEstadoDelServicioLineaYDepartamento(String arg0, String arg1, String arg2) throws InterruptedException {
        actor.has(MoveMouse.to(TableroCitasReprogramadosPage.OPCION_CITAS_REPROGRAMADAS).andThen(actions -> actions.click()));
        Thread.sleep(5000);
        actor.has(TableroCitasReprogramadasTask.FiltrarCampos(arg0, arg1, arg2));
    }

    @And("Gestionamos la opcion de actualizacion masiva de citas reprogramadas, Usuario: {string}, Estado: {string}")
    public void gestionamosLaOpcionDeActualizacionMasivaDeCitasReprogramadas(String arg0, String arg1) {
        actor.has(
                Click.on(TableroCitasReprogramadosPage.ACCIONES_CASOS_SELECCIONADOS),
                Click.on(TableroCitasReprogramadosPage.OPCION_ACTUALIZACION_MASIVA),
                Click.on(TableroCitasReprogramadosPage.CAMPO_USUARIO),
                Enter.theValue(arg0).into(TableroCitasReprogramadosPage.CAMPO_BUSCAR_USUARIO).thenHit(Keys.ENTER),
                Click.on(TableroCitasReprogramadosPage.CAMPO_ESTADO),
                Click.on(TableroCitasReprogramadosPage.SELECIONAR_OPCION.of(String.valueOf(arg1))),
                Click.on(TableroCitasReprogramadosPage.CAMPO_GUARDAR)
        );

    }
}
