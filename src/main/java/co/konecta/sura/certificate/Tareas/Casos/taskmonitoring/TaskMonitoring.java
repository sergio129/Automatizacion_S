package co.konecta.sura.certificate.Tareas.Casos.taskmonitoring;


import co.konecta.sura.certificate.Interfaces.Casos.TareasDeMonitoreo.TaskMonitoringPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.TareasDeMonitoreo.TaskMonitoringPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class TaskMonitoring implements Task {

    private String Nombre,TipoTarea,FechaVencimiento,HoraVencimiento,Usuario;
    public static TaskMonitoring whitData(String Nombre,String TipoTarea,String FechaVencimiento,String HoraVencimiento,String Usuario) {
        return new TaskMonitoring(Nombre,TipoTarea,FechaVencimiento,HoraVencimiento,Usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(Nombre).into(INPUT_NAME),
                Click.on(INPUT_TYPE),
                Click.on(SELECCIONAR_TAREA.of(String.valueOf(TipoTarea))),
                Click.on(TaskMonitoringPage.INPUT_DATE),
                Enter.keyValues(FechaVencimiento).into(INPUT_DATE).thenHit(Keys.TAB).thenHit(Keys.ENTER).thenHit(Keys.ENTER),
                Click.on(INPUT_HOUR),
                Enter.theValue(HoraVencimiento).into(INPUT_HOUR),
                Click.on(TaskMonitoringPage.INPUT_USER),
                Click.on(TaskMonitoringPage.INPUT_USER_FILTER ),
                Enter.theValue(Usuario).into(TaskMonitoringPage.INPUT_USER_FILTER ).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_TASK)
        );
    }
}
