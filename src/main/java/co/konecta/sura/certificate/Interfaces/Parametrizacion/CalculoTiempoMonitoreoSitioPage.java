package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculoTiempoMonitoreoSitioPage {
    public static final Target OPCION_MONITOREO_SITIO = Target.the("OPCION CALCULO TIEMPO MONITOREO SITIO").located(By.id("moMonitoringTimesDestinyParametrization"));
    public static final Target BOTON_CREAR_CALCULO_MONITOREO_SITIO = Target.the("BOTON DE CREAR CALCULO DE TIEMPO DE MONITOREO EN SITIO").located(By.id("btnAddMonitoringBotParametrization"));
    public static final Target CAMPO_NOMBRE = Target.the("CAMPO NOMBRE DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("createInputNameMonitoringBotParametrization"));
    public static final Target CAMPO_MOMENTO_DEL_SERVICIO = Target.the("CAMPO MOMENTO DEL SERVICIO DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("selectServiceTimeMonitoringBotParametrization"));
    public static final Target CAMPO_LINEA = Target.the("CAMPO LINEA DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("selectLineMonitoringBotParametrization"));
    public static final Target CAMPO_TIPO_SERVICIO = Target.the("CAMPO TIPO DE SERVICIO DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("selectServiceMonitoringBotParametrization"));
    public static final Target CAMPO_DEPARTAMENTO = Target.the("CAMPO DEPARTAMENTO DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("selectDepartamentMonitoringBotParametrization"));
    public static final Target CAMPO_MUNICIPIO = Target.the("CAMPO MUNICIPIO DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("selectMunicipalitiesMonitoringBotParametrization"));
    public static final Target CAMPO_DELTA = Target.the("CAMPO DELTA DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("createInputNameMonitoringBotParametrization"));
    public static final Target BOTON_GUARDAR = Target.the("BOTON GUARDAR DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("btnSaveMonitoringBotParametrization"));
    public static final Target BOTON_ELIMINAR = Target.the("BOTON ELIMINAR DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.cssSelector("[mattooltip='Eliminar']"));
    public static final Target BUSCAR_POR_NOMBRE = Target.the("CAMPO BUSCAR POR NOMBRE DE PARAMETRIZACION TIEMPO DE MONITOREO EN SITIO").located(By.id("inputNameMonitoringBotParametrization"));

}
