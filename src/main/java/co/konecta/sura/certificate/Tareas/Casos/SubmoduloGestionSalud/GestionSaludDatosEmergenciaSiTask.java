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
public class GestionSaludDatosEmergenciaSiTask implements Task {
    List<Map<String, String>> DatosEmergenciaSi;
    private static final String TIPO_EMERGENCIA = "TipoEmergencia";
    private static final String SERVICIO_PRESTADO = "ServicioPrestado";
    private static final String NOMBRE_ACOMPANANTEN= "NombreAcompanante";
    private static final String PARENTESCO = "Parentesco";
    private static final String TELEFONO = "Telefono";
    private static final String PRESTADOR_SERVICIO = "PrestadorServicio";


    @Override
    public <T extends Actor> void performAs(T t) {
        if (CAMPO_TIPO_EMERGENCIA.resolveFor(t).isVisible()) {
            t.attemptsTo(
                    Click.on(CAMPO_TIPO_EMERGENCIA),
                    Enter.theValue(DatosEmergenciaSi.get(0).get(TIPO_EMERGENCIA)).into(BUSCAR_TIPO_EMERGENCIA).thenHit(Keys.ENTER),
                    Click.on(CAMPO_SERVICIO_PRESTADO),
                    Enter.theValue(DatosEmergenciaSi.get(0).get(SERVICIO_PRESTADO)).into(BUSCAR_SERVICIO_PRESTADO).thenHit(Keys.ENTER),
                    Enter.theValue(DatosEmergenciaSi.get(0).get(NOMBRE_ACOMPANANTEN)).into(NOMBRE_ACOMPAÑANTE),
                    Click.on(CAMPO_PARENTESCO),
                    Enter.theValue(DatosEmergenciaSi.get(0).get(PARENTESCO)).into(BUSCAR_PARENTESCO).thenHit(Keys.ENTER),
                    Enter.theValue(DatosEmergenciaSi.get(0).get(TELEFONO)).into(TELEFONO_ACOMPAÑANTE),
                    Click.on(CAMPO_PRESTADOR_SERVICIO),
                    Enter.theValue(DatosEmergenciaSi.get(0).get(PRESTADOR_SERVICIO)).into(BUSCAR_PRESTADOR_SERVICIO).thenHit(Keys.ENTER));
        }
    }
    public static co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GestionSaludDatosEmergenciaSiTask DatosEmergenciaSi(List<Map<String, String>> DatosEmergenciaSi){
        return new co.konecta.sura.certificate.Tareas.Casos.SubmoduloGestionSalud.GestionSaludDatosEmergenciaSiTask(DatosEmergenciaSi);
    }
}
