package co.konecta.sura.certificate.Tareas.Parametrizacion.MotivosDeLlamadaTask;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.MotivosDeLlamadaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class SolicitudDeServicioTask implements Task {
    public String name;
    public String Tipo;
    public String Estado;
    public String line;
    public String Validacion;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME_CALL_REASONS),
                Click.on(INPUT_SELECT_TYPE_CALL_REASONS),
                Click.on(SELECT_SERVICE_REQUEST_CALL_REASONS.of(String.valueOf(Tipo))),
                Click.on(CAMPO_ESTADO_MOTIVOS_LLAMADA),
                Click.on(SELECIONAMOS_CAMPO_ESTADO_MOTIVOS_LLAMADA.of(String.valueOf(Estado))),
                Click.on(INPUT_LINE_CALL_REASONS),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_CALL_REASONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SELECT_VALIDATION_CALL_REASONS),
                Click.on(SELECT_VALIDATION_CALL_REASONS.of(String.valueOf(Validacion))),
                Click.on(BUTTON_AMOUNT_CALL_REASONS),
                Click.on(OPTION_YES_SELECT_VALIDATION_CALL_REASONS)
        );
    }

    public static SolicitudDeServicioTask writeInformationServiceRequest(String name, String Tipo, String Estado, String line, String Validacion) {
        return instrumented(SolicitudDeServicioTask.class, name,Tipo,Estado, line, Validacion);
    }

}
