package co.konecta.sura.certificate.Tareas.Casos.SubModuloGestionSalud;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class GestionSaludComunTask implements Task {
    public static GestionSaludComunTask TareaComunEscribirDatosEmergenciaSalud(String CanalIngreso, String TipoDocumento, String NumeroDocumento, String TieneEmergencia) {
        return instrumented(GestionSaludComunTask.class, CanalIngreso, TipoDocumento, NumeroDocumento, TieneEmergencia);
    }



    public String CanalIngreso;
    public String TipoDocumento;
    public String NumeroDocumento;
    public String TieneEmergencia;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_CANAL_INGRESO),
                Enter.theValue(CanalIngreso).into(BUSCAR_CANAL_INGRESO).thenHit(Keys.ENTER),
                Click.on(CAMPO_TIPO_DOCUMENTO),
                Enter.theValue(TipoDocumento).into(BUSCAR_TIPO_DOCUMENTO).thenHit(Keys.ENTER),
                Enter.theValue(NumeroDocumento).into(NUMERO_DOCUMENTO),
                Click.on(CAMPO_TIENE_EMERGENCIA),
                Enter.theValue(TieneEmergencia).into(BUSCAR_TIENE_EMERGENCIA).thenHit(Keys.ENTER));


        }
    }

