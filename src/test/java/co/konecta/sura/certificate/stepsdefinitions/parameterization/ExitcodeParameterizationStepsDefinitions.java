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

public class ExitcodeParameterizationStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edit and delete exit code parameterization$")
    public void ICreateEditDeleteExitCodeParameterization() {
    }

    @And("^I enter exit code parameterization$")
    public void IEnterExitCodeParameterization() throws InterruptedException {
        Thread.sleep(500);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                Click.on(HomePage.SCROLL_PARAMETERIZATION),
                Click.on(HomePage.OPTION_STRATEGY_PARAMETERIZATION),
                Click.on(HomePage.SCROLL2_PARAMETERIZATION),
                Click.on(HomePage.OPTION_EXIT_CODES_PARAMETERIZATION));


    }


}
