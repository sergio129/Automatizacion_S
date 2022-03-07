package co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubCierreExpediente {



    public static final Target EDITAR_CIERRE_EXPEDIENTE = Target.the("clic en modulo expediente").located(By.cssSelector("[aria-label='Editar Cierre de expediente']"));
    public static final Target SELECCIONAR_CIERRE_EXPEDIENTE= Target.the("clic en modulo expediente").locateBy(By.xpath()/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-show-cases/mat-accordion/app-close-proceeding/mat-expansion-panel/mat-expansion-panel-header"));
}
