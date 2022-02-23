package co.konecta.sura.certificate.Interfaces.Casos.ReprogramacionDeCitas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReprogramacionDeCitasPage {

    public static final Target MODULO_EXPANSION_REPROGRAMACION_CITAS = Target.the("EXPANDIMOS EL MODULO DE REPROGRAMACION DE CITAS").located(By.id("mat-expansion-panel-header-31"));
    public static final Target BOTON_CREAR_REPROGRAMACION_CITAS = Target.the("BOTON PARA LA CREACION DE REPROGRAMACION DE CITAS").located(By.id("rescheduleAppointmentButton"));
   /// public static final Target BOTON_CREAR_MODULO_REPROGRAMACION_CITAS = Target.the("BOTON PARA LA CREACION MODULO DE REPROGRAMACION DE CITAS").located(By.cssSelector("[aria-hidden='true']"));

    public static final Target OPCION_SI_CREAR_REPROGRAMACION_CITAS = Target.the("OPCION SI PARA LA CREACION DE REPROGRAMACION DE CITAS").located(By.id("sweetalertConfirmButton"));
    public static final Target CAMPO_MOTIVO_REPROGRAMACION_CITAS = Target.the("CAMPO MOTIVO DE REPROGRAMACION DE CITAS").located(By.id("reasonCtrl"));
    public static final Target BUSCAR_MOTIVO_REPROGRAMACION_CITAS = Target.the("BUSCAR MOTIVO DE REPROGRAMACION DE CITAS").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target CAMPO_SOLICITANTE_REPROGRAMACION_CITAS = Target.the("CAMPO SOLICITANTE DE REPROGRAMACION DE CITAS").located(By.cssSelector("[placeholder='¿Quién solicita?']"));
    public static final Target BUSCAR_SOLICITANTE_REPROGRAMACION_CITAS = Target.the("BUSCAR MOTIVO DE REPROGRAMACION DE CITAS").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target NUEVA_CITA_REPROGRAMACION_CITAS = Target.the("CAMPO NUEVA CITA DE REPROGRAMACION DE CITAS").located(By.cssSelector("[aria-label='Open calendar']"));
    public static final Target CAMPO_HORA_REPROGRAMACION_CITAS = Target.the("CAMPO HORA CITA DE REPROGRAMACION DE CITAS").located(By.id("appointmentTime"));
    public static final Target CAMPO_OBSERVACIONES_REPROGRAMACION_CITAS = Target.the("CAMPO OBSERVACIONES CITA DE REPROGRAMACION DE CITAS").located(By.id("observations"));
    public static final Target BOTON_GUARDAR_REPROGRAMACION_CITAS = Target.the("BOTON PARA GUARDAR DE REPROGRAMACION DE CITAS").located(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-create-edit-reschedule/form/div[2]/button[1]/span"));
    public static final Target SELECCIONAR_FECHA_REPROGRAMACION_CITAS = Target.the("SELECCIONAMOS FECHA GUARDAR DE REPROGRAMACION DE CITAS").locatedBy(" //div/mat-month-view/table/tbody/tr/td/div[contains(text(),'{0}')]");








}
