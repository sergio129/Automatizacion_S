package co.konecta.sura.certificate.stepsdefinitions.listas;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.listas.ListasAsociarListaTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
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

}
