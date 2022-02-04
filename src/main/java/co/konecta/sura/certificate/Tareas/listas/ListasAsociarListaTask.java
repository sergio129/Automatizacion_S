package co.konecta.sura.certificate.Tareas.listas;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Listas.ListasAsociarListasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ListasAsociarListaTask implements Task {

    String ListaPadre;
    String OptListaPadre;
    String ListaHija;
    String OptListaHija;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Click.on(CAMPO_LISTA_PADRE),
                Enter.theValue(ListaPadre).into(BUSCAR_LISTA_PADRE).thenHit(Keys.ENTER),
                Click.on(CAMPO_OPCION_LISTA_PADRE),
                Enter.theValue(OptListaPadre).into(BUSCAR_OPCION_LISTA_PADRE).thenHit(Keys.ENTER),
                Click.on(CAMPO_LISTA_HIJA),
                Enter.theValue(ListaHija).into(BUSCAR_LISTA_HIJA).thenHit(Keys.ENTER),
                Click.on(CAMPO_OPCION_LISTA_HIJA),
                Enter.theValue(OptListaHija).into(BUSCAR_OPCION_LISTA_HIJA).thenHit(Keys.ENTER),
                Click.on(BOTON_GUARDAR_ASOCIAR_LISTA)
        );

    }

    public static ListasAsociarListaTask EscribirInformacion(String ListaPadre, String OptListaPadre, String ListaHija, String OptListaHija) {
        return instrumented(ListasAsociarListaTask.class, ListaPadre, OptListaPadre, ListaHija, OptListaHija);
    }
}
