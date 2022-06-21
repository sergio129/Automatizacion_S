package co.konecta.sura.certificate.stepsdefinitions.pendientes;

import co.konecta.sura.certificate.Tareas.pendientes.LoginTask;
import co.konecta.sura.certificate.Tareas.pendientes.StateManagementTask;
import co.konecta.sura.certificate.Interfaces.HomePage;
import co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.pendientes.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.Interfaces.pendientes.StateManagementPage.*;

public class StateManagementStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("^I am entry in the application state with user (.*) and password (.*)$")
    public void iAmEntryInThePageSupplierWith(String user, String password) {
            actor.wasAbleTo(Open.browserOn(homePage));
            actor.attemptsTo(LoginTask.whitCredentials(user,password));
    }

    @And("^I am entry the advanced search for state and set number case (.*)$")
    public void iAmEntryTheAdvancedSearchForStateAndSetNumberCase(String numberCase) throws InterruptedException {
            Thread.sleep(5000);
            actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
            actor.attemptsTo(Click.on(HomePage.OPTIONS_MENU_CASE));
            actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
            Thread.sleep(2000);
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
            actor.attemptsTo(Enter.theValue(numberCase).into(INPUT_CASE));
            actor.attemptsTo(Click.on(BUTTON_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_CASE_DETAIL_VIEW));
            Thread.sleep(7000);
    }


    @When("^set information status name (.*)$")
    public void setInformationStatusNameStatusname(String stateName) throws InterruptedException {
            Thread.sleep(2000);
            actor.attemptsTo(Click.on(BUTTON_OPEN_MODAL),
                             Click.on(BUTTON_ADD_STATUS));
            Thread.sleep(2000);
            actor.attemptsTo(StateManagementTask.withInformationStateManagement(stateName));
            actor.attemptsTo(Click.on(BUTTON_SAVE_STATUS));
            Thread.sleep(3000);

    }

    @Then("^user view the modal save management status with (.*)$")
    public void userViewTheModalSaveManagementStatusWithModalmessage(String messageModal) {
        actor.attemptsTo(
                Ensure.that(TITLE_DETAILS_CASE).text().isEqualTo(messageModal));
    }
}
