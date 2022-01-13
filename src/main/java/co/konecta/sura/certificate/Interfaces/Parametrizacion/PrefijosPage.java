package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrefijosPage {
    public static final Target BOTON_CREAR_PREFIJOS = Target.the("selecionamos el boton crear prefijos parametrizacion").located(By.id("btnAddPrefixParameterization"));
    public static final Target SELECCION_CAMPO_LINEA = Target.the("selecionamos el campo linea").located(By.id("mat-select-value-7"));
    public static final Target BUSCAMOS_LINEA = Target.the("Buscamos la linea").located(By.id("inputCreateLinePrefixParameterization"));
    public static final Target SELECIONAMOS_LINEA = Target.the("Damos click en la linea encontrada").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");
    public static final Target SELECCION_CAMPO_SERVICIO = Target.the("Buscamos la linea").located(By.id("mat-select-value-9"));
    public static final Target BUSCAMOS_SERVICIO = Target.the("Buscamos el servicio").located(By.id("inputCreateServicePrefixParameterization"));
    public static final Target SELECCIONAR_SERVICIO = Target.the("selecionamos el servicio").locatedBy("/html/body/div[3]/div[4]/div/div/div/mat-option[2]");

    public static final Target SELECCION_CAMPO_PREFIJOS = Target.the("Selecionamos el campo prefijos").located(By.id("inputCreatePrefixesParameterization"));
    public static final Target BOTON_GUARDAR_PREFIJOS = Target.the("selecionamos el boton guardar prefijos parametrizacion").located(By.id("btnSaveFormPrefixParameterization"));



    public static final Target SELECCION_CAMPO_LINEA_INICIO = Target.the("selecionamos el campo linea al inicio").located(By.id("mat-select-value-1"));
    public static final Target BUSCAMOS_LINEA_INICIO= Target.the("Buscamos la linea al inicio").located(By.id("inputLinePrefixParameterization"));
    public static final Target SELECIONAMOS_LINEA_INICIO = Target.the("Damos click en la linea encontrada al inicio").locatedBy("/html/body/div[3]/div[2]/div/div/div/mat-option[2]");
    public static final Target SELECCION_CAMPO_SERVICIO_INICIO = Target.the("Buscamos la linea al inicio").located(By.id("mat-select-value-3"));
    public static final Target BUSCAMOS_SERVICIO_INICIO = Target.the("Buscamos el servicio al inicio").located(By.id("inputServicePrefixParameterization"));
    public static final Target SELECCIONAR_SERVICIO_INICIO = Target.the("selecionamos el servicio").locatedBy("/html/body/div[3]/div[2]/div/div/div/mat-option[2]");

    public static final Target SELECCION_CAMPO_PREFIJOS_INICIO = Target.the("Selecionamos el campo prefijos al inicio").located(By.id("inputPrefixesParameterization"));



    public static final Target BOTON_BUSCAR_PREFIJOS = Target.the("selecionamos el boton buscar prefijos parametrizacion").located(By.id("btnSearchPrefixParameterization"));
    public static final Target BOTON_EDITAR_PREFIJOS = Target.the("selecionamos el boton editar prefijos parametrizacion").located(By.id("btnEditPrefixParameterization"));
    public static final Target BOTON_ELIMINAR_PREFIJOS = Target.the("selecionamos el boton eliminar prefijos parametrizacion").located(By.id("btnDeletedPrefixParameterization"));
    public static final Target OPCION_SI_ELIMINAR_PREFIJOS = Target.the("selecionamos la opcion si para eliminar prefijos parametrizacion").located(By.id("sweetalertConfirmButton"));
















}
