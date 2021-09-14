package co.konecta.sura.certificate.stepsdefinitions.cases;

import co.konecta.sura.certificate.task.cases.statemanagement.StateManagementTask;
import co.konecta.sura.certificate.userinterface.cases.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.userinterface.cases.login.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.userinterface.cases.advancedsearch.AdvancedSearchPage.*;
import static co.konecta.sura.certificate.userinterface.cases.statemanagement.StateManagementPage.*;

public class StateManagementStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }


    @Given("^I performed case status changes$")
    public void iPerformedCaseStatusChanges() {
    }

    @And("^I entering the advanced search and type case number (.*)$")
    public void iEnteringTheAdvancedSearchAndTypeCaseNumber(String numberCase) throws InterruptedException {
            Thread.sleep(5000);
            actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
            actor.attemptsTo(Click.on(HomePage.OPTION_MENU_CASE));
            actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS));
            actor.attemptsTo(Enter.theValue(numberCase).into(INPUT_CASE));
            actor.attemptsTo(Click.on(BUTTON_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_CASE_DETAIL_VIEW));
            Thread.sleep(7000);
    }


    @And("^I type information in the field status name (.*)$")
    public void iTypeInformationInTheFieldStatusName(String stateName) throws InterruptedException {
            Thread.sleep(5000);
            actor.attemptsTo(Click.on(BUTTON_OPEN_MODAL),
                            Click.on(BUTTON_ADD_STATUS));
            Thread.sleep(2000);
            actor.attemptsTo(StateManagementTask.withInformationStateManagement(stateName));
            actor.attemptsTo(Click.on(BUTTON_SAVE_STATUS));
            Thread.sleep(3000);

    }

    @Then("^I view the modal save management status with (.*)$")
    public void iViewTheModalSaveManagementStatus(String messageModal) {
        actor.attemptsTo(
                Ensure.that(TITLE_DETAILS_CASE).text().isEqualTo(messageModal));
    }

}
