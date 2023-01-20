package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Tareas.Casos.statemanagement.StateManagementTask;
import co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.Interfaces.Casos.statemanagement.StateManagementPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CambioEstadoExpedienteStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("^I performed case status changes$")
    public void iPerformedCaseStatusChanges() {
    }

    @And("^I type information in the field status name (.*)$")
    public void iTypeInformationInTheFieldStatusName(List<Map<String, String>> estado) throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(BUTTON_OPEN_MODAL),
                Click.on(BUTTON_ADD_STATUS));
        Thread.sleep(2000);
        actor.attemptsTo(StateManagementTask.withInformationStateManagement(estado), WaitUntil.the(BUTTON_INITIAL_TAB, isVisible()).forNoMoreThan(50000).milliseconds());

    }


    @And("^Hacemos Cambio de Estado$")
    public void HacemosCambioDeEstado(List<Map<String, String>> estado) throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(StateManagementTask.withInformationStateManagement(estado));
        Thread.sleep(3000);

    }

    @Then("^I view the modal save management status with (.*)$")
    public void iViewTheModalSaveManagementStatus(String messageModal) {
        actor.attemptsTo(
                Ensure.that(TITLE_DETAILS_CASE).text().isEqualTo(messageModal));
    }

}
