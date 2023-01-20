package co.konecta.sura.certificate.Tareas.Parametrizacion;

import co.konecta.sura.certificate.Modelos.Parametrizaciones.CalculoTiempoMonitoreoSitioModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.CalculoTiempoMonitoreoSitioPage.*;
import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.BUSCAR_DATO;
import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.SELECCIONAR_DATO;

@AllArgsConstructor
public class CalculoTiempoMonitoreoSitioTask implements Task {
    private final CalculoTiempoMonitoreoSitioModel tiempoModel;

    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(
                Enter.theValue(tiempoModel.getNombre()).into(CAMPO_NOMBRE),
                Click.on(CAMPO_MOMENTO_DEL_SERVICIO),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tiempoModel.getMomentoServicio()))),
                Click.on(CAMPO_LINEA),
                Enter.theValue(tiempoModel.getLinea()).into(BUSCAR_DATO),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tiempoModel.getLinea()))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA),
                Click.on(CAMPO_TIPO_SERVICIO),
                Enter.theValue(tiempoModel.getTipoServicio()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_DEPARTAMENTO),
                Enter.theValue(tiempoModel.getDepartamento()).into(BUSCAR_DATO),
                Click.on(SELECCIONAR_DATO.of(String.valueOf(tiempoModel.getDepartamento()))),Hit.the(Keys.ESCAPE).into(CAMPO_DEPARTAMENTO),
                Click.on(CAMPO_MUNICIPIO),
                Enter.theValue(tiempoModel.getMunicipio()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Enter.theValue(tiempoModel.getDelta()).into(CAMPO_DELTA),
                Click.on(BOTON_GUARDAR)


        );

    }

    public static CalculoTiempoMonitoreoSitioTask escribirDatos(CalculoTiempoMonitoreoSitioModel tiempoModel) {
        return new CalculoTiempoMonitoreoSitioTask(tiempoModel);

    }

}
