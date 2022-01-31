package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.SubModuloGestionSalud.GestionSaludComunTask;
import co.konecta.sura.certificate.Tareas.Casos.SubModuloGestionSalud.GestionSaludEmegenciaNoDificultadNo;
import co.konecta.sura.certificate.Tareas.Casos.SubModuloGestionSalud.GestionSaludEmergenciaNoDificultadSi;
import co.konecta.sura.certificate.Tareas.Casos.SubModuloGestionSalud.GestionSaludEmergenciaSi;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;

public class SubModuloGestionSaludStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Regristro de informacion Sub modulo Gestion Salud$")
    public void RegristroInformacionSubModuloGestionSalud() {
    }

    @And("^Click en crear registro emergencia salud$")
    public void ClickCrearRegistroEmergenciaSalud() throws InterruptedException {
        actor.attemptsTo(
                Click.on(EXPANSION_MODULO_GESTION_SALUD),
                Click.on(BOTON_CREAR_EMERGENCIA_SALUD)
        );
        Thread.sleep(3000);
    }

    @And("^Click en editar registro emergencia salud$")
    public void ClickEditarRegistroEmergenciaSalud() throws InterruptedException {
        actor.attemptsTo(
                Click.on(EXPANSION_MODULO_GESTION_SALUD),
                Click.on(BOTON_EDITAR_EMERGENCIA_SALUD)
        );
        Thread.sleep(3000);
    }

    @And("^Escribimos datos comunes emergencia Salud(.*),(.*),(.*),(.*)$")
    public void EscribimosInformacionEmergenciaSalud(String CanalIngreso, String TipoDocumento, String NumeroDocumento, String TieneEmergencia) {
        actor.attemptsTo(GestionSaludComunTask.TareaComunEscribirDatosEmergenciaSalud(CanalIngreso, TipoDocumento, NumeroDocumento, TieneEmergencia));

    }

    @And("^Escribimos la informacion de Emergencia salud:Si (.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void EscribimosInformacionEmergenciaSaludSi(String TipoEmergencia, String ServicioPrestado, String NombreAcompanante, String Parentesco, String Telefono, String PrestadorServicio, String Observaciones) {
        actor.attemptsTo(GestionSaludEmergenciaSi.EscribirEmergenciaSi(TipoEmergencia, ServicioPrestado, NombreAcompanante, Parentesco, Telefono, PrestadorServicio, Observaciones));

    }

    @And("^Escribimos la informacion de Emergencia salud dificultad No(.*),(.*)$")
    public void EscribimosInformacionEmergenciaSaludNo(String AtencionSalud, String Observaciones) {
        actor.attemptsTo(GestionSaludEmegenciaNoDificultadNo.EscribirEmergenciaNo(AtencionSalud, Observaciones));

    }

    @And("^Escribimos la informacion de Emergencia salud dificulta Si(.*),(.*),(.*)$")
    public void EscribimosInformacionEmergenciaSaludDificultaSi(String AtencionSalud, String atencion, String Observaciones) {
        actor.attemptsTo(GestionSaludEmergenciaNoDificultadSi.EscribirEmergenciaNoDificultadSi(AtencionSalud, atencion, Observaciones));

    }

    @And("^Selecionamos el boton guardar Emergencia salud$")
    public void SelecionamosBotonGuardarEmergenciaSalud() {
        actor.attemptsTo(Click.on(BOTON_GUARDAR_EMERGENCIA_SALUD));
    }
    @Then("^Se visualiza mensaje de la modal Gestion Salud (.*)$")
    public void iViewTheModalSaveWith(String message) throws Exception {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }
}
