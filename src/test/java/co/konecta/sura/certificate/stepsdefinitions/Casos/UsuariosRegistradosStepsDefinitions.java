package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.UsuariosRegistrados.UsuariosRegistradosPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_MENU_CASE;

public class UsuariosRegistradosStepsDefinitions {
    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("Listar Usuarios Registrados")
    public void ListarUsuariosRegistrados() {
    }

    @And("^entramos el modulo de Casos Usuarios Registrados$")
    public void entramosElModuloDeCasosUsuariosRegistrados() throws InterruptedException {
        actor.has(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_CASE),
                Click.on(OPCION_USUARIOS_REGISTRADOS)
        );
        Thread.sleep(2000);
    }

    @And("^Listamos Usuarios Registrados por(.*)$")
    public void listamosUsuariosRegistradosPorRol(String Rol) throws InterruptedException {
        actor.has(
                Click.on(CAMPO_ROLES_USUARIOS_REGISTRADOS),
                Enter.theValue(Rol).into(BUSCAR_ROLES_USUARIOS_REGISTRADOS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)
        );
        Thread.sleep(5000);
    }


    @And("^Listamos Usuarios Registrados Todos los Roles$")
    public void listamosUsuariosRegistradosTodosLosRoles() throws InterruptedException {
        actor.has(
                Click.on(CAMPO_ROLES_USUARIOS_REGISTRADOS),
                Click.on(TODOS_LOS_ROLES_USUARIOS_REGISTRADOS),
                Hit.the(Keys.ESCAPE).into(CAMPO_ROLES_USUARIOS_REGISTRADOS)
                );
        Thread.sleep(2000);
    }

}

