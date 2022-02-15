package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CierreDeExpedientePage {

    public static final Target BOTON_CREAR_CIERRE_EXPEDIENTE = Target.the("BOTON PARA CREAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("btnAddClosingFile"));
    public static final Target CAMPO_LINEA = Target.the("CAMPO LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectCreateLineClosingFile"));
    public static final Target BUSCAR_LINEA = Target.the("BUSCAMOS LA LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputCreateLineClosingFile"));
    public static final Target SELECCIONAR_LINEA = Target.the("SELECCIONAMOS  LA LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").locatedBy("/html/body/div[4]/div[4]/div/div/div/mat-option[2]");
    public static final Target CAMPO_SERVICIO = Target.the("CAMPO SERVICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectCreateServiceClosingFile"));
    public static final Target BUSCAR_SERVICIO = Target.the("BUSCAMOS EL SERVICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputCreateServiceClosingFile"));
    public static final Target SELECCIONAR_SERVICIO = Target.the("SELECCIONAMOS  EL SERVICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.cssSelector("[class='mat-option mat-option-multiple ng-star-inserted mat-active']"));

    public static final Target CAMPO_CAMPO = Target.the("CAMPO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectCreateFieldClosingFile"));
    public static final Target BUSCAR_CAMPO = Target.the("BUSCAMOS EL CAMPO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputCreateFieldClosingFile"));

    public static final Target BOTON_GUARDAR_CIERRE_EXPEDIENTE = Target.the("BOTON PARA GUARDAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("btnSaveFormClosingFile"));

    public static final Target CAMPO_LINEA_INICIO = Target.the("CAMPO LINEA EN INICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectLineClosingFile"));
    public static final Target BUSCAR_LINEA_INICIO = Target.the("BUSCAMOS LA LINEA EN EL INICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputLineClosingFile"));
    public static final Target SELECCIONAR_LINEA_INICIO = Target.the("SELECCIONAMOS  LA LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").locatedBy("/html/body/div[3]/div[2]/div/div/div/mat-option[2]");
    public static final Target CAMPO_SERVICIO_INICIO = Target.the("CAMPO SERVICIO INICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectServiceClosingFile"));
    public static final Target BUSCAR_SERVICIO_INICIO = Target.the("BUSCAMOS EL SERVICIO INICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputServiceClosingFile"));

    public static final Target BOTON_EDITAR_CIERRE_EXPEDIENTE = Target.the("BOTON PARA EDITAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("btnEditClosingFile"));
    public static final Target BOTON_ELIMINAR_CIERRE_EXPEDIENTE = Target.the("BOTON PARA ELIMINAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("btnDeleteClosingFile"));
    public static final Target OPCION_SI_ELIMINAR_CIERRE_EXPEDIENTE = Target.the("OPCION SI PARA ELIMINAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("sweetalertConfirmButton"));

    public static final Target BOTON_BUSCAR_CIERRE_EXPEDIENTE = Target.the("BOTON PARA ELIMINAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("btnSearchClosingFile"));






}
