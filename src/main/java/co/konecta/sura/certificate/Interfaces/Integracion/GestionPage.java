package co.konecta.sura.certificate.Interfaces.Integracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GestionPage {
    public static final Target BOTON_EDITAR_EXPEDIENTE = Target.the("BOTON EDITAR EXPEDIENTE").located(By.id("btnEditIntegrationManagement"));
    public static final Target FECHA_CITA = Target.the("SELECCIONAR CALENDARIO PARA FECHA DE CITA").located(By.id("pickerDateAppintment"));
    public static final Target SELECCIONAR_FECHA_CITA = Target.the("SELECCIONAR UNA FECHA DE CITA").locatedBy("[aria-label='{0}']");
    public static final Target CAMPO_HORA = Target.the("CAMPO HORA").located(By.id("appointmentTime"));
    public static final Target SELECCIONAR_HORA = Target.the("SELECCIONAR UNA HORA DE  FECHA DE CITA").locatedBy("//div//span[contains(text(),'{0}')]");
    public static final Target OK_HORA = Target.the("OK HORA").locatedBy("/html/body//div/div/div/div/div[2]/button[2]");
    public static final Target CAMPO_SERVICIO_ESPECIAL = Target.the("CAMPO SERVICIO ESPECIAL").located(By.id("specialServicesCtrl"));
    public static final Target SELECCIONAR_SERVICIO_ESPECIAL = Target.the("SELECCIONAR SERVICIO ESPECIAL").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target CAMPO_DEPARTAMENTO_SOLICITA = Target.the("CAMPO DEPARTAMENTO SOLICITA").located(By.cssSelector("[aria-label='Departamento solicita'][aria-required='true'][aria-disabled='false'][aria-invalid='true']"));
    public static final Target CAMPO_MUNICIPIO_SOLICITA = Target.the("CAMPO MUNICIPIO SOLICITA").located(By.cssSelector("[id='municipalityCtrl'][aria-required='true'][aria-invalid='true']"));


}
