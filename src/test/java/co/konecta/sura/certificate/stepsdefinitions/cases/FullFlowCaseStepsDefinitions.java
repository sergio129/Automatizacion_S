package co.konecta.sura.certificate.stepsdefinitions.cases;

import co.konecta.sura.certificate.task.cases.taskmonitoring.TaskMonitoringModel;
import co.konecta.sura.certificate.userinterface.cases.login.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.cases.login.HomePage.MODULE_EXPANSION_GENERAL;
import static co.konecta.sura.certificate.userinterface.cases.login.HomePage.STATUS_CASE_VALIDATION;

public class FullFlowCaseStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    private TaskMonitoringModel taskMonitoringModel = new TaskMonitoringModel();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }


    @Given("^I perform case creation full flow of different service$")
    public void iCreateACase() {
    }


    @Then("^I view the information status is (.*)$")
    public void iViewTheInformationSave(String statuscase) throws InterruptedException {
        Thread.sleep(3000);
        actor.attemptsTo(Click.on(MODULE_EXPANSION_GENERAL));
        actor.attemptsTo(
                Ensure.that(STATUS_CASE_VALIDATION).text().isEqualTo(statuscase));
    }
}



