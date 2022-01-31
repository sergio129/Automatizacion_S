package co.konecta.sura.certificate.stepsdefinitions.Roles;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Roles.ListarRolesTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;
import static co.konecta.sura.certificate.Interfaces.Roles.ListarRolesPage.*;

public class RolesListarRolesStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }
    @Given("^Creacion, Edicion, Asociacion y Eliminar lista de Roles$")
    public void CreacionEdicionAsociacionEliminarListaRoles(){}
    @And("^Entramos a Roles Lista roles$")
    public void entramosARolesListaRoles() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(ROLES),
                Click.on(OPCION_LISTAR_ROLES)
        );
        Thread.sleep(3000);

    }

    @And("^Damos Clic en Crear Lista Roles$")
    public void damosClicEnCrearListaRoles() {
        actor.attemptsTo(Click.on(BOTON_CREAR_ROL));
    }

    @And("^Escribimos la informacion SubModulo Cierre de Expediente(.*),(.*),(.*)$")
    public void escribimosLaInformacionSubModuloCierreDeExpedienteNombreRolHabilidadRolEasyCase(String NombreRol, String Habilidad, String EasyCase) {
        actor.attemptsTo(ListarRolesTask.EscribirInformacionListaRoles(NombreRol,Habilidad,EasyCase));
    }

    @And("^Guardamos informacion SubModulo Cierre Expediente$")
    public void guardamosInformacionSubModuloCierreExpediente() {
        actor.attemptsTo(Click.on(BOTON_GUARDAR_ROL));
    }


    @And("^Buscamos Lista Rol(.*)$")
    public void buscamosListaRolBuscarRol(String BuscarRol) {
        actor.attemptsTo(
                Enter.theValue(BuscarRol).into(BUSCAR_ROL_INICIO)
        );
    }

    @And("^Editamos Lista de Rol$")
    public void editamosListaDeRol() {
        actor.attemptsTo(Click.on(BOTON_EDITAR_ROL)
        );
    }

    @And("^Eliminamos Lista de Rol$")
    public void eliminamosListaDeRol() {
        actor.attemptsTo(Click.on(BOTON_ELIMINAR_ROL),
                Click.on(OPCION_SI_ELIMINAR_ROL)
        );
    }

    @And("^Asociamos Usuario Lista Rol(.*)$")
    public void asociamosUsuarioListaRolAsignado(String Asignado) {

    }
}

