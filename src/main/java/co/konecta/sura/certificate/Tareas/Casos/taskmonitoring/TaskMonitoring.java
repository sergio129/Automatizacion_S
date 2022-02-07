package co.konecta.sura.certificate.Tareas.Casos.taskmonitoring;


import co.konecta.sura.certificate.Interfaces.Casos.taskmonitoring.TaskMonitoringPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.taskmonitoring.TaskMonitoringPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class TaskMonitoring implements Task {
    private TaskMonitoringModel taskMonitoringModel;

    public static TaskMonitoring whitData(TaskMonitoringModel taskMonitoringModel) {
        return instrumented(TaskMonitoring.class, taskMonitoringModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_TYPE),
                Hit.the(Keys.ENTER).into(INPUT_TYPE),

                Click.on(TaskMonitoringPage.INPUT_DATE),
                Enter.keyValues(taskMonitoringModel.getDate()).into(INPUT_DATE).thenHit(Keys.TAB).thenHit(Keys.ENTER).thenHit(Keys.ENTER),

                Click.on(INPUT_HOUR),
                Enter.theValue( taskMonitoringModel.getHour()).into(INPUT_HOUR),

                Click.on(TaskMonitoringPage.INPUT_USER),
                Click.on(TaskMonitoringPage.INPUT_USER_FILTER ),
                Enter.theValue( taskMonitoringModel.getUser()).into(TaskMonitoringPage.INPUT_USER_FILTER ).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_TASK)
        );
    }
}
