package co.konecta.sura.certificate.userinterface.parameterization;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DialingCodesParameterizationPage {

    public static final Target BUTTON_CREATE_DIALING = Target.the("This the  button create dialing parameterization").located(By.id("btnCreateIndicative"));
    public static final Target INPUT_DEPARTMENT_DEALING = Target.the("This the  input department dialing parameterization").located(By.id("mat-select-value-7"));
    public static final Target INPUT_SEARCH_DEPARTMENT_DEALING = Target.the("This the  input search department dialing parameterization").located(By.id("inputCreateDepartamentIndicativeSearch"));
    public static final Target INPUT_MUNICIPALITY_DEALING = Target.the("This the  input municipality dialing parameterization").located(By.id("mat-select-value-9"));
    public static final Target INPUT_SEARCH_MUNICIPALITY_DEALING = Target.the("This the  input search municipality dialing parameterization").located(By.id("inputCreateMunicipalityIndicativeSearch"));
    public static final Target WHITE_INDICATIVE_DEALING = Target.the("This the  write indicative dealing parameterization").located(By.id("inputCreateIndicative"));
    public static final Target BUTTON_SAVE_DEALING = Target.the("This the button save dealing parameterization").located(By.id("btnSaveFormIndicative"));
    public static final Target BUTTON_SELECT_DEALING = Target.the("This the select dealing parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[1]");
    //Buscar Ciudad, Municipio, editar y eliminar
    public static final Target INPUT_DEPARTMENT_DEALING_HOME = Target.the("This the  input department home dialing parameterization").located(By.id("mat-select-value-1"));
    public static final Target INPUT_SEARCH_DEPARTMENT_DEALING_HOME = Target.the("This the  input search department home dialing parameterization").located(By.id("inputDepartamentIndicativeSearch"));
    public static final Target BUTTON_SELECT_DEPARTMENT_DEALING_HOME = Target.the("This the select department home dealing parameterization").locatedBy("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span");
    public static final Target INPUT_MUNICIPALITY_DEALING_HOME = Target.the("This the  input municipality dialing home parameterization").located(By.id("mat-select-value-3"));
    public static final Target INPUT_SEARCH_MUNICIPALITY_DEALING_HOME = Target.the("This the  input search municipality dialing home parameterization").located(By.id("inputMunicipalityIndicativeSearch"));
    public static final Target BUTTON_SEARCH_DEALING = Target.the("This the button SEARCH dealing parameterization").located(By.id("btnSearchIndicative"));
    public static final Target BUTTON_EDIT_DEALING = Target.the("This the button edit dealing parameterization").located(By.id("btnEditIndicative"));
    public static final Target BUTTON_DELETE_DEALING = Target.the("This the button delete dealing parameterization").located(By.id("btnDeletedIndicative"));



}
