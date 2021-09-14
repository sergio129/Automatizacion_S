package co.konecta.sura.certificate.task.cases.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.cases.login.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final String username;
    private final String password;


    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SURVEY),
                Enter.theValue(username).into(USER),
                Enter.theValue(password).into(PASSWORD).thenHit(Keys.ENTER)

        );
    }

    public static LoginTask whitCredentials(String username, String password){
        return instrumented(LoginTask.class, username, password);
    }
}

