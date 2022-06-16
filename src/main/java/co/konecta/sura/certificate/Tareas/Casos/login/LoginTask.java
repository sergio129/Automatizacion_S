package co.konecta.sura.certificate.Tareas.Casos.login;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.login.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginTask implements Task {
    private static final String USERNAME="usuario";
    private static final String PASSWORD_USER="contrasena";

    private final List<Map<String,String>> informacion;
    public static LoginTask whitCredentials(List<Map<String,String>> informacion) {
        return instrumented(LoginTask.class, informacion);
    }
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
                Click.on(SURVEY),
                Enter.theValue(informacion.get(0).get(USERNAME)).into(USER),
                Enter.theValue(informacion.get(0).get(PASSWORD_USER)).into(PASSWORD).thenHit(Keys.ENTER));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

