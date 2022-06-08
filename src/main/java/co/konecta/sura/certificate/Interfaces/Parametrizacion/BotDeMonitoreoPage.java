package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BotDeMonitoreoPage {
    public static final Target OPCION_BOT_MONITOREO = Target.the("OPCION DE BOT MONITOREO").located(By.id("moMonitoringBot"));
    public static final Target BOTON_AGREGAR_PARAMETRIZACION_BOT_MONITOREO = Target.the("BOTON PARA AGREGAR NUEVA PARAMETRIZACION BOT MONITOREO").located(By.id("btnAddMonitoringBotParametrization"));
    public static final Target CAMPO_NOMBRE = Target.the("CAMPO NOMBRE DE PARAMETRIZACION BOT MONITOREO").located(By.id("createInputNameMonitoringBotParametrization"));
    public static final Target CAMPO_GESTOR_DE_SERVICIO = Target.the("CAMPO GESTOR DE SERVICIO DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectCoordinationManagerMonitoringBotParametrization"));
    public static final Target SELECCIONAR_GESTOR_DE_SERVICIO = Target.the("SELECCIONAMOS EL GESTOR DE SERVICIO DE PARAMETRIZACION BOT MONITOREO").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target CAMPO_LINEA = Target.the("CAMPO LINEA DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectLineMonitoringBotParametrization"));
    public static final Target BUSCAR_LINEA = Target.the("BUSCAR LINEA DE PARAMETRIZACION BOT MONITOREO").located(By.id("inputCreateLineMonitoringBotParametrization"));
    public static final Target SELECCIONAR_DATO = Target.the("SELECCIONAR LINEA DE PARAMETRIZACION BOT MONITOREO").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target CAMPO_TIPO_SERVICIO = Target.the("CAMPO TIPO SERVICIO DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectServiceMonitoringBotParametrization"));
    public static final Target BUSCAR_TIPO_SERVICIO = Target.the("BUSCAR TIPO SERVICIO DE PARAMETRIZACION BOT MONITOREO").located(By.id("inputCreateServiceMonitoringBotParametrization"));
    public static final Target CAMPO_TIPO_TAREA = Target.the("CAMPO TIPO TAREA DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectTaskTypeMonitoringBotParametrization"));
    public static final Target BUSCAR_TIPO_TAREA = Target.the("BUSCAR TIPO TAREA DE PARAMETRIZACION BOT MONITOREO").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target CAMPO_DEPARTAMENTO = Target.the("CAMPO DEPARTAMENTO DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectDepartamentMonitoringBotParametrization"));
    public static final Target BUSCAR_DEPARTAMENTO = Target.the("BUSCAR DEPARTAMENTO DE PARAMETRIZACION BOT MONITOREO").located(By.id("inputCreateDepartamentMonitoringBotParametrization"));
    public static final Target CAMPO_MUNICIPIO = Target.the("CAMPO MUNICIPIO DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectMunicipalitiesMonitoringBotParametrization"));
    public static final Target BUSCAR_MUNICIPIO = Target.the("BUSCAR MUNICIPIO DE PARAMETRIZACION BOT MONITOREO").located(By.id("inputCreateMunicipalitiesMonitoringBotParametrization"));
    public static final Target CAMPO_SERVICIO_ESPECIAL = Target.the("CAMPO SERVICIO ESPECIAL DE PARAMETRIZACION BOT MONITOREO").located(By.id("selectSpecialServicesMonitoringBotParametrization"));
    public static final Target BUSCAR_SERVICIO_ESPECIAL = Target.the("BUSCAR SERVICIO ESPECIAL DE PARAMETRIZACION BOT MONITOREO").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target BOTON_GUARDAR = Target.the("BOTON GUARDAR PARAMETRIZACION BOT MONITOREO").located(By.id("btnSaveMonitoringBotParametrization"));
    public static final Target BUSCAR_NOMBRE = Target.the("CAMPO BUSCAR NOMBRE DE PARAMETRIZACION BOT MONITOREO").located(By.id("inputNameMonitoringBotParametrization"));
    public static final Target BOTON_HABITAR_INHABILITAR_MODULO = Target.the("BOTON HABILITAR Y INHABILITAR MODULO PARAMETRIZACION BOT MONITOREO").located(By.id("btnModuleStatus"));
    public static final Target BOTON_HABITAR_INHABILITAR_PARAMETRIZACION = Target.the("BOTON HABILITAR Y INHABILITAR UNA PARAMETRIZACION BOT MONITOREO").located(By.id("btnStatusMonitoringBotParametrization0"));
    public static final Target BOTON_EDITAR = Target.the("BOTON EDITAR PARAMETRIZACION BOT MONITOREO").located(By.id("btnEditMonitoringBotParametrization"));
    public static final Target BOTON_CONFIRMACION_HABILITAR_INHABILITAR = Target.the("BOTON HABILITAR INHABILITAR PARAMETRIZACION BOT MONITOREO").located(By.id("disableButton"));


}
