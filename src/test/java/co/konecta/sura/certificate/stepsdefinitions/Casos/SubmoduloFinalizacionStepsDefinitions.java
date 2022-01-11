package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.task.Casos.listenending.Ending;
import co.konecta.sura.certificate.task.Casos.listenending.EndingModel;
import co.konecta.sura.certificate.userinterface.Casos.listenending.EndingPage;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
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

import static co.konecta.sura.certificate.userinterface.Inicio.HomePage.MODAL_VALIDATION;

public class SubmoduloFinalizacionStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    private EndingModel endingModel= new EndingModel();


    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I create or edition a ending for a case$")
    public void iCreateAEndingForACase() {
    }

    @And("^I select button create ending$")
    public void iSelectButtonCreateEnding() {
        actor.attemptsTo(Click.on(EndingPage.BUTTON_CREATE_ENDING));
    }

    @And("^I select button edition ending$")
    public void iSelectButtonEditionEnding() throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(Click.on(EndingPage.MODULE_EXPANSION_ENDING));
        actor.attemptsTo(Click.on(EndingPage.BUTTON_EDIT_ENDING));
        Thread.sleep(1000);
    }


    @And("^I type information in the field ending with (.*)$")
    public void iTypeInformationInTheFieldEndingWith(String ending) throws Exception {
        Thread.sleep(1000);
        this.endingModel.setEndingwith(ending);
    }

    @And("^I type information in the type responses (.*)$")
    public void iTypeInformationInTheTypeResponses(String typeResponse) throws Exception {
        Thread.sleep(1000);
        this.endingModel.setTyperesponse(typeResponse);

    }

    @And("^I type information in the field observation ending (.*)$")
    public void iTypeInformationInTheFieldObservationEnding(String observationEnding) throws Exception {
        this.endingModel.setObservationending(observationEnding);
        actor.attemptsTo(Ending.whitDataEnding(endingModel));

    }

    @And("^I no type information ending$")
    public void iNoTypeInformationEnding() throws InterruptedException {
        actor.attemptsTo(Click.on(EndingPage.BUTTON_CREATE_ENDING));
        Thread.sleep(2000);
        actor.attemptsTo(Click.on(EndingPage.BUTTON_SAVE_ENDING));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save ending with (.*)$")
    public void iViewTheModalSaveEnding(String message) throws Exception {
        Thread.sleep(500);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }


}
