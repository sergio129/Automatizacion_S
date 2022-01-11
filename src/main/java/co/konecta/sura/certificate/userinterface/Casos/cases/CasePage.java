package co.konecta.sura.certificate.userinterface.Casos.cases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CasePage {

    public static final Target INPUT_NUMBER_CASE = Target.the("This the input number case").located(By.id("case"));
    public static final Target INPUT_APPLICANT_NAME = Target.the("This the input applicant name").located(By.id("applicantName"));
    public static final Target INPUT_PHONE1 = Target.the("This the input phone1").located(By.id("phone1"));
    public static final Target INPUT_DEPARTMENT = Target.the("This the input department").located(By.id("departamentCtrl"));
    public static final Target INPUT_DEPARTMENT_FILTER = Target.the("This the input filter department").located(By.id("inputDepartamentFilter"));
    public static final Target INPUT_MUNICIPALITY = Target.the("This the input municipality").located(By.id("municipalityCtrl"));
    public static final Target INPUT_MUNICIPALITY_FILTER = Target.the("This the input filter municipality").located(By.id("inputMunicipalityFilter"));
    public static final Target INPUT_LICENSE_PLATE = Target.the("This the input license plate").located(By.id("placa"));
    public static final Target INPUT_SERVICE_ADDRESS = Target.the("This the input service address").located(By.id("addressService"));
    public static final Target INPUT_SERVICE_LOCATION = Target.the("This the input service location").located(By.id("location"));
    public static final Target INPUT_ADDRESS_DETAIL = Target.the("This the input address detail").located(By.id("addressDetail"));
    public static final Target INPUT_SERVICE= Target.the("This the input service").located(By.id("serviceCtrl"));
    public static final Target INPUT_SERVICE_FILTER = Target.the("This the input filter service").located(By.id("inputServiceFilter"));
    public static final Target INPUT_CLICK_CASE = Target.the("This the input clickcase").located(By.id("clickCtrl"));
    public static final Target INPUT_CLICK_CASE_FILTER = Target.the("This the input filter clickcase").located(By.id("inputClickFilter"));
    public static final Target INPUT_OBSERVATIONS_CASE = Target.the("This the input observations case").located(By.id("caseObservations"));
    public static final Target INPUT_LINE = Target.the("This the input line").located(By.id("lineCtrl"));
    public static final Target INPUT_LINE_FILTER = Target.the("This the input filter line").located(By.id("inputLineFilter"));
    public static final Target MESSAGE = Target.the("The message alert").located(By.id("toast-container"));
    public static final Target BUTTON_SAVE_CASE = Target.the("This the button save case").located(By.id("saveCase"));

    }

