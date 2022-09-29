package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndicativosdeMarcacionPage {

    public static final Target BUTTON_CREATE_DIALING = Target.the("This the  button create dialing parameterization").located(By.id("btnCreateIndicative"));
    public static final Target INPUT_DEPARTMENT_DEALING = Target.the("Campo departamento parametrizacion indicativos de marcacion").located(By.id("selectCreateDepartamentIndicative"));
    public static final Target INPUT_SEARCH_DEPARTMENT_DEALING = Target.the("This the  input search department dialing parameterization").located(By.id("inputCreateDepartamentIndicativeSearch"));
    public static final Target INPUT_MUNICIPALITY_DEALING = Target.the("This the  input municipality dialing parameterization").located(By.id("selectCreateMunicipalityIndicative"));
    public static final Target INPUT_SEARCH_MUNICIPALITY_DEALING = Target.the("This the  input search municipality dialing parameterization").located(By.id("inputCreateMunicipalityIndicativeSearch"));
    public static final Target WHITE_INDICATIVE_DEALING = Target.the("This the  write indicative dealing parameterization").located(By.id("inputCreateIndicative"));
    public static final Target BUTTON_SAVE_DEALING = Target.the("boton para guardar parametrizacion indicativos de marcacion").located(By.id("btnSaveFormIndicative"));
    public static final Target BUTTON_SELECT_DEALING = Target.the("Damos click el departamento").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    //Buscar Ciudad, Municipio, editar y eliminar
    public static final Target INPUT_DEPARTMENT_DEALING_HOME = Target.the("This the  input department home dialing parameterization").located(By.id("selectDepartamentIndicative"));
    public static final Target INPUT_SEARCH_DEPARTMENT_DEALING_HOME = Target.the("This the  input search department home dialing parameterization").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target BUTTON_SELECT_DEPARTMENT_DEALING_HOME = Target.the("This the select department home dealing parameterization").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target INPUT_MUNICIPALITY_DEALING_HOME = Target.the("This the  input municipality dialing home parameterization").located(By.id("selectMunicipalityIndicative"));
    public static final Target INPUT_SEARCH_MUNICIPALITY_DEALING_HOME = Target.the("This the  input search municipality dialing home parameterization").located(By.id("inputMunicipalityIndicativeSearch"));
    public static final Target BUTTON_SEARCH_DEALING = Target.the("This the button SEARCH dealing parameterization").located(By.id("btnSearchIndicative"));
    public static final Target BUTTON_EDIT_DEALING = Target.the("This the button edit dealing parameterization").located(By.id("btnEditIndicative"));

    public static final Target BUTTON_DELETE_DEALING = Target.the("This the button delete dealing parameterization").located(By.id("btnDeletedIndicative"));
    public static final Target OPTION_YES_DEALING = Target.the("This the option yes dealing parameterization").located(By.id("sweetalertConfirmButton"));


}
