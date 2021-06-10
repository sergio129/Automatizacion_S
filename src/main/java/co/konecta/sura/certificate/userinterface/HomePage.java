package co.konecta.sura.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://easylabs.grupokonecta.local:5443/frontend/login")
public class HomePage extends PageObject {

    public static final Target BUTTON_INITIAL_TAB = Target.the("This the input inicial tab").located(By.id("globalMenu"));
  //  public static final Target BUTTON_SONORA_NOTIFICATION = Target.the("This the input final creation date").locatedBy("//input[@id='finalCreationDate']");
 //   public static final Target BUTTON_MAIN_MENU = Target.the("This the input license plate").locatedBy("//input[@id='snav']");
    public static final Target OPTIONS_MENU_CASE = Target.the("This the input security code").located(By.id("moCases"));
    public static final Target OPTION_SEARCH_CASE = Target.the("This the input click case").located(By.id("moCasesList"));
    public static final Target MODAL_VALIDATION = Target.the("This the toast required fields").located(By.id("toast-container"));

}
