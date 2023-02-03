package co.konecta.sura.certificate.Tareas.Casos.login;

import co.konecta.sura.certificate.Modelos.Login.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.HitElement;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.login.LoginPage.*;
import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.BUTTON_INITIAL_TAB;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class LoginTask implements Task {

    User user = new User();

    public static LoginTask whitCredentials(User user) {
        return instrumented(LoginTask.class, user);
    }


    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(
//                Click.on(ESTRELLAS.of(String.valueOf(user.getEstrellas()))));
//        if (JUSTIFICACION.isVisibleFor(actor)) {
//            Enter.theValue(user.getJustificacion()).into(JUSTIFICACION);
//        }
        actor.attemptsTo(
                Click.on(SURVEY),
                Enter.theValue(user.getUsername()).into(USER),
                Enter.theValue(user.getPassword()).into(PASSWORD).thenHit(Keys.ENTER), WaitUntil.the(BUTTON_INITIAL_TAB, isVisible()).forNoMoreThan(50000).milliseconds()
        );

    }
}

