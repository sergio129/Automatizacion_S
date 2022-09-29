package co.konecta.sura.certificate.Interfaces.Inicio;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ControlBoardsPage {

    public static final Target INPUT_BOARD_NAME = Target.the("This the input board name").located(By.id("inputBoardName"));
    public static final Target INPUT_BOARD_TYPE = Target.the("This the input board type").located(By.id("typeBoardFilter"));
    public static final Target SELECCIONAR_INPUT_BOARD_TYPE = Target.the("SELECCIONAMOS EL TIPO DE TABLERO").locatedBy("//mat-option/span[contains(text(),' {0} ')]");
    public static final Target INPUT_FIELDS_SHOW = Target.the("This the input fields to show").located(By.id("pcp_fieldsCtrl"));
    public static final Target INPUT_SEARCH_FIELDS_SHOW = Target.the("This the input search fields to show").located(By.id("inputFieldsCtrlFilterSearch"));
    public static final Target INPUT_ROL_BOARDS = Target.the("This the input rol boards").located(By.id(""));
    public static final Target INPUT_ADVISERS = Target.the("This the input rol boards").located(By.id(""));
    public static final Target INPUT_ONLY_CASES = Target.the("This the input only my cases").located(By.id("onlyItemsCtrl"));
    public static final Target INPUT_CASE_STATUS_FILTER_BOARDS = Target.the("This the input case status filter boards").located(By.id("statusCaseCtrl"));
    public static final Target INPUT_SEARCH_CASE_STATUS_FILTER_BOARDS = Target.the("This the input search case status filter boards").located(By.id("inputStatusCaseFilterSearch"));
    public static final Target INPUT_SERVICE_STATUS_FILTER_BOARDS = Target.the("This the input service status filter boards").located(By.id("controlPanelStatusServiceCtrl"));
    public static final Target INPUT_SEARCH_SERVICE_STATUS_FILTER_BOARDS = Target.the("This the input search service status filter boards").located(By.id("inputControlPanelStatusServiceSearch"));
    public static final Target INPUT_DEPARTMENT_REQUEST_FILTER_BOARDS = Target.the("This the input department request filter boards").located(By.id("controlPanelDepartment"));
    public static final Target INPUT_SEARCH_DEPARTMENT_REQUEST_FILTER_BOARDS = Target.the("This the input search department request filter boards").located(By.id("inputControlPanelDepartmentSearch"));
    public static final Target INPUT_LINE_FILTER_BOARDS = Target.the("This the input line filter boards").located(By.id("controlPanelLineaFilter"));
    public static final Target INPUT_SERVICE_FILTER_BOARDS = Target.the("This the input service filter boards").located(By.id("controlPanelService"));
    public static final Target INPUT_SEARCH_SERVICE_FILTER_BOARDS = Target.the("This the input search service filter boards").located(By.id("inputControlPanelServiceSearch"));
    public static final Target INPUT_SPECIAL_SERVICE_FILTER_BOARDS = Target.the("This the input special service filter boards").located(By.id("controlPanelSpecialServices"));
    public static final Target INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS = Target.the("This the input search special service filter boards").located(By.id("inputControlPanelSpecialServicesSearch"));
    public static final Target INPUT_CLICK_CASE_FILTER_BOARDS = Target.the("This the input click case filter boards").located(By.id("clickCtrlFilter"));
    public static final Target INPUT_TASK_STATUS_FILTER_BOARDS = Target.the("This the input task status filter boards").located(By.id("taskStateFilter"));
    public static final Target INPUT_SUPPLIER_FILTER_BOARDS = Target.the("This the input supplier filter boards").located(By.id("controlPanelProvider"));
    public static final Target INPUT_SEARCH_SUPPLIER_FILTER_BOARDS = Target.the("This the input search supplier filter boards").located(By.id("inputControlPanelProviderSearch"));
    public static final Target INPUT_MONITORING_TYPE_FILTER_BOARDS = Target.the("This the input monitoring type filter boards").located(By.id("monitoringTypeCtrl"));
    public static final Target INPUT_SEARCH_MONITORING_TYPE_FILTER_BOARDS = Target.the("This the input search monitoring type filter boards").located(By.id("inputMonitoringTypeCtrlSearch"));
    public static final Target INPUT_ASSIGNED_USER_FILTER_BOARDS = Target.the("This the input assigned user filter boards").located(By.id("controlPanelAssignedCtrl"));
    public static final Target INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS = Target.the("This the input search assigned user filter boards").located(By.id("inputControlPanelAssignedCtrlSearch"));
    public static final Target INPUT_CLOSURE_STATUS_FILTER_BOARDS = Target.the("This the input closure status filter boards").located(By.id("stateClosingCaseCtrlFilter"));
    public static final Target BUTTON_CREATE_CONTROL_BOARDS = Target.the("This the button create control board").located(By.id("createControlPanel"));
    public static final Target BUTTON_EDIT_CONTROL_BOARDS = Target.the("This the button edit control board").located(By.id("editControlPanel"));
    public static final Target BUTTON_DELETE_CONTROL_BOARDS = Target.the("This the button delete control board").located(By.id("deleteControlPanel"));
    public static final Target OPTION_YES_CONTROL_BOARDS = Target.the("This the button yes control board").located(By.id("sweetalertConfirmButton"));
    public static final Target BUTTON_SAVE_CONTROL_BOARDS = Target.the("This the button save control board").located(By.id("controlPanelBtnSaveInitialCreate"));
    public static final Target BUTTON_CANCEL_CONTROL_BOARDS = Target.the("This the button cancel control board").located(By.id("controlPanelBtnCancel"));
    public static final Target MODULE_EXPANSION_FILTER_CONTROL_BOARDS = Target.the("This the module expansion filter control board").located(By.id("accordionFiltersToApply"));
}
