package co.konecta.sura.certificate.Tareas.Casos.SubmoduloCierreExpediente;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.konecta.sura.certificate.Interfaces.Casos.SubCierreExpediente.SubCierreExpedientePage.CAMPO_KILOMETRO_FALLIDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class CheckBanderazofallidoTask implements Task {

    public String kilometrofallido;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_KILOMETRO_FALLIDO),
                Enter.theValue(kilometrofallido).into(CAMPO_KILOMETRO_FALLIDO));
    }


    public static CheckBanderazofallidoTask EsbriboBanderazoFallido(String kilometrofallido) {
        return instrumented(CheckBanderazofallidoTask.class, kilometrofallido);
    }

    }

