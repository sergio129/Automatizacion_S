package co.konecta.sura.certificate.Tareas.Casos.statemanagement;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.statemanagement.StateManagementPage.INPUT_SEARCH_ADD_STATUS;
import static co.konecta.sura.certificate.Interfaces.Casos.statemanagement.StateManagementPage.INPUT_STATUS_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class StateManagementTask implements Task {


    private static final String ESTADO_EXPEDEINTE = "CambioEstado";
    List<Map<String, String>> estado;

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
                Click.on(INPUT_STATUS_NAME),
                WaitUntil.the(INPUT_SEARCH_ADD_STATUS, isVisible()).forNoMoreThan(50).milliseconds(),
                Enter.theValue(estado.get(0).get(ESTADO_EXPEDEINTE)).into(INPUT_SEARCH_ADD_STATUS).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER)
        );
    }

    public static StateManagementTask withInformationStateManagement(List<Map<String, String>> estado) {
        return instrumented(StateManagementTask.class, estado);
    }
}
