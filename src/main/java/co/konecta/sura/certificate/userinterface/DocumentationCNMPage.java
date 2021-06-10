package co.konecta.sura.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DocumentationCNMPage {

    public static final Target INPUT_MANAGEMENT_PERSON_DOCUMENTATION = Target.the("This the input management person documentation").located(By.id("persManCnmDoc"));
    public static final Target INPUT_SEARCH_MANAGEMENT_PERSON_DOCUMENTATION = Target.the("This the input search management person").located(By.id("inputPersManCnmDoc"));
    public static final Target INPUT_GENERATES_COMPLAINT_DOCUMENTATION = Target.the("This the input generates complaint documentation").located(By.id("genComplaitCnmDoc"));
    public static final Target INPUT_SEARCH_GENERATES_COMPLAINT_DOCUMENTATION = Target.the("This the input search generates complaint documentation").located(By.id("inputGenComplaitCnmDoc"));
    public static final Target INPUT_FILED_COMPLAINT_DOCUMENTATION = Target.the("This the input filed complaint monitoring").located(By.id("filedComplaintcnmDoc"));
    public static final Target INPUT_OBSERVATION_DOCUMENTATION = Target.the("This the input observation documentation").located(By.id("descriptionCnmDoc"));
    public static final Target BUTTON_CREATE_DOCUMENTATION = Target.the("This the button create documentation").located(By.id("createCnmDocumentation"));
    public static final Target BUTTON_SAVE_DOCUMENTATION = Target.the("This the button save documentation").located(By.id("saveCnmDocumentation"));
    public static final Target BUTTON_CANCEL_DOCUMENTATION = Target.the("This the button cancel documentation").located(By.id("cancelCnmDocumentation"));
    public static final Target MODULE_EXPANSION_DOCUMENTATION = Target.the("This the expansion module documentation").located(By.id("mat-expansion-panel-header-8"));


}
