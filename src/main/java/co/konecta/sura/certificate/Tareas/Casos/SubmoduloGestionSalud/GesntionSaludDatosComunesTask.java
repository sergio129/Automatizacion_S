package co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud.SubModuloGestionSaludPage.*;
@AllArgsConstructor
public class GesntionSaludDatosComunesTask implements Task {
    List<Map<String, String>> DatosComunesGestionSalud2;
    private static final String CANAL_INGRESO = "CanalIngreso";
    private static final String TIPO_DOCUMENTO = "TipoDocumento";
    private static final String NUMERODOCUMENTO = "NumeroDocumento";



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_CANAL_INGRESO),
                Enter.theValue(DatosComunesGestionSalud2.get(0).get(CANAL_INGRESO)).into(BUSCAR_CANAL_INGRESO).thenHit(Keys.ENTER),
                Click.on(CAMPO_TIPO_DOCUMENTO),
                Enter.theValue(DatosComunesGestionSalud2.get(0).get(TIPO_DOCUMENTO)).into(BUSCAR_TIPO_DOCUMENTO).thenHit(Keys.ENTER),
                Enter.theValue(DatosComunesGestionSalud2.get(0).get(NUMERODOCUMENTO)).into(NUMERO_DOCUMENTO));
    }
    public static co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GesntionSaludDatosComunesTask EscribirDatosComunes2(List<Map<String, String>> DatosComunesGestionSalud2){
        return new co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GesntionSaludDatosComunesTask(DatosComunesGestionSalud2);
    }
}
