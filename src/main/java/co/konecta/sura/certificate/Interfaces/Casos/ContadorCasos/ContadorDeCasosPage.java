package co.konecta.sura.certificate.Interfaces.Casos.ContadorCasos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContadorDeCasosPage {

    public static final Target OPCION_CONTADOR_DE_CASOS = Target.the("ENTRAR CONTADOR DE CASOS").located(By.id("moCasesReport"));
    public static final Target CAMPO_ESTADO_SERVICIO = Target.the("CAMPOS ESTADO DEL SERVICIO").located(By.id("selectStatusServiceCaseCounter"));
    public static final Target BUSCAR_ESTADO_SERVICIO = Target.the("BUSCAR ESTADO DEL SERVICIO").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target FECHA_INICIO_CONTADOR_CASOS = Target.the("FECHA INICIO CONTADOR DE CASOS").located(By.cssSelector("[fill='currentColor']"));
    public static final Target SELECCIONAR_FECHA_INICIO = Target.the("SELECCIONAR FECHA INICIO CONTADOR DE CASOS").locatedBy("//*[@aria-label='{0}']");
    public static final Target SELECCIONAR_FECHA_FIN = Target.the("CAMBIAR FECHA INICIO HACIA DELANTE CONTADOR DE CASOS").locatedBy("//*[@aria-label='{0}']");
    public static final Target BOTON_BUSCAR_CONTADOR_CASOS = Target.the("CAMBIAR AÑO FECHA INICIO HACIA DELANTE CONTADOR DE CASOS").located(By.id("btnSearchCaseCounter"));


    public static final Target FECHA_FIN_CONTADOR_CASOS = Target.the("FECHA FIN DEL SERVICIO").located(By.xpath("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-report/div/div/mat-card/mat-card-content/mat-grid-list/div/mat-grid-tile[3]/figure/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button"));
    public static final Target REPORTE_CONTADOR_CASOS = Target.the("CAMPO REPORTE ESTADO DEL SERVICIO").located(By.id("selectReportCaseCounter"));
    public static final Target SELECCIONAR_REPORTE_CONTADOR_CASOS = Target.the("CAMPO REPORTE ESTADO DEL SERVICIO").locatedBy("//mat-option/span[contains(text(),' {0} ')]");
    public static final Target VENTA_MODAL = Target.the("CAMPO REPORTE ESTADO DEL SERVICIO").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-report/mat-card/mat-card-content/div/mat-table/mat-header-row/mat-header-cell[2]");

    public static final Target CHECK_CONTADOR_CASOS = Target.the("CHECK TODOS LOS ESTADOS CONTADOR DE CASOS").locatedBy("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span/ngx-mat-select-search/div/mat-checkbox/label/div");


}
