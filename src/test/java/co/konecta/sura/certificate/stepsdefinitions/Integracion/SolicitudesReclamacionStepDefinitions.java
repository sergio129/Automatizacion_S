package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Integracion.SolicitudReclamacionesPage;
import co.konecta.sura.certificate.Modelos.Integracion.SolicitudReclamacionesModel;
import co.konecta.sura.certificate.Tareas.Integracion.SolicitudRelacmacionGestionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Mouse;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_INTEGRATION;

public class SolicitudesReclamacionStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    SolicitudReclamacionesModel model = new SolicitudReclamacionesModel();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @And("Ingresamos a Integracion Solicitudes de reclamacion")
    public void ingresamos_a_integracion_solicitudes_de_reclamacion() {
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_INTEGRATION),
                MoveMouse.to(SolicitudReclamacionesPage.OPCION_SOLICITUDES_DE_RECLAMACION).andThen(actions -> actions.click()));
    }

    @And("Buscamos por numero de placa: {string}")
    public void buscamos_por_numero_de_placa(String buscarPlaca) {
        actor.attemptsTo(
                Enter.theValue(buscarPlaca).into(SolicitudReclamacionesPage.CAMPO_PLACA));

    }

    @And("Seleccionamos el boton de gestionar solicitud de reclamaciones")
    public void seleccionamos_el_boton_de_gestionar_solicitud_de_reclamaciones() {
        actor.attemptsTo(Click.on(SolicitudReclamacionesPage.BOTON_GESTIONAR));

    }

    @And("^Agregamos una Gestion de Solicitud de reclamaciones: (.*),(.*),(.*)$")
    public void agregamos_una_gestion_de_solicitud_de_reclamaciones_gdi_crisis_front_pruebas_automatizadas(String tipoGestion, String personaGestion, String observaciones) {
        this.model.setTipoGestion(tipoGestion);
        this.model.setPersonaGestion(personaGestion);
        this.model.setObservaciones(observaciones);
        actor.attemptsTo(SolicitudRelacmacionGestionTask.EscribirDatos(model));

    }

    @And("Seleccionamos un estado de Solicitud de reclamaciones:{string}")
    public void seleccionamos_un_estado_de_solicitud_de_reclamaciones(String string) {

    }

    @And("Guardamos la gestion")
    public void guardamos_la_gestion() {
    }
}
