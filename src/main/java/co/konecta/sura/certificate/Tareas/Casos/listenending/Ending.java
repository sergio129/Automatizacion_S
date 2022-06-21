package co.konecta.sura.certificate.Tareas.Casos.listenending;

import co.konecta.sura.certificate.Interfaces.Casos.listenending.EndingPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Ending implements Task {
    private EndingModel endingModel;
    private static final String FINALIZACION_CON = "Finazalicion";
    private static final String TIPO_DE_RESPUESTA = "TipoRespuesta";
    private static final String OBSERVACIONES = "Observaciones";
    List<Map<String, String>> Finalizacion;

    public static Ending whitDataEnding(List<Map<String, String>> Finalizacion) {
        return instrumented(Ending.class, Finalizacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(EndingPage.INPUT_ENDING_WITH),
                Click.on(EndingPage.INPUT_ENDING_WITH_FILTER),
                Enter.theValue(Finalizacion.get(0).get(FINALIZACION_CON)).into(EndingPage.INPUT_ENDING_WITH_FILTER).thenHit(Keys.ENTER),

                Click.on(EndingPage.INPUT_TYPE_RESPONSE),
                Click.on(EndingPage.INPUT_TYPE_RESPONSE_FILTER),
                Enter.theValue(Finalizacion.get(0).get(TIPO_DE_RESPUESTA)).into(EndingPage.INPUT_TYPE_RESPONSE_FILTER).thenHit(Keys.ENTER),

                Enter.theValue(Finalizacion.get(0).get(OBSERVACIONES)).into(EndingPage.INPUT_OBSERVATION_ENDING),

                Click.on(EndingPage.BUTTON_SAVE_ENDING)
        );

    }

}
