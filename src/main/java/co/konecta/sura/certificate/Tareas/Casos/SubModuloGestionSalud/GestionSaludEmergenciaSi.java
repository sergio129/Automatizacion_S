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
public class GestionSaludEmergenciaSi implements Task {

    public String TipoEmergencia;
    public String ServicioPrestado;
    public String NombreAcompanante;
    public String Parentesco;
    public String Telefono;
    public String PrestadorServicio;
    public String Observaciones;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_TIPO_EMERGENCIA),
                Enter.theValue(TipoEmergencia).into(BUSCAR_TIPO_EMERGENCIA).thenHit(Keys.ENTER),
                Click.on(CAMPO_SERVICIO_PRESTADO),
                Enter.theValue(ServicioPrestado).into(BUSCAR_SERVICIO_PRESTADO).thenHit(Keys.ENTER),
                Enter.theValue(NombreAcompanante).into(NOMBRE_ACOMPAÑANTE),
                Click.on(CAMPO_PARENTESCO),
                Enter.theValue(Parentesco).into(BUSCAR_PARENTESCO).thenHit(Keys.ENTER),
                Enter.theValue(Telefono).into(TELEFONO_ACOMPAÑANTE),
                Click.on(CAMPO_PRESTADOR_SERVICIO),
                Enter.theValue(PrestadorServicio).into(BUSCAR_PRESTADOR_SERVICIO).thenHit(Keys.ENTER),
                Enter.theValue(Observaciones).into(OBSERVACIONES));
    }
    public static GestionSaludEmergenciaSi EscribirEmergenciaSi(String TipoEmergencia, String ServicioPrestado, String NombreAcompanante, String Parentesco, String Telefono, String PrestadorServicio, String Observaciones) {
        return instrumented(GestionSaludEmergenciaSi.class, TipoEmergencia, ServicioPrestado, NombreAcompanante, Parentesco, Telefono, PrestadorServicio, Observaciones );
    }
}
