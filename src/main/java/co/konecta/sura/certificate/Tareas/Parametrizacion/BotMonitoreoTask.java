package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.BotDeOfertamientoPage.*;

@AllArgsConstructor
public class BotMonitoreoTask implements Task {
    private String Nombre,GestionServicio,Linea,TipoServicio,TipoTarea,Departamento,Municipio,ServicioEspecial;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Enter.theValue(Nombre).into(CAMPO_NOMBRE),
                Click.on(CAMPO_GESTOR_DE_SERVICIO),
                Click.on(SELECCIONAR_GESTOR_DE_SERVICIO.of(String.valueOf(GestionServicio))),
                Click.on(CAMPO_LINEA),
                Enter.theValue(Linea).into(BUSCAR_LINEA),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(Linea))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA),
                Click.on(CAMPO_TIPO_SERVICIO),
                Enter.theValue(TipoServicio).into(BUSCAR_TIPO_SERVICIO).thenHit(Keys.ENTER),
                Hit.the(Keys.ESCAPE).into(CAMPO_TIPO_SERVICIO),
                Click.on(CAMPO_TIPO_TAREA),
                Enter.theValue(TipoTarea).into(BUSCAR_TIPO_TAREA).thenHit(Keys.ENTER),
                Hit.the(Keys.ESCAPE).into(CAMPO_TIPO_TAREA),
                Click.on(CAMPO_DEPARTAMENTO),
                Enter.theValue(Departamento).into(BUSCAR_DEPARTAMENTO),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(Departamento))),
                Hit.the(Keys.ESCAPE).into(CAMPO_DEPARTAMENTO),
                Click.on(CAMPO_MUNICIPIO),
                Enter.theValue(Municipio).into(BUSCAR_MUNICIPIO).thenHit(Keys.ENTER),
                Hit.the(Keys.ESCAPE).into(CAMPO_MUNICIPIO),
                Click.on(CAMPO_SERVICIO_ESPECIAL),
                Enter.theValue(ServicioEspecial).into(BUSCAR_SERVICIO_ESPECIAL).thenHit(Keys.ENTER),
                Hit.the(Keys.ESCAPE).into(CAMPO_MUNICIPIO)
        );
    }
    public static BotMonitoreoTask EscribirDatosBotMonitoreo(String Nombre,String GestionServicio,String Linea,String TipoServicio,String TipoTarea,String Departamento,String Municipio,String ServicioEspecial){
        return new BotMonitoreoTask(Nombre,GestionServicio,Linea,TipoServicio,TipoTarea,Departamento,Municipio,ServicioEspecial);
    }
}
