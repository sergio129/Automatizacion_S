package co.konecta.sura.certificate.Tareas.Casos.Novedades;

import co.konecta.sura.certificate.Interfaces.Casos.Novedades.NovedadesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.Novedades.NovedadesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Novedades implements Task {
    private NoveltyModel noveltyModel;

    public Novedades(NoveltyModel noveltyModel){this.noveltyModel = noveltyModel;}

    public static Novedades whitDataNovelty (NoveltyModel noveltyModel){
        return instrumented(Novedades.class, noveltyModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NovedadesPage.INPUT_WHO_REPORTS_NEWS_MANAGEMENTS),
                Click.on(INPUT_WHO_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(noveltyModel.getWhoreports()).into(INPUT_WHO_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),

                Click.on(NovedadesPage.INPUT_CAUSE_NOVELTY_NEWS_MANAGEMENTS),
                Click.on(NovedadesPage.INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(noveltyModel.getCausenovelty()).into(NovedadesPage.INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),

                Click.on(NovedadesPage.INPUT_COMPLAINT_NEWS_MANAGEMENTS),
                Click.on(NovedadesPage.INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(noveltyModel.getComplaintnews()).into(NovedadesPage.INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),
                Enter.theValue(noveltyModel.getObservationnovelty()).into(NovedadesPage.INPUT_OBSERVATION_NEWS_MANAGEMENTS),

                Click.on( NovedadesPage.BUTTON_SAVE_MANAGEMENTS)
                );

    }
}
