package co.konecta.sura.certificate.stepsdefinitions.Reportes;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.ContadorCasos.ContadorDeCasosPage.*;
import static co.konecta.sura.certificate.Interfaces.Casos.ContadorCasos.ContadorDeCasosPage.SELECCIONAR_FECHA_FIN;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;
import static co.konecta.sura.certificate.Interfaces.Reportes.GenerarReportePage.*;

public class GenerarReporteStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Generar Reportes")
    public void GenerarReportes() {
    }


    @And("^Entramos a el modulo de reportes$")
    public void entramosAElModuloDeReportes() throws InterruptedException {
        actor.has(Click.on(BUTTON_INITIAL_TAB),
                Click.on(REPORTES),
                Click.on(GENERAR_REPORTES)
                );
        Thread.sleep(2000);
    }

    @And("^Filtramos por nombre de reporte(.*), Fechas: (.*),(.*)$")
    public void filtramosPorNombreDeReporteNameFechasFechainicioFechaFin(String name, String FI, String FF) throws InterruptedException {
        actor.has(
                Click.on(CAMPO_SELECCIONAR_REPORTE),
                Enter.theValue(name).into(BUSCAR_REPORTE).thenHit(Keys.ENTER),
                Click.on(FECHA_INICIO_REPORTE),
                Click.on(SELECCIONAR_FECHA_INICIO.of(String.valueOf(FI))),
                Click.on(FECHA_FIN_REPORTE),
                Click.on(SELECCIONAR_FECHA_FIN.of(String.valueOf(FF))),
                Click.on(BOTON_GENERAR_REPORTE)

        );
Thread.sleep(5000);
    }
}
