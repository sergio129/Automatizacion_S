package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CaseClosurePage {

    public static final Target INPUT_LINE_CLOSURE = Target.the("This the input line closure parameterization").located(By.id("mat-select-value-7"));
    public static final Target INPUT_SEARCH_LINE_CLOSURE = Target.the("This the input search line closure parameterization").located(By.id("inputCreateLineClosingFile"));
    public static final Target SELECT_SEARCH_LINE_CLOSURE = Target.the("This the select search line closure parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");
    public static final Target MAT_DIALOG = Target.the("This the mat dialog line closure parameterization").locatedBy("/html/body/div[3]/div[2]");


    public static final Target INPUT_SERVICE_CLOSURE = Target.the("This the input service closure parameterization").located(By.id("mat-select-value-9"));
    public static final Target INPUT_SEARCH_SERVICE_CLOSURE = Target.the("This the input search service closure parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[1]/span/ngx-mat-select-search/div/input");
    public static final Target SELECT_SEARCH_SERVICE_CLOSURE = Target.the("This the input search service closure parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");

    public static final Target INPUT_FIELD_CLOSURE = Target.the("This the input field closure parameterization").located(By.id("mat-select-value-11"));
    public static final Target INPUT_SEARCH_FIELD_CLOSURE = Target.the("This the input search field closure parameterization").located(By.id("inputCreateFieldClosingFile"));
    public static final Target BUTTON_CREATE_CLOSURE = Target.the("This the button create closure parameterization").located(By.id("btnAddClosingFile"));
    public static final Target BUTTON_EDIT_CLOSURE = Target.the("This the button edit closure parameterization").located(By.id("btnEditClosingFile"));
    public static final Target BUTTON_DELETE_CLOSURE = Target.the("This the button delete closure parameterization").located(By.id(""));
    public static final Target OPTION_YES_CLOSURE_PARAMETERIZATION = Target.the("This the button yes case closure parameterization").located(By.id(""));
    public static final Target BUTTON_SAVE_CLOSURE = Target.the("This the button save closure parameterization").located(By.id("btnSaveFormClosingFile"));
    public static final Target BUTTON_CANCEL_CLOSURE_PARAMETERIZATION = Target.the("This the button cancel closure parameterization").located(By.id(""));
    public static final Target INPUT_LINE_CLOSURE_HOME = Target.the("This the input line home closure parameterization").located(By.id("mat-select-value-1"));
    public static final Target INPUT_SEARCH_LINE_CLOSURE_HOME = Target.the("This the input search line home closure parameterization").located(By.id("inputLineClosingFile"));
    public static final Target INPUT_SERVICE_CLOSURE_HOME = Target.the("This the input service home closure parameterization").located(By.id("mat-select-value-3"));
    public static final Target INPUT_SEARCH_SERVICE_CLOSURE_HOME = Target.the("This the input search home service closure parameterization").located(By.id("inputServiceClosingFile"));
    public static final Target BUTTON_SEARCH_CLOSURE_HOME = Target.the("This the button search home closure parameterization").located(By.id("btnSearchClosingFile"));



}
