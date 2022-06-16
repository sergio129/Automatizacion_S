package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.SubModuloAgenda.LlamadaTask;
import co.konecta.sura.certificate.Tareas.Casos.SubModuloAgenda.TipoContactoTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static co.konecta.sura.certificate.Interfaces.SubAgenda.AgendaPage.*;

public class SubModuloAgendaStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^Regristro de informacion Sub modulo Agenda$")
    public void regristroDeInformacionSubModuloAgenda() {
    }


    @And("^Escribimos en el modulo agenda campos a llamar (.*),(.*),(.*)$")
        public void escribimosEnElCampoTipocontactoClicEnAgregarIngresamosLaInformacionEnLosCamposNumeroallamarDepartamentoMunicipio(String numeroallamar, String departamento, String municipio) throws InterruptedException {
            actor.attemptsTo(LlamadaTask.EscriboModuloLLamada(numeroallamar, departamento, municipio));
            Thread.sleep(2000);
        }

        @And("^Selecionamos el boton llamar$")
        public void selecionamosElBotonLlamar ()throws InterruptedException {
            actor.attemptsTo(Click.on(ICONO_LLAMAR));
            Thread.sleep(2000);
        }

        @And("^Escribimos en el modulo agenda el (.*)$")
        public void escribimosEnElCampoTipocontacto (String tipocontacto){
            actor.attemptsTo(TipoContactoTask.EscriboTipoContacto(tipocontacto));
        }

        @And("^clic en agregar modulo agenda$")
        public void clicEnAgregarModuloAgenda () throws InterruptedException {
            actor.attemptsTo(Click.on(AGREGAR_LLAMADA));
            Thread.sleep(2000);
        }
    }

