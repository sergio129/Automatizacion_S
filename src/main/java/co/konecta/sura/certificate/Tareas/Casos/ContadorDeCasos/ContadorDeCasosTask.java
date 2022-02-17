package co.konecta.sura.certificate.Tareas.Casos.ContadorDeCasos;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.ContadorCasos.ContadorDeCasosPage.*;

@AllArgsConstructor
public class ContadorDeCasosTask implements Task {
    private ContadorCasosModel contadorCasosModel;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(Click.on(FECHA_INICIO_CONTADOR_CASOS),
                Enter.keyValues(contadorCasosModel.getDate1()).into(FECHA_INICIO_CONTADOR_CASOS).thenHit(Keys.ENTER)

        );


    }
    public static ContadorDeCasosTask EscribirFechas(ContadorCasosModel contadorCasosModel){
        return new ContadorDeCasosTask(contadorCasosModel);
    }
}
