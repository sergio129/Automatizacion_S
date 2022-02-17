package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Tareas.Parametrizacion.CallReasonsTask.FollowupToaServiceTask;
import co.konecta.sura.certificate.Tareas.Parametrizacion.CallReasonsTask.GeneralInformationTask;
import co.konecta.sura.certificate.Tareas.Parametrizacion.CallReasonsTask.ServiceRequestTask;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Parametrizacion.MotivosDeLlamadaPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_MENU_PARAMETERIZATION;

public class CallReasonsParameterizationStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edit and delete call reasons parameterization$")
    public void ICreateEditAndDeleteCallReasonsParameterization() {
    }

    @And("^I enter call reasons parameterization$")
    public void IEnterCallReasonsParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPTION_CALL_REASONS_PARAMETERIZATION).andThen(actions -> actions.click()));
    }

    @And("^I select button create call reasons parameterization$")
    public void ISelectButtonCreateCallReasonsParameterization() {
        actor.attemptsTo(Click.on(MotivosDeLlamadaPage.BUTTON_CREATE_CALL_REASONS));
    }

    @And("^I write information in call reasons Service Request parameterization and (.*) and (.*)$")
    public void IWriteInformationInCallReasonsParameterizationServiceRequest(String name, String line) {
        actor.attemptsTo(ServiceRequestTask.writeInformationServiceRequest(name, line));

    }

    @And("^I write information in call reasons Follow up To a Service parameterization and (.*) and (.*) and (.*)$")
    public void IWriteInformationInCallReasonsParameterizationFollowupToaService(String name, String line, String option) {
        actor.attemptsTo(FollowupToaServiceTask.writeInformationFollowupToaService(name, line, option));
    }
    @And("^I write information in call reasons general information parameterization and (.*) and (.*) and (.*)$")
    public void IWriteInformationCallReasonsGeneralInformationParameterization(String name, String line, String finalmanagement) {
        actor.attemptsTo(GeneralInformationTask.whiteGeneralInformation(name, line, finalmanagement));
    }

    @And("^I Select check catastrophic event$")
    public void ISelectCheckCatastrophicEvent() throws InterruptedException {
        Thread.sleep(300);
        actor.attemptsTo(Click.on(MotivosDeLlamadaPage.CHECK_CATASTROPHIC_EVENT));
    }

    @And("^I Select button save call reasons parameterization$")
    public void ISelectButtonSaveCallReasonsParameterization() {
        actor.attemptsTo(Click.on(MotivosDeLlamadaPage.BUTTON_SAVE_CALL_REASONS));
    }

    @Then("^I view the modal save call reasons parameterization (.*)$")
    public void IViewTheModalSaveCallReasonsParameterization(String message) throws InterruptedException {
        Thread.sleep(2000);
         actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}
