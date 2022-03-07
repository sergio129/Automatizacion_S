package co.konecta.sura.certificate.Tareas.Integracion;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.cases.CasePage.*;
import static co.konecta.sura.certificate.Interfaces.Integracion.GestionPage.*;

@AllArgsConstructor
public class GestionTask implements Task {
    public String FCita;
    public String Hora;
    public String Nomb;
    public String Tlf;
    public String DpSl;
    public String MpSl;
    public String Placa;
    public String DServ;
    public String UbServ;
    public String DllDirecc;
    public String ServEsp;
    public String GCord;
    public String linea;
    public String Servicio;

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.has(Click.on(BOTON_EDITAR_EXPEDIENTE));
        actor.has(Open.url("https://easylabs.grupokonecta.local:5443/frontend/cases/create?tabIntegration=1"));
        Thread.sleep(5000);
        actor.has(
                Click.on(FECHA_CITA),
                Click.on(SELECCIONAR_FECHA_CITA.of(String.valueOf(FCita))),
                Click.on(CAMPO_HORA),
                Click.on(SELECCIONAR_HORA.of(String.valueOf(Hora))),
                Click.on(OK_HORA));
        if (INPUT_APPLICANT_NAME.resolveFor(actor).isEnabled()) {
            actor.has(Enter.theValue(Nomb).into(INPUT_APPLICANT_NAME));
        }
        if (INPUT_PHONE1.resolveFor(actor).isEnabled()) {
            actor.has(Enter.theValue(Tlf).into(INPUT_PHONE1));
        }
        if (CAMPO_DEPARTAMENTO_SOLICITA.resolveFor(actor).isVisible()) {
            actor.has(Click.on(INPUT_DEPARTMENT),
                    Enter.theValue(DpSl).into(INPUT_DEPARTMENT_FILTER).thenHit(Keys.ENTER));
        }
        if (CAMPO_MUNICIPIO_SOLICITA.resolveFor(actor).isVisible()) {
            actor.has(
                    Click.on(INPUT_MUNICIPALITY),
                    Enter.theValue(MpSl).into(INPUT_MUNICIPALITY_FILTER).thenHit(Keys.ENTER));
        }
        if (INPUT_LICENSE_PLATE.resolveFor(actor).isEnabled()) {
            actor.has(Enter.theValue(Placa).into(INPUT_LICENSE_PLATE));
        }
        if (INPUT_SERVICE_ADDRESS.resolveFor(actor).isEnabled()) {
            actor.has(Enter.theValue(DServ).into(INPUT_SERVICE_ADDRESS));
        }
        if (INPUT_SERVICE_LOCATION.resolveFor(actor).isEnabled()) {
            actor.has(Enter.theValue(UbServ).into(INPUT_SERVICE_LOCATION));
        }
        if (INPUT_ADDRESS_DETAIL.resolveFor(actor).isEnabled()) {
            actor.has(Enter.theValue(DllDirecc).into(INPUT_ADDRESS_DETAIL));
        }
        if (CAMPO_SERVICIO_ESPECIAL.resolveFor(actor).isEnabled()) {
            actor.has(Click.on(CAMPO_SERVICIO_ESPECIAL),
                    Click.on(SELECCIONAR_SERVICIO_ESPECIAL.of(String.valueOf(ServEsp))));
        }
        if (INPUT_CLICK_CASE.resolveFor(actor).isEnabled()) {
            actor.has(Click.on(INPUT_CLICK_CASE),
                    Enter.theValue(GCord).into(INPUT_CLICK_CASE_FILTER).thenHit(Keys.ENTER));
        }
        if (CAMPO_LINEA.resolveFor(actor).isVisible()) {
            actor.has(Click.on(INPUT_LINE), Enter.theValue(linea).into(INPUT_LINE_FILTER).thenHit(Keys.ENTER));
        }
        if (CAMPO_SERVICIO.resolveFor(actor).isVisible()) {
            actor.has(Click.on(INPUT_SERVICE), Enter.theValue(Servicio).into(INPUT_SERVICE_FILTER).thenHit(Keys.ENTER));
        }
        actor.has(Click.on(BUTTON_SAVE_CASE));

    }

    public static GestionTask EscribirDatosGestion(String FCita, String Hora, String Nomb, String Tlf, String DpSl, String MpSl, String Placa, String DServ, String UbServ, String DllDirecc, String ServEsp, String GCord, String linea, String Servicio) {
        return new GestionTask(FCita, Hora, Nomb, Tlf, DpSl, MpSl, Placa, DServ, UbServ, DllDirecc, ServEsp, GCord, linea, Servicio);
    }
}
