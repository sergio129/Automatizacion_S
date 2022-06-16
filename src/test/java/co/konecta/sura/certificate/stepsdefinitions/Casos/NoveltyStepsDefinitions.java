package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Tareas.Casos.Novedades.Novedades;
import co.konecta.sura.certificate.Tareas.Casos.Novedades.NoveltyModel;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Casos.Novedades.NovedadesPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;

public class NoveltyStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    private NoveltyModel novelModel= new NoveltyModel();


    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^I create or edition a novelty for a case$")
    public void iCreateANoveltyForACase() {
    }

    @And("^I select button create novelty$")
    public void iSelectButtonCreateNovelty() throws InterruptedException {
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(NovedadesPage.BUTTON_CREATE_MANAGEMENTS));
    }

    @And("^I select button edition novelty$")
    public void iSelectButtonEditionNovelty() {
        actor.attemptsTo(Click.on(NovedadesPage.MODULE_EXPANSION_MANAGEMENTS));
        actor.attemptsTo(Click.on(NovedadesPage.BUTTON_EDIT_MANAGEMENTS));
    }

    @And("^I type information in the field who reports (.*)$")
    public void iTypeInformationInTheFieldWhoReports(String whoreports) throws Exception {
        this.novelModel.setWhoreports(whoreports);
    }

    @And("^I type information in the field cause novelty (.*)$")
    public void iTypeInformationInTheFieldCauseNovelty(String causenovelty) throws Exception {
        this.novelModel.setCausenovelty(causenovelty);
    }

    @And("^I type information in the field complaint news (.*)$")
    public void iTypeInformationInTheFieldComplaintNews(String complaintnews) throws Exception {
        this.novelModel.setComplaintnews(complaintnews);
    }

    @And("^I type information in the field novelty observation (.*)$")
    public void iTypeInformationInTheFieldNoveltyObservation(String observationnovelty) throws Exception {
        this.novelModel.setObservationnovelty(observationnovelty);
        actor.attemptsTo(Novedades.whitDataNovelty(novelModel));
    }

    @And("^I no type information novelty$")
    public void iNoTypeInformationNovelty() throws InterruptedException {
        actor.attemptsTo(Click.on(NovedadesPage.BUTTON_CREATE_MANAGEMENTS));
        Thread.sleep(500);
        actor.attemptsTo(Click.on(NovedadesPage.BUTTON_SAVE_MANAGEMENTS));
        Thread.sleep(1000);
    }

    @Then("^I view the modal save novelty with (.*)$")
    public void iViewTheModalSaveWith(String message) throws Exception {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

}


