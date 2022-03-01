package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertasUCKPage {

    public static final Target BOTON_CREACION_PARAMETRIZACION_ALERTAS_UCK = Target.the("BOTON PARA CREACION DE PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[mattooltip='Crear']"));
    public static final Target CAMPO_NOMBRE_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO NOMBRE DE PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Nombre *']"));
    public static final Target CAMPO_LINEA_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO LINEA DE PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Lineas *']"));
    public static final Target BUSCAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK = Target.the("BUSCAR REGISTROS PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target SELECCIONAR_REGISTRO_PARAMETRIZACION_ALERTAS_UCK = Target.the("SELECCIONAR REGISTROS PARAMETRIZACION ALERTAS UCK").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target CAMPO_TIPO_SERVICIO_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIPO SERVICIO PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Tipo servicio']"));
    public static final Target CAMPO_GUARDIANES_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO GUARDIANES PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Guardianes']"));
    public static final Target CAMPO_FLUJO_ESPECIAL_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO FLUJO ESPECIAL PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Flujos especiales']"));
    public static final Target CAMPO_ESTADO_SERVICIO_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO ESTADO DEL SERVICIO PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Estado del servicio']"));
    public static final Target CAMPO_TIPO_MONITOREO_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIPO DE MONITOREO PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Tipo monitoreo']"));
    public static final Target CAMPO_GESTOR_CORDINACION_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO GESTOR DE CORDINACION PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Gestor de cordinación']"));
    public static final Target CAMPO_ESTADO_CIERRE_EXPEDIENTE_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO ESTADO GESTION DE EXPEDIENTE PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[aria-label='Estado cierre expediente'][aria-required='false'][aria-disabled='false'][aria-invalid='false']"));
    public static final Target CAMPO_PROVEEDOR_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO PROVEEDOR PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Proveedor']"));
    public static final Target CAMPO_TAREAS_MONITOREO_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TAREAS DE MONITOREO PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Tareas de monitoreo']"));
    public static final Target CAMPO_GESTION_CNM_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIEMPO GESTION CNM PARAMETRIZACION ALERTAS UCK").located(By.id("168"));
    public static final Target CAMPO_UNIDAD_CONTROL_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIEMPO UNIDAD CONTROL PARAMETRIZACION ALERTAS UCK").located(By.id("188"));
    public static final Target CAMPO_ROL_LIDER_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIEMPO ROL LIDER PARAMETRIZACION ALERTAS UCK").located(By.id("242"));
    public static final Target CAMPO_ROL_CORDINADOR_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIEMPO ROL CORDINADOR PARAMETRIZACION ALERTAS UCK").located(By.id("243"));
    public static final Target CAMPO_ROL_GERENTE_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIEMPO ROL GERENTE PARAMETRIZACION ALERTAS UCK").located(By.id("244"));
    public static final Target BOTON_GUARDAR_PARAMETRIZACION_ALERTAS_UCK = Target.the("BOTON GUARDAR PARAMETRIZACION ALERTAS UCK").locatedBy("//app-create-alert-parameterization-uck//button[1]/span");
    public static final Target CAMPO_NOMBRE_ALERTA_PARAMETRIZACION_ALERTAS_UCK = Target.the("CAMPO TIEMPO ROL CORDINADOR PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[placeholder='Nombre Alerta']"));
    public static final Target BOTON_EDITAR_PARAMETRIZACION_ALERTAS_UCK = Target.the("BOTON PARA EDITAR DE PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[mattooltip='Editar']"));
    public static final Target BOTON_ELIMINAR_PARAMETRIZACION_ALERTAS_UCK = Target.the("BOTON PARA ELIMINAR DE PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[mattooltip='Eliminar']"));
    public static final Target CONFIRMAR_SI_ELIMINAR_PARAMETRIZACION_ALERTAS_UCK = Target.the("CONFIRMAR SI ELIMINAR PARAMETRIZACION ALERTAS UCK").located(By.id("sweetalertConfirmButton"));

    public static final Target TITULO = Target.the("TITULO PARAMETRIZACION ALERTAS UCK").located(By.cssSelector("[class='mat-card-title']"));

}
