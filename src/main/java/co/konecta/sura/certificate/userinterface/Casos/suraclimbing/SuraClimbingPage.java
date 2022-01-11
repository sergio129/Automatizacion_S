package co.konecta.sura.certificate.userinterface.Casos.suraclimbing;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuraClimbingPage {

    public static final Target INPUT_MANAGEMENT_TYPE = Target.the("This the input management type").located(By.id("typeOfManagement"));
    public static final Target INPUT_SEARCH_MANAGEMENT_TYPE = Target.the("This the input search management type").located(By.id("inputTypeManagementFilter"));
    public static final Target INPUT_MANAGEMENT_PERSON = Target.the("This the input management person").located(By.id("personOfManagement"));
    public static final Target INPUT_SEARCH_MANAGEMENT_PERSON = Target.the("This the input search management person").located(By.id("inputPersonManagementFilter"));
    public static final Target INPUT_RESPONSE_TYPE = Target.the("This the input response type").located(By.id("typeOfReply"));
    public static final Target INPUT_SEARCH_RESPONSE_TYPE = Target.the("This the input search response type").located(By.id("inputTypeReplyFilter"));
    public static final Target INPUT_GENERATES_COMPLAINT = Target.the("This the input generates complaint").located(By.id("generateOfComplaint"));
    public static final Target INPUT_SEARCH_GENERATES_COMPLAINT = Target.the("This the input search generates complaint").located(By.id("inputGenerateComplaintFilter"));
    public static final Target INPUT_FILED_COMPLAINT = Target.the("This the input file complaint").located(By.id("filedTheComplaint"));
    public static final Target INPUT_OBSERVATIONS = Target.the("This the input observations sura climbing").located(By.id("observationScaling"));
    public static final Target BUTTON_CREATE_CLIMBING = Target.the("This the button create climbing").located(By.id("createScaling"));
    public static final Target BUTTON_SAVE_CLIMBING = Target.the("This the button save climbing").located(By.id("saveScaling"));
    public static final Target BUTTON_EDIT_CLIMBING = Target.the("This the button edit climbing").located(By.id("editScaling"));
    public static final Target BUTTON_CANCEL_CLIMBING = Target.the("This the button cancel climbing").located(By.id("cancelScaling"));
    public static final Target MODULE_EXPANSION_CLIMBING = Target.the("This the expansion module climbing").located(By.id("moduleSuraScallings"));

}
