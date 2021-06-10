package co.konecta.sura.certificate.stepsdefinitions;

import co.konecta.sura.certificate.questions.TheModal;
import co.konecta.sura.certificate.task.LoginTask;
import co.konecta.sura.certificate.userinterface.HomePage;
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

    @Given("^i am entry in the application$")
    public void iAmEntryInTheApplication() {actor.wasAbleTo(Open.browserOn(homePage));}

    @When("^i enter the user (.*) and the password (.*)$")
    public void iEnterTheUserAndThePassword(String user, String password){
        actor.attemptsTo(
                LoginTask.whitCredentials(user,password)
        );

    }

    @Then("^user view(.*)  in the input$")
    public void userViewInTheInput(String messageModal) {
        actor.should(
                seeThat(TheModal.isVisible(messageModal)
                )
        );


    }
}
