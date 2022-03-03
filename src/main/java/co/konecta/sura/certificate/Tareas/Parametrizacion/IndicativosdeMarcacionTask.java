package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.IndicativosdeMarcacionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class IndicativosdeMarcacionTask implements Task {
    String department;
    String municipality;
    String indicative;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_DEPARTMENT_DEALING),
                Enter.theValue(department).into(INPUT_SEARCH_DEPARTMENT_DEALING),
                Click.on(BUTTON_SELECT_DEALING.of(String.valueOf(department))));
        actor.attemptsTo(Click.on(INPUT_MUNICIPALITY_DEALING),
                Enter.theValue(municipality).into(INPUT_SEARCH_MUNICIPALITY_DEALING).thenHit(Keys.ENTER),
                Enter.theValue(indicative).into(WHITE_INDICATIVE_DEALING),
                Click.on(BUTTON_SAVE_DEALING));

    }

    public static IndicativosdeMarcacionTask WriteInformationDialingCodesParameterizationTask(String department, String municipality, String indicative) {
        return instrumented(IndicativosdeMarcacionTask.class, department, municipality, indicative);
    }
}
