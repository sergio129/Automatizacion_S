package co.konecta.sura.certificate.Tareas.Casos.SubModuloAgenda;

import co.konecta.sura.certificate.Tareas.Inicio.AlertaedicionTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.BUSCAR_ALERTA_UCK;
import static co.konecta.sura.certificate.Interfaces.Inicio.AlertaPage.CAMPO_VALIDACIONES;
import static co.konecta.sura.certificate.Interfaces.SubAgenda.AgendaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
@AllArgsConstructor
public class LlamadaTask implements Task {

        public String numeroallamar;
        public String departamento;
        public String municipio;
    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
                    Click.on(CAMPO_NUMERO_LLAMADA),
                    Enter.theValue(numeroallamar).into(CAMPO_NUMERO_LLAMADA).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                    Click.on(CAMPO_DEPARTAMENTO_AGENDA),
                    Enter.theValue(departamento).into(CAMPO_BUSCAR_LLAMADA).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                    Click.on(CAMPO_TIPO_MUNICIPIO_AGENDA),
                    Enter.theValue(municipio).into(CAMPO_BUSCAR_LLAMADA).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
        public static LlamadaTask EscriboModuloLLamada( String numeroallamar,String departamento,String municipio) {
            return instrumented(LlamadaTask.class, numeroallamar,departamento,municipio);
        }



    }


