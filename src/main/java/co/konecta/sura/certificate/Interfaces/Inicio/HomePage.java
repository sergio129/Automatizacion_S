package co.konecta.sura.certificate.Interfaces.Inicio;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://172.23.1.252:5443/frontend/login")
public class HomePage extends PageObject {

    public static final Target BUTTON_INITIAL_TAB = Target.the("This the input inicial tab").located(By.id("globalMenu"));
    //  public static final Target BUTTON_SONORA_NOTIFICATION = Target.the("This the input final creation date").locatedBy("//input[@id='finalCreationDate']");
    public static final Target OPTION_MENU_CASE = Target.the("This the button menu case").located(By.id("moCases"));
    public static final Target OPTION_MENU_PARAMETERIZATION = Target.the("This the button menu parameterization").located(By.id("moParameterization"));
    public static final Target OPTION_SEARCH_CASE = Target.the("This the button search case").located(By.id("moCasesList"));
    public static final Target OPTION_CONTROL_BOARDS_PARAMETERIZATION = Target.the("This the button control boards parameterization").located(By.id("moControlPanelParameterization"));
    public static final Target OPTION_ALERT_PARAMETERIZATION = Target.the("This the button alert parameterization").located(By.id("moAlertRecipients"));
    public static final Target OPTION_CASE_CLOSURE_PARAMETERIZATION = Target.the("This the button case closure parameterization").located(By.id("moCloseCasesParameterization"));
    public static final Target OPTION_STRATEGY_PARAMETERIZATION = Target.the("This the button strategy parameterization").located(By.id("moStrategy"));
    public static final Target OPTION_ASSIGNMENT_PARAMETERIZATION = Target.the("This the button assignment parameterization").located(By.id("moWizzardParameterization"));
    public static final Target OPTION_ALERT_TIME_PARAMETERIZATION = Target.the("This the button alert time parameterization").located(By.id("moAlertTimes"));
    public static final Target OPTION_HIDE_MONITORING_TASKS_PARAMETERIZATION = Target.the("This the button hide monitoring tasks parameterization").located(By.id("moHideMonitoringTask"));
    public static final Target OPTION_TRAFFIC_LIGHT_PARAMETERIZATION = Target.the("This the button traffic light parameterization").located(By.id("moTrafficLightParameterization"));
    public static final Target MODULE_EXPANSION_GENERAL = Target.the("This the expansion module general").located(By.id("moduleGeneral"));
    public static final Target MODAL_VALIDATION = Target.the("This the toast validation").located(By.id("toast-container"));
    public static final Target OPTION_BOUQUETS_PARAMETERIZATION = Target.the("This the option bouquets parameterization").located(By.id("moBranch"));
    public static final Target STATUS_CASE_VALIDATION = Target.the("This the input status case validation").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-show-cases/mat-accordion/mat-expansion-panel[1]/div/div/div/div[5]/h6");
    public static final Target SCROLL_PARAMETERIZATION = Target.the("This controls the Scrooll").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav[1]");
    public static final Target OPTION_DIALING_CODES_PARAMETERIZATION = Target.the("This the Dialing codes parameterization").located(By.id("moListIndicative"));
    public static final Target OPTION_EXIT_CODES_PARAMETERIZATION = Target.the("This the exit codes parameterization").located(By.id("moListExitCode"));
    public static final Target SCROLL2_PARAMETERIZATION = Target.the("This controls 2 the Scrooll").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav[1]/div[3]");
    public static final Target OPTION_INTEGRATION = Target.the("This the integration").located(By.id("moIntegration"));
    public static final Target OPTION_HIGH_CONTACT_TIMES_INTEGRATION = Target.the("This the high contact times").located(By.id("moHighTimeManagement"));
    public static final Target OPTION_CALL_REASONS_PARAMETERIZATION = Target.the("This the option call reasons parameterization").located(By.id("moCallReason"));
    public static final Target PARAMETRIZACION_PREFIJOS = Target.the("selecionamos la opcion prefijos del menu de parametrizacion").located(By.id("moListPrefix"));

    public static final Target ROLES = Target.the("Menu Roles").located(By.id("moRoles"));
    public static final Target OPCION_LISTAR_ROLES = Target.the("Opcion listar roles").located(By.id("moRolesList"));
    public static final Target OPCION_ASOCIAR_LISTAS = Target.the("opcion para entrar al menu de asociar listas ").located(By.id("moListRelations"));
    public static final Target OPCION_SERVICIOS_DUPLICADOS = Target.the("opcion para entrar al menu de servicios duplicados ").located(By.id("moServiceDuplicate"));

    public static final Target GESTION_SERVICIOS_DUPLICADOS = Target.the("opcion para entrar al menu de servicios duplicados ").located(By.cssSelector("[mattooltip='Guardar Gestión']"));
    public static final Target GESTION_USUARIOS = Target.the("opcion para entrar a gestion de usuarios ").located(By.id("moUserManagement"));
    public static final Target GESTION_USUARIOS_LISTAR_USUARIOS = Target.the("opcion para entrar a a la opcion de listar usuarios del modulo de gestion de usuarios ").located(By.id("moUserList"));

    public static final Target OPCION_CIERRE_EXPEDIENTE = Target.the("opcion para entrar  la parametrizacion de cierre de expediente ").located(By.id("moCloseCasesParameterization"));


}
