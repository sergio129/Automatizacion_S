package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Casos.listenending.EndingPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.listenending.Ending;
import co.konecta.sura.certificate.Tareas.Casos.listenending.EndingModel;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class SubmoduloFinalizacionStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    ;


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I create or edition a ending for a case$")
    public void iCreateAEndingForACase() {
    }


    @And("^I select button edition ending$")
    public void iSelectButtonEditionEnding() throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(Click.on(EndingPage.MODULE_EXPANSION_ENDING));
        actor.attemptsTo(Click.on(EndingPage.BUTTON_EDIT_ENDING));
        Thread.sleep(1000);
    }


    @And("^I no type information ending$")
    public void iNoTypeInformationEnding() throws InterruptedException {
        actor.attemptsTo(Click.on(EndingPage.BUTTON_CREATE_ENDING));
        Thread.sleep(2000);
        actor.attemptsTo(Click.on(EndingPage.BUTTON_SAVE_ENDING));
        Thread.sleep(1000);
    }


    @And("Escribimos informacion de Finalizacion")
    public void escribimosInformacionDeFinalizacion(List<Map<String, String>> Finalizacion) {
        actor.attemptsTo(Ending.whitDataEnding(Finalizacion));
    }

    @And("Seleccionamos el Boton Crear Finalizacion")
    public void seleccionamosElBotonCrearFinalizacion() {
        actor.attemptsTo(Click.on(EndingPage.BUTTON_CREATE_ENDING));
    }
}
