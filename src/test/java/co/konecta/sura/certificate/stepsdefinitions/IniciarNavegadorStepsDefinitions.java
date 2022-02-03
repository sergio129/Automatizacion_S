package co.konecta.sura.certificate.stepsdefinitions;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class IniciarNavegadorStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }
}
