package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.userinterface.home.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.HomePage.BUTTON_INITIAL_TAB;
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
        actor.attemptsTo();
    }
}
