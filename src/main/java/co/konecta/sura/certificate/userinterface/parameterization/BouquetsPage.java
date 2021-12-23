package co.konecta.sura.certificate.userinterface.parameterization;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BouquetsPage {

    public static final Target BUTTON_CREATE_BOUQUETS = Target.the("This the  button create bouquets parameterization").located(By.id("addBranch"));
    public static final Target INPUT_LINE_BOUQUETS = Target.the("This the  input line bouquets parameterization").located(By.id("mat-select-value-3"));
    public static final Target INPUT_SEARCH_LINE_BOUQUETS = Target.the("This the  input search line bouquets parameterization").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");
    public static final Target WHITE_BRANCH_BOUQUETS = Target.the("This the  write branch bouquets parameterization").located(By.id("inputCreateBranch"));
    public static final Target BUTTON_SAVE_BOUQUETS = Target.the("This the button save bouquets parameterization").located(By.id("btnSaveFormBranch"));
    public static final Target BUTTON_INITIAL_TAB = Target.the("This the input inicial tab").located(By.id("globalMenu"));//Lo traje de HomePage
}
