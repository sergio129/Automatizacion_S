package co.konecta.sura.certificate.Tareas.Parametrizacion.Tableros_de_Control;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosdeControlPage.*;
import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.SELECCIONAR_DATO;


public class TablerosdeControlInfomacionBasicaTask implements Task {

    private final String boardName,fieldsShow;

    private TablerosdeControlInfomacionBasicaTask(String boardName, String fieldsShow) {
        this.boardName = boardName;
        this.fieldsShow = fieldsShow;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(fieldsShow))),
                Enter.theValue(boardName).into(INPUT_BOARD_NAME_PARAMETERIZATION));
    }

        public static TablerosdeControlInfomacionBasicaTask withInformationControlBoardsParameterization(String boardName, String fieldsShow){
        return new TablerosdeControlInfomacionBasicaTask(boardName, fieldsShow);

        }

}
