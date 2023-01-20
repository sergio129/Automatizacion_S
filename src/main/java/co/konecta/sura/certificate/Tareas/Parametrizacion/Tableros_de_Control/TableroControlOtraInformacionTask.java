package co.konecta.sura.certificate.Tareas.Parametrizacion.Tableros_de_Control;

import co.konecta.sura.certificate.TablerosdeControl.ParametrizacionTablerosdeControlModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosdeControlPage.*;
import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.SELECCIONAR_DATO;

public class TableroControlOtraInformacionTask implements Task {
    private final ParametrizacionTablerosdeControlModel tableros;

    public TableroControlOtraInformacionTask(ParametrizacionTablerosdeControlModel tableros) {
        this.tableros = tableros;
    }

    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(
                Click.on(CAMPO_A_MOSTRAR),
                Enter.theValue(tableros.getCamposMostrar()).into(BUSCAR_CAMPOS_A_MOSTRAR).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_ROLES),
                Enter.theValue(tableros.getRoles()).into(BUSCAR_ROLES).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_ASESORES),
                Enter.theValue(tableros.getAsesores()).into(BUSCAR_ASESORES).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_SOLO_MIS_EXPEDIENTES),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tableros.getSoloMisExpedientes())))
        );

    }
    public static TableroControlOtraInformacionTask EscribirDatos(ParametrizacionTablerosdeControlModel tableros){
        return new TableroControlOtraInformacionTask(tableros);
    }
}
