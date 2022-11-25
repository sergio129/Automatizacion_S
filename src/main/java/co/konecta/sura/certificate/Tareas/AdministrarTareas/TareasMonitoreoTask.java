package co.konecta.sura.certificate.Tareas.AdministrarTareas;

import co.konecta.sura.certificate.Modelos.AdministrarTareas.TareasMonitoreoModel;
import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.AdministrarTareas.TareasMonitoreoPage.*;
import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.SELECCIONAR_DATO;

public class TareasMonitoreoTask implements Task {
    private final TareasMonitoreoModel tareasmodel;

    public TareasMonitoreoTask(TareasMonitoreoModel tareasmodel) {
        this.tareasmodel = tareasmodel;
    }

    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(
                Enter.theValue(tareasmodel.getNombre()).into(NOMBRE_TAREAS_MONITOREO),
                Enter.theValue(tareasmodel.getCaso()).into(CAMPO_CASO),
                Click.on(CAMPO_ESTADO_TAREA),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tareasmodel.getEstadoTarea()))),
                Hit.the(Keys.ESCAPE).into(CAMPO_ESTADO_TAREA),
                Click.on(CAMPO_LINEA),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tareasmodel.getLinea()))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA),
                Click.on(CAMPO_TIPO_MONITOREO),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tareasmodel.getTipoMonitoreo()))),
                Hit.the(Keys.ESCAPE).into(CAMPO_TIPO_MONITOREO)


        );

    }
}
