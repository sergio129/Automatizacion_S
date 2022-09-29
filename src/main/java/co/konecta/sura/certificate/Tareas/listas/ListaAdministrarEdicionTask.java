package co.konecta.sura.certificate.Tareas.listas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.konecta.sura.certificate.Interfaces.Listas.ListasAdministrarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ListaAdministrarEdicionTask implements Task {
    String NombreOpcion;
    String Posicion;
    String idcase;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_EDITAR_OPCION_LISTA),
                Enter.theValue(NombreOpcion).into(NOMBRE_OPCION_EDIT),
                Enter.theValue(Posicion).into(POSICION_OPCION_EDIT),
                Enter.theValue(idcase).into(EASYCASE_OPCION_EDIT),
                Click.on(BOTON_GUARDAR_OPCION_EDIT)
        );
    }

    public static ListaAdministrarEdicionTask EscriirInformacionEdicionListasAministrar(String NombreOpcion, String Posicion, String idcase) {
        return instrumented(ListaAdministrarEdicionTask.class, NombreOpcion, Posicion, idcase);
    }
}
