package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.ReprogramacionDeCitas.ReprogramacionDeCitasTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Casos.ReprogramacionDeCitas.ReprogramacionDeCitasPage.*;


public class SubModuloReprogramacionDeCitasStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Creacion de Reprogramacion de cita$")
    public void creacionDeReprogramacionDeCita() {
    }

    @And("^Entramos a la reprogramacion de citas desde el sudmodulo de Tareas de monitoreo$")
    public void entramosAlSubModuloReprogramacionDeCitas() throws InterruptedException {
        actor.has(
                Click.on(BOTON_CREAR_REPROGRAMACION_CITAS),
               // MoveMouse.to(BOTON_CREAR_MODULO_REPROGRAMACION_CITAS).andThen(actions -> actions.click()),
               Click.on(OPCION_SI_CREAR_REPROGRAMACION_CITAS)
               // MoveMouse.to(BOTON_CREAR_MODULO_REPROGRAMACION_CITAS).andThen(actions -> actions.click())
                //Click.on(BOTON_CREAR_REPROGRAMACION_CITAS)
        );
        Thread.sleep(3000);
    }

    @And("^Escribimos la informacion de la Reprogramacion de Citas(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosLaInformacionDeLaReprogramacionDeCitasMotivoSolicitanteNuevaCitaHoraObservacion(String Motivo,String Solicitante, String NuevaCita, String Hora, String Observacion ) {
        actor.has(ReprogramacionDeCitasTask.EscribirInformacionReprogramacion(Motivo, Solicitante, NuevaCita, Hora, Observacion));
    }

    @And("^Click Boton Guardar Reprogramacion de Citas$")
    public void clickBotonGuardarReprogramacionDeCitas() {
        actor.has(Click.on(BOTON_GUARDAR_REPROGRAMACION_CITAS));
    }
}
