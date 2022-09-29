package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DestinatariosAlertaPage {

    public static final Target INPUT_NAME_ALERT = Target.the("This the input alert name").located(By.id("createNameAlertRecipients"));
    public static final Target INPUT_SEARCH_NAME_ALERT = Target.the("This the input search alert name").located(By.id("NameAlertRecipients"));
    public static final Target INPUT_LINE_ALERT = Target.the("Campo seleccionar linea").located(By.id("selectCreateAlertRecipientsServiceLine"));
    public static final Target INPUT_SEARCH_LINE_ALERT = Target.the("Buscamos la linea de destinatarios de alerta").located(By.id("inputCreateAlertRecipientsServiceLineSearch"));
    public static final Target INPUT_SERVICE_ALERT = Target.the("This the input service alert").located(By.id("selectCreateAlertRecipientsSelectService"));
    public static final Target INPUT_SEARCH_SERVICE_ALERT = Target.the("This the input search service alert").located(By.id("inputCreateAlertRecipientsSelectServiceSearch"));
    public static final Target INPUT_DEPARTMENT_ALERT = Target.the("campo seleccionar departamento destinatarios de alerta").located(By.id("selectCreateAlertRecipientsSelectDepartament"));
    public static final Target INPUT_SEARCH_DEPARTMENT_ALERT = Target.the("This the input search department alert").located(By.id("inputCreateAlertRecipientsSelectDepartamentSearch"));
    public static final Target INPUT_MUNICIPALITY_ALERT = Target.the("Campo municipio destinatarios de alerta").located(By.id("selectCreateAlertRecipientsSelectMunicipality"));
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
    public static final Target BOTON_SELECCIONAR_LINEA_DESTINATARIO_ALERTA = Target.the("click para seleccionar la linea").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target OPTION_SELECT_DEPARTMENT_PARAMETERIZATION = Target.the("This the select department parameterization").locatedBy("//mat-option/span[contains(text(),'{0}')]");

}
