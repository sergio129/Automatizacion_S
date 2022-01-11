package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.RamosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RamosTask implements Task {

    public String branch;

    public RamosTask(String branch) {

        this.branch = branch;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_BOUQUETS),
                Click.on(INPUT_SEARCH_LINE_BOUQUETS));
        actor.attemptsTo(
                Enter.theValue(branch).into(WHITE_BRANCH_BOUQUETS).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_BOUQUETS)
        );

    }

    public static RamosTask whthBouquetsTaskParameterization(String branch) {
        return instrumented(RamosTask.class,branch);
    }

}