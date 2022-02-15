package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CierreDeExpedientePage {

    public static final Target BOTON_CREAR_CIERRE_EXPEDIENTE = Target.the("BOTON PARA CREAR PARAMETRIZACION CIERRE DE EXPEDIENTE").located(By.id("btnAddClosingFile"));
    public static final Target CAMPO_LINEA = Target.the("CAMPO LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectCreateLineClosingFile"));
    public static final Target BUSCAR_LINEA = Target.the("BUSCAMOS LA LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputCreateLineClosingFile"));
    public static final Target SELECCIONAR_LINEA = Target.the("SELECCIONAMOS  LA LINEA DE PARAMETRIZACION CIERRE EXPEDIENTE").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");

    public static final Target CAMPO_SERVICIO = Target.the("CAMPO SERVICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("selectCreateServiceClosingFile"));
    public static final Target BUSCAR_SERVICIO = Target.the("BUSCAMOS EL SERVICIO DE PARAMETRIZACION CIERRE EXPEDIENTE").located(By.id("inputCreateServiceClosingFile"));





}
