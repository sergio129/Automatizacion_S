package co.konecta.sura.certificate.Tareas.GestionUsuarios;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.GestionUsuarios.ListarUsuariosPage.*;

@AllArgsConstructor
public class ListarUsuariosTask implements Task {
    private String Nombre, Identificador, Correo, Rol, Asignacion;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Enter.theValue(Nombre).into(CAMPO_NOMBRE),
                Enter.theValue(Identificador).into(CAMPO_IDENTIFICACION),
                Enter.theValue(Correo).into(CAMPO_CORREO),
                Click.on(CAMPO_ESTADO),
                Click.on(SELECCIONAR_ESTADO),
                Click.on(CAMPO_ROL),
                Enter.theValue(Rol).into(BUSCAR_ROL).thenHit(Keys.ENTER),
                Enter.theValue(Asignacion).into(CAMPO_ASIGNACION_USUARIO),
                Click.on(CAMPO_URL_EXTERNA),
                Click.on(SELECCIONAR_URL_EXTERNA),
                Click.on(BOTON_GUARDAR_USUARIO));
    }

    public static ListarUsuariosTask EscribirInformacionListarUsuarios(String Nombre, String Identificador, String Correo, String Rol, String Asignacion) {
        return new ListarUsuariosTask(Nombre, Identificador, Correo, Rol, Asignacion);
    }
}
