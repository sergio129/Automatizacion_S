package co.konecta.sura.certificate.Tareas.Casos.SubModuloAgenda;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.CAMPO_OBSERVACION;
import static co.konecta.sura.certificate.Interfaces.SubAgenda.AgendaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor

public class TipoContactoTask implements Task {

    public String tipocontacto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECCIONAR_CAMPO),
                Enter.theValue(tipocontacto).into(CAMPO_BUSCAR_LLAMADA).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
    }

    public static TipoContactoTask EscriboTipoContacto(String tipocontacto){
        return instrumented(TipoContactoTask.class,tipocontacto);


    }
}