package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;

public class SubModuloGestionSaludStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Regristro de informacion Sub modulo Gestion Salud$")
    public void RegristroInformacionSubModuloGestionSalud(){}

    @And("^Click en crear registro emergencia salud$")
    public void ClickCrearRegistroEmergenciaSalud() throws InterruptedException {
        actor.attemptsTo(
                Click.on(EXPANSION_MODULO_GESTION_SALUD),
                Click.on(BOTON_CREAR_EMERGENCIA_SALUD)
        );
        Thread.sleep(3000);
    }


}
