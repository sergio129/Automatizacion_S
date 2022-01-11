package co.konecta.sura.certificate.userinterface.parameterization;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstrategiaPage {

    public static final Target INPUT_CONTINGENCY = Target.the("This the input contingency").located(By.id("nameEditStrategy"));
    public static final Target INPUT_CONTINGENCY_DESCRIPTION = Target.the("This the input contingency description").located(By.id("descriptionEditStrategy"));
    public static final Target INPUT_COORDINATION_STRATEGY = Target.the("This the input coordination strategy").located(By.id("mat-select-value-7"));
    public static final Target INPUT_TIME_ASSIGNMENT = Target.the("This the input time for assignment").located(By.id("pqrTimeEditStrategy"));
    public static final Target INPUT_FIRST_EXPIRATION_TIME = Target.the("This the input first expiration time").located(By.id("oneEndDateEditStrategy"));
    public static final Target INPUT_SECOND_EXPIRATION_TIME = Target.the("This the input second expiration time").located(By.id("twoEndDateEditStrategy"));
    public static final Target INPUT_MONITORING_STRATEGY = Target.the("This the input monitoring strategy").located(By.id(""));
    public static final Target INPUT_PREVENTIVE_MONITORING_TIME_= Target.the("This the input preventive monitoring time").located(By.id("preventiveTimeEditStrategy"));
    public static final Target INPUT_TIME_MONITORING_SITE = Target.the("This the input time monitoring on site").located(By.id("siteTimeEditStrategy"));
    public static final Target INPUT_TIME_MONITORING_COMPLETION = Target.the("This the input time monitoring completion").located(By.id("endingTimeEditStrategy"));
    public static final Target INPUT_MONITORING_TASK = Target.the("This the input monitoring task").located(By.id(""));
    public static final Target INPUT_SERVICES_STRATEGY = Target.the("This the input services strategy").located(By.id(""));
    public static final Target INPUT_SEARCH_SERVICES_STRATEGY = Target.the("This the input search services strategy").located(By.id(""));
    public static final Target INPUT_NOTIFICATION_MESSAGE_STATUS = Target.the("This the input notification message status").located(By.id(""));
    public static final Target INPUT_NOTIFICATION_MESSAGE = Target.the("This the input notification message").located(By.id(""));
    public static final Target INPUT_NOTIFICATION_TIME = Target.the("This the input notification time").located(By.id(""));
   public static final Target INPUT_SEARCH_STRATEGY_NAME = Target.the("This the input search strategy name").located(By.id("nameStrategy"));
    public static final Target BUTTON_SEARCH_STRATEGY = Target.the("This the button search strategy").located(By.id("btnStrategySearch"));
    public static final Target BUTTON_EDIT_CONTINGENCY_STRATEGY = Target.the("This the button edit contingency strategy").located(By.id("btnEditStrategy"));
    public static final Target BUTTON_EDIT_COORDINATION_STRATEGY = Target.the("This the button edit coordination strategy").located(By.id("btnEditStrategy"));
    public static final Target BUTTON_EDIT_MONITORING_STRATEGY = Target.the("This the button edit monitoring strategy").located(By.id(""));
    public static final Target BUTTON_EDIT_TASK_STRATEGY = Target.the("This the button edit task strategy").located(By.id("btnEditStrategy"));
    public static final Target BUTTON_EDIT_SERVICES_STRATEGY = Target.the("This the button edit services strategy").located(By.id(""));
    public static final Target BUTTON_EDIT_NOTIFICATION_STRATEGY = Target.the("This the button edit notification strategy").located(By.id("btnEditStrategy"));
    public static final Target BUTTON_SAVE_STRATEGY = Target.the("This the button save strategy").located(By.id("btnEditSaveStrategy"));
    public static final Target BUTTON_CANCEL_STRATEGY = Target.the("This the button cancel strategy").located(By.id(""));




}
