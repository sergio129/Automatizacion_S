package co.konecta.sura.certificate.Interfaces.Casos.ContadorCasos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContadorDeCasosPage {

    public static final Target OPCION_CONTADOR_DE_CASOS = Target.the("ENTRAR CONTADOR DE CASOS").located(By.id("moCasesReport"));
    public static final Target CAMPO_ESTADO_SERVICIO = Target.the("CAMPOS ESTADO DEL SERVICIO").located(By.id("selectStatusServiceCaseCounter"));
    public static final Target BUSCAR_ESTADO_SERVICIO = Target.the("BUSCAR ESTADO DEL SERVICIO").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target FECHA_INICIO_CONTADOR_CASOS = Target.the("FECHA INICIO CONTADOR DE CASOS").located(By.cssSelector("[fill='currentColor']"));
    public static final Target PREVIA_FECHA_INICIO_CONTADOR_CASOS = Target.the("CAMBIAR FECHA INICIO HACIA ATRAS CONTADOR DE CASOS").located(By.cssSelector("[aria-label='Previous month']"));
    public static final Target NEXT_FECHA_INICIO_CONTADOR_CASOS = Target.the("CAMBIAR FECHA INICIO HACIA DELANTE CONTADOR DE CASOS").located(By.cssSelector("[aria-label='Next month']"));
    public static final Target ANO_FECHA_INICIO_CONTADOR_CASOS = Target.the("CAMBIAR AÑO FECHA INICIO HACIA DELANTE CONTADOR DE CASOS").located(By.cssSelector("[aria-label='Choose month and year']"));


    public static final Target FECHA_FIN_CONTADOR_CASOS = Target.the("FECHA FIN DEL SERVICIO").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-report/div/div/mat-card/mat-card-content/mat-grid-list/div/mat-grid-tile[3]/figure/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button/span/svg/path");
    public static final Target REPORTE_CONTADOR_CASOS = Target.the("CAMPO REPORTE ESTADO DEL SERVICIO").located(By.id("inputStatusServiceCaseCounter"));




}
