package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Modelos.Login.User;
import co.konecta.sura.certificate.Tareas.Casos.login.LoginTask;
import co.konecta.sura.certificate.Utilidades.Login.TestUserCreator;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;

public class LoginStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    private final HomePage homePage = new HomePage();
    @When("Ingresamos a la aplicacion con Usuario y contraseña {string}")
    public void ingresamosALaAplicacionConUsuarioYContraseña(String arg0) {
        actor.wasAbleTo(Open.browserOn(homePage));
        User user = TestUserCreator.getTipoUsuario(arg0);
        actor.attemptsTo(LoginTask.whitCredentials(user));

    }
    @Then("^Se visualiza mensaje de la modal(.*)$")
    public void SeVisualizaMensajeDeLaModal(String mensaje) throws Exception {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(mensaje));
    }


    @When("Gestionamos en Sara")
    public void gestionamosEnSara() {

    }

    @Given("Ingresar a Sara con nuevo login")
    public void ingresarASaraConNuevoLogin() {
    }

    public static final Target MENUSARA = Target.the("This the toast validation").locatedBy("/html/body/app-root/app-full-layout/div/mat-toolbar/div[2]/div/div[2]");
    @Then("^Se visualiza nombre de usuario logueado(.*)$")
    public void seVisualizaNombreDeUsuarioLogueadoUser(String User) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MENUSARA).text().isEqualTo(User));
    }
}

