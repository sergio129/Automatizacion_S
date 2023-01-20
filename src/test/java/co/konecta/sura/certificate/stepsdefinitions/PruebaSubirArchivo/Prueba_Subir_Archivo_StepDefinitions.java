package co.konecta.sura.certificate.stepsdefinitions.PruebaSubirArchivo;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.components.FileToUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static co.konecta.sura.certificate.Interfaces.HomePage.BUTTON_INITIAL_TAB;

public class Prueba_Subir_Archivo_StepDefinitions {
    public static final Target TABLA_TIEMPOS = Target.the("Parametrizacion tiempos").located(By.id("moTimeSettingsParametrization"));
    public static final Target SELECCIONAR_ARCHIVO = Target.the("campos subit Archivo").located(By.cssSelector("[placeholder='seleccionar archivo']"));
    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("subir Archivo")
    public void subir_archivo() {

    }

    @Then("Subimos el achivo")
    public void subimos_el_achivo() throws InterruptedException {

//        File file = new File("C:\\Users\\Sergio\\Desktop\\backlog-sura-asistencia-automatizacion_nuevo_patron\\src\\test\\resources\\listado_parametrizacion_tiempos_altos_20221102140826.csv");
//        String path = file.getAbsolutePath();
//        Thread.sleep(500);
        Path data = null;
        actor.attemptsTo(
                Click.on(BUTTON_INITIAL_TAB),
                Click.on(HomePage.OPTION_MENU_PARAMETERIZATION),Click.on(TABLA_TIEMPOS));

        try {
            data = Paths.get(ClassLoader.getSystemResource("C:\\Users\\Sergio\\Desktop\\backlog-sura-asistencia-automatizacion_nuevo_patron\\src\\test\\resources\\listado_parametrizacion_tiempos_altos_20221102140826.csv").toURI());
        } catch (URISyntaxException ignore) {}
        actor.attemptsTo(Click.on(SELECCIONAR_ARCHIVO),Upload.theFile(data).to(SELECCIONAR_ARCHIVO));

        //driver.findElement(By.cssSelector("[placeholder='seleccionar archivo']")).sendKeys(path);
        //     Click.on(SELECCIONAR_ARCHIVO));
        ///       Enter.theValue(path).into(SELECCIONAR_ARCHIVO),
        //  Click.on(SELECCIONAR_ARCHIVO),
        ///    Upload.theFile(Paths.get(path)).to(SELECCIONAR_ARCHIVO));

        Thread.sleep(20000);
    }

}
