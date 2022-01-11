package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.ExitCodeParameterizationTask;
import co.konecta.sura.certificate.userinterface.home.HomePage;
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

import static co.konecta.sura.certificate.userinterface.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.userinterface.home.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.parameterization.ExitCodeParameterizationPage.*;

public class ParametrizacionCodigosSalidaStepsDefinitions {

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
                //Click.on(HomePage.SCROLL_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPTION_EXIT_CODES_PARAMETERIZATION).andThen(actions -> actions.click()));

                //Click.on(HomePage.OPTION_EXIT_CODES_PARAMETERIZATION));


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
                ExitCodeParameterizationTask.withInformationExitCode(line,code)
        );
    }
    @And("^Selecionamos el boton buscar codigos de salida (.*)$")
    public void ISelectButtonSearchExitCodeParameterization(String line) throws InterruptedException {
        actor.attemptsTo(
                Click.on(INPUT_LINE_EXIT_CODE_HOME));
        Thread.sleep(5000);
               actor.attemptsTo(
                       Click.on(INPUT_SEARCH_LINE_EXIT_CODE_HOME),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_EXIT_CODE_HOME).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SEARCH_EXIT_CODE_HOME)
        );
    }
    @And("^Selecionamos boton de editar codigos de salida$")
    public void ISelectButtonEditExitCodeParameterization(){
        actor.attemptsTo(Click.on(BUTTON_EDIT_EXIT_CODE_HOME));
    }



    @Then("^Se visualiza mensaje de la modal parametrizacion codigos de salida (.*)$")
    public void IViewTheModalSaveExitCodesParameterization(String message) throws InterruptedException {
        Thread.sleep(4000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }


}
