package co.konecta.sura.certificate.task.Casos.suraclimbing;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.Casos.suraclimbing.SuraClimbingPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuraClimbingTask implements Task {

    public String managementType;
    public String managementPerson;
    public String responseType;
    public String generatesComplaint;
    public String observations;

    public SuraClimbingTask(String managementType, String managementPerson, String responseType, String generatesComplaint, String observations) {
        this.managementType = managementType;
        this.managementPerson = managementPerson;
        this.responseType = responseType;
        this.generatesComplaint = generatesComplaint;
        this.observations = observations;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_MANAGEMENT_TYPE),
                Enter.theValue(managementType).into(INPUT_SEARCH_MANAGEMENT_TYPE).thenHit(Keys.ENTER),
                WaitUntil.the(INPUT_MANAGEMENT_PERSON, isVisible()).forNoMoreThan(10).milliseconds(),
                Click.on(INPUT_MANAGEMENT_PERSON),
                Enter.theValue(managementPerson).into(INPUT_SEARCH_MANAGEMENT_PERSON).thenHit(Keys.ENTER),
                Click.on(INPUT_RESPONSE_TYPE),
                Enter.theValue(responseType).into(INPUT_SEARCH_RESPONSE_TYPE).thenHit(Keys.ENTER),
                Click.on(INPUT_GENERATES_COMPLAINT),
                Enter.theValue(generatesComplaint).into(INPUT_SEARCH_GENERATES_COMPLAINT).thenHit(Keys.ENTER),
                Enter.theValue(observations).into(INPUT_OBSERVATIONS)

        );
    }

        public static SuraClimbingTask withInformationSuraClimbing (String managementType, String managementPerson, String responseType, String generatesComplaint, String observations){
            return instrumented(SuraClimbingTask.class, managementType, managementPerson, responseType, generatesComplaint, observations);
        }
    }

