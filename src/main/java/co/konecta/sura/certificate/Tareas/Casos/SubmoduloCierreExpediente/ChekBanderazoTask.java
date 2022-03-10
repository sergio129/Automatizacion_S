package co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente.SubCierreExpedientePage.CAMPO_KILOMETRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ChekBanderazoTask implements Task {

    public String kilometro;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_KILOMETRO),
                Enter.theValue(kilometro).into(CAMPO_KILOMETRO));
    }
    public static ChekBanderazoTask EsbriboBanderazo(String kilometrofallido) {
        return instrumented(ChekBanderazoTask.class, kilometrofallido);

    }
}