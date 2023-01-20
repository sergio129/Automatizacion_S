package co.konecta.sura.certificate.Interfaces.Reutilizables;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfacesReutilizablesPage {

    public static final Target SELECCIONAR_DATO = Target.the("Este campo selecionar lo que s ele pase por parametro para dar clic").locatedBy("//mat-option/span[contains(text(),' {0} ')]");
    public static final Target BUSCAR_DATO = Target.the("Este campo BUSCA LOS DATOS ").located(By.cssSelector("[placeholder='Buscar']"));

}
