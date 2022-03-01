package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_MENU_PARAMETERIZATION;

public class AlertasUCKStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Creacion, Edicion y Eliminar Alerta UCK")
    public void CreacionEdicionEliminarAlertaUCK() {
    }

    @And("^Entramos a Parametrizacion Alertas UCK$")
    public void entramosAParametrizacionAlertasUCK(){
        actor.attemptsTo(Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPCIONES_PARAMETRIZACION_ALERTAS_UCK).andThen(actions -> actions.click()));
    }
}

