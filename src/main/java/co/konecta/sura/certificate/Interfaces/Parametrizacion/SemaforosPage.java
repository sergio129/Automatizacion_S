package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SemaforosPage {

    public static final Target INPUT_ROLE_TRAFFIC_LIGHT = Target.the("Campo roles de parametrizacion de semaforos").located(By.id("selectTrafficLightRoles"));
    public static final Target INPUT_SEARCH_ROLE_TRAFFIC_LIGHT = Target.the("This the input search role traffic light parameterization").located(By.id("inputListTrafficLightRolesSearch"));
    public static final Target INPUT_SERVICE_STATUS_TRAFFIC = Target.the("Campo estado del servicio parametrizacion de semaforos").located(By.id("selectTrafficLightStatusServices"));
    public static final Target INPUT_SEARCH_SERVICE_STATUS_TRAFFIC = Target.the("This the input search service status traffic light parameterization").located(By.id("inputTrafficLightStatusServicesSearch"));
    public static final Target INPUT_LINE_TRAFFIC_LIGHT = Target.the("Campo linea Parametrizacion de semaforos").located(By.id("selectTrafficLightLine"));
    public static final Target INPUT_SEARCH_LINE_TRAFFIC_LIGHT = Target.the("This the input search line traffic light parameterization").located(By.id("inputTrafficLightLineSearch"));
    public static final Target INPUT_SERVICE_TRAFFIC_LIGHT = Target.the("Campo servicio de parametrizacion de semaforos").located(By.id("selectTrafficLightService"));
    public static final Target INPUT_SEARCH_SERVICE_TRAFFIC_LIGHT = Target.the("This the input search service traffic light parameterization").located(By.id("inputTrafficLightServiceSearch"));
    public static final Target INPUT_FROM_1 = Target.the("This the input from 1 traffic light parameterization").located(By.id("fieldColor1From"));
    public static final Target INPUT_UNTIL_1 = Target.the("This the input until 1 traffic light parameterization").located(By.id("fieldColor1Until"));
    public static final Target INPUT_FROM_2 = Target.the("This the input from 2 traffic light parameterization").located(By.id("fieldColor2From"));
    public static final Target INPUT_UNTIL_2 = Target.the("This the input until 2 traffic light parameterization").located(By.id("fieldColor2Until"));
    public static final Target INPUT_FROM_3 = Target.the("This the input from 3 traffic light parameterization").located(By.id("fieldColor3From"));
    public static final Target INPUT_UNTIL_3 = Target.the("This the input until 3 traffic light parameterization").located(By.id("fieldColor3Until"));
    public static final Target INPUT_FROM_4 = Target.the("This the input from 4 traffic light parameterization").located(By.id("fieldColor4From"));
    public static final Target INPUT_UNTIL_4 = Target.the("This the input until 4 traffic light parameterization").located(By.id("fieldColor4Until"));
    public static final Target INPUT_FROM_5 = Target.the("This the input from 5 traffic light parameterization").located(By.id("fieldColor5From"));
    public static final Target INPUT_UNTIL_5 = Target.the("This the input until 5 traffic light parameterization").located(By.id("fieldColor5Until"));
    public static final Target INPUT_FROM_6 = Target.the("This the input from 6 traffic light parameterization").located(By.id("fieldColor6From"));
    public static final Target INPUT_UNTIL_6 = Target.the("This the input until 6 traffic light parameterization").located(By.id("fieldColor6Until"));
    public static final Target BUTTON_CREATE_TRAFFIC_LIGHT = Target.the("This the button create traffic light parameterization").located(By.id("btnAddTrafficLightRoles"));
    public static final Target BUTTON_EDIT_TRAFFIC_LIGHT = Target.the("This the button edit traffic light parameterization").located(By.id("btnEditTrafficLightRoles"));
    public static final Target BUTTON_DELETE_TRAFFIC_LIGHT = Target.the("This the button delete traffic light parameterization").located(By.id("btnDeleteTrafficLightRoles"));
    public static final Target OPTION_YES_DELETE_TRAFFIC_LIGHT = Target.the("This the button yes traffic light parameterization").locatedBy("/html/body/div[5]/div/div[3]/button[1]");
    public static final Target BUTTON_SAVE_TRAFFIC_LIGHT = Target.the("This the button save traffic light parameterization").located(By.id("btnSaveTrafficLight"));
    public static final Target BUTTON_CANCEL_TRAFFIC_LIGHT = Target.the("This the button cancel traffic light parameterization").located(By.id(""));
    public static final Target INPUT_ROLE_TRAFFIC_LIGHT2 = Target.the("This the input search roles traffic light parameterization").located(By.id("selectSearchTrafficLightRoles"));
    public static final Target BUTTON_BUSCAR_TRAFFIC_LIGHT = Target.the("This the button buscar traffic light parameterization").located(By.id("btnSearchTrafficLightRoles"));
    public static final Target INPUT_SEARCH_ROLE_TRAFFIC_LIGHT2 = Target.the("This the input search role traffic light parameterization").located(By.id("inputListSearchTrafficLightRoles"));

}
