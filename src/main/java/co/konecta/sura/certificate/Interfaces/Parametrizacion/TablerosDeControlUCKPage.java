package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TablerosDeControlUCKPage {
    public static final Target FECHA_TABLERO_CONTROL_UCK = Target.the("FECHA TABLERO DE CONTROL LUCK").located(By.cssSelector("[fill='currentColor']"));
    public static final Target SELECCIONAR_FECHA_UCK = Target.the("SELECCIONAR FECHA TABLERO DE CONTROL UCK").locatedBy("//*[@aria-label='{0}']");

}
