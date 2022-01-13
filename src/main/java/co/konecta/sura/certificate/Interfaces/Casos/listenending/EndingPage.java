package co.konecta.sura.certificate.Interfaces.Casos.listenending;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EndingPage {

    public static final Target MODULE_EXPANSION_ENDING = Target.the("This the expansion module ending").located(By.id("accordionModuleListEnding"));
    public static final Target BUTTON_CREATE_ENDING = Target.the("This the button create ending").located(By.id("createListEnding"));
    public static final Target INPUT_ENDING_WITH = Target.the("This the input ending with").located(By.id("endingWith"));
    public static final Target INPUT_ENDING_WITH_FILTER = Target.the("This the input search generates ending with ").located(By.id("inputEndingWith"));
    public static final Target INPUT_TYPE_RESPONSE = Target.the("This the input type response").located(By.id("typeResponseEnding"));
    public static final Target INPUT_TYPE_RESPONSE_FILTER = Target.the("This the input search generates cause management").located(By.id("inputTypeResponEnding"));
    public static final Target INPUT_OBSERVATION_ENDING = Target.the("This the input observation").located(By.id("descriptionEnding"));
    public static final Target BUTTON_SAVE_ENDING = Target.the("This the button save ending").located(By.id("saveEnding"));
    public static final Target BUTTON_CANCEL_ENDING = Target.the("This the button cancel ending").located(By.id("cancelEnding"));
    public static final Target BUTTON_EDIT_ENDING = Target.the("This the button edit ending").located(By.id("editListEnding"));
}

