package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.SemaforosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SemaforosTask implements Task {

    String roleTrafficLight;
    String serviceStatusTraffic;
    String lineTrafficLight;
    String serviceTrafficLight;
    String from1TrafficLight;
    String until1TrafficLight;
    String from2TrafficLight;
    String until2TrafficLight;
    String from3TrafficLight;
    String until3TrafficLight;
    String from4TrafficLight;
    String until4TrafficLight;
    String from5TrafficLight;
    String until5TrafficLight;
    String from6TrafficLight;
    String until6TrafficLight;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_ROLE_TRAFFIC_LIGHT),
                Enter.theValue(roleTrafficLight).into(INPUT_SEARCH_ROLE_TRAFFIC_LIGHT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_STATUS_TRAFFIC),
                Enter.theValue(serviceStatusTraffic).into(INPUT_SEARCH_SERVICE_STATUS_TRAFFIC).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_LINE_TRAFFIC_LIGHT),
                Enter.theValue(lineTrafficLight).into(INPUT_SEARCH_LINE_TRAFFIC_LIGHT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_TRAFFIC_LIGHT),
                Enter.theValue(serviceTrafficLight).into(INPUT_SEARCH_SERVICE_TRAFFIC_LIGHT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Enter.theValue(from1TrafficLight).into(INPUT_FROM_1),
                Enter.theValue(until1TrafficLight).into(INPUT_UNTIL_1),
                Enter.theValue(from2TrafficLight).into(INPUT_FROM_2),
                Enter.theValue(until2TrafficLight).into(INPUT_UNTIL_2),
                Enter.theValue(from3TrafficLight).into(INPUT_FROM_3),
                Enter.theValue(until3TrafficLight).into(INPUT_UNTIL_3),
                Enter.theValue(from4TrafficLight).into(INPUT_FROM_4),
                Enter.theValue(until4TrafficLight).into(INPUT_UNTIL_4),
                Enter.theValue(from5TrafficLight).into(INPUT_FROM_5),
                Enter.theValue(until5TrafficLight).into(INPUT_UNTIL_5),
                Enter.theValue(from6TrafficLight).into(INPUT_FROM_6),
                Enter.theValue(until6TrafficLight).into(INPUT_UNTIL_6),
                Click.on(BUTTON_SAVE_TRAFFIC_LIGHT)
                );
    }

    public static SemaforosTask withInformationTrafficLight (String roleTrafficLight, String serviceStatusTraffic, String lineTrafficLight, String serviceTrafficLight, String from1TrafficLight, String until1TrafficLight, String from2TrafficLight, String until2TrafficLight, String from3TrafficLight, String until3TrafficLight, String from4TrafficLight, String until4TrafficLight, String from5TrafficLight, String until5TrafficLight, String from6TrafficLight, String until6TrafficLight){
        return instrumented(SemaforosTask.class, roleTrafficLight,serviceStatusTraffic, lineTrafficLight, serviceTrafficLight, from1TrafficLight, until1TrafficLight, from2TrafficLight, until2TrafficLight, from3TrafficLight, until3TrafficLight, from4TrafficLight, until4TrafficLight, from5TrafficLight, until5TrafficLight, from6TrafficLight, until6TrafficLight);
    }
}
