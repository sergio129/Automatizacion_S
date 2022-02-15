package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.PrefijosTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.PrefijosPage.*;


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

    @And("^Se filtra por linea(.*), Servicio(.*), prefijos(.*) y Buscamos$")
    public void SeFiltraLineaServicioPrefijosyBuscamos(String linea, String servicio, String prefijos) throws InterruptedException {
        actor.attemptsTo(
                Click.on(SELECCION_CAMPO_LINEA_INICIO),
                Enter.theValue(linea).into(BUSCAMOS_LINEA_INICIO),
                Click.on(SELECIONAMOS_LINEA_INICIO),
                Click.on(SELECCION_CAMPO_SERVICIO_INICIO),
                Enter.theValue(servicio).into(BUSCAMOS_SERVICIO_INICIO).thenHit(Keys.ENTER),
                //Click.on(SELECCIONAR_SERVICIO_INICIO),
                Enter.theValue(prefijos).into(SELECCION_CAMPO_PREFIJOS_INICIO),
                Click.on(BOTON_BUSCAR_PREFIJOS)

        );
        Thread.sleep(500);

    }
    @And("^Selecionamos el boton editar prefijos$")
    public void SelecionamosBotonEditarPrefijos(){
        actor.attemptsTo(Click.on(BOTON_EDITAR_PREFIJOS));
    }

    @And("^Selecionamos el boton eliminar prefijos$")
    public void SelecionamosBotonEliminarPrefijos(){
        actor.attemptsTo(Click.on(BOTON_ELIMINAR_PREFIJOS),
                Click.on(OPCION_SI_ELIMINAR_PREFIJOS));
    }


}
