package co.konecta.sura.certificate.Interfaces.pendientes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SupplierMonitoringPage {

    public static final Target INPUT_MONITORING_WITH = Target.the("This the input monitoring with").located(By.id("whoReports"));
    public static final Target INPUT_SEARCH_MONITORING_WITH = Target.the("This the input search monitoring with").located(By.id("inputWhoReports"));
    public static final Target INPUT_TIME_SERVICE = Target.the("This the input time of service").located(By.id("momentService"));
    public static final Target INPUT_SEARCH_TIME_SERVICE = Target.the("This the input search time of service").located(By.id("inputMomentService"));
    public static final Target INPUT_RESPONSE_MONITORING = Target.the("This the input response to monitoring").located(By.id("causeNovelty"));
    public static final Target INPUT_SEARCH_RESPONSE_MONITORING = Target.the("This the input search response to monitoring").located(By.id("inputcauseNovelty"));
    public static final Target INPUT_GENERATES_COMPLAINT_MONITORING = Target.the("This the input generates complaint monitoring").located(By.id("generateComplaint"));
    public static final Target INPUT_GENERATES_OPTION_NO = Target.the("This the input generates complaint monitoring option no").locatedBy("/html/body/div[3]/div[6]/div/div/div/mat-option[2]");
    public static final Target INPUT_GENERATES_OPTION_SI = Target.the("This the input generates complaint monitoring option si").locatedBy("/html/body/div[3]/div[6]/div/div/div/mat-option[1]");
    public static final Target INPUT_FILED_COMPLAINT_MONITORING = Target.the("This the input filed complaint monitoring").located(By.id("filedComplaint"));
    public static final Target INPUT_ADVISER_OBSERVATION= Target.the("This the input adviser observation").located(By.id("obsAdvisorProviderMonitoring"));
    public static final Target INPUT_SUPPLIER_OBSERVATION = Target.the("This the input supplier observation").located(By.id("obsProviderMonitoring"));
    public static final Target BUTTON_EDIT_TASK = Target.the("This the button edit task").located(By.id("editMonitoringTask"));
    public static final Target BUTTON_CREATE_MONITORING = Target.the("This the button create monitoring").located(By.id("createProviderMonitoring"));
    public static final Target BUTTON_SAVE_MONITORING = Target.the("This the button save monitoring").located(By.id("saveProviderMonitoring"));
    public static final Target BUTTON_EDIT_MONITORING = Target.the("This the button edit monitoring").located(By.id("editProviderMonitoring"));
    public static final Target BUTTON_CANCEL_MONITORING = Target.the("This the button cancel monitoring").located(By.id("cancelProviderMonitoring"));
    public static final Target BUTTON_CANCEL_TASK = Target.the("This the button cancel task").located(By.id("cancelMonitoringTask"));
    public static final Target MODULE_EXPANSION_TASK = Target.the("This the expansion module task").located(By.id("moduleMonitoringTask"));



}