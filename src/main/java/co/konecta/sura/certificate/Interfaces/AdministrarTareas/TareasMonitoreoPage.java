package co.konecta.sura.certificate.Interfaces.AdministrarTareas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TareasMonitoreoPage {
    public static final Target OPCION_ADMINISTRAR_LISTAS = Target.the("OPCION ADMINISTRAR LISTAS").located(By.id("moManageTasks"));
    public static final Target OPCION_TAREAS_MONITOREO = Target.the("OPCION TAREAS MONITOREO").located(By.id("moMonitoringTasks"));
    public static final Target NOMBRE_TAREAS_MONITOREO = Target.the("NOMBRE TAREAS MONITOREO").located(By.id("inputNameMonitoringTasks"));
    public static final Target CAMPO_CASO = Target.the("CAMPO CASO FILTRO TAREAS DE MONITOREO").located(By.id("inputCaseMonitoringTasks"));
    public static final Target CAMPO_ESTADO_TAREA = Target.the("CAMPO ESTADO DE TAREA").located(By.id("selectStatusTasksMonitoringTasks"));
    public static final Target CAMPO_LINEA = Target.the("CAMPO LINEA").located(By.id("selectLineMonitoringTasks"));

    public static final Target CAMPO_TIPO_MONITOREO = Target.the("CAMPO TIPO MONITOREO").located(By.id("selectMonitoringTypeMonitoringTasks"));
    public static final Target CAMPO_GESTION_COORDINACION = Target.the("CAMPO GESTION COORDINACION").located(By.id("selectClickFileMonitoringTasks"));
    public static final Target CAMPO_FECHA_INICIO = Target.the("CAMPO FECHA INICIO").located(By.cssSelector("[placeholder='Fecha inicio']"));
    public static final Target CAMPO_SELECIONAR_FECHA = Target.the("CAMPO FECHA INICIO").located(By.cssSelector("[aria-label='{0}']"));
    public static final Target CAMPO_FECHA_FIN = Target.the("CAMPO FECHA FIN").located(By.cssSelector("[placeholder='Fecha fin']"));
    public static final Target CAMPO_USUARIO_ASIGNADO = Target.the("CAMPO USUARIO ASIGNADO").located(By.cssSelector("[placeholder='Usuario asignado']"));
    public static final Target CAMPO_TAREAS_VENCIDAS = Target.the("CAMPO TAREAS VENCIDAS").located(By.id("selectDueTasksMonitoringTasks"));

    public static final Target BOTON_BUSCAR = Target.the("BOTON BUSCAR").located(By.id("btnSearchMonitoringTasks"));
    public static final Target SELECCIONAR_TAREA = Target.the("SELECIONAR CHECK DE TAREAS").located(By.id("checkboxElementMonitoringTasks0"));
    public static final Target SELECCIONAR_ACTUALIZACION_MASIVA = Target.the("SELECIONAR ACTUALIZACION MASIVA").located(By.id("checkboxMoreMonitoringTasks"));
    public static final Target ACTUALIZACION_MASIVA = Target.the("SELECIONAR ACTUALIZACION MASIVA").located(By.id("massUpdateMonitoringTasks"));

    public static final Target CAMPO_SELECIONAR_USUARIO = Target.the("CAMPO SELECIONAR USUARIO").located(By.cssSelector("[placeholder='Seleccionar Usuario']"));
    public static final Target CAMPO_BUSCAR_USUARIO = Target.the("CAMPO BUSCAR USUARIO").located(By.cssSelector("[placeholder='Buscar Usuario']"));
    public static final Target SELECIONAR_ESTADO = Target.the("CAMPO SELECIONAR ESTADO").located(By.id("selectStatusMonitoringTasks"));
    public static final Target BOTON_GUARDAR_ESTADO = Target.the("CAMPO GURDA ESTADO DE TAREA").located(By.id("btnSaveFormMonitoringTasks"));



}
