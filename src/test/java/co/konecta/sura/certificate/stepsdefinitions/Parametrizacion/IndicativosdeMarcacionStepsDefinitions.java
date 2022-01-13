package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Tareas.Parametrizacion.IndicativosdeMarcacionTask;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
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

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.IndicativosdeMarcacionPage.*;

public class IndicativosdeMarcacionStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition of delete dialing codes parameterization$")
    public void ICreateOrEditionOfDeleteDialingCodesParameterization() {

    }

    @And("^I enter dialing codes parameterization$")
    public void IEnterDialingCodesParameterization() throws InterruptedException {
        Thread.sleep(500);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                Click.on(HomePage.OPTION_DIALING_CODES_PARAMETERIZATION)
        );
    }

    @And("^I select button create dialing codes parameterization$")
    public void ISelectButtonCreateDialingCodesParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_DIALING));
        Thread.sleep(500);
    }

    @And("^I Write information in dialing codes parameterization(.*) and (.*) and (.*)$")
    public void IWriteInformationInDialingCodesParameterization(String department, String municipality, String indicative) {
        actor.attemptsTo(IndicativosdeMarcacionTask.WriteInformationDialingCodesParameterizationTask(department, municipality, indicative));
    }

    @And("^I select button search dialing codes parameterization(.*) and (.*)$")
    public void ISelectButtonSearchDialingCodesParameterization(String department, String municipality) throws InterruptedException {
        actor.attemptsTo(
                Click.on(INPUT_DEPARTMENT_DEALING_HOME),
                Enter.theValue(department).into(INPUT_SEARCH_DEPARTMENT_DEALING_HOME),
                Click.on(BUTTON_SELECT_DEPARTMENT_DEALING_HOME));
        Thread.sleep(3000);
        actor.attemptsTo(
                Click.on(INPUT_MUNICIPALITY_DEALING_HOME),
                Enter.theValue(municipality).into(INPUT_SEARCH_MUNICIPALITY_DEALING_HOME).thenHit(Keys.ENTER),
                Click.on(BUTTON_SEARCH_DEALING)

        );

    }

    @And("^I select button edit dialing codes parameterization$")
    public void ISelectButtonEditDialinngCodesParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_EDIT_DEALING));
    }

    @And("^I select button Save dialing codes parameterization$")
    public void ISelectButtonSaveDialinngCodesParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_SAVE_DEALING));
    }

    @And("^I select button delete dialing codes parameterization$")
    public void ISelectButtonDeleteDialingCodesParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_DELETE_DEALING),
                Click.on(OPTION_YES_DEALING)
        );
        Thread.sleep(500);
    }

    @Then("^I view the modal save dialing codes parameterization (.*)$")
    public void IViewTheModalSaveBouquetsParameterization(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }


}
