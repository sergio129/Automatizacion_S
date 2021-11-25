package co.konecta.sura.certificate.stepsdefinitions.parameterization;

import co.konecta.sura.certificate.task.parameterization.AssignmentTask;
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
import static co.konecta.sura.certificate.userinterface.parameterization.AssignmentPage.*;

public class AssignmentStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete a assignment parameterization$")
    public void iCreateEditionOrDeleteAssignmentParameterization() {
    }

    @And("^I entering assignment parameterization$")
    public void iEnteringAssignmentParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.SCROLL_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_ASSIGNMENT_PARAMETERIZATION));


    }

    @And("^I select button create assignment$")
    public void iSelectButtonCreateAssignment() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_ASSIGNMENT));

    }


    @And("^I select button edition assignment$")
    public void iSelectButtonEditionAssignment() {actor.attemptsTo(Click.on(BUTTON_EDIT_ASSIGNMENT));
   }

    @And("^I type information in the assignment with the role (.*) and the user (.*) and the line (.*) and the service (.*) and the department (.*)$")
    public void iTypeInformationInTheAssignmentWithTheRoleAndTheUserAndTheLineAndTheServiceAndTheDepartment(String roleAssignment, String userAssignment, String lineAssignment, String serviceAssignment, String departmentAssignment) {
        actor.attemptsTo(AssignmentTask.withInformationAssignment(roleAssignment, userAssignment, lineAssignment, serviceAssignment, departmentAssignment));
    }

    @And("^I select button delete assignment$")
    public void iSelectButtonDeleteAssignment() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_ASSIGNMENT),
                Click.on(OPTION_YES_ASSIGNMENT));
    }

    @And("^I no type information assignment$")
    public void iNoTypeInformationAssignment() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_ASSIGNMENT));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_ASSIGNMENT));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save assignment parameterization with (.*)$")
    public void iViewTheModalSaveAssignmentParameterizationWithe(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}
