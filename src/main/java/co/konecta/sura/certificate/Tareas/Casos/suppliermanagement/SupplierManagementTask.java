package co.konecta.sura.certificate.Tareas.Casos.suppliermanagement;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.*;
import static co.konecta.sura.certificate.Interfaces.Casos.suppliermanagement.SupplierManagementPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SupplierManagementTask implements Task {

    private static final String NOMBRE_PROVEEDOR = "Proveedor", RESPUESTA_PROVEEDOR = "RespuestaProveedor", TIEMPO_MONITOREO_SITIO = "TiempoMonitoreoSitio";
    private static final String TIEMPO_MONITOREO_DESTINO = "TiempoMonitoreoDestino", CELULAR_TECNICO = "CelularTecnico", CELULAR_CENTRAL = "TelfonoCentral";
    private static final String OBSERVACIONES = "Observaciones", CELULAR_CENTRAL2 = "TelfonoCentral1";
    List<Map<String, String>> informacion;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_SUPPLIER_NAME),
                Enter.theValue(informacion.get(0).get(NOMBRE_PROVEEDOR)).into(INPUT_SEARCH_SUPPLIER_NAME).thenHit(Keys.ENTER),
                Click.on(INPUT_SUPPLIER_RESPONSE),
                Enter.theValue(informacion.get(0).get(RESPUESTA_PROVEEDOR)).into(INPUT_SEARCH_SUPPLIER_RESPONSE).thenHit(Keys.ENTER),
                Enter.theValue(informacion.get(0).get(TIEMPO_MONITOREO_SITIO)).into(INPUT_TIME_MONITORING_SITE),
                Enter.theValue(informacion.get(0).get(TIEMPO_MONITOREO_DESTINO)).into(INPUT_TIME_MONITORING_DESTINATION),
                Enter.theValue(informacion.get(0).get(CELULAR_TECNICO)).into(INPUT_TECHNICAL_CELLPHONE),
                Enter.theValue(informacion.get(0).get(CELULAR_CENTRAL)).into(INPUT_CENTRAL_PHONE1),
                Enter.theValue(informacion.get(0).get(CELULAR_CENTRAL2)).into(INPUT_CENTRAL_PHONE2),
                Click.on(MODAL_VALIDATION),
                Enter.theValue(informacion.get(0).get(OBSERVACIONES)).into(INPUT_OBSERVATIONS)

        );
    }

    public static SupplierManagementTask withInformationSupplier(List<Map<String, String>> informacion) {
        return instrumented(SupplierManagementTask.class, informacion);
    }

}
