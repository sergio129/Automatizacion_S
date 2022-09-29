package co.konecta.sura.certificate.Tareas.Casos.Novedades;

import co.konecta.sura.certificate.Interfaces.Casos.Novedades.NovedadesPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.Novedades.NovedadesPage.INPUT_FILED_COMPLAINT_MANAGEMENTS;
import static co.konecta.sura.certificate.Interfaces.Casos.Novedades.NovedadesPage.INPUT_WHO_FILTER_NEWS_MANAGEMENTS;

@AllArgsConstructor
public class NovedadesTask implements Task {
    private static final String REPORTA_NOVEDAD = "ReportaNovedad";
    private static final String CAUSA_NOVEDAD = "CausaNovedad";
    private static final String GENERA_QUEJA = "GenerarQueja";
    private static final String RADICADO = "Radicado";
    private static final String OBSERVACIONES = "Observaciones";
    List<Map<String, String>> InformacionNovedades;

    public static NovedadesTask EscribirInformacionNovedades(List<Map<String, String>> InformacionNovedades) {
        return new NovedadesTask(InformacionNovedades);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NovedadesPage.INPUT_WHO_REPORTS_NEWS_MANAGEMENTS),
                // Click.on(INPUT_WHO_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(InformacionNovedades.get(0).get(REPORTA_NOVEDAD)).into(INPUT_WHO_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),
                Click.on(NovedadesPage.INPUT_CAUSE_NOVELTY_NEWS_MANAGEMENTS),
                // Click.on(NovedadesPage.INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(InformacionNovedades.get(0).get(CAUSA_NOVEDAD)).into(NovedadesPage.INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),
                Click.on(NovedadesPage.INPUT_COMPLAINT_NEWS_MANAGEMENTS),
                // Click.on(NovedadesPage.INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(InformacionNovedades.get(0).get(GENERA_QUEJA)).into(NovedadesPage.INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER));
        if (INPUT_FILED_COMPLAINT_MANAGEMENTS.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Enter.theValue(InformacionNovedades.get(0).get(RADICADO)).into(INPUT_FILED_COMPLAINT_MANAGEMENTS));
        }
        actor.attemptsTo(
                Enter.theValue(InformacionNovedades.get(0).get(OBSERVACIONES)).into(NovedadesPage.INPUT_OBSERVATION_NEWS_MANAGEMENTS),

                Click.on(NovedadesPage.BUTTON_SAVE_MANAGEMENTS)
        );
    }
}
