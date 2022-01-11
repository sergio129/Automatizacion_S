package co.konecta.sura.certificate.task.Casos.listenending;

import co.konecta.sura.certificate.userinterface.Casos.listenending.EndingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ending implements Task {
    private EndingModel endingModel;

    public Ending(EndingModel endingModel ) {
        this.endingModel = endingModel;
    }

    public static Ending whitDataEnding (EndingModel endingMode) {
        return  instrumented(Ending.class, endingMode);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(EndingPage.INPUT_ENDING_WITH),
                Click.on(EndingPage.INPUT_ENDING_WITH_FILTER),
                Enter.theValue(endingModel.getEndingwith()).into(EndingPage.INPUT_ENDING_WITH_FILTER).thenHit(Keys.ENTER),

                Click.on(EndingPage.INPUT_TYPE_RESPONSE),
                Click.on(EndingPage.INPUT_TYPE_RESPONSE_FILTER),
                Enter.theValue(endingModel.getTyperesponse()).into(EndingPage.INPUT_TYPE_RESPONSE_FILTER).thenHit(Keys.ENTER),

                Enter.theValue(endingModel.getObservationending()).into(EndingPage.INPUT_OBSERVATION_ENDING),

                Click.on( EndingPage.BUTTON_SAVE_ENDING)
        );

    }

}
