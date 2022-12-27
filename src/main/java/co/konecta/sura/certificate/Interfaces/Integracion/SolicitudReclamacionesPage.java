package co.konecta.sura.certificate.Interfaces.Integracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SolicitudReclamacionesPage {

    public static final Target OPCION_SOLICITUDES_DE_RECLAMACION = Target.the("OPCION DE SOLICITUDES DE RECLAMACION").located(By.id("moClaimRequests"));
    public static final Target CAMPO_PLACA = Target.the("CAMPO PLACA").located(By.cssSelector("[formcontrolname='plate']"));

}
