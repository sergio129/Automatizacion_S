package co.konecta.sura.certificate.stepsdefinitions.listas;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.listas.ListasAsociarListaTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;
import static co.konecta.sura.certificate.Interfaces.Listas.ListasAdministrarPage.*;
import static co.konecta.sura.certificate.Interfaces.Listas.ListasAsociarListasPage.*;


public class ListasAsociarListaStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    public final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Creacion, Edicion y Eliminar Listar Asociar listas$")
    public void CreacionEdicionEliminarListarAsociarLista() {
    }

    @And("^Entramos a listas Asociacion listas$")
    public void entramosAListasAsociacionListas() throws InterruptedException {
        Thread.sleep(5000);
        actor.wasAbleTo(
                Click.on(GLOBAL_MENU),
                Click.on(BUTTON_LIST),
                Click.on(OPCION_ASOCIAR_LISTAS));
    }

    @And("^Click Boton crear Asociar Lista$")
    public void clickBotonCrearAsociarLista() throws InterruptedException {
        actor.wasAbleTo(Click.on(BOTON_CREAR_ASOCIAR_LISTA));
        Thread.sleep(500);
    }

    @And("^Escribimos informacion Listas a asociar(.*),(.*),(.*),(.*)Guardamos$")
    public void escribimosInformacionListasAAsociarListaPadeOptListaPadreListaHijaOptListaHija(String ListaPadre, String OptListaPadre, String ListaHija, String OptListaHija) {
        actor.has(ListasAsociarListaTask.EscribirInformacion(ListaPadre, OptListaPadre, ListaHija, OptListaHija));
    }

    @And("^Buscamos Asociacion de Lista(.*),(.*)$")
    public void buscamosAsociacionDeListaBuscarListaBuscarOpcion(String BuscarLista, String BuscarOpcion) {
        actor.has(
                Click.on(CAMPO_LISTA_INICIO),
                Enter.theValue(BuscarLista).into(BUSCAR_LISTA_INICIO).thenHit(Keys.ENTER),
                Click.on(CAMPO_OPCION_LISTA_INICIO),
                Enter.theValue(BuscarOpcion).into(BUSCAR_OPCION_LISTA_INICIO).thenHit(Keys.ENTER)
        );
    }

    @And("^Click Boton Editar Asociar Lista$")
    public void clickBotonEditarAsociarLista() {
        actor.has(Click.on(BOTON_EDITAR_ASOCIAR_LISTA));
    }

    @And("^Click Boton Eliminar Asociar Lista$")
    public void clickBotonEliminarAsociarLista() {
        actor.has(
                Click.on(BOTON_ELIMINAR_ASOCIAR_LISTA),
                Click.on(OPCION_SI_ELIMINAR_ASOCIAR_LISTA)
        );
    }

    @And("^Click Boton Guardar Asociar Lista$")
    public void clickBotonGuardarAsociarLista() {
        actor.has(Click.on(BOTON_GUARDAR_ASOCIAR_LISTA));
    }
}
