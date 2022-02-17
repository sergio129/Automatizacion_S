package co.konecta.sura.certificate.stepsdefinitions.Casos;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Casos.ContadorDeCasos.ContadorCasosModel;
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

public class ContadorDeCasosStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();
    private ContadorCasosModel Contados_Casos = new ContadorCasosModel();

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
    public void filtramosPorFechaInicioContadorDeCasosFI(String FI) throws InterruptedException {
        this.Contados_Casos.setDate1(FI);
        actor.has(Click.on(FECHA_INICIO_CONTADOR_CASOS));
        actor.has(Enter.keyValues(Contados_Casos.getDate1()).into(FECHA_INICIO_CONTADOR_CASOS).thenHit(Keys.TAB).thenHit(Keys.ENTER).thenHit(Keys.ENTER));
        //actor.has(ContadorDeCasosTask.EscribirFechas(Contados_Casos));
        Thread.sleep(5000);
        /*actor.has(Click.on(FECHA_INICIO_CONTADOR_CASOS));
        String date_dd_MM_yyyy[] = (FI.split(" ")[0]).split("/");

        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
       // actor.has(Click.on(ANO_FECHA_INICIO_CONTADOR_CASOS));
        if(yearDiff!=0){
            //Si se tiene que mover a el proximo año
            if(yearDiff>0){
                for(int i=0;i< yearDiff;i++){
                    System.out.println("Year Diff->"+i);
                    actor.has(Click.on(NEXT_FECHA_INICIO_CONTADOR_CASOS));
                }
            }
            //Si tienes que moverte al año anterior
            else if(yearDiff<0){
                for(int i=0;i< (yearDiff*(-1));i++){
                    System.out.println("Year Diff->"+i);
                    actor.has(Click.on(PREVIA_FECHA_INICIO_CONTADOR_CASOS));
                }
            }
        }
        Thread.sleep(1000);*/

    }
}
