package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.AlertasUCKTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_MENU_PARAMETERIZATION;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.AlertasUCKPage.*;

public class AlertasUCKStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Creacion, Edicion y Eliminar Alerta UCK")
    public void CreacionEdicionEliminarAlertaUCK() {
    }

    @And("^Entramos a Parametrizacion Alertas UCK$")
    public void entramosAParametrizacionAlertasUCK() {
        actor.attemptsTo(Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPCIONES_PARAMETRIZACION_ALERTAS_UCK).andThen(actions -> actions.click()));
    }

    @And("^Selecionamos el boton crear Alerta UCK$")
    public void selecionamosElBotonCrearAlertaUCK() {
        actor.has(Click.on(BOTON_CREACION_PARAMETRIZACION_ALERTAS_UCK));
    }

    @And("^Escribimos la Informacion alerta UCK (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosLaInformacionAlertaUCKNombreLineaServicioGuardianesFlujoEEstadoSTMonitoreoCordinacionEstadoExpProveedorTareasM(String Nombre, String Linea, String Servicio, String Guardianes, String FlujoE, String EstadoS, String TMonitoreo, String Cordinacion, String EstadoExp, String Proveedor, String TareasM) {
        actor.has(AlertasUCKTask.EscribirInformacionAlertaUCK(Nombre, Linea, Servicio, Guardianes, FlujoE, EstadoS, TMonitoreo, Cordinacion, EstadoExp, Proveedor, TareasM));
    }

    @And("^Escribimos Tiempos de los siguientes Roles, Gestion CNM:\"([^\"]*)\",Unidad Control:\"([^\"]*)\", Lider:\"([^\"]*)\", Cordinador:\"([^\"]*)\", Gerente:\"([^\"]*)\"$")
    public void escribimosTiemposDeLosSiguientesRolesGestionCNMUnidadControlLiderCordinadorGerente(String arg0, String arg1, String arg2, String arg3, String arg4) throws Throwable {
       actor.has( Enter.theValue(arg0).into(CAMPO_GESTION_CNM_PARAMETRIZACION_ALERTAS_UCK),
        Enter.theValue(arg1).into(CAMPO_UNIDAD_CONTROL_PARAMETRIZACION_ALERTAS_UCK),
        Enter.theValue(arg2).into(CAMPO_ROL_LIDER_PARAMETRIZACION_ALERTAS_UCK),
        Enter.theValue(arg3).into(CAMPO_ROL_CORDINADOR_PARAMETRIZACION_ALERTAS_UCK),
        Enter.theValue(arg4).into(CAMPO_ROL_GERENTE_PARAMETRIZACION_ALERTAS_UCK));
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^Selecionamos el boton guardar Alerta UCK$")
    public void selecionamosElBotonGuardarAlertaUCK() {
        actor.has(Click.on(BOTON_GUARDAR_PARAMETRIZACION_ALERTAS_UCK));
    }

    @And("^Selecionamos el boton Editar Parametrizacion Alerta UCK$")
    public void selecionamosElBotonEditarParametrizacionAlertaUCK() {
        actor.has(Click.on(BOTON_EDITAR_PARAMETRIZACION_ALERTAS_UCK));
    }

    @And("^Buscamos parametrizacion Alerta UCK Nombre Alerta:\"([^\"]*)\"$")
    public void buscamosParametrizacionAlertaUCKNombreAlerta(String arg0) throws Throwable {
      actor.has(Enter.theValue(arg0).into(CAMPO_NOMBRE_ALERTA_PARAMETRIZACION_ALERTAS_UCK));
      Thread.sleep(2000);
    }
}

