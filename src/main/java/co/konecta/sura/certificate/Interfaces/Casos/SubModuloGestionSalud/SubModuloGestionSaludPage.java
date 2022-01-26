package co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubModuloGestionSaludPage {
    public static final Target EXPANSION_MODULO_GESTION_SALUD = Target.the("Campo para la expansion del modulo gestion salud").located(By.id("healthManagementTitle"));
    public static final Target BOTON_CREAR_EMERGENCIA_SALUD = Target.the("boton para la creacion de registro emergencia salud").located(By.id("addButton"));
    public static final Target CAMPO_CANAL_INGRESO = Target.the("Campo Canal de ingreso Emergencia Salud").located(By.id("entryChannel"));
    public static final Target BUSCAR_CANAL_INGRESO = Target.the("Buscamos canal ingreso Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target CAMPO_TIPO_DOCUMENTO = Target.the("Campo tipo documento Emergencia Salud").located(By.id("documentType"));
    public static final Target BUSCAR_TIPO_DOCUMENTO = Target.the("buscamos tipo documento Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target NUMERO_DOCUMENTO = Target.the("Escribimos el numero de documento Emergencia Salud").located(By.id("documentNumber"));
    public static final Target CAMPO_TIENE_EMERGENCIA = Target.the("Campos tiene emergencia Emergencia Salud").located(By.id("haveYouAnEmergency"));
    public static final Target BUSCAR_TIENE_EMERGENCIA = Target.the("buscamos tiene emergencia Emergencia Salud").locatedBy("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']");
    //Campos de tiene emergencia SI
    public static final Target CAMPO_TIPO_EMERGENCIA = Target.the("Campos tipo emergencia Emergencia Salud").located(By.id("emergencyType"));
    public static final Target BUSCAR_TIPO_EMERGENCIA = Target.the("buscamos tipo emergencia Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target CAMPO_SERVICIO_PRESTADO = Target.the("Campo Servicio prestado Emergencia Salud").located(By.id("providedService"));
    public static final Target BUSCAR_SERVICIO_PRESTADO = Target.the("buscamos servicio prestado Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target NOMBRE_ACOMPAÑANTE = Target.the("Escribimos nombre de acompañante Emergencia Salud").located(By.id("companionName"));
    public static final Target CAMPO_PARENTESCO = Target.the("Campo parentesco Emergencia Salud").located(By.id("relationship"));
    public static final Target BUSCAR_PARENTESCO = Target.the("buscamos parentesco Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target TELEFONO_ACOMPAÑANTE = Target.the("Escribimos telefono de acompañante Emergencia Salud").located(By.id("companionTelephone"));
    public static final Target CAMPO_PRESTADOR_SERVICIO = Target.the("Campo parentesco Emergencia Salud").located(By.id("serviceProvider"));
    public static final Target BUSCAR_PRESTADOR_SERVICIO = Target.the("buscamos parentesco Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target OBSERVACIONES = Target.the("Escribimos observaciones Emergencia Salud").located(By.id("observation"));
    public static final Target BOTON_GUARDAR_EMERGENCIA_SALUD = Target.the("Boton guardar Emergencia Salud").located(By.id("saveButton"));
    //Campos Tiene Emergencia NO
    public static final Target DIFICULTAD_ATENCION_SALUD = Target.the("Campo dificulta atencion salud Emergencia Salud").located(By.id("difficultyInHealthCare"));
    public static final Target BUSCAR_DIFICULTAD_ATENCION_SALUD = Target.the("buscamos dificulta atencion salud Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
    public static final Target TIPO_DIFICULTAD_ATENCION_SALUD = Target.the("Campo tipo dificulta atencion salud Emergencia Salud").located(By.id("typeOfDifficultyInHealthCare"));
    public static final Target BUSCAR_TIPO_DIFICULTAD_ATENCION_SALUD = Target.the("buscamos tipo dificulta atencion salud Emergencia Salud").located(By.cssSelector("[class='mat-select-search-input mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));


}
