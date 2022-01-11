package co.konecta.sura.certificate.stepsdefinitions.listas;

import co.konecta.sura.certificate.task.listas.ListTask;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
import co.konecta.sura.certificate.userinterface.Listas.listPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class listStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a list$")
    public void iCreateOrEditionAList() {
    }

    @And("^I entering list$")
    public void iEnteringList() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(listPage.GLOBAL_MENU));
        actor.attemptsTo(Click.on(listPage.BUTTON_LIST));
        Thread.sleep(3000);
        actor.attemptsTo(Click.on(listPage.BUTTON_ADMIN));
        Thread.sleep(3000);

        actor.attemptsTo(Click.on(listPage.SEARCH_LISTS));
        Thread.sleep(3000);

    }

    @And("^I type information in the lists parameterization with the options1(.*)$")
    public void Iwriteasearchlist(String optionsLists1) {
        //Click.on(listPage.SEARCH_LISTS);
        actor.attemptsTo(ListTask.withInformationList(optionsLists1));
        //Click.on(listPage.SEARCH_LISTS);
    }
}