package co.konecta.sura.certificate.stepsdefinitions.Inicio;

import co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Inicio.AlertaedicionTask;
import co.konecta.sura.certificate.Tareas.Inicio.AlertasUckTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.*;

public class AlertaUckStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Dado("^que realizó una busqueda y edición en el modulo alerta UCK$")
    public void queRealizóUnaBusquedaYEdiciónEnElModuloAlertaUCK() {
    }

    @Y("^Ingresamos al modulo alertas UCK$")
    public void ingresamosAlModuloAlertasUCK() throws InterruptedException {
        actor.attemptsTo
                (Click.on(HomePage.BUTTON_INITIAL_TAB), Click.on(AlertaPage.MODULO_ALERTASCK));
        Thread.sleep(3000);
    }

    @Y("^Escribimos la informacion en los campos de seleccion (.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosEnLosCamposDeSeleccionNombrealertaLineaServicioEstadoservicioGuardianesFlujosespecialesTipomonitoreo(String nombrealerta, String linea, String servicio, String estadoservicio, String guardianes, String flujosespeciales, String tipomonitoreo) {
        actor.attemptsTo(AlertasUckTask.withInformationAlerta(nombrealerta, linea, servicio, estadoservicio, guardianes, flujosespeciales, tipomonitoreo));
    }

    @Y("^clic en el boton buscar$")
    public void clicEnElBotonBuscar() throws InterruptedException {
        actor.attemptsTo(Click.on(AlertaPage.BOTON_BUSCAR));
        Thread.sleep(3000);
    }

/*    @Entonces("^Se visualize pantalla de registro de busqueda$")
    public void seVisualizePantallaDeRegistroDeBusquedaMensaje() throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(PANTALLA_REGISTRO).isEnabled());
    }*/

    @Y("^clic en el boton editar$")
    public void clicEnElBotonEditar() throws InterruptedException {
        actor.attemptsTo(Click.on(AlertaPage.BOTON_EDITAR));
                Thread.sleep(3000);
    }

    @Y("^filtramos por el campo (.*),(.*)$")
    public void filtramosPorElCampoLineaServicio(String linea, String servicio) {
        actor.attemptsTo
                (Click.on(CAMPO_LINEA),
                        Enter.theValue(linea).into(BUSCAR_ALERTA_UCK),
                        Click.on(SELECCIONAR_LINEA_ALERTA_UCK.of(String.valueOf(linea))),
                        Hit.the(Keys.ESCAPE).into(CAMPO_LINEA),
                        Click.on(CAMPO_SERVICIO),
                        Enter.theValue(servicio).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
    }
    @Y("^escribimos en los campos (.*) y validacion (.*) y motivo (.*) y tipo de gestion (.*)$")
    public void escribimosEnLosCamposObservacionYValidacionValidacionesYMotivoMotivoYTipoDeGestionTipogestion(String observacion, String validaciones, String motivo, String tipogestion) {
        actor.attemptsTo(AlertaedicionTask.withInformationEdicionAlerta(observacion,validaciones, motivo, tipogestion));
    }

    @Entonces("^Se visualize en la pantalla registro guardado exitoso$")
    public void seVisualizeEnLaPantallaRegistroGuardadoExitoso() throws InterruptedException {
        Thread.sleep(1000);
        actor.attemptsTo(
                Ensure.that(PANTALLA_REGISTRO).isEnabled());
    }


    @Y("^filtramos por el campo seleccion nombre de alerta (.*)$")
    public void filtramosPorElCampoSeleccionNombreDeAlertaNombrealerta(String nombrealerta) {
        actor.attemptsTo(
                Click.on(NOMBRE_ALERTA_UCK),
                Enter.theValue(nombrealerta).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
    }

    @Y("^filtramos por el campo selccion estado servicio (.*)$")
    public void filtramosPorElCampoSelccionEstadoServicioEstadoservicio(String estadoservicio) {
        actor.attemptsTo(
                Click.on(CAMPO_ESTADOO_SERVICIO),
                Enter.theValue(estadoservicio).into(BUSCAR_ALERTA_UCK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
    }



}



