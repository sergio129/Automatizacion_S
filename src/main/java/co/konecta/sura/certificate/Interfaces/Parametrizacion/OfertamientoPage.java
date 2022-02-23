package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OfertamientoPage {
    public static final Target OPCION_OFERTAMIENTO = Target.the("OPCION OFERTAMIENTO").located(By.id("moOfferChattigoParametrization"));
    public static final Target BOTON_CREACION_DE_OFERTAMIENTO = Target.the("BOTON PARA LA CREACION DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("btnAddOfferChanttigoParametrization"));
    public static final Target CAMPO_NOMBRE_DE_OFERTAMIENTO = Target.the("CAMPO NOMBRE DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("createInputNameOfferChanttigoParametrization"));
    public static final Target CAMPO_COORDINACION_DE_OFERTAMIENTO = Target.the("CAMPO COORDINACION DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectCoordinationManagerOfferChanttigoParametrization"));
    public static final Target SELECCIONAR_COORDINACION_DE_OFERTAMIENTO = Target.the("SELECCIONAR OPCION DE COORDINACION DE PARAMETRIZACION DE OFERTAMIENTO").locatedBy("//*[@id='listCoordinationManagerOfferChanttigoParametrization']/span[contains(text(),'{0}')]");
    public static final Target CAMPO_TIPO_OFERTAMIENTO = Target.the("CAMPO TIPO OFERTAMIENTO PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectOfferTypeOfferChanttigoParametrization"));





}
