package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Tareas.Casos.casetask.Case;
import co.konecta.sura.certificate.Tareas.Casos.casetask.CaseModel;
import co.konecta.sura.certificate.Tareas.Casos.login.LoginTask;
import co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage.INPUT_CASE;
import static co.konecta.sura.certificate.Interfaces.Casos.cases.CasePage.BUTTON_SAVE_CASE;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;

public class CaseStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    private CaseModel caseModel = new CaseModel();


    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I create or edition a case$")
    public void iCreateOrEditionACase() {
    }

    @When("^I entering the case creation page with user (.*) and password (.*)$")
    public void iAmEnteringTheCasePageWith(String user, String password) throws InterruptedException {
        actor.wasAbleTo(Open.browserOn(homePage));
        actor.attemptsTo(LoginTask.whitCredentials(user, password));
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_CASE));
        actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
        Thread.sleep(2000);

    }

    @And("^I select creation case button$")
    public void iSelectCreationCaseButton() throws InterruptedException {
        actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CREATE_CASE));
        Thread.sleep(2000);
    }

    @And("^I select button case edition with case (.*)$")
    public void iSelectButtonCaseEdit(String numberCase) throws InterruptedException {
        actor.attemptsTo(
                Click.on(AdvancedSearchPage.BUTTON_CLEAR_FILTERS),
                Enter.theValue(numberCase).into(INPUT_CASE),
                Click.on(AdvancedSearchPage.BUTTON_SEARCH),
                Click.on(AdvancedSearchPage.BUTTON_EDIT));
        Thread.sleep(2000);
    }

    @And("^I type information in the field number case (.*)$")
    public void iTypeInformationInTheFields(String numberCase) {
     this.caseModel.setNumberCase(numberCase);
    }

    @And("^I type information in the field applicant name (.*)$")
    public void iTypeInformationInTheFieldApplicantName(String applicantName) {
        this.caseModel.setApplicantName(applicantName);
    }

    @And("^I type information in the field phone1 (.*)$")
    public void iInputingInformationInTheFieldPhone(String phone1)  {
      this.caseModel.setPhone1(phone1);
    }

    @And("^I type information in the field license plate (.*)$")
    public void iTypeInformationInTheFieldLicensePlate(String licensePlate)  {
      this.caseModel.setLicensePlate(licensePlate);
    }

    @And("^I type information in the field serviceaddress (.*)$")
    public void iTypeInformationInTheFieldServiceAddress(String serviceAddress) {
        this.caseModel.setServiceAddress(serviceAddress);

    }

    @And("^I type information in the field location (.*)$")
    public void iTypeInformationInTheFieldServiceLocation(String serviceLocation)  {
       this.caseModel.setServiceLocation(serviceLocation);
    }

    @And("^I type information in the field department (.*)$")
    public void iTypeInformationInTheFieldDepartment(String department) {
       this.caseModel.setDepartment(department);
    }

    @And("^I type information in the field municipality (.*)$")
    public void iTypeInformationInTheFieldMunicipality(String municipality) {
       this.caseModel.setMunicipality(municipality);

    }

    @And("^I type information in the field click case (.*)$")
    public void iTypeInformationInTheFieldClickCase(String clickCase) {
      this.caseModel.setClickCase(clickCase);

    }

    @And("^I type information in the field line (.*)$")
    public void iTypeInformationInTheFieldLine(String line) {
       this.caseModel.setLine(line);

    }

    @And("^I type information in the field service (.*)$")
    public void iTypeInformationInTheFieldService(String service) {
        this.caseModel.setService(service);

    }

    @And("^I type information in the field address detail (.*)$")
    public void iTypeInformationInTheFieldAddressDetail(String address) throws Exception {
        this.caseModel.setAddressDetail(address);
        actor.attemptsTo(Case.whitDataCase(caseModel));
    }

    @When("^I no type information in the case creation$")
    public void iNoTypeInformationInTheCaseCreation() throws InterruptedException {
        actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CREATE_CASE));
        Thread.sleep(2000);
        actor.attemptsTo(
                MoveMouse.to(BUTTON_SAVE_CASE).andThen(actions -> actions.click()));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save case with (.*)$")
    public void iViewTheModalSaveCase(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));

    }

}


