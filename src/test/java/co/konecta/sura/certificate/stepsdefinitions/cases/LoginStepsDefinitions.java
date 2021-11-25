package co.konecta.sura.certificate.stepsdefinitions.cases;

import co.konecta.sura.certificate.questions.TheModal;
import co.konecta.sura.certificate.task.cases.login.LoginTask;
import co.konecta.sura.certificate.userinterface.home.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I entering in the application$")
    public void iAmEntryInTheApplication() {}

    @When("^I entering in the application with user (.*) and password (.*)$")
    public void iEnteringInTheApplicationWith(String user, String password) {
        actor.wasAbleTo(Open.browserOn(homePage));
        actor.attemptsTo(LoginTask.whitCredentials(user,password));
    }

    @Then("^I view the message (.*)$")
    public void userViewInTheInput(String messageModal) {
        actor.should(
                seeThat(TheModal.isVisible(messageModal)
                )
        );


    }
}
