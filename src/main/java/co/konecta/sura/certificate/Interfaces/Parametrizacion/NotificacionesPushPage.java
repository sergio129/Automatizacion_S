package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotificacionesPushPage {
    //Push Notification Creation
    public static final Target OPTION_PUSH_NOTIFICATIONS = Target.the("We select the parameterization push notifications option").located(By.id("moPushNotifications"));
    public static final Target BUTTON_CREATE_PUSH_NOTIFICATIONS = Target.the("This the button parameterization push notifications option").located(By.id("btnCreatePushNotification"));
    public static final Target INPUT_LINE_PUSH_NOTIFICATIONS = Target.the("Campo Linea Parametrizacion notificaciones push").located(By.id("selectCreateLinePushNotification"));
    public static final Target INPUT_SEARCH_LINE_PUSH_NOTIFICATIONS = Target.the("This the input search line notifications parameterization").located(By.id("inputCreateLinePushNotificationSearch"));
    public static final Target INPUT_SERVICE_PUSH_NOTIFICATIONS = Target.the("Campo Servicio notificaciones push").located(By.id("selectCreateServicePushNotification"));
    public static final Target INPUT_SEARCH_SERVICE_PUSH_NOTIFICATIONS = Target.the("This the input search service notifications parameterization").located(By.id("inputCreateServicePushNotificationSearch"));
    public static final Target INPUT_SERVICE_STATUS_PUSH_NOTIFICATIONS = Target.the("Campo estado del servicio notificaciones push").located(By.id("selectCreateStateServicePushNotification"));
    public static final Target INPUT_SEARCH_STATUS_SERVICE_PUSH_NOTIFICATIONS = Target.the("This the input search service status notifications parameterization").located(By.id("inputCreateStateServicePushNotificationSearch"));
    public static final Target INPUT_ROLES_PUSH_NOTIFICATIONS = Target.the("Campo roles notificaciones push").located(By.id("selectCreateRolePushNotification"));
    public static final Target INPUT_SEARCH_ROLES_PUSH_NOTIFICATIONS = Target.the("This the input search roles notifications parameterization").located(By.id("inputCreateRolePushNotificationSearch"));
    public static final Target INPUT_MOMENT1_PUSH_NOTIFICATIONS = Target.the("Campo tiempo al momento 1 notificaciones push").located(By.id("inputTimeMomentOnePushNotification"));
    public static final Target INPUT_MOMENT2_PUSH_NOTIFICATIONS = Target.the("Campo tiempo al momento 2 notificaciones push").located(By.id("inputTimeMomentTwoPushNotification"));
    public static final Target INPUT_QUOTE1_PUSH_NOTIFICATIONS = Target.the("Campo tiempo de cita 1 notificaciones push").located(By.id("inputTimeAppointmentOnePushNotification"));
    public static final Target INPUT_QUOTE2_PUSH_NOTIFICATIONS = Target.the("Campo tiempo de cita 2 notificaciones push").located(By.id("inputTimeAppointmentTwoPushNotification"));
    public static final Target BUTTON_SAVE_PUSH_NOTIFICATIONS = Target.the("This the button save push notifications parameterization").located(By.id("btnSaveFormPushNotification"));
    //Buttons for filters
    public static final Target INPUT_LINE_FILTER_PUSH_NOTIFICATIONS = Target.the("Campo filtro seleccionar linea notificaciones push ").located(By.id("selectLinePushNotification"));
    public static final Target INPUT_SEARCH_LINE_FILTER_PUSH_NOTIFICATIONS = Target.the("This the input search line filter notifications parameterization").located(By.id("inputLinePushNotificationSearch"));
    public static final Target INPUT_SERVICE_FILTER_PUSH_NOTIFICATIONS = Target.the("This the input service filter push notifications parameterization").located(By.id("selectServicePushNotification"));
    public static final Target INPUT_SEARCH_SERVICE_FILTER_PUSH_NOTIFICATIONS = Target.the("This the input search service filter notifications parameterization").located(By.id("inputServicePushNotificationSearch"));
    public static final Target INPUT_SERVICE_STATUS_FILTER_PUSH_NOTIFICATIONS = Target.the("This the input service status push filter notifications parameterization").located(By.id("selectStateServicePushNotification"));
    public static final Target INPUT_SEARCH_STATUS_FILTER_SERVICE_PUSH_NOTIFICATIONS = Target.the("This the input search service status notifications parameterization").located(By.id("inputStateServicePushNotificationSearch"));
    public static final Target INPUT_ROLES__FILER_PUSH_NOTIFICATIONS = Target.the("This the input roles push notifications parameterization").located(By.id("selectRolePushNotification"));
    public static final Target INPUT_SEARCH_ROLES_FILER_PUSH_NOTIFICATIONS = Target.the("This the input search roles notifications parameterization").located(By.id("inputRolePushNotificationSearch"));
    public static final Target BUTTON_SEARCH_PUSH_NOTIFICATIONS = Target.the("This the button save push notifications parameterization").located(By.id("btnSearchPushNotification"));
    public static final Target BUTTON_EDIT_PUSH_NOTIFICATIONS = Target.the("This the button Edit push notifications parameterization").located(By.id("btnEditPushNotification"));
    //Delete Push Notification
    public static final Target BUTTON_DELETE_PUSH_NOTIFICATIONS = Target.the("This the button Edit push notifications parameterization").located(By.id("btnDeletedPushNotification"));
    public static final Target OPTION_YES_PUSH_NOTIFICATIONS = Target.the("This the option yes push notifications parameterization").locatedBy("/html/body/div[5]/div/div[3]/button[1]");










}
