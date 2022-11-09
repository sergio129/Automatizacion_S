package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TablerosdeControlPage {

    public static final Target INPUT_BOARD_NAME_PARAMETERIZATION = Target.the("This the input board name parameterization").located(By.id("inputBoardName"));
    public static final Target INPUT_BOARD_TYPE_PARAMETERIZATION = Target.the("This the input board type parameterization").located(By.id("typeBoardFilter"));
    public static final Target CAMPO_A_MOSTRAR = Target.the("CAMPOS A MOSTRAR").located(By.id("pcp_fieldsCtrl"));
    public static final Target BUSCAR_CAMPOS_A_MOSTRAR = Target.the("SE BUSCAN LOS CAMPOS A MOSTRAR").located(By.id("inputFieldsCtrlFilterSearch"));
    public static final Target CAMPO_ROLES = Target.the("CAMPO_ROLES").located(By.id("rolesCtrl"));
    public static final Target BUSCAR_ROLES = Target.the("BUSCAR ROLES").located(By.id("inputRolesFilterSearch"));
    public static final Target CAMPO_ASESORES = Target.the("CAMPOS ASESORES").located(By.id("usersCtrl"));
    public static final Target BUSCAR_ASESORES = Target.the("BUSCAR ASESORES").located(By.id("inputUsersFilterSearch"));

    public static final Target CAMPO_SOLO_MIS_EXPEDIENTES = Target.the("This the input only my cases parameterization").located(By.id("onlyItemsCtrl"));
    public static final Target CAMPO_ESTADO_EXPEDIENTE = Target.the("This the input case status filter boards parameterization").located(By.id("statusCaseCtrl"));
    public static final Target INPUT_SEARCH_CASE_STATUS_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search case status filter boards parameterization").located(By.id("inputStatusCaseFilterSearch"));
    public static final Target CAMPO_ESTADO_SERVICIO = Target.the("CAMPO DEL ESTADO DE SERVICIO").located(By.id("controlPanelStatusServiceCtrl"));
    public static final Target INPUT_SEARCH_SERVICE_STATUS_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search service status filter boards parameterization").located(By.id("inputControlPanelStatusServiceSearch"));
    public static final Target CAMPO_DEPARTAMENTO_SOLICITA = Target.the("DEPARTAMENTO SOLICITA").located(By.id("controlPanelDepartment"));
    public static final Target INPUT_SEARCH_DEPARTMENT_REQUEST_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search department request filter boards parameterization").located(By.id("inputControlPanelDepartmentSearch"));
    public static final Target CAMPO_LINEA = Target.the("This the input line filter boards parameterization").located(By.id("controlPanelLineaFilter"));
    public static final Target CAMPO_USUARIO_ASIGNADO = Target.the("CAMPO USUARIO ASIGNADO").located(By.id("controlPanelAssignedCtrl"));

    public static final Target CAMPO_RESPONSABLE = Target.the("CAMPO RESPONSABLE").located(By.id("responsibleCtrl"));
    public static final Target BUSCAR_RESPONSABLE = Target.the("BUSCAR RESPONSABLE").located(By.id("inputControlPanelResponsibleCtrlSearch"));


    public static final Target CAMPO_SERVICIO = Target.the("CAMPO SERVICIO").located(By.id("controlPanelService"));
    public static final Target INPUT_SEARCH_SERVICE_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search service filter boards parameterization").located(By.id("inputControlPanelServiceSearch"));
    public static final Target CAMPO_SERVICIOS_ESPECIALES = Target.the("CAMPO DE SERVICIOS ESPECIALES").located(By.id("controlPanelSpecialServices"));
    public static final Target INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search special service filter boards parameterization").located(By.id("inputControlPanelSpecialServicesSearch"));
    public static final Target CAMPO_GESTION_COORDINACION = Target.the("CAMPO GESTION COORDINACION").located(By.id("clickCtrlFilter"));
    public static final Target CAMPO_ESTADO_DE_TAREAS = Target.the("CAMPO ESTADO DE TAREAS").located(By.id("taskStateFilter"));
    public static final Target CAMPO_PROVEEDOR = Target.the("CAMPO PROVEEDOR").located(By.id("controlPanelProvider"));
    public static final Target INPUT_SEARCH_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search supplier filter boards parameterization").located(By.id("inputControlPanelProviderSearch"));
    public static final Target CAMPO_TIPO_DE_MONITOREO = Target.the("CAMPO TIPO DE MONITOREO").located(By.id("monitoringTypeCtrl"));
    public static final Target INPUT_SEARCH_MONITORING_TYPE_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search monitoring type filter boards parameterization").located(By.id("inputMonitoringTypeCtrlSearch"));
    public static final Target INPUT_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input assigned user filter boards parameterization").located(By.id("controlPanelAssignedCtrl"));
    public static final Target INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input search assigned user filter boards parameterization").located(By.id("inputControlPanelAssignedCtrlSearch"));
    public static final Target INPUT_CLOSURE_STATUS_FILTER_BOARDS_PARAMETERIZATION = Target.the("This the input closure status filter boards parameterization").located(By.id("stateClosingCaseCtrlFilter"));
    public static final Target BUTTON_CREATE_CONTROL_BOARDS_PARAMETERIZATION = Target.the("Boton creacion Parametrizacion tablero de control").locatedBy("#createControlPanelParameterization");
    public static final Target BUTTON_EDIT_CONTROL_BOARDS_PARAMETERIZATION = Target.the("This the button edit control board parameterization").located(By.id("editControlPanelParameterization"));
    public static final Target BUTTON_DELETE_CONTROL_BOARDS_PARAMETERIZATION = Target.the("This the button delete control board parameterization").located(By.id("deleteControlPanelParameterization"));
    public static final Target OPTION_YES_CONTROL_BOARDS_PARAMETERIZATION = Target.the("This the button yes control board parameterization").located(By.id(""));
    public static final Target BOTON_GUARDAR = Target.the("This the button save control board parameterization").located(By.id("controlPanelBtnSaveInitialCreate"));
    public static final Target BUTTON_CANCEL_CONTROL_BOARDS_PARAMETERIZATION = Target.the("This the button cancel control board parameterization").located(By.id("controlPanelBtnCancel"));
    public static final Target EXPANDIR_FILTROS_PARA_APLICAR = Target.the("expancion del modulo de filtros").located(By.id("accordionFiltersToApply"));
}
