package co.konecta.sura.certificate.Interfaces.Casos.TareasDeMonitoreo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TaskMonitoringPage {

    public static final Target INPUT_STATE = Target.the("This the input name").located(By.id("stateMonitoringTask"));
    public static final Target INPUT_NAME = Target.the("This the input name").located(By.id("nameMonitoringTask"));
    public static final Target INPUT_TYPE = Target.the("This the input type").located(By.id("typeMonitoringTask"));
    public static final Target INPUT_DATE = Target.the("This the input date").located(By.id("expiredTimeMonitoringTask"));
    public static final Target INPUT_DAY = Target.the("This the input date").locatedBy("/html/body/div[2]/div[4]/div/mat-datepicker-content/mat-calendar/mat-calendar-header/div/div/button[1]");
    public static final Target INPUT_HOUR = Target.the("This the input date").located(By.id("expiredHourMonitoringTask"));
    public static final Target INPUT_USER = Target.the("This the input user").located(By.id("userAssignedMonitoringTask"));
    public static final Target INPUT_USER_FILTER = Target.the("This the input user filter").located(By.id("inputUserCrtlMoniTask"));
    public static final Target BUTTON_SAVE_TASK = Target.the("This the button save status").located(By.id("saveMonitoringTask"));
    public static final Target BUTTON_CREATE_MONITORING = Target.the("This the button create monitoring").located(By.id("createMonitoringTask"));
    public static final Target BUTTON_EDIT_MONITORING = Target.the("This the button create monitoring").located(By.id("editMonitoringTask"));
    public static final Target BUTTON_SAVE_MONITORING = Target.the("This the button save management").located(By.id("saveMonitoringTask"));
    public static final Target MODULE_EXPANSION_MONITORING = Target.the("This the expansion management").located(By.id("AccordionModuleMonitoringTask"));

}
