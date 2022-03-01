package co.konecta.sura.certificate.Tareas.Parametrizacion.MotivosDeLlamadaTask;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.MotivosDeLlamadaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class InformacionGeneralTask implements Task {
    public String name;
    public String Tipo;
    public String Estado;
    public String line;
    public String Gestionfinal;
    public String servicio;


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
                Click.on(SELECCIONAR_GESTION_FINAL),
                Click.on(INPUT_GESTION_FINAL.of(String.valueOf(Gestionfinal))),
                Click.on(SELECCIONAR_SERVICIO),
                Click.on(INPUT_SERVICIO.of(String.valueOf(servicio))),
                Click.on(BUTTON_ADD_CALL_REASONS)

                        );




    }

    public static InformacionGeneralTask whiteGeneralInformation(String name, String Tipo, String Estado, String line,String Gestionfinal, String servicio) {
        return instrumented(InformacionGeneralTask.class,name,Tipo,Estado,line,Gestionfinal,servicio);
    }
}
