package co.konecta.sura.certificate.Tareas.pendientes;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.pendientes.LoginPage.PASSWORD;
import static co.konecta.sura.certificate.Interfaces.pendientes.LoginPage.USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginTask implements Task {

    private final String username;
    private final String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USER),
                Enter.theValue(password).into(PASSWORD).thenHit(Keys.ENTER)

        );
    }

    public static LoginTask whitCredentials(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }
}

