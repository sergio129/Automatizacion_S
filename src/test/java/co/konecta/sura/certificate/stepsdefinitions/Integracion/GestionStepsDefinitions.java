package co.konecta.sura.certificate.stepsdefinitions.Integracion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Integracion.GestionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GestionStepsDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Gestion, Edicion de expedientes: Integracion")
    public void GestionEdicionExpedientesIntegracion(){}

    @And("^Ingresamos a Integracion Gestion$")
    public void ingresamosAIntegracionGestion() {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_INTEGRATION),
                MoveMouse.to(HomePage.GESTION).andThen(actions -> actions.click())
                //Click.on(HomePage.OPTION_HIGH_CONTACT_TIMES_INTEGRATION)
        );
    }


    @And("^Escribimos la informacion de Integracion Gestion(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void escribimosLaInformacionDeIntegracionGestion(String FCita ,String Hora,String Nomb,String Tlf,String DpSl,String MpSl,String Placa,String DServ ,String UbServ ,String DllDirecc ,String ServEsp,String GCord,String linea,String Servicio) {
        actor.has(GestionTask.EscribirDatosGestion(FCita ,Hora,Nomb,Tlf,DpSl,MpSl,Placa,DServ ,UbServ ,DllDirecc ,ServEsp,GCord,linea,Servicio));
    }
}
