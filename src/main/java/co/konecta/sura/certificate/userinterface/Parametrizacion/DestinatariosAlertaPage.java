package co.konecta.sura.certificate.userinterface.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DestinatariosAlertaPage {

    public static final Target INPUT_NAME_ALERT = Target.the("This the input alert name").located(By.id("createNameAlertRecipients"));
    public static final Target INPUT_SEARCH_NAME_ALERT = Target.the("This the input search alert name").located(By.id("NameAlertRecipients"));
    public static final Target INPUT_LINE_ALERT = Target.the("This the input line alert").located(By.id("mat-select-value-11"));
    public static final Target INPUT_SEARCH_LINE_ALERT = Target.the("This the input search line alert").located(By.id("inputCreateAlertRecipientsServiceLineSearch"));
    public static final Target INPUT_SERVICE_ALERT = Target.the("This the input service alert").located(By.id("mat-select-value-13"));
    public static final Target INPUT_SEARCH_SERVICE_ALERT = Target.the("This the input search service alert").located(By.id("inputCreateAlertRecipientsSelectServiceSearch"));
    public static final Target INPUT_DEPARTMENT_ALERT = Target.the("This the input department alert").located(By.id("mat-select-value-15"));
    public static final Target INPUT_SEARCH_DEPARTMENT_ALERT = Target.the("This the input search department alert").located(By.id("inputCreateAlertRecipientsSelectDepartamentSearch"));
    public static final Target INPUT_MUNICIPALITY_ALERT = Target.the("This the input municipality alert").located(By.id("mat-select-value-17"));
    public static final Target INPUT_SEARCH_MUNICIPALITY_ALERT = Target.the("This the input search municipality alert").located(By.id("inputCreateAlertRecipientsSelectMunicipalitySearch"));
    public static final Target INPUT_EMAIL_ALERT = Target.the("This the input email alert").located(By.id("correoAlertRecipients"));
    public static final Target BUTTON_CREATE_ALERT_PARAMETERIZATION = Target.the("This the button create alert parameterization").located(By.id("btnCreateAlertRecipients"));
    public static final Target BUTTON_EDIT_ALERT_PARAMETERIZATION = Target.the("This the button edit alert parameterization").located(By.id("btnEditAlertRecipients"));
    public static final Target BUTTON_DELETE_ALERT_PARAMETERIZATION = Target.the("This the button delete alert parameterization").located(By.id("iconAccionSelectAlertRecipients"));
    public static final Target BUTTON_SEARCH_ALERT_PARAMETERIZATION = Target.the("This the button search alert parameterization").located(By.id("btnSearchAlertRecipients"));
    public static final Target CHECKBOX_DELETE_ALERT_PARAMETERIZATION = Target.the("This the checkbox delete alert parameterization").located(By.id("checkboxAllSelectAlertRecipients"));
    public static final Target OPTION_DELETE_ALERT_PARAMETERIZATION = Target.the("This the option delete alert parameterization").located(By.id("actionSelectedAlertRecipients"));
    public static final Target OPTION_YES_ALERT_PARAMETERIZATION = Target.the("This the button yes alert parameterization").located(By.id("sweetalertConfirmButton"));
    public static final Target BUTTON_SAVE_ALERT_PARAMETERIZATION = Target.the("This the button save alert parameterization").located(By.id("btnSaveFormAlertRecipients"));
    public static final Target BUTTON_SELECT_ALERT_PARAMETERIZATION = Target.the("This the button Select alert parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");
    public static final Target OPTION_SELECT_DEPARTMENT_PARAMETERIZATION = Target.the("This the select department parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");

}
