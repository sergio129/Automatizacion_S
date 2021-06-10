package co.konecta.sura.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SupplierManagementPage {

    public static final Target INPUT_SUPPLIER_NAME = Target.the("This the input supplier name").located(By.id("nameProvider"));
    public static final Target INPUT_SEARCH_SUPPLIER_NAME = Target.the("This the input search name").located(By.id("inputProviderFilter"));
    public static final Target INPUT_SUPPLIER_RESPONSE = Target.the("This the input supplier response").located(By.id("replyProvider"));
    public static final Target INPUT_SEARCH_SUPPLIER_RESPONSE = Target.the("This the input search supplier response").located(By.id("inputProviderResponseFilter"));
    public static final Target INPUT_TIME_MONITORING_SITE = Target.the("This the input time monitoring site").located(By.id("time_monitoring_site"));
    public static final Target INPUT_TIME_MONITORING_DESTINATION = Target.the("This the input time monitoring destination").located(By.id("timeMonitoringDestination"));
    public static final Target INPUT_DATE_MONITORING_DESTINATION = Target.the("This the input date monitoring destination").located(By.id("dateMonitoringDestination"));
    public static final Target INPUT_TECHNICAL_CELLPHONE = Target.the("This the input technical cell phone").located(By.id("technicianPhoneNumber"));
    public static final Target INPUT_CENTRAL_PHONE1 = Target.the("This the input central phone 1").located(By.id("centralPhone1"));
    public static final Target INPUT_CENTRAL_PHONE2 = Target.the("This the input central phone 2").located(By.id("centralPhone2"));
    public static final Target INPUT_OBSERVATIONS = Target.the("This the input observations").located(By.id("observationProvider"));
    public static final Target BUTTON_CREATE_SUPPLIER = Target.the("This the button create case").located(By.id("createProviderManagement"));
    public static final Target BUTTON_SAVE_SUPPLIER = Target.the("This the button save supplier").located(By.id("saveProvider"));
    public static final Target BUTTON_EDIT_SUPPLIER = Target.the("This the button edit supplier").located(By.id("editProvider"));
    public static final Target BUTTON_CANCEL_SUPPLIER = Target.the("This the button cancel supplier").located(By.id("cancelProvider"));
    public static final Target MODULE_EXPANSION_SUPPLIER = Target.the("This the expansion module supplier").located(By.id("moduleManagementProvider"));

}
