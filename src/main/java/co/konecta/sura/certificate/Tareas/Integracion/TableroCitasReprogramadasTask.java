package co.konecta.sura.certificate.Tareas.Integracion;

import co.konecta.sura.certificate.Interfaces.Integracion.TableroCitasReprogramadosPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


@AllArgsConstructor
public class TableroCitasReprogramadasTask implements Task {
    private String EstadoServicio, Linea, Departamento;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Click.on(TableroCitasReprogramadosPage.CAMPO_ESTADO_SERVICIO),
                Click.on(TableroCitasReprogramadosPage.SELECIONAR_OPCION.of(String.valueOf(EstadoServicio))),
                Hit.the(Keys.ESCAPE).into(TableroCitasReprogramadosPage.CAMPO_ESTADO_SERVICIO),
                Click.on(TableroCitasReprogramadosPage.CAMPO_LINEA),
                Click.on(TableroCitasReprogramadosPage.SELECIONAR_OPCION.of(String.valueOf(Linea))),
                Hit.the(Keys.ESCAPE).into(TableroCitasReprogramadosPage.CAMPO_LINEA),
                Click.on(TableroCitasReprogramadosPage.CAMPO_DEPARTAMENTO),
                Click.on(TableroCitasReprogramadosPage.SELECIONAR_OPCION.of(String.valueOf(Departamento))),
                Hit.the(Keys.ESCAPE).into(TableroCitasReprogramadosPage.CAMPO_DEPARTAMENTO),
                Click.on(TableroCitasReprogramadosPage.BOTON_BUSCAR),
                Click.on(TableroCitasReprogramadosPage.SELECCIONAR_SERVICIO),
                Click.on(TableroCitasReprogramadosPage.ACCIONES_CASOS_SELECCIONADOS)
        );
    }

    public static TableroCitasReprogramadasTask FiltrarCampos(String EstadoServicio, String Linea, String Departamento) {
        return new TableroCitasReprogramadasTask(EstadoServicio, Linea, Departamento);

    }
}
