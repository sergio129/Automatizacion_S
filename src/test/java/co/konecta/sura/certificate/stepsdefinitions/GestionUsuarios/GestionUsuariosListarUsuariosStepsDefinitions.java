package co.konecta.sura.certificate.stepsdefinitions.GestionUsuarios;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.GestionUsuarios.ListarUsuariosTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.GestionUsuarios.ListarUsuariosPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;

public class GestionUsuariosListarUsuariosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    public final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Hacer toda la gestion de usuarios")
    public void HacerTodaLaGestionDeUsuarios() {
    }

    @And("^Entramos a gestion de usuarios listar usuarios$")
    public void entramosAGestionDeUsuariosListarUsuarios() {
        actor.has(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(GESTION_USUARIOS),
                Click.on(GESTION_USUARIOS_LISTAR_USUARIOS));
    }

    @And("^Selecionamos el Boton Crear Listar Usuarios$")
    public void selecionamosElBotonCrearListarUsuarios() {
        actor.has(Click.on(BOTON_CREACION_USUARIO));
    }

    @And("^Escribimos informacion de Listar Usuarios(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosInformacionDeListarUsuariosNombreUsuarioIdentificadorCorreoRolAsignacion(String NombreUsuario, String Identificador, String Correo, String Rol, String Asignacion) {
        actor.has(ListarUsuariosTask.EscribirInformacionListarUsuarios(NombreUsuario, Identificador, Correo, Rol, Asignacion));
    }


    @And("^Selecionamos el Boton Editar Listar Usuarios$")
    public void selecionamosElBotonEditarListarUsuarios() {
        actor.has(Click.on(BOTON_EDITAR_USUARIO));
    }

    @And("^Buscamos en Lista de usuarios por Identificador:\"([^\"]*)\"$")
    public void buscamosEnListaDeUsuariosPorNombreIdentificadorRol(String Identificador) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        actor.has(
                Click.on(CAMPO_IDENTIFICADOR_USUARIO_INICIO),
                Enter.theValue(Identificador).into(BUSCAR_IDENTIFICADOR_USUARIO_INICIO).thenHit(Keys.ENTER),
                Click.on(BOTON_BUSCAR_USUARIO_INICIO)
        );
        Thread.sleep(3000);
    }

    @And("^visualizamos Informacion y Hacemos conexion remota$")
    public void visualizamosInformacionYHacemosConexionRemota() throws InterruptedException {
        actor.has(Click.on(BOTON_VISUALIZAR_USUARIO),
                Click.on(BOTON_CONEXION_REMOTA_USUARIO)
        );
        Thread.sleep(3000);
    }

    @Then("^Se visualiza ventana nueva ventana de conexion remota(.*)$")
    public void seVisualizaVentanaNuevaVentanaDeConexionRemotaModalmensaje(String mensaje) throws InterruptedException {
        actor.attemptsTo(
                Ensure.that(BUTTON_INITIAL_TAB).text().isEqualTo(mensaje));
        Thread.sleep(3000);
    }

    @And("^Selecionamos el boton Guardar Listar Usuarios$")
    public void selecionamosElBotonGuardarListarUsuarios() {
        actor.has(Click.on(BOTON_GUARDAR_USUARIO));
    }

    @And("^visualizamos Informacion y Hacemos el deslogueo$")
    public void visualizamosInformacionYHacemosElDeslogueo() {
        actor.has(Click.on(BOTON_DESLOGUEAR_USUARIO), Click.on(OPCION_SI_DESLOGUEAR_USUARIO));
    }
}
