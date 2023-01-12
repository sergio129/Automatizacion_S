package co.konecta.sura.certificate.Tareas.Integracion;

import co.konecta.sura.certificate.Interfaces.Integracion.SolicitudReclamacionesPage;
import co.konecta.sura.certificate.Modelos.Integracion.SolicitudReclamacionesModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.SELECCIONAR_DATO;

@AllArgsConstructor
public class SolicitudRelacmacionGestionTask implements Task {
    private final SolicitudReclamacionesModel model;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SolicitudReclamacionesPage.CAMPO_TIPO_GESTION),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(model.getTipoGestion()))),

                Click.on(SolicitudReclamacionesPage.CAMPO_PERSONA_GESTION),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(model.getPersonaGestion()))),

                Enter.theValue(model.getObservaciones()).into(SolicitudReclamacionesPage.CAMPO_OBSERVACIONES),
                Click.on(SolicitudReclamacionesPage.BOTON_AGREGAR_GESTION)
        );
    }

    public static SolicitudRelacmacionGestionTask EscribirDatos(SolicitudReclamacionesModel model) {
        return new SolicitudRelacmacionGestionTask(model);
    }
}
