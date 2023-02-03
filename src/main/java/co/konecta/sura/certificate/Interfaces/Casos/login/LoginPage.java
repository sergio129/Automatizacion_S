package co.konecta.sura.certificate.Interfaces.Casos.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER = Target.the("This the input user").located(By.id("loginUserName"));
    public static final Target PASSWORD = Target.the("This the input password").located(By.id("loginPassword"));
    public static final Target SURVEY = Target.the("This the input survey").locatedBy("/html/body/app-root/app-blank/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/mat-card-content/form/div/p/label[1]");
    public static final Target JUSTIFICACION = Target.the("Campo Justificacion").located(By.id("surveyJustification"));
    public static final Target ESTRELLAS = Target.the("NUMERO DE ESTRELLAS").locatedBy("//input[@value={0}]");
}
