package co.konecta.sura.certificate.Interfaces.Integracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TableroCitasReprogramadosPage {

    public static final Target OPCION_CITAS_REPROGRAMADAS = Target.the("OPCION DE CITAS REPROGRAMADAS EN INTEGRACION").located(By.id("moRescheduledAppointments"));
    public static final Target CAMPO_ESTADO_SERVICIO = Target.the("CAMPO ESTADO DEL SERVICIO").located(By.id("statusCaseRescheduledAppointment"));
    public static final Target CAMPO_LINEA = Target.the("CAMPO LINEA").located(By.id("lineCaseRescheduledAppointment"));
    public static final Target CAMPO_DEPARTAMENTO = Target.the("CAMPO DEPARTAMENTO").located(By.id("selectDepartment"));
    public static final Target SELECIONAR_OPCION = Target.the("SELECIONAR UNA OPCION").locatedBy("//div/mat-option/span[contains(text(),'{0}')]");
    public static final Target BOTON_BUSCAR = Target.the("CAMPO BUSCAR").located(By.id("btnSearchRescheduledAppointment"));
    public static final Target SELECCIONAR_SERVICIO = Target.the("SELECCIONAR SERVICIO").located(By.id("checkboxElementRescheduledAppointmentBoard0"));
    public static final Target ACCIONES_CASOS_SELECCIONADOS = Target.the("OPCION DE LAS ACCIONES CASOS SELECCIONADOS").located(By.id("checkboxMoreRescheduledAppointment"));
    public static final Target OPCION_ACTUALIZACION_MASIVA = Target.the("OPCION DE ACTUALIZACION MASIVA").located(By.id("massUpdateRescheduledAppointment"));
    public static final Target CAMPO_USUARIO = Target.the("CAMPO USUARIO").located(By.cssSelector("[placeholder='Seleccionar Usuario']"));
    public static final Target CAMPO_BUSCAR_USUARIO = Target.the("CAMPO BUSCAR USUARIO").located(By.cssSelector("[placeholder='Buscar Usuario']"));
    public static final Target CAMPO_ESTADO = Target.the("CAMPO CAMBIO DE ESTADO").located(By.id("selectStatusMassUpdateRA"));
    public static final Target CAMPO_GUARDAR = Target.the("CAMPO BUSCAR USUARIO").located(By.id("btnSaveFormMassUpdateRA"));
    public static final Target OPCION_ELIMINAR = Target.the("OPCION ELIMINAR").located(By.id("deleteCasesRescheduledAppointment"));
    public static final Target CONFIRMAR_SI = Target.the("CONFIRMAR SI").located(By.id("sweetalertConfirmButton"));




}
