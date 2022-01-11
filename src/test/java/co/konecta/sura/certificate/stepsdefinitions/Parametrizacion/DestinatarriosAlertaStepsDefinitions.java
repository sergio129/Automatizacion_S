package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.task.Parametrizacion.DestinatariosAlertaTask;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
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

import static co.konecta.sura.certificate.userinterface.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.userinterface.Parametrizacion.DestinatariosAlertaPage.*;

public class DestinatarriosAlertaStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete a alert recipients parameterization$")
    public void iCreateEditionOrDeleteAAlertParameterization() {
    }

    @And("^I entering alert recipients parameterization$")
    public void iEnteringAlertRecipientsParameterization() {
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.SCROLL_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_ALERT_PARAMETERIZATION));
    }
    @And("^I select button search alert recipients(.*)$")
    public void iSearchButtonCreateAlertRecipients(String nameAlert) {
        actor.attemptsTo(
                Enter.theValue(nameAlert).into(INPUT_SEARCH_NAME_ALERT),
                Click.on(BUTTON_SEARCH_ALERT_PARAMETERIZATION));
    }

    @And("^I select button create alert recipients$")
    public void iSelectButtonCreateAlertRecipients() {
        actor.attemptsTo(
                Click.on(BUTTON_CREATE_ALERT_PARAMETERIZATION));
    }

    @And("^I select button edition alert recipients$")
    public void iSelectButtonEditionAlertRecipients() {

        actor.attemptsTo(Click.on(BUTTON_EDIT_ALERT_PARAMETERIZATION));
    }

    @And("^I type information in the alert with the name (.*) and the line (.*) and the service (.*) and the department (.*) and the municipality (.*) and the email (.*)$")
    public void iTypeInformationInTheAlertWithTheNameAndTheLineAndTheServiceAndTheDepartmentAndTheMunicipalityAndTheEmail(String nameAlert, String lineAlert, String serviceAlert, String departmentAlert, String municipalityAlert, String emailAlert) {
        actor.attemptsTo(DestinatariosAlertaTask.withInformationAlertParameterization(nameAlert, lineAlert, serviceAlert, departmentAlert, municipalityAlert, emailAlert));
    }

    @And("^I search name alert (.*) and select button delete alert recipients$")
    public void iSearchNameAlertAndSelectButtonDeleteAlertRecipients(String nameAlert) throws InterruptedException {
        actor.attemptsTo(Enter.theValue(nameAlert).into(INPUT_SEARCH_NAME_ALERT),
                Click.on(BUTTON_SEARCH_ALERT_PARAMETERIZATION));
                Thread.sleep(1000);
        actor.attemptsTo(Click.on(CHECKBOX_DELETE_ALERT_PARAMETERIZATION),
                (Click.on(BUTTON_DELETE_ALERT_PARAMETERIZATION)),
                (Click.on(OPTION_DELETE_ALERT_PARAMETERIZATION)),
                (Click.on(OPTION_YES_ALERT_PARAMETERIZATION)));
    }

    @And("^I no type information alert recipients$")
    public void iNoTypeInformationAlertRecipients() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_SAVE_ALERT_PARAMETERIZATION));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save alert recipients parameterization with (.*)$")
    public void iViewTheModalSaveAlertRecipientsParameterizationWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}
