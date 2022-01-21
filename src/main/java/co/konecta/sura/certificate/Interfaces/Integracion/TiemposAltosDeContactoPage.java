package co.konecta.sura.certificate.Interfaces.Integracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TiemposAltosDeContactoPage {

    public static final Target INPUT_LINE_INTEGRATION = Target.the("This the input line").located(By.id("selectLineHighTime"));
    public static final Target INPUT_SEARCH_LINE = Target.the("This the input search line").located(By.id("inputLineHighTimeSearch"));
    public static final Target SELECCION_CAMPO_SERVICIO = Target.the("selecionamos el campo servicio").located(By.id("selectServiceHighTime"));
    public static final Target BUSCAR_SERVICIO = Target.the("Buscamos el servicio").located(By.id("inputServiceHighTimeSearch"));
    public static final Target SELECCION_CAMPO_MUNICIPIO = Target.the("selecionamos el campo municipio").located(By.id("selectMunicipalityHighTime"));
    public static final Target BUSCAR_MUNICIPIO = Target.the("Buscamos el municipio").located(By.id("inputMunicipalityHighTimeSearch"));
    public static final Target SELECCION_CAMPO_FAMILIA = Target.the("selecionamos el campo familia").located(By.id("selectFamilyHighTime"));
    public static final Target BUSCAR_FAMILIA = Target.the("Buscamos la familia").located(By.id("inputFamilyHighTimeSearch"));
    public static final Target BUTTON_SEARCH_INTEGRATION = Target.the("This the button search integration").located(By.id("btnSearchHighTime"));
    public static final Target BUTTON_ACTIONS_INTEGRATION = Target.the("This the button actions integration").located(By.id("btnDoneHighTime"));
    public static final Target INPUT_MANAGEMENT_INTEGRATION = Target.the("This the input MANAGEMENT Integration").located(By.id("management"));
    public static final Target INPUT_SEARCH_MANAGEMENT_INTEGRATION = Target.the("Buscar gestion tiempos altos de contacto").located(By.cssSelector("[ng-reflect-placeholder='Buscar gestión']"));
    public static final Target BUTTON_SAVE_INTEGRATION = Target.the("This the button save Integration").located(By.id("saveButton"));










}
