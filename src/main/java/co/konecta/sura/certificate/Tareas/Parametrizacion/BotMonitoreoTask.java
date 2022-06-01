package co.konecta.sura.certificate.Tareas.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Parametrizacion.BotDeOfertamientoPage;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class BotMonitoreoTask implements Task {
    private String Nombre,GestionServicio,Linea,TipoServicio,TipoTarea,Departamento,Municipio,ServicioEspecial;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Enter.theValue(Nombre).into(BotDeOfertamientoPage.CAMPO_NOMBRE),
                Click.on(BotDeOfertamientoPage.CAMPO_GESTOR_DE_SERVICIO),
                Click.on(BotDeOfertamientoPage.SELECCIONAR_GESTOR_DE_SERVICIO.of(String.valueOf(GestionServicio))),
                Click.on(BotDeOfertamientoPage.CAMPO_LINEA),
                Enter.theValue(Linea).into(BotDeOfertamientoPage.BUSCAR_LINEA),
                Click.on(BotDeOfertamientoPage.CAMPO_LINEA.of(String.valueOf(Linea))),
                Hit.the(Keys.ESCAPE).into(BotDeOfertamientoPage.CAMPO_LINEA),
                Click.on(BotDeOfertamientoPage.CAMPO_TIPO_SERVICIO),
                Enter.theValue(TipoServicio).into(BotDeOfertamientoPage.BUSCAR_TIPO_SERVICIO),
                Hit.the(Keys.ESCAPE).into(BotDeOfertamientoPage.CAMPO_TIPO_SERVICIO),
                Click.on(BotDeOfertamientoPage.CAMPO_TIPO_TAREA),
                Enter.theValue(TipoTarea).into(BotDeOfertamientoPage.BUSCAR_TIPO_TAREA),
                Hit.the(Keys.ESCAPE).into(BotDeOfertamientoPage.CAMPO_TIPO_TAREA),
                Click.on(BotDeOfertamientoPage.CAMPO_DEPARTAMENTO),
                Enter.theValue(Departamento).into(BotDeOfertamientoPage.BUSCAR_DEPARTAMENTO),
                Hit.the(Keys.ESCAPE).into(BotDeOfertamientoPage.CAMPO_DEPARTAMENTO),
                Click.on(BotDeOfertamientoPage.CAMPO_MUNICIPIO),
                Enter.theValue(Municipio).into(BotDeOfertamientoPage.BUSCAR_MUNICIPIO),
                Hit.the(Keys.ESCAPE).into(BotDeOfertamientoPage.CAMPO_MUNICIPIO),
                Click.on(BotDeOfertamientoPage.CAMPO_SERVICIO_ESPECIAL),
                Enter.theValue(ServicioEspecial).into(BotDeOfertamientoPage.BUSCAR_SERVICIO_ESPECIAL),
                Hit.the(Keys.ESCAPE).into(BotDeOfertamientoPage.CAMPO_MUNICIPIO)
        );
    }
}
