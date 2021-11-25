package co.konecta.sura.certificate.userinterface.parameterization;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListsParameterizationPage {
    public static final Target BUTTON_INITIAL_TAB = Target.the("This the input inicial tab").located(By.id("globalMenu"));//Lo traje de HomePage
    public static final Target BUTTON_PARAMETRIZACION = Target.the("This the input inicial tab").located(By.id("moParameterization"));//
    public static final Target BUTTON_SCROLL = Target.the("This the input inicial tab").located(By.id("snav"));//
    public static final Target OPTION_LIST_PARAMETERIZATION = Target.the("This the button lists parameterization").located(By.id("moListsParameterization"));
    public static final Target INPUT_ROLES_LISTS = Target.the("This the input roles lists").located(By.id("moRolesList"));
    public static final Target INPUT_SEARCH_ROLES_LISTS = Target.the("This the input search roles lists").located(By.id(""));
    public static final Target INPUT_MODULES_LISTS = Target.the("This the input modules lists").located(By.id(""));
    public static final Target INPUT_SEARCH_MODULES_LISTS = Target.the("This the input search modules lists").located(By.id(""));
    public static final Target INPUT_LISTS = Target.the("This the input lists").located(By.id(""));
    public static final Target INPUT_SEARCH_LISTS = Target.the("This the input lists").located(By.id(""));
    public static final Target INPUT_OPTIONS_LISTS = Target.the("This the input options lists").located(By.id(""));
    public static final Target INPUT_SEARCH_OPTIONS = Target.the("This the input search options lists").located(By.id(""));
    public static final Target INPUT_OPTION_NAME = Target.the("This the input option name").located(By.id(""));
    public static final Target INPUT_OPTION_ID_EASYCASE = Target.the("This the input option id easycase").located(By.id(""));
    public static final Target BUTTON_CREATE_LISTS = Target.the("This the button create lists").located(By.id("addListParameterizacion"));
    public static final Target BUTTON_CREATE_OPTION_LISTS = Target.the("This the button create option lists").located(By.id(""));
    public static final Target BUTTON_EDIT_LISTS = Target.the("This the button edit lists").located(By.id("btnEditListParameterizacion"));
    public static final Target BUTTON_SAVE_LISTS = Target.the("This the button save lists").located(By.id(""));
    public static final Target BUTTON_SAVE_OPTION_LISTS = Target.the("This the button save option lists").located(By.id(""));

}
