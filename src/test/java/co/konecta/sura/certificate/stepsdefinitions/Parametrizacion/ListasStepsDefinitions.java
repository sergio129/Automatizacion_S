package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Parametrizacion.ListasPage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.ListsParameterizationTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.ListasPage.*;

public class ListasStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a lists parameterization$")
    public void iCreateOrEditionAListsParameterization() {
    }

    @And("^I entering lists parameterization$")
    public void iEnteringListsParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(ListasPage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(ListasPage.BUTTON_PARAMETRIZACION));
        Thread.sleep(3000);
        actor.has(MoveMouse.to(ListasPage.OPTION_LIST_PARAMETERIZATION).andThen(actions -> actions.click()));
    }

    @And("^I select button create lists parameterization$")
    public void iSelectButtonCreateListsParameterization() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_LISTS));
    }

    @And("^I select button edition lists parameterization$")
    public void iSelectButtonEditionListsParameterization() {
        actor.attemptsTo(Click.on(BUTTON_EDIT_LISTS));
    }

    @And("^I type information in the lists parameterization with the roles (.*) and modules (.*) and lists (.*) and options1 (.*) and options2 (.*)$")
    public void iTypeInformationInTheListsParameterizationWithTheRolesAndModulesAndListsAndOptionsAndOptions(String rolesLists, String modulesLists, String lists, String optionsLists1, String optionsLists2) {
        actor.attemptsTo(ListsParameterizationTask.withInformationListParameterization(rolesLists, modulesLists, lists, optionsLists1, optionsLists2)

        );
    }
    @And("^Selecionamos boton crear opcion parametrizacion listas$")
    public void SelecionamosBotonParametrizacionListas(){
        actor.attemptsTo(
                Click.on(BUTTON_CREATE_OPTION_LISTS));

    }

    @And("^I create new list option with option name (.*) and id easycase (.*)$")
    public void iCreateNewListOptionWithOptionNameAndIdEasycase(String optionName, String idEasyCase) throws InterruptedException {

        Thread.sleep(5000);

               actor.attemptsTo( Enter.theValue(optionName).into(INPUT_OPTION_NAME),
                Enter.theValue(idEasyCase).into(INPUT_OPTION_ID_EASYCASE),
                Click.on(BUTTON_SAVE_OPTION_LISTS));
    }

    @And("^I no type information lists parameterization$")
    public void iNoTypeInformationListsParameterization() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_LISTS));
        Thread.sleep(1000);
        actor.attemptsTo(Click.on(BUTTON_SAVE_LISTS));
        Thread.sleep(1000);
    }
    @And("^Selecionamos el boton guardar lista$")
    public void SelecionamosBotonGuardarLista() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_SAVE_LISTS));
        Thread.sleep(1000);
    }


}
