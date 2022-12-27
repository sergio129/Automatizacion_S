package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Modelos.Parametrizaciones.CalculoTiempoMonitoreoSitioModel;
import co.konecta.sura.certificate.Tareas.Parametrizacion.CalculoTiempoMonitoreoSitioTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CalculoTiempoMonitoreoSitioPage.BOTON_CREAR_CALCULO_MONITOREO_SITIO;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CalculoTiempoMonitoreoSitioPage.OPCION_MONITOREO_SITIO;

public class CalculoTiempoMonitoreoSitioStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    CalculoTiempoMonitoreoSitioModel tiempo = new CalculoTiempoMonitoreoSitioModel();


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @And("Ingresamos a parametrizacion Cálculo de tiempo de monitoreo en sitio")
    public void ingresamos_a_parametrizacion_cálculo_de_tiempo_de_monitoreo_en_sitio() {
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(OPCION_MONITOREO_SITIO).andThen(actions -> actions.click()));

    }

    @And("^Datos Cálculo de tiempo de monitoreo en sitio(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void datos_cálculo_de_tiempo_de_monitoreo_en_sitio_automatizacion_nocturno_pm_am_autos_grua_cordoba_lorica(String Nombre, String Momento_Servicio, String Linea, String Tipo_Servicio, String Departamento, String Municipio, String Delta) {
        this.tiempo.setNombre(Nombre);
        this.tiempo.setMomentoServicio(Momento_Servicio);
        this.tiempo.setLinea(Linea);
        this.tiempo.setTipoServicio(Tipo_Servicio);
        this.tiempo.setDepartamento(Departamento);
        this.tiempo.setMunicipio(Municipio);
        this.tiempo.setDelta(Delta);
        actor.attemptsTo(CalculoTiempoMonitoreoSitioTask.escribirDatos(tiempo));
    }

    @And("Seleccionamos el boton Crear  parametrización cálculo de tiempo de monitoreo en sitio")
    public void seleccionamosElBotonCrearParametrizaciónCálculoDeTiempoDeMonitoreoEnSitio() {
        actor.attemptsTo(Click.on(BOTON_CREAR_CALCULO_MONITOREO_SITIO));
    }

    @And("Buscamos una parametrizacion cálculo de tiempo de monitoreo en sitio: {string}")
    public void buscamosUnaParametrizacionCálculoDeTiempoDeMonitoreoEnSitio(String arg0) {

    }
}
