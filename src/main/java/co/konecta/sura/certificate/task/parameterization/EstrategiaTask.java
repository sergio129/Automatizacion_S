package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.EstrategiaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EstrategiaTask implements Task {

    public String contingencyDescription;

    public EstrategiaTask(String contingencyDescription) {
        this.contingencyDescription = contingencyDescription;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_CONTINGENCY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CONTINGENCY),
                Hit.the(Keys.ENTER).into(INPUT_CONTINGENCY),
                Enter.theValue(contingencyDescription).into(INPUT_CONTINGENCY_DESCRIPTION)

        );

    }

    public static EstrategiaTask withInformationStrategy(String contingencyDescription){
        return instrumented(EstrategiaTask.class, contingencyDescription);
    }

}