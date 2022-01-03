package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.CaseClosurePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CaseClosureTask implements Task {

    public String lineClosure;
    public String serviceClosure;
    public String fieldClosure;

    public CaseClosureTask(String lineClosure, String serviceClosure, String fieldClosure) {
        this.lineClosure = lineClosure;
        this.serviceClosure = serviceClosure;
        this.fieldClosure = fieldClosure;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_LINE_CLOSURE),
                Enter.theValue(lineClosure).into(INPUT_SEARCH_LINE_CLOSURE),
                Click.on(SELECT_SEARCH_LINE_CLOSURE),
                Hit.the(Keys.ESCAPE).into(INPUT_SEARCH_LINE_CLOSURE),
                //Click.on(MAT_DIALOG),
                Click.on(INPUT_SERVICE_CLOSURE),
                Enter.theValue(serviceClosure).into(INPUT_SEARCH_SERVICE_CLOSURE),
                Click.on(SELECT_SEARCH_SERVICE_CLOSURE),
                Hit.the(Keys.ESCAPE).into(INPUT_SEARCH_SERVICE_CLOSURE),
                Click.on(INPUT_FIELD_CLOSURE),
                Enter.theValue(fieldClosure).into(INPUT_SEARCH_FIELD_CLOSURE).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_CLOSURE)
        );


    }

    public static CaseClosureTask withInformationClosureParameterization(String lineClosure, String serviceClosure, String fieldClosure) {
        return instrumented(CaseClosureTask.class, lineClosure, serviceClosure, fieldClosure);
    }

}
