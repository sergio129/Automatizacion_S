package co.konecta.sura.certificate.userinterface.Listas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class listPage {
    public static final Target GLOBAL_MENU = Target.the("Selections Menu global").located(By.id("globalMenu"));
    public static final Target BUTTON_LIST = Target.the("This the input verification case").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav[1]/div[1]/app-sidebar/mat-nav-list/mat-list-item[4]/div/a");
    public static final Target BUTTON_ADMIN = Target.the("This the input initial tab").located(By.id("moListList"));
    public static final Target SEARCH_LISTS = Target.the("This the input list").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-list/div/div/mat-card/mat-card-content/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]");
    //public static final Target SEARCH_LISTS = Target.the("This the input list").located(By.id("inputListsSearchFilterSearch"));
}
