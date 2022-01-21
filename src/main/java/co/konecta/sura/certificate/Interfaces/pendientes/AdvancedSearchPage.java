package co.konecta.sura.certificate.Interfaces.pendientes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvancedSearchPage {

    public static final Target BUTTON_CREATE_CASE = Target.the("This the button create case").located(By.id("createCase"));
    public static final Target BUTTON_CLEAR_FILTERS = Target.the("This the button clear filters").located(By.id("clearFilters"));
    public static final Target INPUT_CASE = Target.the("This the input case").located(By.id("case"));
    public static final Target INPUT_CASE_VERIFICATION = Target.the("This the input verification case").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-list/mat-card/mat-card-content/div/mat-table/mat-row/mat-cell[2]/a");
    public static final Target INPUT_INITIAL_CREATION_DATE = Target.the("This the input initial creation date").located(By.id("initialCreationDate"));
    public static final Target INPUT_FINAL_CREATION_DATE = Target.the("This the input final creation date").located(By.id("finalCreationDate"));
    public static final Target INPUT_LICENSE_PLATE = Target.the("This the input license plate").located(By.id("licensePlate"));
    public static final Target INPUT_SECURITY_CODE = Target.the("This the input security code").located(By.id("securityCode"));
    public static final Target INPUT_CLICK_CASE = Target.the("This the input click case").located(By.id("clickCase"));
    public static final Target INPUT_SEARCH_CLICK_CASE = Target.the("This the input click case").located(By.id("mat-option-1"));
    public static final Target INPUT_ASSIGNED_TO = Target.the("This the input assigned to").located(By.id("assignedFilter"));
    public static final Target INPUT_SEARCH_ASSIGNED_TO = Target.the("This the input search assigned to").located(By.id("mat-input-10"));
    public static final Target INPUT_DEPARTMENT = Target.the("This the input department").located(By.id("departmentFilter"));
    public static final Target INPUT_SEARCH_DEPARTMENT = Target.the("This the input search department").located(By.id("mat-input-12"));
    public static final Target INPUT_MUNICIPALITY = Target.the("This the input municipality").located(By.id("municipalityFilter"));
    public static final Target INPUT_SEARCH_MUNICIPALITY = Target.the("This the input search municipality").located(By.id("mat-input-14"));
    public static final Target INPUT_LINE = Target.the("This the input line").located(By.id("lineFilter"));
    public static final Target INPUT_SEARCH_LINE = Target.the("This the input search line").located(By.id("mat-input-16"));
    public static final Target INPUT_STATUS_CLOSING_CASE = Target.the("This the input status closing case").located(By.id("statusClosingCaseFilter"));
    public static final Target INPUT_SEARCH_STATUS_CLOSING_CASE = Target.the("This the input search status closing case").located(By.id("mat-input-18"));
    public static final Target INPUT_SERVICE_CLASS = Target.the("This the input service class").located(By.id("serviceClassFilter"));
    public static final Target INPUT_SEARCH_SERVICE_CLASS = Target.the("This the input search service class").located(By.id("mat-input-20"));
    public static final Target INPUT_STATUS_CASE = Target.the("This the input status case").located(By.id("statusCaseFilter"));
    public static final Target INPUT_SEARCH_STATUS_CASE = Target.the("This the input search status case").located(By.id("mat-input-22"));
    public static final Target INPUT_STATUS_SERVICE = Target.the("This the input status service").located(By.id("statusServiceFilter"));
    public static final Target INPUT_SEARCH_STATUS_SERVICE = Target.the("This the input search status service").located(By.id("mat-input-24"));
    public static final Target INPUT_SERVICE = Target.the("This the input service").located(By.id("serviceFilter"));
    public static final Target INPUT_SEARCH_SERVICE = Target.the("This the input search service").located(By.id("mat-input-26"));
    public static final Target INPUT_SERVICE_TYPE = Target.the("This the input service type").located(By.id("serviceTypeFilter"));
    public static final Target INPUT_SEARCH_SERVICE_TYPE = Target.the("This the input search service type").located(By.id("mat-input-28"));
    public static final Target INPUT_SPECIAL_SERVICE = Target.the("This the input special service").located(By.id("specialServicesFilter"));
    public static final Target INPUT_SEARCH_SPECIAL_SERVICE = Target.the("This the input search special service").located(By.id("mat-input-30"));
    public static final Target INPUT_CUSTOMER_TYPE = Target.the("This the input customer type").located(By.id("customerTypeFilter"));
    public static final Target INPUT_SEARCH_CUSTOMER_TYPE = Target.the("This the input search customer type").located(By.id("mat-input-32"));
    public static final Target INPUT_SUPPLIER = Target.the("This the input supplier").located(By.id("providerFilter"));
    public static final Target INPUT_SEARCH_SUPPLIER = Target.the("This the input search supplier").located(By.id("mat-input-34"));
    public static final Target BUTTON_SEARCH = Target.the("This the button search case").located(By.id("searchFile"));
    public static final Target BUTTON_ADVANCED_SEARCH = Target.the("This the button advanced search case").located(By.id("advancedSearchFile"));
    public static final Target BUTTON_EDIT = Target.the("This the button edit").located(By.id("editCase"));
    public static final Target BUTTON_SHOW = Target.the("This the button show").located(By.id("showCase"));
    public static final Target BUTTON_CASE_DETAIL_VIEW = Target.the("This the button case detail view ").located(By.id("showCase"));

}