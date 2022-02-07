package co.konecta.sura.certificate.Tareas.Inicio;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Inicio.ControlBoardsPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class TablerosdeControlTask implements Task {

    public String boardName;
    public String fieldsShow1;
    public String fieldsShow2;
    public String fieldsShow3;
    public String fieldsShow4;
    public String fieldsShow5;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(boardName).into(INPUT_BOARD_NAME),
                Click.on(INPUT_FIELDS_SHOW),
                Enter.theValue(fieldsShow1).into(INPUT_SEARCH_FIELDS_SHOW).thenHit(Keys.ENTER),
                Enter.theValue(fieldsShow2).into(INPUT_SEARCH_FIELDS_SHOW).thenHit(Keys.ENTER),
                Enter.theValue(fieldsShow3).into(INPUT_SEARCH_FIELDS_SHOW).thenHit(Keys.ENTER),
                Enter.theValue(fieldsShow4).into(INPUT_SEARCH_FIELDS_SHOW).thenHit(Keys.ENTER),
                Enter.theValue(fieldsShow5).into(INPUT_SEARCH_FIELDS_SHOW).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_ONLY_CASES),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_ONLY_CASES),
                Hit.the(Keys.ENTER).into(INPUT_ONLY_CASES)

        );
    }

    public static TablerosdeControlTask withInformationControlBoards (String boardName, String fieldsShow1, String fieldsShow2, String fieldsShow3, String fieldsShow4, String fieldsShow5){
        return instrumented(TablerosdeControlTask.class, boardName, fieldsShow1, fieldsShow2, fieldsShow3, fieldsShow4, fieldsShow5);
    }

}
