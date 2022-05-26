package co.konecta.sura.certificate.Interfaces.Integracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TableroControlOfertamientoPage {
    public static final Target SUBMODULO_TABLERO_CONTROL_OFERTAMIENTO = Target.the("SUBMODULO DE TABLERO CONTROL REOFERTMAIENTO").located(By.id("moOfferControl"));
    public static final Target CAMPO_BUSCAR_OFERTAMIENTO = Target.the("CAMPOS PARA BUSCAR OFERTAMIENTO").located(By.id("inputCaseOfferControl"));
    public static final Target BOTON_BUSCAR_OFERTAMIENTO = Target.the("BOTON PARA BUSCAR OFERTAMIENTO").located(By.id("btnSearchOfferControl"));
    public static final Target BOTON_REOFERTAR = Target.the("BOTON GESTIONAR EL REOFERTAMIENTO").located(By.cssSelector("[mattooltip='Gestión']"));
    public static final Target BOTON_OK = Target.the("BOTON OK PARA REALIZAR EL SIGUIENTE OFERTAMIENTO").located(By.id("sweetalertConfirmButton"));
    public static final Target LISTA_DE_OFERTAMIENTOS = Target.the("SE MUESTRA EL LISTADO DE TODOS LOS OFERTAMIENTO DISPONIBLES").locatedBy("//mat-table/mat-header-row/mat-header-cell[contains(text(),'{0}')]");



}
