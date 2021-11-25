package co.konecta.sura.certificate.userinterface.home;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://easylabs.grupokonecta.local:5443/frontend/login")
public class HomePage extends PageObject {

    public static final Target BUTTON_INITIAL_TAB = Target.the("This the input inicial tab").located(By.id("globalMenu"));
  //  public static final Target BUTTON_SONORA_NOTIFICATION = Target.the("This the input final creation date").locatedBy("//input[@id='finalCreationDate']");
    public static final Target OPTION_MENU_CASE = Target.the("This the button menu case").located(By.id("moCases"));
    public static final Target OPTION_MENU_PARAMETERIZATION = Target.the("This the button menu parameterization").located(By.id("moParameterization"));
    public static final Target OPTION_SEARCH_CASE = Target.the("This the button search case").located(By.id("moCasesList"));
    public static final Target OPTION_CONTROL_BOARDS_PARAMETERIZATION = Target.the("This the button control boards parameterization").located(By.id(""));
    public static final Target OPTION_ALERT_PARAMETERIZATION = Target.the("This the button alert parameterization").located(By.id(""));
    public static final Target OPTION_CASE_CLOSURE_PARAMETERIZATION = Target.the("This the button case closure parameterization").located(By.id(""));
    public static final Target OPTION_STRATEGY_PARAMETERIZATION = Target.the("This the button strategy parameterization").located(By.id("moStrategy"));
    public static final Target OPTION_ASSIGNMENT_PARAMETERIZATION = Target.the("This the button assignment parameterization").located(By.id("moWizzardParameterization"));
    public static final Target OPTION_ALERT_TIME_PARAMETERIZATION = Target.the("This the button alert time parameterization").located(By.id("moAlertTimes"));
    public static final Target OPTION_HIDE_MONITORING_TASKS_PARAMETERIZATION = Target.the("This the button hide monitoring tasks parameterization").located(By.id(""));
    public static final Target OPTION_TRAFFIC_LIGHT_PARAMETERIZATION = Target.the("This the button traffic light parameterization").located(By.id(""));
    public static final Target MODULE_EXPANSION_GENERAL = Target.the("This the expansion module general").located(By.id("moduleGeneral"));
    public static final Target MODAL_VALIDATION = Target.the("This the toast validation").located(By.id("toast-container"));
    public static final Target STATUS_CASE_VALIDATION = Target.the("This the input status case validation").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-show-cases/mat-accordion/mat-expansion-panel[1]/div/div/div/div[5]/h6");
    public static final Target SCROLL_PARAMETERIZATION=Target.the("This controls the Scrooll").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav[1]/div[3]");

}
