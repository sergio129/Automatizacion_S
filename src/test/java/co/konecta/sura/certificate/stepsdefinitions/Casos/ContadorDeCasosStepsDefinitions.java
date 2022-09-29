package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.ContadorCasos.ContadorDeCasosPage.*;

public class ContadorDeCasosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Buscar Casos asignado por todos los filtros")
    public void BuscarCasosAsignadoPorTodosLosFiltros() {
    }

    @And("^Entramos a Casos Buscar Casos$")
    public void entramosACasosBuscarCasos() throws InterruptedException {
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_CASE),
                Click.on(OPCION_CONTADOR_DE_CASOS));
Thread.sleep(3000);
    }


    @And("^Filtramos por Estado del servicio contador de caso (.*)$")
    public void filtramosPorEstadoDelServicioContadorDeCasoEstado_Servicio(String Estado_Servicio) {
        actor.has(Click.on(CAMPO_ESTADO_SERVICIO),
                Enter.theValue(Estado_Servicio).into(BUSCAR_ESTADO_SERVICIO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)
        );
    }

    @And("^Filtramos por fecha inicio contador de casos (.*)$")
    public void filtramosPorFechaInicioContadorDeCasosFI(String FechaInicio) throws InterruptedException {
            actor.has(Click.on(FECHA_INICIO_CONTADOR_CASOS),
                    Click.on(SELECCIONAR_FECHA_INICIO.of(String.valueOf(FechaInicio)))
                //    Hit.the(Keys.TAB).into(CAMPO_ESTADO_SERVICIO),
                  //  Hit.the(Keys.TAB).into(FECHA_INICIO_CONTADOR_CASOS)
            );
    }

    @And("^Filtramos por Fecha Fin contador de casos (.*)$")
    public void filtramosPorFechaFinContadorDeCasosFechaFin(String FechaFin) {
        actor.has(
                Click.on(FECHA_FIN_CONTADOR_CASOS),
                Click.on(SELECCIONAR_FECHA_FIN.of(String.valueOf(FechaFin)))
        );
    }

    @And("^Filtramos por Reporte contador de casos (.*)$")
    public void filtramosPorReporteContadorDeCasosReporte(String Reporte) throws InterruptedException {
        actor.has(Click.on(REPORTE_CONTADOR_CASOS),
                Click.on(SELECCIONAR_REPORTE_CONTADOR_CASOS.of(String.valueOf(Reporte))),
                Click.on(BOTON_BUSCAR_CONTADOR_CASOS));
        Thread.sleep(5000);
    }

    @And("^Semuestra la cantidad de casos(.*)$")
    public void semuestraLaCantidadDeCasosMensaje(String mensaje) throws InterruptedException {
        actor.has(
                Ensure.that(VENTA_MODAL).text().isEqualTo(mensaje)
        );
Thread.sleep(3000);
    }

    @And("^Seleccionamos Check de todos los estados$")
    public void seleccionamosCheckDeTodosLosEstados() {

        actor.has(
                Click.on(CAMPO_ESTADO_SERVICIO),
                Click.on(CHECK_CONTADOR_CASOS),
                Hit.the(Keys.ESCAPE).into(CAMPO_ESTADO_SERVICIO));
    }
}
