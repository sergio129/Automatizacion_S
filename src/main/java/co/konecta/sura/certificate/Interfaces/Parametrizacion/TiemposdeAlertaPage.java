package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TiemposdeAlertaPage {

    public static final Target INPUT_LINE_ALERT_TIME = Target.the("This the input alert time parameterization").located(By.id("selectCreateServiceLineTimeAlert"));
    public static final Target INPUT_SERVICE_ALERT_TIME = Target.the("This the input service alert time parameterization").located(By.id("selectCreateServiceTimeAlert"));
    public static final Target INPUT_SEARCH_SERVICE_ALERT_TIME = Target.the("This the input search service alert time parameterization").located(By.id("inputCreateSelectServiceTimeAlertSearch"));
    public static final Target INPUT_TIME = Target.the("This the input time parameterization").located(By.id("inputCreateWeatherTimeAlert"));
    public static final Target BUTTON_CREATE_ALERT_TIME = Target.the("This the button create alert time parameterization").located(By.id("btnCreateTimeAlert"));
    public static final Target BUTTON_EDIT_ALERT_TIME = Target.the("This the button edit alert time parameterization").located(By.id("btnEditTimeAlert"));
    public static final Target BUTTON_DELETE_ALERT_TIME = Target.the("This the button delete alert time parameterization").located(By.id("btnDeletedTimeAlert"));
    public static final Target BUTTON_SAVE_ALERT_TIME = Target.the("This the button save alert time parameterization").located(By.id("btnSaveFormTimeAlert"));
    public static final Target BUTTON_CANCEL_ALERT_TIME = Target.the("This the button cancel alert time parameterization").located(By.id(""));
    public static final Target OPTION_YES_ALERT_TIME = Target.the("This the button yes alert time parameterization").locatedBy("/html/body/div[5]/div/div[3]/button[1]");
    public static final Target OPTION_LINE = Target.the("This the button option line parameterization").located(By.id("inputCreateServiceLineTimeAlertSearch"));

    public static final Target SELECCIONAR_CAMPO = Target.the("SELECCIONAMOS UN CAMPO PASADO POR PARAMETRO").locatedBy("//div//span[contains(text(),'{0}')]");




}
