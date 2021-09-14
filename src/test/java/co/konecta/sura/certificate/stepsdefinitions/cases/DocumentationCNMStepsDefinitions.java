package co.konecta.sura.certificate.stepsdefinitions.cases;

import co.konecta.sura.certificate.task.cases.documentationcnm.DocumentationCNMTask;
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

import static co.konecta.sura.certificate.userinterface.cases.documentationcnm.DocumentationCNMPage.*;
import static co.konecta.sura.certificate.userinterface.cases.login.HomePage.MODAL_VALIDATION;
public class DocumentationCNMStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create a documentation CNM for a case$")
    public void iCreateADocumentationCNMForACase() {
    }

    @And("^I type information in the fields management person (.*) and generates complaint (.*) and observation (.*)$")
    public void iTypeInformationInTheFieldsManagementPersonAndGeneratesComplaintAndObservation(String managementPerson, String generatesComplaint, String observation) throws InterruptedException {
            Thread.sleep(1000);
            actor.attemptsTo(Click.on(BUTTON_CREATE_DOCUMENTATION));
            Thread.sleep(2000);
            actor.attemptsTo(DocumentationCNMTask.withInformationDocumentationCNM(managementPerson, generatesComplaint,observation));
            actor.attemptsTo(Click.on(BUTTON_SAVE_DOCUMENTATION));
            Thread.sleep(1000);

    }

    @And("^I type information complaint in the fields management person (.*) and generates complaint (.*) and observation (.*) and filed complaint (.*)$")
    public void iTypeInformationComplaintInTheFieldsManagementPersonAndGeneratesComplaintAndObservationAndFiledComplaint(String managementPerson, String generatesComplaint, String observation, String filedComplaint) throws InterruptedException {
            actor.attemptsTo(Click.on(BUTTON_CREATE_DOCUMENTATION));
            Thread.sleep(2000);
            actor.attemptsTo(DocumentationCNMTask.withInformationDocumentationCNM(managementPerson, generatesComplaint,observation));
            actor.attemptsTo(Enter.theValue(filedComplaint).into(INPUT_FILED_COMPLAINT_DOCUMENTATION));
            actor.attemptsTo(Click.on(BUTTON_SAVE_DOCUMENTATION));
            Thread.sleep(1000);

    }

    @And("^I no type information documentation CNM$")
    public void iNoTypeInformationDocumentationCNM() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_DOCUMENTATION));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_DOCUMENTATION));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save documentation CNM with (.*)$")
    public void iViewTheModalSaveDocumentationCNMWith(String messageModal) {
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(messageModal));
    }

}
