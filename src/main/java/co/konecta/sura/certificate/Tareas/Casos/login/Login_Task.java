package co.konecta.sura.certificate.Tareas.Casos.login;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.login.LoginPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Login_Task implements Task {
    private static final String USERNAME="usuario";
    private static final String PASSWORD_USER="contrasena";

    private final List<Map<String,String>> informacion;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SURVEY),
                Enter.theValue(informacion.get(0).get(USERNAME)).into(USER),
                Enter.theValue(informacion.get(0).get(PASSWORD_USER)).into(PASSWORD).thenHit(Keys.ENTER), WaitUntil.the(BUTTON_INITIAL_TAB, isVisible()).forNoMoreThan(50000).milliseconds());

    }

    public static Login_Task whitCredentials(List<Map<String, String>> informacion) {
        return instrumented(Login_Task.class, informacion);
    }
}
