package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.CallReasonsTask.ServiceRequestTask;
import co.konecta.sura.certificate.userinterface.home.HomePage;
import co.konecta.sura.certificate.userinterface.parameterization.CallReasonsParameterizationPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.userinterface.home.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.home.HomePage.OPTION_MENU_PARAMETERIZATION;

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
                Click.on(HomePage.SCROLL_PARAMETERIZATION),
                Click.on(HomePage.OPTION_CALL_REASONS_PARAMETERIZATION));
    }
    @And("^I select button create call reasons parameterization$")
    public void ISelectButtonCreateCallReasonsParameterization(){
        actor.attemptsTo(Click.on(CallReasonsParameterizationPage.BUTTON_CREATE_CALL_REASONS));
    }
    @And("^I write information in call reasons parameterization and (.*) and (.*)$")
    public void IWriteInformationInCallReasonsParameterization(String name, String line){
actor.attemptsTo(ServiceRequestTask.writeInformationServiceRequest(name,line));

    }
    @And("^I Select button save call reasons parameterization$")
    public void ISelectButtonSaveCallReasonsParameterization(){
        actor.attemptsTo(Click.on(CallReasonsParameterizationPage.BUTTON_SAVE_CALL_REASONS));
    }
    @Then("^I view the modal save call reasons parameterization (.*)$")
    public void IViewTheModalSaveCallReasonsParameterization(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }
}
