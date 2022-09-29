package co.konecta.sura.certificate.Tareas.Casos.CasosCompleto;

import co.konecta.sura.certificate.Interfaces.Casos.cases.CasePage;
import co.konecta.sura.certificate.Tareas.Casos.casetask.CaseModel;
import co.konecta.sura.certificate.Tareas.Casos.login.LoginTask;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class CasoCompletoTask implements Task {
    private static final String NOMBRE_SOLICITANTE = "NombreSol";
    private static final String TELEFONO1 = "Telefono1";
    private static final String PLACA = "Placa";
    private static final String DIRECCION_SERVICIO = "DireccionServicio";
    private static final String UBICACION_SERVICIO = "UbicacionServicio";
    private static final String DETALLE_SERVICIO = "DetalleDireccion";
    private static final String DEPARTAMENTO = "Departamento";
    private static final String MUNICIPIO = "Municicpio";
    private static final String GESTOR_CORDINADOR = "GestorCordi";
    private static final String LINEA = "Linea";
    private static final String SERVICIO = "Servicio";

    private final List<Map<String, String>> informacion;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacion.get(0).get(NOMBRE_SOLICITANTE)).into(CasePage.INPUT_APPLICANT_NAME),
                Enter.theValue(informacion.get(0).get(TELEFONO1)).into(CasePage.INPUT_PHONE1),
                //Enter.theValue(datacase.getLicensePlate()).into(CreateCasePage.INPUT_NUMBERCASE),
                Click.on(CasePage.INPUT_DEPARTMENT),
                Click.on(CasePage.INPUT_DEPARTMENT_FILTER),
                Enter.theValue(informacion.get(0).get(DEPARTAMENTO)).into(CasePage.INPUT_DEPARTMENT_FILTER).thenHit(Keys.ENTER),
                Enter.theValue(informacion.get(0).get(PLACA)).into(CasePage.INPUT_LICENSE_PLATE),
                Enter.theValue(informacion.get(0).get(DIRECCION_SERVICIO)).into(CasePage.INPUT_SERVICE_ADDRESS),
                Enter.theValue(informacion.get(0).get(UBICACION_SERVICIO)).into(CasePage.INPUT_SERVICE_LOCATION),
                Enter.theValue(informacion.get(0).get(DETALLE_SERVICIO)).into(CasePage.INPUT_ADDRESS_DETAIL),
                Click.on(CasePage.INPUT_CLICK_CASE),
                Click.on(CasePage.INPUT_CLICK_CASE_FILTER),
                Enter.theValue(informacion.get(0).get(GESTOR_CORDINADOR)).into(CasePage.INPUT_CLICK_CASE_FILTER).thenHit(Keys.ENTER),
                Click.on(CasePage.INPUT_LINE),
                Click.on(CasePage.INPUT_LINE_FILTER),
                Enter.theValue(informacion.get(0).get(LINEA)).into(CasePage.INPUT_LINE_FILTER).thenHit(Keys.ENTER),
                Click.on(CasePage.INPUT_SERVICE),
                Click.on(CasePage.INPUT_SERVICE_FILTER),
                Enter.theValue(informacion.get(0).get(SERVICIO)).into(CasePage.INPUT_SERVICE_FILTER).thenHit(Keys.ENTER),
                WaitUntil.the(CasePage.INPUT_MUNICIPALITY, isVisible()).forNoMoreThan(3).milliseconds(),
                Click.on(CasePage.INPUT_MUNICIPALITY),
                Click.on(CasePage.INPUT_MUNICIPALITY_FILTER),
                Enter.theValue(informacion.get(0).get(MUNICIPIO)).into(CasePage.INPUT_MUNICIPALITY_FILTER).thenHit(Keys.ENTER),
                Click.on(CasePage.BUTTON_SAVE_CASE)

        );

    }

    public static CasoCompletoTask EscribirDatos(List<Map<String, String>> informacion) {
        return instrumented(CasoCompletoTask.class, informacion);
    }
}
