package co.konecta.sura.certificate.Interfaces.Integracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SolicitudReclamacionesPage {

    public static final Target OPCION_SOLICITUDES_DE_RECLAMACION = Target.the("OPCION DE SOLICITUDES DE RECLAMACION").located(By.id("moClaimRequests"));
    public static final Target CAMPO_PLACA = Target.the("CAMPO PLACA").located(By.cssSelector("[formcontrolname='plate']"));
    public static final Target BOTON_GESTIONAR = Target.the("BOTON GESTIONAR").located(By.cssSelector("[mattooltip='Gestionar']"));
    public static final Target BOTON_EDITAR = Target.the("BOTON EDITAR").located(By.cssSelector("[mattooltip='Editar']"));
    public static final Target CAMPO_TIPO_GESTION = Target.the("CAMPO TIPO DE GESTION").located(By.cssSelector("[placeholder='Tipo de gestion']"));
    public static final Target CAMPO_PERSONA_GESTION = Target.the("CAMPO PERSONA DE GESTION").located(By.cssSelector("[placeholder='Persona de gestion']"));
    public static final Target CAMPO_OBSERVACIONES = Target.the("CAMPO OBSERVACIONES").located(By.cssSelector("[placeholder='Persona de gestion']"));
    public static final Target BOTON_AGREGAR_GESTION = Target.the("BOTON AGREGAR GESTION").located(By.id("btnAggestion"));
    public static final Target CAMPO_ESTADO = Target.the("CAMPO ESTADO").located(By.cssSelector("[placeholder='Estado']"));
    public static final Target CAMPO_FECHA_REPROGRAMACION = Target.the("CAMPO FECHA REPROGRAMACION").located(By.id("btnReprogrammingDate"));
    public static final Target SELECIONAR_FECHA = Target.the("CAMPO FECAH REPROGRAMACION").locatedBy("//*[@aria-label='{0}']");
    public static final Target CAMPO_HORA_REPROGRAMACION = Target.the("CAMPO HORA REPROGRAMACION").located(By.id("ReprogrammingTime"));
    public static final Target SELECCIONAR_HORA_REPROGRAMACION = Target.the("SELECCIONAR HORA REPROGRAMACION").locatedBy("//div[4]//div[1]/div[1]/span[contains(text(),'{0}')]");

}
