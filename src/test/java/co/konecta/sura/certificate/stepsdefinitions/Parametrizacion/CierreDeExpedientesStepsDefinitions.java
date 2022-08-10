package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.CierreExpedientesTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CierreDeExpedientePage.*;

public class CierreDeExpedientesStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Gestion la Creacion, Edicion y eliminacion de parametrizacion cierre de expediente")
    public void GestionLaCreacionEdicionEliminacionDeParametrizacionCierreDeExpediente() {
    }

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
        Thread.sleep(1000);
    }

    @And("^Escribimos la informacion de parametrizacion Cierre de Expediente(.*),(.*),(.*)$")
    public void escribimosLaInformacionDeParametrizacionCierreDeExpedienteLineaServicioCampo(String linea, String servicio, String Campo) {
        actor.has(CierreExpedientesTask.EscribirInformacionCierreExpediente(linea, servicio, Campo));

    }

    @And("^Seleccionamos el boton guardar Parametrizacion Cierre de Expediente$")
    public void seleccionamosElBotonGuardarParametrizacionCierreDeExpediente() {
        actor.has(Click.on(BOTON_GUARDAR_CIERRE_EXPEDIENTE));
    }


    @And("^Buscamos Parametrizacion Cierre de expediente por Linea:\"([^\"]*)\", Servicio:\"([^\"]*)\"$")
    public void buscamosParametrizacionCierreDeExpedientePorLineaServicio(String linea, String servicio) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        actor.has(
                Click.on(CAMPO_LINEA_INICIO),
                Enter.theValue(linea).into(BUSCAR_LINEA_INICIO),
                Click.on(SELECCIONAR_LINEA_INICIO),
                Hit.the(Keys.ESCAPE).into(BUSCAR_LINEA_INICIO),
                Click.on(CAMPO_SERVICIO_INICIO),
                Enter.theValue(servicio).into(BUSCAR_SERVICIO_INICIO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BOTON_BUSCAR_CIERRE_EXPEDIENTE)
        );
        Thread.sleep(3000);

    }

    @And("^Seleccionamos el boton Editar Parametrizacion Cierre de Expediente$")
    public void selecionamosElBotonEditarParametrizacionCierreDeExpediente() {
        actor.has(Click.on(BOTON_EDITAR_CIERRE_EXPEDIENTE));
    }

    @And("^Seleccionamos el Boton Eliminar Parametrizacion Cierre de Expediente$")
    public void seleccionamosElBotonEliminarParametrizacionCierreDeExpediente() {
        actor.has(Click.on(BOTON_ELIMINAR_CIERRE_EXPEDIENTE), Click.on(OPCION_SI_ELIMINAR_CIERRE_EXPEDIENTE));
    }

}
