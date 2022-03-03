package co.konecta.sura.certificate.Interfaces.Inicio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertaPage {

    public static final Target MODULO_ALERTASCK= Target.the("clic en el modulo alertar uck").located(By.id("moAlertUCK"));
    public static final Target NOMBRE_ALERTA_UCK = Target.the("seleccionar el campo alerta nombre UCK").located(By.cssSelector("[aria-label='Seleccionar Nombre Alerta']"));
    public static final Target BUSCAR_ALERTA_UCK = Target.the("seleccionar la busqueda del elemento").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target CAMPO_LINEA = Target.the("seleccionar campo linea").located(By.cssSelector("[aria-label='Seleccionar Linea']"));
    public static final Target SELECCIONAR_LINEA_ALERTA_UCK = Target.the("sleccionar el campo linea ").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target CAMPO_SERVICIO = Target.the("seleccionar el campo servicio UCK").located(By.cssSelector("[aria-label='Seleccionar Servicio']"));
    public static final Target CAMPO_ESTADOO_SERVICIO = Target.the("seleccionar el campo estado servicio UCK").located(By.cssSelector("[aria-label='Estado del servicio ']"));
    public static final Target CAMPO_GUARDIANES = Target.the("seleccionar el campo alerta guardianes UCK").located(By.cssSelector("[aria-label='Guardianes']"));
    public static final Target CAMPO_FLUJO_ESPECIALES= Target.the("seleccionar el campo alerta flujo especiales UCK").located(By.cssSelector("[aria-label='Flujos especiales']"));
    public static final Target CAMPO_TIPO_MONITOREO= Target.the("clic el campo alerta tipo monitoreo UCK").located(By.cssSelector("[aria-label='Tipo de monitoreo ']"));
    public static final Target BOTON_BUSCAR= Target.the("clic boton buscar UCK").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-list-alert-uck/div/div/mat-card/mat-card-content/form/div[4]/button[1]/span");
    public static final Target PANTALLA_REGISTRO= Target.the("ver pantalla de busqueda").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/app-breadcrumb/div/div/div[1]/h4");
    // Alerta edidicion tas
    public static final Target CAMPO_OBSERVACION = Target.the("seleccionar el campo observacion").located(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-create-edit-alert-uck/form/div[1]/div[1]/mat-form-field/div/div[1]/div/textarea"));
    public static final Target CAMPO_VALIDACIONES = Target.the("seleccionar el campo validaciones").located(By.cssSelector("[aria-label='Validaciones']"));
    public static final Target CAMPO_MOTIVO = Target.the("seleccionar el campo alerta motivo").located(By.cssSelector("[aria-label='Motivo']"));
    public static final Target CAMPO_TIPO_GESTION= Target.the("seleccionar el campo alerta tipo de gestion").located(By.cssSelector("[aria-label='Tipo de Gestión']"));
    public static final Target BOTON_EDITAR= Target.the("seleccionar busqueda alerta UCK").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-list-alert-uck/mat-card/mat-card-content/div/mat-table/mat-row/mat-cell[14]/button/span/mat-icon");
    public static final Target BOTON_GUARDAR_EDICION=Target.the("clic boton guardar ").located(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-create-edit-alert-uck/form/div[2]/button[1]/span"));






    }


