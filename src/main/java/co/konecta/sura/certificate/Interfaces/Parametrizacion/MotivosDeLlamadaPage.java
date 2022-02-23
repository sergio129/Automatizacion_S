package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MotivosDeLlamadaPage {
    public static final Target BUTTON_CREATE_CALL_REASONS = Target.the("This the button create call reasons").located(By.id("btnCreateCallReasons"));
    public static final Target INPUT_NAME_CALL_REASONS = Target.the("This the input name call reasons").located(By.id("inputCreateNameCallReasons"));
    public static final Target INPUT_SELECT_TYPE_CALL_REASONS = Target.the("Campo tipo").located(By.id("selectCreateTypeCallReasons"));
    public static final Target SELECT_SERVICE_REQUEST_CALL_REASONS = Target.the("SELECIONAMOS EL TIPO DE SERVICIO").locatedBy("//*[@id='inputCreateTypeCallReasonsSearch']/span[contains(text(),'{0}')]");
    public static final Target SELECT_FOLLOW_SERVICE_CALL_REASONS = Target.the("This the input select type call reasons").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target SELECT_GENERAL_INFORMATION_CALL_REASONS = Target.the("This the input select General information call reasons").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[3]");
    public static final Target INPUT_LINE_CALL_REASONS = Target.the("This the input line call reasons").located(By.id("lineCtrlSearch"));
    public static final Target INPUT_SEARCH_LINE_CALL_REASONS = Target.the("This the search line  call reasons").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target INPUT_SEARCH_LINE_FOLLOW_CALL_REASONS = Target.the("This the search line  call reasons").locatedBy("/html/body/div[3]/div[4]/div/div/div/ngx-mat-select-search/div/input");
    public static final Target INPUT_SELECT_VALIDATION_CALL_REASONS = Target.the("This the input select type call reasons").located(By.id("selectCreateValidationCallReasons"));
    public static final Target OPTION_YES_SELECT_VALIDATION_CALL_REASONS = Target.the("This the input select type call reasons").located(By.id("sweetalertConfirmButton"));
    public static final Target SELECT_VALIDATION_CALL_REASONS = Target.the("This the input select type call reasons").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target BUTTON_AMOUNT_CALL_REASONS = Target.the("This the button amount call reasons").located(By.id("btnAddFormCallReasons"));
    public static final Target BUTTON_SAVE_CALL_REASONS = Target.the("This the button save call reasons").located(By.id("btnSaveFormCallReasons"));
    public static final Target CHECK_CATASTROPHIC_EVENT= Target.the("This the button check box catastrophic event call reasons").located(By.id("mat-checkbox-5"));
    public static final Target OPTION_DESCRIPTION= Target.the("This the option description call reasons").located(By.id("inputCreateOptionCallReasons"));
    public static final Target BUTTON_ADD_CALL_REASONS = Target.the("This the button add call reasons").located(By.id("btnAddOptionCallReasons"));
    public static final Target INPUT_SELECT_FINAL_MANAGE_CALL_REASONS = Target.the("This the input select type call reasons").located(By.id("mat-select-value-9"));
    public static final Target OPTION_FINAL_MANAGE_CALL_REASONS = Target.the("This the option select  final manage type call reasons").located(By.id("inputCreateFinalManagementCallReasonsSearch"));

    public static final Target SELECT_FINAL_MANAGE_CALL_REASONS = Target.the("This the select  final manage type call reasons").located(By.id("selectCreateFinalManagementCallReasons-panel"));

    public static final Target CAMPO_ESTADO_MOTIVOS_LLAMADA = Target.the("CAMPO ESTADO MOTIVOS DE LLAMADA").located(By.id("selectCreateStateCallReasons"));
    public static final Target SELECIONAMOS_CAMPO_ESTADO_MOTIVOS_LLAMADA = Target.the("SELECIONAMOS UN ESTADO DE MOTIVOS DE LLAMADA").locatedBy("//mat-option/span[contains(text(),'{0}')]");


















}
