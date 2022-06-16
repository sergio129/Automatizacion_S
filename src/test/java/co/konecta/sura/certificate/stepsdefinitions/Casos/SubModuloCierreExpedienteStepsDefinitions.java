package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente.CheckBanderazofallidoTask;
import co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente.ChekBanderazoTask;
import co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente.CrearExpedienteTask;
import co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente.EditarExpedienteTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
                Click.on(EDITAR_CIERRE_EXPEDIENTE));
        Thread.sleep(2000);
    }

    @And("^Escribimos en los campos (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosEnLosCamposHoraManiobrasManiobrasjustificadaAdicionalZonarojaAdicionaljustificacionAsumeclienteConvenio(String hora, String maniobras, String maniobrasjustificada, String adicional, String zonaroja, String zonadestapada, String adicionaljustificacion, String asumecliente, String convenio) throws InterruptedException {
        actor.attemptsTo(EditarExpedienteTask.TareaEscribirDatos(hora, maniobras, maniobrasjustificada, adicional, zonaroja, zonadestapada, adicionaljustificacion, asumecliente, convenio));
        Thread.sleep(2000);
    }

    @And("^click en el boton guardar$")
    public void clickEnElBotonGuardar() throws InterruptedException {
        actor.attemptsTo(
                Click.on(GUARDAR_EXPEDIENTE));
        Thread.sleep(2000);
    }

    @And("^Seleccionamos el check banderazo fonaneo fallido$")
    public void seleccionamosElCheckBanderazoFonaneoFallido() throws InterruptedException {
        actor.attemptsTo(
                Click.on(BANDERAZO_FALLIDO));
        Thread.sleep(1000);
    }

    @And("^Escribimos en el campo (.*)$")
    public void escribimosEnElCampoKilometrofallido(String kilometrofallido) throws InterruptedException {
        actor.attemptsTo(CheckBanderazofallidoTask.EsbriboBanderazoFallido(kilometrofallido));
        Thread.sleep(1000);
    }

    @And("^Seleccionamos el check banderazo fonaneo$")
    public void seleccionamosElCheckBanderazoFonaneo() throws InterruptedException {
        actor.attemptsTo(
                Click.on(BANDERAZO));
        Thread.sleep(1000);
    }

    @And("^Escribo en el campo (.*)$")
    public void escriboEnElCampoKilometro(String kilometro) throws InterruptedException {
        actor.attemptsTo(ChekBanderazoTask.EsbriboBanderazo(kilometro));
        Thread.sleep(1000);
    }

    @And("^Escribimos en el campos (.*)$")
    public void escribimosEnElCamposObservacion(String observacion) throws InterruptedException {
        actor.attemptsTo(CrearExpedienteTask.EsbriboCrearexpediente(observacion));
        Thread.sleep(2000);
    }

    @And("^Clic en el icono crear$")
    public void clicEnElIconoCrear() throws InterruptedException {
            actor.attemptsTo(
            Click.on(BOTON_CREAR));
            Thread.sleep(1000);
    }

    @And("^click en el boton guardar observacion$")
    public void clickEnElBotonGuardarObservacion() throws InterruptedException{
        actor.attemptsTo(
        Click.on(GUARDAR_OBSERVACION),
        Click.on(GUARDAR_OBSERVACION2));
        Thread.sleep(1000);
    }
}