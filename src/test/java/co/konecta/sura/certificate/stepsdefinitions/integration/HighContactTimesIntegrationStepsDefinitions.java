package co.konecta.sura.certificate.stepsdefinitions.integration;

import co.konecta.sura.certificate.task.integration.HighContactTimeIntegrationTask;
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

import static co.konecta.sura.certificate.userinterface.home.HomePage.MODAL_VALIDATION;

public class HighContactTimesIntegrationStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I management the high contact time integration$")
    public void IManagementTheHighContactTimeIntegration() {
    }

    @And("^I enter high contact times integration$")
    public void IEnterHighContactTimesIntegration() {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_INTEGRATION),
                Click.on(HomePage.OPTION_HIGH_CONTACT_TIMES_INTEGRATION)
        );
    }
    @And("^we make a filter(.*), we search and manage(.*)$")
    public void weMakeAFilterWeSearchAndManage(String line, String management){
        actor.attemptsTo(HighContactTimeIntegrationTask.writeInformationHighContact(line,management));

    }
    @Then("^I view the modal save high contact times integration(.*)$")
    public void iViewTheModalSaveHideMonitoringTasksParameterizationWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }
}
