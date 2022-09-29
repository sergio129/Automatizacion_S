package co.konecta.sura.certificate.stepsdefinitions.Casos;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;

public class SubModuloGestionSaludStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


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

    @Then("^Se visualiza mensaje de la modal Gestion Salud (.*)$")
    public void iViewTheModalSaveWith(String message) throws Exception {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

    @And("Tiene una Emergencia?:{string}")
    public void tieneUnaEmergencia(String TieneEmergencia) {
        actor.has(
                Click.on(CAMPO_TIENE_EMERGENCIA),
                Enter.theValue(TieneEmergencia).into(BUSCAR_TIENE_EMERGENCIA).thenHit(Keys.ENTER));
    }

    @And("Escribimos datos comunes emergencia Salud:")
    public void escribimosDatosComunesEmergenciaSalud(List<Map<String, String>> DatosComunesGestionSalud2) {
        actor.has(co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GesntionSaludDatosComunesTask.EscribirDatosComunes2(DatosComunesGestionSalud2));
    }

    @And("Preguntamos si tiene Dificultad en la atencion en salud")
    public void preguntamosSiTieneDificultadEnLaAtencionEnSalud(List<Map<String, String>> DatosDificultad) {
        actor.attemptsTo(co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GestionSaludDificultadTask.EscribirDatosDificultad(DatosDificultad));
    }

    @And("Escribimos los datos de tiene emergencia Si")
    public void escribimosLosDatosDeTieneEmergenciaSi(List<Map<String, String>> DatosEmergenciaSi) {
        actor.has(co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GestionSaludDatosEmergenciaSiTask.DatosEmergenciaSi(DatosEmergenciaSi));
    }

    @And("Escribimos las observaciones: {string} y guardamos")
    public void escribimosLasObservacionesYGuardamos(String arg0) {
        actor.attemptsTo(
                Enter.theValue(arg0).into(OBSERVACIONES),
                Click.on(BOTON_GUARDAR_EMERGENCIA_SALUD)
        );

    }
}
