package co.konecta.sura.certificate.userinterface.integration;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HighContactTimesIntegrationPage {

    public static final Target INPUT_LINE_INTEGRATION = Target.the("This the input line").located(By.id("mat-select-value-1"));
    public static final Target INPUT_SEARCH_LINE = Target.the("This the input search line").located(By.id("inputLineHighTimeSearch"));
    public static final Target SELECCION_CAMPO_SERVICIO = Target.the("selecionamos el campo servicio").located(By.id("mat-select-value-3"));
    public static final Target BUSCAR_SERVICIO = Target.the("Buscamos el servicio").locatedBy("/html/body/div[4]/div[2]/div/div/div/ngx-mat-select-search/div/input");
    public static final Target SELECCION_CAMPO_MUNICIPIO = Target.the("selecionamos el campo municipio").located(By.id("mat-select-value-5"));
    public static final Target BUSCAR_MUNICIPIO = Target.the("Buscamos el municipio").located(By.id("cityFilterSearch"));
    public static final Target SELECCION_CAMPO_FAMILIA = Target.the("selecionamos el campo familia").located(By.id("mat-select-value-7"));
    public static final Target BUSCAR_FAMILIA = Target.the("Buscamos la familia").located(By.id("familiesFilterSearch"));
    public static final Target BUTTON_SEARCH_INTEGRATION = Target.the("This the button search integration").located(By.id("btnSearchHighTime"));
    public static final Target BUTTON_ACTIONS_INTEGRATION = Target.the("This the button actions integration").located(By.id("btnDoneHighTime"));
    public static final Target INPUT_MANAGEMENT_INTEGRATION = Target.the("This the input MANAGEMENT Integration").located(By.id("mat-select-value-9"));
    public static final Target INPUT_SEARCH_MANAGEMENT_INTEGRATION = Target.the("This the input search MANAGEMENT Integration").locatedBy("/html/body/div[3]/div[4]/div/div/div/ngx-mat-select-search/div/input");
    public static final Target BUTTON_SAVE_INTEGRATION = Target.the("This the button save Integration").located(By.id("saveButton"));










}
