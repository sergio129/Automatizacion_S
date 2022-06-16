package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Tareas.Parametrizacion.RamosTask;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.RamosPage.*;

public class RamosStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create bouquets parameterization$")
    public void ICreateBouquetsParameterization() {
    }

    @And("^I enter bouquets parameterization$")
    public void IEnterBouquetsParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPTION_BOUQUETS_PARAMETERIZATION).andThen(actions -> actions.click()));
    }

    @And("^I select button create bouquets parameterization$")
    public void ISelectButtonCreateBouquetsParameterization() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_BOUQUETS));
    }

    @And("^I write information in bouquets parameterization and save(.*),(.*)$")
    public void WriteInformationInBouquetsParameterization(String linea, String branch) {
        actor.attemptsTo(RamosTask.whthBouquetsTaskParameterization(linea, branch));

    }

    @Then("^Mostramos el mensaje de la modal de ramos(.*)$")
    public void mostramosElMensajeDeLaModalDeRamos(String message ) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().contains(message));
    }
}
