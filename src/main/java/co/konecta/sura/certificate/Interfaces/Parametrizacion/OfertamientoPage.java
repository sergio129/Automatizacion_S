package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OfertamientoPage {
    public static final Target OPCION_OFERTAMIENTO = Target.the("OPCION OFERTAMIENTO").located(By.id("moOfferChattigoParametrization"));
    public static final Target BOTON_CREACION_DE_OFERTAMIENTO = Target.the("BOTON PARA LA CREACION DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("btnAddOfferChanttigoParametrization"));
    public static final Target CAMPO_NOMBRE_DE_OFERTAMIENTO = Target.the("CAMPO NOMBRE DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("createInputNameOfferChanttigoParametrization"));
    public static final Target CAMPO_COORDINACION_DE_OFERTAMIENTO = Target.the("CAMPO COORDINACION DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectCoordinationManagerOfferChanttigoParametrization"));
    public static final Target SELECCIONAR_COORDINACION_DE_OFERTAMIENTO = Target.the("SELECCIONAR OPCION DE COORDINACION DE PARAMETRIZACION DE OFERTAMIENTO").locatedBy("//*[@id='listCoordinationManagerOfferChanttigoParametrization']/span[contains(text(),'{0}')]");
    public static final Target CAMPO_TIPO_OFERTAMIENTO = Target.the("CAMPO TIPO PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectOfferTypeOfferChanttigoParametrization"));
    public static final Target BUSCAR_TIPO_OFERTAMIENTO = Target.the("BUSCAR OFERTAMIENTO PARAMETRIZACION DE OFERTAMIENTO").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target CAMPO_TIEMPO_OFERTAMIENTO = Target.the("CAMPO TIEMPO DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("createInputTimeOfferChanttigoParametrization"));
    public static final Target CAMPO_LINEA_OFERTAMIENTO = Target.the("CAMPO LINEA DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectLineOfferChanttigoParametrization"));
    public static final Target BUSCAR_LINEA_OFERTAMIENTO = Target.the("BUSCAR LINEA DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("inputCreateLineOfferChanttigoParametrization"));
    public static final Target SELECCIONAR_LINEA_OFERTAMIENTO = Target.the("SELECCIONAMOS LA LINEA DE PARAMETRIZACION DE OFERTAMIENTO").locatedBy("//mat-option/span[contains(text(),' {0} ')]");
    public static final Target CAMPO_SERVICIO_OFERTAMIENTO = Target.the("CAMPO SERVICIO PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectServiceOfferChanttigoParametrization"));
    public static final Target BUSCAR_SERVICIO_OFERTAMIENTO = Target.the("BUSCAR SERVICIO DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("inputCreateServiceOfferChanttigoParametrization"));
    public static final Target CAMPO_DEPARTAMENTO_OFERTAMIENTO = Target.the("CAMPO DEPARTAMENTO PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectDepartamentOfferChanttigoParametrization"));
    public static final Target BUSCAR_DEPARTAMENTO_OFERTAMIENTO = Target.the("BUSCAR DEPARTAMENTO DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("inputCreateDepartamentOfferChanttigoParametrization"));
    public static final Target SELECCIONAR_DEPARTAMENTO_OFERTAMIENTO = Target.the("SELECCIONAMOS EL DEPARTAMENTO DE PARAMETRIZACION DE OFERTAMIENTO").locatedBy("//mat-option/span[contains(text(),' {0} ')]");
    public static final Target CAMPO_MUNICIPIO_OFERTAMIENTO = Target.the("CAMPO DEPARTAMENTO PARAMETRIZACION DE OFERTAMIENTO").located(By.id("selectMunicipalitiesOfferChanttigoParametrization"));
    public static final Target BUSCAR_MUNICIPIO_OFERTAMIENTO = Target.the("BUSCAR DEPARTAMENTO DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("inputCreateMunicipalitiesOfferChanttigoParametrization"));
    public static final Target BOTON_GUARDAR_OFERTAMIENTO = Target.the("BOTON PARA GUARDAR DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("btnSaveOfferChanttigoParametrization"));
    public static final Target BOTON_VISUALIZAR_OFERTAMIENTO = Target.the("BOTON PARA VISUALIZAR DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("btnVisibilityOfferChanttigoParametrization"));
    public static final Target BOTON_EDITAR_OFERTAMIENTO = Target.the("BOTON PARA EDITAR DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("btnEditOfferChanttigoParametrization"));
    public static final Target CAMPO_BUSCAR_OFERTAMIENTO = Target.the("BUSCAR DE PARAMETRIZACION DE OFERTAMIENTO").located(By.id("inputNameOfferChanttigoParametrization"));
    public static final Target BOTON_ACTIVAR_OFERTAMIENTO = Target.the("BOTON ACTIVAR/DESACTIVAR PARAMETRIZACION DE OFERTAMIENTO").located(By.id("btnStatusOfferChanttigoParametrization0"));


}
