package co.konecta.sura.certificate.Tareas.Roles;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Roles.ListarRolesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ListaRolesAsociarMenuRolTask implements Task {
    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_ASOCIAR_MENU_ROL));
        Thread.sleep(5000);
        actor.attemptsTo(
                Click.on(PERMISOS_LISTAS_ADMINISTRAR_TAREAS),
                Click.on(SELECCIONAR_ADMINISTRAR_TAREAS),
                Hit.the(Keys.ESCAPE).into(SELECCIONAR_ADMINISTRAR_TAREAS),
              //  Hit.the(Keys.TAB).into(PERMISOS_LISTAS_ADMINISTRAR_TAREAS),

                Click.on(PERMISOS_LISTAS_CAMPO_BUSCAR),
                Click.on(SELECCIONAR_CASOS_BUSCAR),
                Hit.the(Keys.ESCAPE).into(PERMISOS_LISTAS_CAMPO_BUSCAR),

              //  Hit.the(Keys.TAB).into(SELECCIONAR_USUARIO_REGISTRADO)
                Click.on(PERMISOS_LISTAS_USUARIOS_REGISTRADOS),
                Click.on(SELECCIONAR_USUARIOS_REGISTRADOS),
                Hit.the(Keys.ESCAPE).into(PERMISOS_LISTAS_USUARIOS_REGISTRADOS),

                Click.on(PERMISOS_LISTAS_CONTADOR_CASOS),
                Click.on(SELECCIONAR_CONTADOR_CASOS),
                Hit.the(Keys.ESCAPE).into(PERMISOS_LISTAS_CONTADOR_CASOS),
                MoveMouse.to(GUARDAR_ASOCIAR_MENU_ROL).andThen(actions -> actions.click()),
                Click.on(OPCION_SI_GUARDAR_ASOCIAR_MENU_ROL)
        );



    }
    public static ListaRolesAsociarMenuRolTask SeleccionarListas(){
        return instrumented(ListaRolesAsociarMenuRolTask.class);
    }
}
