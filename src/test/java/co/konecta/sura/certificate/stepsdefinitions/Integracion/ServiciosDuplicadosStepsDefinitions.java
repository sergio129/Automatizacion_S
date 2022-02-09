package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;

public class ServiciosDuplicadosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Se hace la gestion de los servicios que se crean duplicados")
    public void SeHaceGestionServiciosDuplicados() {
    }


    @And("^Entramos a Integracion Servicios Duplicados y Gestionamos$")
    public void entramosAIntegracionServiciosDuplicadosYGestionamos() {
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_INTEGRATION),
                Click.on(OPCION_SERVICIOS_DUPLICADOS),
                Click.on(GESTION_SERVICIOS_DUPLICADOS)

        );
    }
}
