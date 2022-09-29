package co.konecta.sura.certificate.stepsdefinitions.Roles;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Roles.ListaRolesAsociarMenuRolTask;
import co.konecta.sura.certificate.Tareas.Roles.ListarRolesTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;
import static co.konecta.sura.certificate.Interfaces.Roles.ListarRolesPage.*;

public class RolesListarRolesStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Creacion, Edicion, Asociacion y Eliminar lista de Roles$")
    public void CreacionEdicionAsociacionEliminarListaRoles() {
    }

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
        actor.attemptsTo(ListarRolesTask.EscribirInformacionListaRoles(NombreRol, Habilidad, EasyCase));
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
        actor.attemptsTo(
                Click.on(BOTON_ASOCIAR_USUARIOS_ROL),
                Click.on(CAMPO_ASIGNAR_USUARIO),
                Enter.theValue(Asignado).into(BUSCAR_ASIGNAR_USUARIO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),


                Click.on(BOTON_GUARDAR_ASOCIAR_USUARIO)
        );

    }

    @And("^Asociamos Menu Rol$")
    public void asociamosMenuRolAdminTareas() throws InterruptedException {
        actor.attemptsTo(ListaRolesAsociarMenuRolTask.SeleccionarListas());





    }
}

