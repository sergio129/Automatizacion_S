package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TablerosDeControlUCKPage {
    public static final Target FECHA_TABLERO_CONTROL_UCK = Target.the("FECHA TABLERO DE CONTROL LUCK").located(By.cssSelector("[fill='currentColor']"));
    public static final Target SELECCIONAR_FECHA_UCK = Target.the("SELECCIONAR FECHA TABLERO DE CONTROL UCK").locatedBy("//*[@aria-label='{0}']");
    public static final Target BOTON_BUSCAR_UCK = Target.the("BOTON PARA BUSCAR TABLERO DE CONTROL UCK").located(By.id("btnSearchBoardsUck"));
    public static final Target BOTON_EDITAR_UCK = Target.the("BOTON PARA EDITAR TABLERO DE CONTROL UCK").located(By.id("btnEditBoardsUck"));
    public static final Target CAMPO_MOTIVO_UCK = Target.the("CAMPO MOTIVO TABLERO DE CONTROL UCK").located(By.id("selectCallReasonBoardsUck"));
    public static final Target SELECCIONAR_REGISTRO_UCK = Target.the("SELECCIONAR REGISTRO TABLERO DE CONTROL UCK").locatedBy("//mat-option/span[contains(text(),'{0}')]");
    public static final Target CAMPO_ASEGURADO_UCK = Target.the("CAMPO ASEGURADO TABLERO DE CONTROL UCK").located(By.id("selectSecuredContexBoardsUck"));
    public static final Target ESCAPE_UCK = Target.the("CAMPO HABILITAR TABLERO DE CONTROL UCK").located(By.id("listSecuredContexBoardsUck"));

    public static final Target CAMPO_HABILITAR_UCK = Target.the("CAMPO HABILITAR TABLERO DE CONTROL UCK").located(By.id("selectEnableBoardsUck"));
    public static final Target CAMPO_OBSERVACIONES_UCK = Target.the("CAMPO OBSERVACIONES TABLERO DE CONTROL UCK").located(By.id("textareaObservationBoardsUck"));
    public static final Target BOTON_GUARDAR_UCK = Target.the("BOTON PARA GUARDAR TABLERO DE CONTROL UCK").located(By.id("btnSaveFormBoardsUck"));

}
