package co.konecta.sura.certificate.Tareas.Casos.login;

import co.konecta.sura.certificate.Modelos.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.login.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginTask2 implements Task {

    User user = new User();

    public static LoginTask2 whitCredentials( User user) {
        return instrumented(LoginTask2.class, user);
    }


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SURVEY),
                Enter.theValue(user.getUsername()).into(USER),
                Enter.theValue(user.getUsername()).into(PASSWORD).thenHit(Keys.ENTER)

        );

    }
}

