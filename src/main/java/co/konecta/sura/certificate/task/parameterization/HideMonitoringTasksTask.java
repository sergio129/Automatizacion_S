package co.konecta.sura.certificate.task.parameterization;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.parameterization.HideMonitoringTasksPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HideMonitoringTasksTask implements Task {

    String lineTask;
    String serviceTask;
    String taskType;

    public HideMonitoringTasksTask(String lineTask, String serviceTask, String taskType) {
        this.lineTask = lineTask;
        this.serviceTask = serviceTask;
        this.taskType = taskType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_HIDE_TASK),
                Enter.theValue(lineTask).into(INPUT_SEARCH_LINE_HIDE_TASK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_HIDE_TASK),
                Enter.theValue(serviceTask).into(INPUT_SEARCH_SERVICE_HIDE_TASK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_TYPE_HIDE_TASK),
                Enter.theValue(taskType).into(INPUT_SEARCH_TYPE_HIDE_TASK).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CHECKBOX_YES_HIDE_TASK),
                Click.on(BUTTON_SAVE_HIDE_TASK)
        );
    }

    public static HideMonitoringTasksTask withInformationHideMonitoringTask (String lineTask, String serviceTask, String taskType){
        return instrumented(HideMonitoringTasksTask.class, lineTask,serviceTask, taskType);
    }

}
