package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Casos.advancedsearch.AdvancedSearchPage;
import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.CasosCompleto.CasoCompletoTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class CreacionCasoCompletoStepsDefnitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("Creacion de caso interaccion modulos")
    public void Creaciondecasointeraccionmodulos() {
    }

    @And("Seleccionamos el boton de Crear Caso")
    public void seleccionamosElBotonDeCrearCaso() throws InterruptedException {
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_CASE));
        actor.attemptsTo(Click.on(HomePage.OPTION_SEARCH_CASE));
        actor.attemptsTo(Click.on(AdvancedSearchPage.BUTTON_CREATE_CASE));
        Thread.sleep(2000);
    }

    @And("Escribmos la informacion de la creacion de expediente")
    public void escribmosLaInformacionDeLaCreacionDeExpediente(List<Map<String, String>> informacion) {
        actor.attemptsTo(CasoCompletoTask.EscribirDatos(informacion));

    }
}
