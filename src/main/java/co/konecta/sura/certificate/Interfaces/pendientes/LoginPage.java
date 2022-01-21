package co.konecta.sura.certificate.Interfaces.pendientes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER = Target.the("This the input user").located(By.id("loginUserName"));
    public static final Target PASSWORD = Target.the("This the input password").located(By.id("loginPassword"));

}