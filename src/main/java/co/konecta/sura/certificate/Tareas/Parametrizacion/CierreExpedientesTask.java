package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CierreDeExpedientePage.*;

@AllArgsConstructor
public class CierreExpedientesTask implements Task {
    private String linea, servicio, campo;
    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Click.on(CAMPO_LINEA),
                Enter.theValue(linea).into(BUSCAR_LINEA),
                Click.on(SELECCIONAR_LINEA),
                Hit.the(Keys.ESCAPE).into(BUSCAR_LINEA),
                Click.on(CAMPO_SERVICIO),
                Enter.theValue(servicio).into(BUSCAR_SERVICIO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
                Thread.sleep(2000);
               actor.has(
                       //Click.on(SELECCIONAR_SERVICIO),
                Click.on(CAMPO_CAMPO),
                Enter.theValue(campo).into(BUSCAR_CAMPO).thenHit(Keys.ENTER)
        );

    }
    public static CierreExpedientesTask EscribirInformacionCierreExpediente(String linea, String servicio, String campo){
        return new CierreExpedientesTask(linea, servicio, campo);
    }
}
