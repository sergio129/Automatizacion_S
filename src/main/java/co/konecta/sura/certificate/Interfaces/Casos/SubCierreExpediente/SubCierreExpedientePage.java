package co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubCierreExpedientePage {


    public static final Target EDITAR_CIERRE_EXPEDIENTE = Target.the("clic en modulo expediente").located(By.cssSelector("[aria-label='Editar Cierre de expediente']"));
    public static final Target SELECCIONAR_CIERRE_EXPEDIENTE= Target.the("clic en modulo expediente").located(By.xpath("//mat-sidenav-content/div/app-show-cases/mat-accordion/app-close-proceeding/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/div"));
//editar
    public static final Target CAMPO_HORAS = Target.the("escribo en el campo horas").located(By.cssSelector("[placeholder='Horas']"));
    public static final Target CAMPO_MANIOBRAS = Target.the("escribo en el campo maniobras").located(By.cssSelector("[placeholder='Maniobras']"));
    public static final Target CAMPO_MANIOBRAS_JUSTIFICADA = Target.the("escribo en el campo maniobrasjustificada").located(By.cssSelector("[placeholder='Maniobras justificación']"));
    public static final Target CAMPO_ADICIONAL = Target.the("escribo en el campo adicional").located(By.cssSelector("[placeholder='Adicional']"));
    public static final Target CAMPO_ZONA_ROJA = Target.the("escribo en el campo  roja").located(By.cssSelector("[placeholder='Zona_roja']"));
    public static final Target CAMPO_ZONA_DESTAPADA = Target.the("escribo en el campo  zona destapada").located(By.cssSelector("[placeholder='Zona destapada']"));
    public static final Target CAMPO_ADICIONAL_JUSTIFICADA = Target.the("escribo en el campo  adicional justificada").located(By.xpath("//mat-dialog-container/editcloseproceeding/div[2]/form/div/mat-form-field[9]/div/div[1]/div/input"));
    public static final Target CAMPO_ASUME_CLIENTE= Target.the("escribo en el campo asume cliente").located(By.cssSelector("[placeholder='Asume cliente']"));
    public static final Target CAMPO_CAUSA_ACCIDENTE  = Target.the("selecciono campo causa accidente").located(By.cssSelector("[placeholder='Causa accidente']"));
    public static final Target SELECCIONAR_CAUSA_ACCIDENTE= Target.the("selecCiono la opcion causa").located(By.xpath("//mat-option[2]"));
    public static final Target CAMPO_ESTADO = Target.the("selecciono campo estado").located(By.cssSelector("[placeholder='Estado cierre expediente']"));
    public static final Target SELECCIONAR_ESTADO= Target.the("selecCiono la opcion estado").located(By.xpath("//mat-option[2]"));
    public static final Target CAMPO_CONVENIO = Target.the("selecciono campo estado").located(By.cssSelector("[placeholder='Convenio']"));
    public static final Target GUARDAR_EXPEDIENTE= Target.the("selecCiono la opcion estado").located(By.xpath("//mat-dialog-container/editcloseproceeding/div[2]/div/button[1]"));
//check banderazo fallido
    public static final Target BANDERAZO_FALLIDO= Target.the("seleccino check banderazo fallido").located(By.xpath("//mat-dialog-container/editcloseproceeding/div[2]/form//div[2]/input"));
    public static final Target CAMPO_KILOMETRO_FALLIDO = Target.the("escribo campo kilometro fallido").located(By.xpath("//mat-dialog-container/editcloseproceeding/div[2]/form/div/mat-form-field[2]/div/div[1]/div/input"));
    //check banderazo
    public static final Target BANDERAZO= Target.the("seleccino check banderazo ").located(By.xpath("//mat-dialog-container/editcloseproceeding/div[2]/form/div/div[1]/input"));
    public static final Target CAMPO_KILOMETRO = Target.the("escribo en el campo kilometro" ).located(By.xpath("//mat-dialog-container/editcloseproceeding/div[2]/form/div/mat-form-field[1]//div[1]/div/input"));

// CREAR
    public static final Target CAMPO_OBSERVACION = Target.the("escribo en el campo observacion" ).located(By.cssSelector("[placeholder='Observación *']"));
    public static final Target BOTON_CREAR = Target.the("CREAR ").located(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/editcloseproceeding/div[2]/app-observation/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/div[2]/button"));
    public static final Target GUARDAR_OBSERVACION2 = Target.the("escribo en el campo observacion2" ).located(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/editcloseproceeding/div[2]/div/button[1]"));
    public static final Target GUARDAR_OBSERVACION = Target.the("escribo en el campo observacion" ).located(By.xpath("/html/body/div[3]/div[4]/div/mat-dialog-container/app-create/form/div[2]/button[1]"));
}

