package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AsignacionPage {

    public static final Target INPUT_ROLE_ASSIGNMENT = Target.the("This the input role assignment parameterization").located(By.id("selectCreateRolWizzard"));
    public static final Target INPUT_SEARCH_ROLE_ASSIGNMENT = Target.the("This the input search role assignment parameterization").located(By.id("inputCreateRolWizzardSearch"));
    public static final Target INPUT_USER_ASSIGNMENT = Target.the("This the input user assignment parameterization").located(By.id("selectCreateUsersWizzard"));
    public static final Target INPUT_SEARCH_USER_ASSIGNMENT = Target.the("This the input search user assignment parameterization").located(By.id("inputCreateUsersWizzardSearch"));
    public static final Target INPUT_LINE_ASSIGNMENT = Target.the("This the input line assignment parameterization").located(By.id("selectCreateLinesWizzard"));
    public static final Target INPUT_SEARCH_LINE_ASSIGNMENT = Target.the("This the input search line assignment parameterization").located(By.id("inputCreateLinesWizzardSearch"));
    public static final Target INPUT_SERVICE_ASSIGNMENT = Target.the("This the input service assignment parameterization").located(By.id("selectCreateServiceActivatedWizzard"));
    //public static final Target CLIC_SERVICE_ASSIGNMENT = Target.the("This the input service assignment parameterization").located(By.id("inputCreateServiceActivatedWizzardSearchd"));


    public static final Target INPUT_SEARCH_SERVICE_ASSIGNMENT = Target.the("This the input search service assignment parameterization").located(By.id("inputCreateServiceActivatedWizzardSearch"));
    public static final Target INPUT_DEPARTMENT_ASSIGNMENT = Target.the("This the input department assignment parameterization").located(By.id("selectCreateDepartmentsWizzard"));
    public static final Target INPUT_SEARCH_DEPARTMENT_ASSIGNMENT = Target.the("This the input search department assignment parameterization").located(By.id("inputCreateDepartmentsWizzardSearch"));
    public static final Target INPUT_COORDINATION_MANAGER = Target.the("This the input coordination manager parameterization").located(By.id("selectCreateCoordinationManagerWizzard"));
    public static final Target LIST_COORDINATION_MANAGER = Target.the("This the list coordination manager parameterization").locatedBy("//mat-option//span[contains(text(),'{0}')]");
    public static final Target BUTTON_CREATE_ASSIGNMENT = Target.the("This the button create assignment parameterization").located(By.id("btnCreateWizzard"));
    public static final Target BUTTON_EDIT_ASSIGNMENT = Target.the("This the button edit assignment parameterization").located(By.id("btnEditWizzard"));
    public static final Target BUTTON_DELETE_ASSIGNMENT = Target.the("This the button delete assignment parameterization").located(By.id("btnDeleteWizzard"));
    public static final Target OPTION_YES_ASSIGNMENT = Target.the("This the button yes assignment parameterization").locatedBy("/html/body/div[5]/div/div[3]/button[1]");
    public static final Target BUTTON_SAVE_ASSIGNMENT = Target.the("This the button save assignment parameterization").located(By.id("btnSaveWizzard"));
    public static final Target BUTTON_CANCEL_ASSIGNMENT = Target.the("This the button cancel assignment parameterization").located(By.id(""));
    public static final Target BUTTON_SELECT = Target.the("This the button Select assignment parameterization").locatedBy("//mat-option//span[contains(text(),'{0}')]");
    public static final Target INPUT_USER_ASSIGNMENT_INICIO = Target.the("This is the parameterization of the user input assignment at startup").located(By.id("selectUsersdWizzard"));
    public static final Target INPUT_SEARCH_ROLE_ASSIGNMENT_INICIO = Target.the("This the input search user assignment parameterization").located(By.id("inputUsersdWizzardSearch"));
    public static final Target BUTTON_SEARCH = Target.the("This the button SEARCH assignment parameterization").located(By.id("btnSearchWizzard"));


}
