package co.konecta.sura.certificate.task.cases.novelty;

import co.konecta.sura.certificate.userinterface.cases.novelty.NoveltyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.cases.novelty.NoveltyPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Novelty implements Task {
    private NoveltyModel noveltyModel;

    public Novelty(NoveltyModel noveltyModel){this.noveltyModel = noveltyModel;}

    public static Novelty whitDataNovelty (NoveltyModel noveltyModel){
        return instrumented(Novelty.class, noveltyModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NoveltyPage.INPUT_WHO_REPORTS_NEWS_MANAGEMENTS),
                Click.on(INPUT_WHO_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(noveltyModel.getWhoreports()).into(INPUT_WHO_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),

                Click.on(NoveltyPage.INPUT_CAUSE_NOVELTY_NEWS_MANAGEMENTS),
                Click.on(NoveltyPage.INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(noveltyModel.getCausenovelty()).into(NoveltyPage.INPUT_CAUSE_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),

                Click.on(NoveltyPage.INPUT_COMPLAINT_NEWS_MANAGEMENTS),
                Click.on(NoveltyPage.INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS),
                Enter.theValue(noveltyModel.getComplaintnews()).into(NoveltyPage.INPUT_COMPLAINT_FILTER_NEWS_MANAGEMENTS).thenHit(Keys.ENTER),
                Enter.theValue(noveltyModel.getObservationnovelty()).into(NoveltyPage.INPUT_OBSERVATION_NEWS_MANAGEMENTS),

                Click.on( NoveltyPage.BUTTON_SAVE_MANAGEMENTS)
                );

    }
}
