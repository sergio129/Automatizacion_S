package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.ControlBoardsParameterizationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ControlBoardsParameterizationTask implements Task {

    public String boardName;
    public String fieldsShow;
    public String onlyMyCases;


    public ControlBoardsParameterizationTask(String boardName, String fieldsShow, String onlyMyCases) {
        this.boardName = boardName;
        this.fieldsShow = fieldsShow;
        this.onlyMyCases = onlyMyCases;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(boardName).into(INPUT_BOARD_NAME_PARAMETERIZATION),
                Click.on(INPUT_SEARCH_FIELDS_SHOW_PARAMETERIZATION),
                Enter.theValue(fieldsShow).into(INPUT_FIELDS_SHOW_PARAMETERIZATION).thenHit(Keys.ENTER).thenHit(Keys.CLEAR),
                Click.on(INPUT_ONLY_CASES_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_ONLY_CASES_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_ONLY_CASES_PARAMETERIZATION)

        );
    }

        public static ControlBoardsParameterizationTask withInformationControlBoardsParameterization(String boardName, String fieldsShow){
            return instrumented(ControlBoardsParameterizationTask.class, boardName, fieldsShow);
        }

}
