package co.konecta.sura.certificate.Interfaces.Reportes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GenerarReportePage {
    public static final Target CAMPO_SELECCIONAR_REPORTE = Target.the("CAMPO SELECCIONAR REPORTE").located(By.id("selectReportRegear"));

    public static final Target BUSCAR_REPORTE = Target.the("CAMPO SELECCIONAR REPORTE").located(By.id("inputReportRegear"));
    public static final Target BOTON_GENERAR_REPORTE = Target.the("CAMPO SELECCIONAR REPORTE").located(By.id("btnSearchRegear"));
    public static final Target FECHA_FIN_REPORTE = Target.the("CAMPO SELECCIONAR REPORTE").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-generate/mat-card/mat-card-content/div/mat-grid-list/div/mat-grid-tile[2]/figure/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button");
    public static final Target FECHA_INICIO_REPORTE = Target.the("FECHA INICIO CONTADOR DE CASOS").located(By.cssSelector("[fill='currentColor']"));


}