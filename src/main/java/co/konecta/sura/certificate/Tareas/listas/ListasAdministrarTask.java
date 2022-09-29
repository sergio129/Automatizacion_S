package co.konecta.sura.certificate.Tareas.listas;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.konecta.sura.certificate.Interfaces.Listas.ListasAdministrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ListasAdministrarTask implements Task {
    String nombrelista;
    String nombreopcion;
    String idcase;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombrelista).into(NOMBRE_LISTAS),
                Click.on(BOTON_AGREGAR_OPCION),
                Enter.theValue(nombreopcion).into(NOMBRE_OPCION),
                Enter.theValue(idcase).into(ID_CASE_OPCION),
                Click.on(CHECK_AGREGAR_OPCION)
        );
    }

    public static ListasAdministrarTask EscribimosInformacionListasAdministrar(String nombrelista, String nombreopcion, String idcase) {
        return instrumented(ListasAdministrarTask.class, nombrelista, nombrelista, idcase);
    }
}
