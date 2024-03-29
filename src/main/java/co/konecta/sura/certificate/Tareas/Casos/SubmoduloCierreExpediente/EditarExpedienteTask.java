package co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente.SubCierreExpedientePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class EditarExpedienteTask implements Task {

    public String hora;
    public String maniobras;
    public String maniobrasjustificada;
    public String adicional;
    public String zonaroja;
    public String zonadestada;
    public String adicionaljustificacion;
    public String asumecliente;
    public String convenio;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_HORAS),
                Enter.theValue(hora).into(CAMPO_HORAS),
                Click.on(CAMPO_MANIOBRAS),
                Enter.theValue(maniobras).into(CAMPO_MANIOBRAS),
                Click.on(CAMPO_MANIOBRAS_JUSTIFICADA),
                Enter.theValue(maniobrasjustificada).into(CAMPO_MANIOBRAS_JUSTIFICADA),
                Click.on(CAMPO_ADICIONAL),
                Enter.theValue(adicional).into(CAMPO_ADICIONAL),
                Click.on(CAMPO_ZONA_ROJA),
                Enter.theValue(zonaroja).into(CAMPO_ZONA_ROJA),
                Click.on(CAMPO_ZONA_DESTAPADA),
                Enter.theValue(zonadestada).into(CAMPO_ZONA_DESTAPADA),
                Click.on(CAMPO_ADICIONAL_JUSTIFICADA),
                Enter.theValue(adicionaljustificacion).into(CAMPO_ADICIONAL_JUSTIFICADA),
                Click.on(CAMPO_ASUME_CLIENTE),
                Enter.theValue(asumecliente).into(CAMPO_ASUME_CLIENTE),
                Click.on(CAMPO_CAUSA_ACCIDENTE),
                Click.on(SELECCIONAR_CAUSA_ACCIDENTE),
                Click.on(CAMPO_ESTADO),
                Click.on(SELECCIONAR_ESTADO),
                Enter.theValue(convenio).into(CAMPO_CONVENIO)
        );


    }

    public static EditarExpedienteTask TareaEscribirDatos(String hora,String maniobras,String maniobrasjustificada,String adicional,String zonaroja,String zonadestapada,String adicionaljustificacion,String asumecliente,String convenio){

     return instrumented(EditarExpedienteTask.class, hora, maniobras, maniobrasjustificada, adicional, zonaroja, zonadestapada, adicionaljustificacion, asumecliente, convenio);

    }
}