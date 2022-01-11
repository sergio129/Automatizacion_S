package co.konecta.sura.certificate.task.listas;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.list.listPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ListTask implements Task {


   // public String lists;
    public String optionsLists1;

    public ListTask(String optionsLists1) {

      //  this.lists = lists;
        this.optionsLists1 = optionsLists1;
    }





    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(SELECT_LISTS),
                Enter.theValue(optionsLists1).into(SEARCH_LISTS).thenHit(Keys.ENTER)


        );



    }
    public static ListTask withInformationList(String optionsLists1){
        return instrumented(ListTask.class, optionsLists1);
    }
}
