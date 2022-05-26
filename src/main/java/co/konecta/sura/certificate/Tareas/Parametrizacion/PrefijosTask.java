package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.PrefijosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class PrefijosTask implements Task {
    String linea;
    String servicio;
    String prefijos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECCION_CAMPO_LINEA),
                Enter.theValue(linea).into(BUSCAMOS_LINEA),
                Click.on(SELECIONAMOS_LINEA.of(String.valueOf(linea))),
                Click.on(SELECCION_CAMPO_SERVICIO),
                Enter.theValue(servicio).into(BUSCAMOS_SERVICIO).thenHit(Keys.ENTER),
                //Click.on(SELECCIONAR_SERVICIO),
                Enter.theValue(prefijos).into(SELECCION_CAMPO_PREFIJOS)

        );


    }

    public static PrefijosTask EscriboInformacionPrefijos(String linea, String servicio, String prefijos) {
        return instrumented(PrefijosTask.class, linea, servicio, prefijos);
    }

}
