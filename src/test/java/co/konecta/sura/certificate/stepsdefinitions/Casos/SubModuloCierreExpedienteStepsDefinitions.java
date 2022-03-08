package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente.EditarExpedienteTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente.SubCierreExpedientePage.*;

public class SubModuloCierreExpedienteStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }
    @Given("^Regristro de informacion Sub modulo Cierre expediente$")
    public void regristroDeInformacionSubModuloCierreExpediente() {
    }

    @And("^Click en el modulo cierre de expediente$")
    public void clickEnElModuloCierreDeExpediente() throws InterruptedException {
        actor.attemptsTo(
                Click.on(SELECCIONAR_CIERRE_EXPEDIENTE),
                Click.on(EDITAR_CIERRE_EXPEDIENTE)
        );
        Thread.sleep(2000);
    }
    @And("^Escribimos en los campos (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosEnLosCamposHoraManiobrasManiobrasjustificadaAdicionalZonarojaAdicionaljustificacionAsumeclienteConvenio(String hora, String maniobras, String maniobrasjustificada, String adicional, String zonaroja, String zonadestapada,String adicionaljustificacion, String asumecliente, String convenio)throws InterruptedException {
    actor.attemptsTo(EditarExpedienteTask.TareaEscribirDatos(hora, maniobras, maniobrasjustificada, adicional, zonaroja, zonadestapada, adicionaljustificacion, asumecliente, convenio));
        Thread.sleep(2000);
    }

    @And("^click en el boton guardar$")
    public void clickEnElBotonGuardar() throws InterruptedException {
        actor.attemptsTo(
                Click.on(GUARDAR_EXPEDIENTE));
                Thread.sleep(2000);
    }
}
