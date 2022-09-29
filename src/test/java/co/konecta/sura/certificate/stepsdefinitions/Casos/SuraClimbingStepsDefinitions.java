package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Tareas.Casos.EscalamientosSura.EscalamientosSuraTask;
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

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Casos.suraclimbing.SuraClimbingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SuraClimbingStepsDefinitions {


    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a sura climbing for a case$")
    public void iCreateOrEditionASuraClimbingForACase() {
    }

    @And("^Seleccionamos el boton Editar Escalamiento sura$")
    public void iTypeInformationEditionInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservations() throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(Click.on(MODULE_EXPANSION_CLIMBING));
        actor.attemptsTo(Click.on(BUTTON_EDIT_CLIMBING));
        Thread.sleep(2000);
    }

    @And("^Seleccionamos el boton Crear Escalamientos Sura$")
    public void iTypeInformationComplaintInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndFiledComplaintAndObservations() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
        Thread.sleep(2000);

    }

    @And("^I type information edition complaint in the fields management type (.*) and management person (.*) and response type (.*) and generates complaint (.*) and observations (.*) and filed complaint (.*)$")
    public void iTypeInformationEditionComplaintInTheFieldsManagementTypeAndManagementPersonAndResponseTypeAndGeneratesComplaintAndObservationsAndFiledComplaint(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations, String filedComplaint) throws InterruptedException {
        actor.attemptsTo(Click.on(MODULE_EXPANSION_CLIMBING));
        actor.attemptsTo(Click.on(BUTTON_EDIT_CLIMBING));
        Thread.sleep(2000);
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT));
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
            Thread.sleep(1000);
    }

    @And("^I no type information sura climbing$")
    public void iNoTypeInformationSuraClimbing() throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_CLIMBING));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save sura climbing with (.*)$")
    public void iViewTheModalSaveSuraClimbing(String messageModal) throws Exception {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));

    }

    @And("Escribimos la informacion de Escalamientos Sura")
    public void escribimosLaInformacionDeEscalamientosSura(List<Map<String, String>> EscalamientoSura) throws InterruptedException {
        actor.attemptsTo(EscalamientosSuraTask.withInformationSuraClimbing(EscalamientoSura));
        actor.attemptsTo(Click.on(BUTTON_SAVE_CLIMBING));
        Thread.sleep(1000);
    }
}
