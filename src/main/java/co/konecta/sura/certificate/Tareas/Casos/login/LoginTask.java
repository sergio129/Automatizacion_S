package co.konecta.sura.certificate.Tareas.Casos.login;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.login.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginTask implements Task {

    private final String username;
    private final String password;

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SURVEY),
                Enter.theValue(username).into(USER),
                Enter.theValue(password).into(PASSWORD).thenHit(Keys.ENTER)
        );
        Thread.sleep(10000);
    }

    public static LoginTask whitCredentials(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }
}

