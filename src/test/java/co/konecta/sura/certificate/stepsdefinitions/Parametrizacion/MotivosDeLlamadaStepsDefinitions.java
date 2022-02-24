package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Interfaces.Parametrizacion.MotivosDeLlamadaPage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.MotivosDeLlamadaTask.InformacionGeneralTask;
import co.konecta.sura.certificate.Tareas.Parametrizacion.MotivosDeLlamadaTask.SeguimientoDeServicioTask;
import co.konecta.sura.certificate.Tareas.Parametrizacion.MotivosDeLlamadaTask.SolicitudDeServicioTask;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.OPTION_MENU_PARAMETERIZATION;

public class MotivosDeLlamadaStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edit and delete call reasons parameterization$")
    public void ICreateEditAndDeleteCallReasonsParameterization() {
    }

    @And("^I enter call reasons parameterization$")
    public void IEnterCallReasonsParameterization() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(OPTION_MENU_PARAMETERIZATION),
                MoveMouse.to(HomePage.OPTION_CALL_REASONS_PARAMETERIZATION).andThen(actions -> actions.click()));
    }

    @And("^I select button create call reasons parameterization$")
    public void ISelectButtonCreateCallReasonsParameterization() {
        actor.attemptsTo(Click.on(MotivosDeLlamadaPage.BUTTON_CREATE_CALL_REASONS));
    }

    @And("^Escribimos la informacion de motivos de llamada con solicitud de servicio(.*),Tipo:\"([^\"]*)\",Estado:\"([^\"]*)\",Linea:(.*),Validacion\"([^\"]*)\"$")
    public void IWriteInformationInCallReasonsParameterizationServiceRequest(String name, String Tipo, String Estado, String line, String Validacion) {
        actor.attemptsTo(SolicitudDeServicioTask.writeInformationServiceRequest(name,Tipo,Estado, line, Validacion));

    }


    @And("^Con Evento Catastrofico$")
    public void ISelectCheckCatastrophicEvent() throws InterruptedException {
        Thread.sleep(300);
        actor.attemptsTo(Click.on(MotivosDeLlamadaPage.CHECK_CATASTROPHIC_EVENT));
    }

    @And("^I Select button save call reasons parameterization$")
    public void ISelectButtonSaveCallReasonsParameterization() {
        actor.attemptsTo(Click.on(MotivosDeLlamadaPage.BUTTON_SAVE_CALL_REASONS));
    }

    @Then("^I view the modal save call reasons parameterization (.*)$")
    public void IViewTheModalSaveCallReasonsParameterization(String message) throws InterruptedException {
        Thread.sleep(2000);
         actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().isEqualTo(message));
    }

    @And("^Escribimos la informacion de motivos de llamada Seguimiento de Servicio Nombre:(.*),Tipo:\"([^\"]*)\",Estado:\"([^\"]*)\",Linea:(.*),opcion(.*)$")
    public void escribimosLaInformacionDeMotivosDeLlamadaSeguimientoDeServicioNombreNameTipoEstadoLineaLineOpcionOption(String name, String tipo, String estado, String line,String option) throws Throwable {
        actor.attemptsTo(SeguimientoDeServicioTask.writeInformationFollowupToaService(name, tipo,estado,line, option));
    }

    @And("^I write information in call reasons general information parameterization and (.*) Tipo:\"([^\"]*)\",Estado:\"([^\"]*)\",Linea:(.*),Gestionfinal:\"([^\"]*)\",servicio:\"([^\"]*)\"$")
    public void iWriteInformationInCallReasonsGeneralInformationParameterizationAndNameTipoEstadoLineaLineGestionfinalServicio(String name, String Tipo, String Estado, String line,String Gestionfinal, String servicio) throws Throwable {
        actor.attemptsTo(InformacionGeneralTask.whiteGeneralInformation(name,Tipo,Estado,line,Gestionfinal,servicio));
    }
}
