package co.konecta.sura.certificate.stepsdefinitions.listas;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.listas.ListaAdministrarEdicionTask;
import co.konecta.sura.certificate.Tareas.listas.ListasAdministrarTask;
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

import static co.konecta.sura.certificate.Interfaces.Listas.ListasAdministrarPage.*;

public class ListasAdministrarStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Crear, Editar, Desactivar administar listas$")
    public void iCreateOrEditionAList() {
    }

    @And("^Entramos a listas administrar$")
    public void iEnteringList() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(GLOBAL_MENU));
        actor.attemptsTo(Click.on(BUTTON_LIST));
        Thread.sleep(3000);
        actor.attemptsTo(Click.on(BUTTON_ADMIN));
        Thread.sleep(3000);
    }

    @And("^Seleccionamos el boton crear listas administrar$")
    public void SelecionamosBotonCrearListasAdministrar() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(BOTON_CREAR_LISTAS));
    }

    @And("^Escribimos la informacion de listas administrar Nombre de lista(.*), nombre opcion(.*), id case(.*)$")
    public void EscribimosInformacionListasAdministrar(String nombrelista, String nombreopcion, String idcase) {
        actor.attemptsTo(ListasAdministrarTask.EscribimosInformacionListasAdministrar(nombrelista, nombreopcion, idcase));
    }

    @And("^Seleccionamos el boton guardar listas administrar$")
    public void SelecionamosBotonGuardarListasAdministrar() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(BOTON_GUARDAR_LISTAS));
    }

    @And("^Buscamos(.*) y creamos la opcion(.*) y (.*) lista administar$")
    public void BuscamoCreamosOpcionListaAdministar(String nombrelista, String opcionnueva, String idcase) throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(
                Click.on(SELECCION_CAMPO_LISTAS_INICIO),
                Enter.theValue(nombrelista).into(BUSCAR_LISTAS_INICIO).thenHit(Keys.ENTER),
                Click.on(BOTON_AGREGAR_OPCION_INICIO),
                Enter.theValue(opcionnueva).into(NOMBRE_NUEVA_OPCION_INICIO).thenHit(Keys.ENTER),
                Enter.theValue(idcase).into(IDCASE_OPCION_INICIO),
                Click.on(BOTON_GUARDAR_OPCION_INICIO)
        );
    }

    @And("^Editamos (.*),(.*),(.*) Listas Administrar$")
    public void buscamosListaYOpcionListaEditamosNombreOpcionPosicionIdcaseListasAdministrar(String NombreOpcion, String Posicion, String idcase) {
        actor.attemptsTo(ListaAdministrarEdicionTask.EscriirInformacionEdicionListasAministrar(NombreOpcion, Posicion, idcase));
    }

    @And("^Buscamos(.*) y (.*) Listas Administrar$")
    public void buscamosListaYOpcionListaListasAdministrar(String Lista, String OpcionLista) {
        actor.attemptsTo(
                Click.on(SELECCION_CAMPO_LISTAS_INICIO),
                Enter.theValue(Lista).into(BUSCAR_LISTAS_INICIO).thenHit(Keys.ENTER),
                Enter.theValue(OpcionLista).into(BUSCAR_OPCION_LISTAS_INICIO)
        );
    }

    @And("^Seleccionamos el check activar/desactivar$")
    public void selecionamosElCheckActivarDesactivar() {
        actor.attemptsTo(Click.on(BOTON_ACTIVAR_DESACTIVAR_OPCION));
    }
}