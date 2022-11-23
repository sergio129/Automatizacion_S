package co.konecta.sura.certificate.stepsdefinitions.pruebas;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Modelos.User;
import co.konecta.sura.certificate.Tareas.Casos.login.LoginTask2;
import co.konecta.sura.certificate.Utilidades.TestUserCreator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class PruebasStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Ingrear a Sara con nuevo login")
    public void ingrearASaraConNuevoLogin() {
    }

    @When("Ingresamos a la aplicacion con Usuario y contraseña {string}")
    public void ingresamosALaAplicacionConUsuarioYContraseña(String arg0) {
        actor.wasAbleTo(Open.browserOn(homePage));
        User user = TestUserCreator.getTipoUsuario(arg0);
        actor.attemptsTo(LoginTask2.whitCredentials(user));

    }


}
