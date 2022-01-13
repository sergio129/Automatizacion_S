package co.konecta.sura.certificate.stepsdefinitions.listas;

import co.konecta.sura.certificate.task.listas.ListasAdministrarTask;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.Listas.ListasAdministrarPage.*;

public class AdministrarStepsDefinitions {


    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

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

    @And("^Selecionamos el boton crear listas administrar$")
    public void SelecionamosBotonCrearListasAdministrar() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(BOTON_CREAR_LISTAS));

    }



    @And("^Escribimos la informacion de listas administrar Nombre de lista(.*), nombre opcion(.*), id case(.*)$")
    public void EscribimosInformacionListasAdministrar(String nombrelista, String nombreopcion, String idcase) {
        actor.attemptsTo(ListasAdministrarTask.EscribimosInformacionListasAdministrar(nombrelista,nombreopcion,idcase));

    }
    @And("^Selecionamos el boton guardar listas administrar$")
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



    @Then("^Se visualiza mensaje de la modal listas administrar (.*)$")
    public void SeVisualizaMensajeModalListasAdministrar(String message) throws InterruptedException {
        Thread.sleep(4000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }
}