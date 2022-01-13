package co.konecta.sura.certificate.Interfaces.pendientes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StateManagementPage {

    public static final Target INPUT_STATUS_NAME = Target.the("This the input status name").located(By.id("nextStateChange"));
    public static final Target INPUT_SEARCH_ADD_STATUS = Target.the("This the input search add status").located(By.id("inputSearchNextStateChange"));
    public static final Target BUTTON_OPEN_MODAL = Target.the("This the button open modal").located(By.id("btonSlideStateComponent"));
    public static final Target BUTTON_ADD_STATUS = Target.the("This the button add status").located(By.id("addStatusChange"));
    public static final Target BUTTON_SAVE_STATUS = Target.the("This the button save status").located(By.id("saveStateChange"));
    public static final Target BUTTON_CANCEL_STATUS = Target.the("This the button cancel status").located(By.id("cancelStateChange"));
    public static final Target TITLE_DETAILS_CASE = Target.the("This the title details case").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/app-breadcrumb/div/div/div[1]/h4");

}
