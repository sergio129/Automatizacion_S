package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.ListasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ListsParameterizationTask implements Task {

    public String rolesLists;
    public String modulesLists;
    public String lists;
    public String optionsLists1;
    public String optionsLists2;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_ROLES_LISTS),
                Enter.theValue(rolesLists).into(INPUT_SEARCH_ROLES_LISTS).thenHit(Keys.ENTER),
                Click.on(INPUT_MODULES_LISTS),
                Enter.theValue(modulesLists).into(INPUT_SEARCH_MODULES_LISTS).thenHit(Keys.ENTER),
                Click.on(INPUT_LISTS),
                Enter.theValue(lists).into(INPUT_SEARCH_LISTS).thenHit(Keys.ENTER),
                Click.on(INPUT_OPTIONS_LISTS),
                Enter.theValue(optionsLists1).into(INPUT_SEARCH_OPTIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_OPTIONS_LISTS),
                Enter.theValue(optionsLists2).into(INPUT_SEARCH_OPTIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)

        );

    }

    public static ListsParameterizationTask withInformationListParameterization(String rolesLists, String modulesLists, String lists, String optionsLists1, String optionsLists2) {
        return instrumented(ListsParameterizationTask.class, rolesLists, modulesLists, lists, optionsLists1, optionsLists2);
    }

}
