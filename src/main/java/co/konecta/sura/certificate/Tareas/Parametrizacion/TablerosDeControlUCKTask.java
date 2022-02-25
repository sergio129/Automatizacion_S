package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosDeControlUCKPage.*;

@AllArgsConstructor
public class TablerosDeControlUCKTask implements Task {
    private String motivo,asegurado, habilitar, observacion;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Click.on(BOTON_EDITAR_UCK),
                Click.on(CAMPO_MOTIVO_UCK),
                Click.on(SELECCIONAR_REGISTRO_UCK.of(String.valueOf(motivo))),
                Click.on(CAMPO_ASEGURADO_UCK),
                Click.on(SELECCIONAR_REGISTRO_UCK.of(String.valueOf(asegurado))),
                Hit.the(Keys.ESCAPE).into(ESCAPE_UCK),
                Click.on(CAMPO_HABILITAR_UCK),
                Click.on(SELECCIONAR_REGISTRO_UCK.of(String.valueOf(habilitar))),
                Enter.theValue(observacion).into(CAMPO_OBSERVACIONES_UCK),
                Click.on(BOTON_GUARDAR_UCK)
        );



    }
    public static TablerosDeControlUCKTask EscribirInformacionUCK(String motivo,String asegurado,String habilitar,String observacion){
        return new TablerosDeControlUCKTask(motivo,asegurado, habilitar, observacion);
    }
}
