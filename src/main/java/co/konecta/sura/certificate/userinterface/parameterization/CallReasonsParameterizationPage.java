package co.konecta.sura.certificate.userinterface.parameterization;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CallReasonsParameterizationPage {
    public static final Target BUTTON_CREATE_CALL_REASONS = Target.the("This the button create call reasons").located(By.id("btnCreateCallReasons"));
    public static final Target INPUT_NAME_CALL_REASONS = Target.the("This the input name call reasons").located(By.id("inputCreateNameCallReasons"));
    public static final Target INPUT_SELECT_TYPE_CALL_REASONS = Target.the("This the input select type call reasons").located(By.id("mat-select-value-3"));
    public static final Target SELECT_SERVICE_REQUEST_CALL_REASONS = Target.the("This the input select type call reasons").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[1]");
    public static final Target INPUT_LINE_CALL_REASONS = Target.the("This the input line call reasons").located(By.id("mat-select-value-17"));
    public static final Target INPUT_SEARCH_LINE_CALL_REASONS = Target.the("This the search line  call reasons").located(By.id("lineFilterSearch"));
    public static final Target SELECT_VALIDATION_CALL_REASONS = Target.the("This the input select type call reasons").locatedBy("/html/body/div[2]/div[4]/div/div/div/mat-option[58]");
    public static final Target BUTTON_AMOUNT_CALL_REASONS = Target.the("This the button amount call reasons").located(By.id("btnAddFormCallReasons"));
    public static final Target BUTTON_SAVE_CALL_REASONS = Target.the("This the button save call reasons").located(By.id("btnAddFormCallReasons"));















}
