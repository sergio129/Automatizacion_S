package co.konecta.sura.certificate.Tareas.Parametrizacion.Tableros_de_Control;

import co.konecta.sura.certificate.TablerosdeControl.TablerosDeControlFiltrosModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.Interfaces.Casos.cases.CasePage.INPUT_APPLICANT_NAME;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosdeControlPage.*;
import static co.konecta.sura.certificate.Interfaces.Reutilizables.InterfacesReutilizablesPage.*;

public class TableroControlFiltrosTask implements Task {
    private final TablerosDeControlFiltrosModel filtros;

    public TableroControlFiltrosTask(TablerosDeControlFiltrosModel filtros) {
        this.filtros = filtros;
    }

    @Override
    public <T extends Actor> void performAs(T konecta) {
        konecta.attemptsTo(Click.on(EXPANDIR_FILTROS_PARA_APLICAR),
                Click.on(CAMPO_LINEA), Click.on(SELECCIONAR_DATO.of(String.valueOf(filtros.getLinea()))),
                Hit.the(Keys.ESCAPE).into(CAMPO_LINEA),
                Click.on(CAMPO_USUARIO_ASIGNADO),
                Enter.theValue(filtros.getUsuario_asignado()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(CAMPO_RESPONSABLE),
                Enter.theValue(filtros.getResponsable()).into(BUSCAR_RESPONSABLE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));

        if (CAMPO_ESTADO_EXPEDIENTE.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_ESTADO_EXPEDIENTE), Enter.theValue(filtros.getEstado_expediente()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
        if (CAMPO_ESTADO_SERVICIO.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_ESTADO_SERVICIO), Enter.theValue(filtros.getEstado_servicio()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
        if (CAMPO_DEPARTAMENTO_SOLICITA.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_DEPARTAMENTO_SOLICITA), Enter.theValue(filtros.getDepartamento()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
        if (CAMPO_SERVICIO.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_SERVICIO), Enter.theValue(filtros.getServicio()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
        if (CAMPO_SERVICIOS_ESPECIALES.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_SERVICIOS_ESPECIALES), Enter.theValue(filtros.getServicio_especial()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }

        if (CAMPO_GESTION_COORDINACION.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_GESTION_COORDINACION), Click.on(SELECCIONAR_DATO.of(String.valueOf(filtros.getGestion_coordinacion()))), Hit.the(Keys.ESCAPE).into(CAMPO_GESTION_COORDINACION));
        }
        if (CAMPO_ESTADO_DE_TAREAS.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_ESTADO_DE_TAREAS), Click.on(SELECCIONAR_DATO.of(String.valueOf(filtros.getEstado_tareas()))), Hit.the(Keys.ESCAPE).into(CAMPO_ESTADO_DE_TAREAS));
        }
        if (CAMPO_PROVEEDOR.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_PROVEEDOR), Enter.theValue(filtros.getProveedor()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }
        if (CAMPO_TIPO_DE_MONITOREO.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_TIPO_DE_MONITOREO), Enter.theValue(filtros.getTipo_monitoreo()).into(BUSCAR_DATO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE));
        }

        if (CAMPO_TIPO_SERVICIO.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_TIPO_SERVICIO), Click.on(SELECCIONAR_DATO.of(String.valueOf(filtros.getTipo_servicio()))), Hit.the(Keys.ESCAPE).into(CAMPO_TIPO_SERVICIO));
        }
        if (CAMPO_ESTADO_CIERRE.resolveFor(konecta).isVisible()) {
            konecta.has(Click.on(CAMPO_ESTADO_CIERRE), Click.on(SELECCIONAR_DATO.of(String.valueOf(filtros.getEstado_cierre()))), Hit.the(Keys.ESCAPE).into(CAMPO_ESTADO_CIERRE));
        }

    }

    public static TableroControlFiltrosTask EscribirDatosFiltros(TablerosDeControlFiltrosModel filtros) {
        return new TableroControlFiltrosTask(filtros);

    }
}
