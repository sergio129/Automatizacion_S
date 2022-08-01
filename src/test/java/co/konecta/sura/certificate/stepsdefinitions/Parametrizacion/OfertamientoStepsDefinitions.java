package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.OfertamientoTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_MENU_PARAMETERIZATION;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.OfertamientoPage.*;

public class OfertamientoStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Creacion, Edicion y Activar-Desactivar Parametrizacion")
    public void CreacionEdicionActivarDesactivarParametrizacion() {
    }

    @And("^Entramos a Parametrizacion Ofertamiento$")
    public void entramosAParametrizacionOfertamiento() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_PARAMETERIZATION));
        actor.has(MoveMouse.to(OPCION_OFERTAMIENTO).andThen(actions -> actions.click()));
        Thread.sleep(3000);
    }

    @And("^Seleccionamos el boton crear parametrizacion de Ofertamiento$")
    public void selecionamosElBotonCrearParametrizacionDeOfertamiento() {
        actor.has(
                Click.on(BOTON_CREACION_DE_OFERTAMIENTO)
        );
    }

    @And("^Digitamos la informacion de la parametrizacion de ofertamiento(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void digitamosLaInformacionDeLaParametrizacionDeOfertamientoNombreCoordinacionOfertamientoTiempoLineaServicioDepartamentoMunicipio(String Nombre, String Coordinacion, String Ofertamiento, String Tiempo, String Linea, String Servicio, String Departamento, String Municipio) {
        actor.has(OfertamientoTask.EscribirInformacionOfertamiento(Nombre, Coordinacion, Ofertamiento, Tiempo, Linea, Servicio, Departamento, Municipio));
    }

    @And("^Seleccionamos el Boton de guardar Parametrizacion de Ofertamiento$")
    public void selecionamosElBotonDeGuardarParametrizacionDeOfertamiento() {
        actor.has(Click.on(BOTON_GUARDAR_OFERTAMIENTO));
    }

    @And("^Seleccionamos el boton Editar parametrizacion de Ofertamiento$")
    public void selecionamosElBotonEditarParametrizacionDeOfertamiento() {
        actor.has(Click.on(BOTON_EDITAR_OFERTAMIENTO));
    }

    @And("^Buscamos Parametrizacion de Ofertamiento por nombre: \"([^\"]*)\"$")
    public void buscamosParametrizacionDeOfertamientoPorNombre(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        actor.has(
                Enter.theValue(arg0).into(CAMPO_BUSCAR_OFERTAMIENTO)
        );
        Thread.sleep(3000);
    }

    @And("^Seleccionamos el boton de Activar/Desactivar Parametrizacion Ofertamiento$")
    public void selecionamosElBotonDeActivarDesactivarParametrizacionOfertamiento() {
        actor.has(Click.on(BOTON_ACTIVAR_OFERTAMIENTO));
    }
}

