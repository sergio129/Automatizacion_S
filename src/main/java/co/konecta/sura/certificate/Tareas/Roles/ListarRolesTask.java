package co.konecta.sura.certificate.Tareas.Roles;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Roles.ListarRolesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ListarRolesTask implements Task {

    public String NombreRol;
    public String Habilidad;
    public String EasyCase;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(NombreRol).into(CAMPO_NOMBRE_ROL),
                Enter.theValue(Habilidad).into(CAMPO_HABILIDADES_ROL),
                Click.on(CAMPO_EASY_CASE_ROL),
                Enter.theValue(EasyCase).into(BUSCAR_EASY_CASE_ROL).thenHit(Keys.ENTER),
                Click.on(BOTON_GUARDAR_ROL)
        );

    }
    public static ListarRolesTask EscribirInformacionListaRoles(String NombreRol, String Habilidad, String EasyCase){
        return instrumented(ListarRolesTask.class, NombreRol,Habilidad,EasyCase);
    }
}
