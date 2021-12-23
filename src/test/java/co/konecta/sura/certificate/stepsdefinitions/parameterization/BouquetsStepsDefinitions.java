package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.BouquetsTask;
import co.konecta.sura.certificate.userinterface.home.HomePage;
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
import static co.konecta.sura.certificate.userinterface.home.HomePage.*;
import static co.konecta.sura.certificate.userinterface.parameterization.BouquetsPage.*;
public class BouquetsStepsDefinitions {
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
        actor.attemptsTo(Click.on(BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_BOUQUETS_PARAMETERIZATION));
    }

    @And("^I select button create bouquets parameterization$")
    public void ISelectButtonCreateBouquetsParameterization() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_BOUQUETS));
    }

    @And("^I write information in bouquets parameterization and save(.*)$")
    public void WriteInformationInBouquetsParameterization(String branch) {
        actor.attemptsTo(BouquetsTask.whthBouquetsTaskParameterization(branch));

    }


    @Then("^I view the modal save  bouquets parameterization (.*)$")
    public void IViewTheModalSaveBouquetsParameterization(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().contains(message));
    }



}
