package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Tareas.Parametrizacion.CodigosdeSalidaTask;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CodigosdeSalidaPage.*;

public class CodigosSalidaStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Creo, edito y elimino codigos de salida parametrizacion$")
    public void ICreateEditDeleteExitCodeParameterization() {
    }

    @And("^Entramos a parametrizacion codigos de salida$")
    public void IEnterExitCodeParameterization() throws InterruptedException {
        Thread.sleep(500);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPTION_EXIT_CODES_PARAMETERIZATION).andThen(actions -> actions.click()));
    }
    @And("^Selecionamos el boton creacion codigos de salida$")
    public void ISelectButtonCreateExitCodeParameterization(){
        actor.attemptsTo(
                Click.on(BUTTON_CREATE_EXIT_CODE)
        );
    }
    @And("^Escribimos la informacion de codigos de salida(.*) y (.*)$")
    public void IWriteInformationInExitCodeParameterization(String line, String code){
        actor.attemptsTo(
                CodigosdeSalidaTask.withInformationExitCode(line,code)
        );
    }
    @And("^Selecionamos el boton buscar codigos de salida (.*)$")
    public void ISelectButtonSearchExitCodeParameterization(String line) throws InterruptedException {
        actor.attemptsTo(
                Click.on(INPUT_LINE_EXIT_CODE_HOME));
               actor.attemptsTo(
                       Click.on(INPUT_SEARCH_LINE_EXIT_CODE_HOME),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_EXIT_CODE_HOME).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SEARCH_EXIT_CODE_HOME)
        );
    }
    @And("^Selecionamos boton de editar codigos de salida$")
    public void ISelectButtonEditExitCodeParameterization() throws InterruptedException {
        Thread.sleep(3000);
        actor.attemptsTo(
                Click.on(BUTTON_EDIT_EXIT_CODE_HOME));

    }

    @And("^Selecionamos boton de eliminar codigos de salida$")
    public void SelecionamosBotonEliminarCodigosSalida(){
        actor.attemptsTo(
                Click.on(BUTTON_DELETE_EXIT_CODE_HOME),
                Click.on(OPTION_YES_DELETE_EXIT_CODE_HOME)

        );
    }

    @And("^Selecionamos el boton guardar codigo de salida$")
    public void SelecionamosElBotonGuardar(){
        actor.attemptsTo(
                Click.on(BUTTON_SAVE_EXIT_CODE)
        );
    }

    @Then("^Se visualiza mensaje de la modal parametrizacion codigos de salida (.*)$")
    public void IViewTheModalSaveExitCodesParameterization(String message) throws InterruptedException {
        Thread.sleep(4000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }


}
