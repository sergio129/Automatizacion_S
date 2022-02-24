package co.konecta.sura.certificate.Tareas.Parametrizacion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.OfertamientoPage.*;

@AllArgsConstructor
public class OfertamientoTask implements Task {
    private String Nombre, Coordinacion, Ofertamiento, Tiempo, Linea, Servicio, Departamento, Municipio;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(
                Enter.theValue(Nombre).into(CAMPO_NOMBRE_DE_OFERTAMIENTO),
                Click.on(CAMPO_COORDINACION_DE_OFERTAMIENTO),
                Click.on(SELECCIONAR_COORDINACION_DE_OFERTAMIENTO.of(String.valueOf(Coordinacion))),
                Click.on(CAMPO_TIPO_OFERTAMIENTO),
                Enter.theValue(Ofertamiento).into(BUSCAR_TIPO_OFERTAMIENTO).thenHit(Keys.ENTER),
                Enter.theValue(Tiempo).into(CAMPO_TIEMPO_OFERTAMIENTO),
                Click.on(CAMPO_LINEA_OFERTAMIENTO),
                Enter.theValue(Linea).into(BUSCAR_LINEA_OFERTAMIENTO),
                Click.on(SELECCIONAR_LINEA_OFERTAMIENTO.of(String.valueOf(Linea))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA_OFERTAMIENTO),
                Click.on(CAMPO_SERVICIO_OFERTAMIENTO),
                Enter.theValue(Servicio).into(BUSCAR_SERVICIO_OFERTAMIENTO).thenHit(Keys.ENTER),
                Click.on(CAMPO_DEPARTAMENTO_OFERTAMIENTO),
                Enter.theValue(Departamento).into(BUSCAR_DEPARTAMENTO_OFERTAMIENTO),
                Click.on(SELECCIONAR_DEPARTAMENTO_OFERTAMIENTO.of(String.valueOf(Departamento))),
                Hit.the(Keys.ESCAPE).into(CAMPO_DEPARTAMENTO_OFERTAMIENTO),
                Click.on(CAMPO_MUNICIPIO_OFERTAMIENTO),
                Enter.theValue(Municipio).into(BUSCAR_MUNICIPIO_OFERTAMIENTO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)

        );

    }
    public static OfertamientoTask EscribirInformacionOfertamiento(String Nombre, String Coordinacion, String Ofertamiento, String Tiempo, String Linea, String Servicio, String Departamento, String Municipio){
        return new OfertamientoTask(Nombre, Coordinacion, Ofertamiento, Tiempo, Linea, Servicio, Departamento, Municipio);
    }
}
