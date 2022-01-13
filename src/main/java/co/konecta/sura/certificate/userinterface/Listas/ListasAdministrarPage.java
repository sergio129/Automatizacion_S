package co.konecta.sura.certificate.userinterface.Listas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListasAdministrarPage {
    public static final Target GLOBAL_MENU = Target.the("Selections Menu global").located(By.id("globalMenu"));
    public static final Target BUTTON_LIST = Target.the("Selecionamos modulo de listas").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav[1]/div[1]/app-sidebar/mat-nav-list/mat-list-item[4]/div/a/span[1]");
    public static final Target BUTTON_ADMIN = Target.the("This the input initial tab").located(By.id("moListList"));
    public static final Target SEARCH_LISTS = Target.the("This the input list").locatedBy("/html/body/app-root/app-full-layout/div/mat-sidenav-container/mat-sidenav-content/div/app-list/div/div/mat-card/mat-card-content/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]");
    public static final Target BOTON_CREAR_LISTAS = Target.the("boton para crear lista administrar").located(By.id("createList"));
    public static final Target NOMBRE_LISTAS = Target.the("Escribir nombre de la lista").located(By.id("inputNameList"));
    public static final Target BOTON_AGREGAR_OPCION = Target.the("boton para agregar opciones").locatedBy("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-list/div[1]/div/ng2-smart-table/table/thead/tr[2]/th[3]/a");
    public static final Target NOMBRE_OPCION = Target.the("Se escribe el nombre de la opcion").locatedBy("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-list/div[1]/div/ng2-smart-table/table/thead/tr[3]/td[1]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input");
    public static final Target ID_CASE_OPCION = Target.the("Se escribe el id case de la opcion").locatedBy("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-list/div[1]/div/ng2-smart-table/table/thead/tr[3]/td[2]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input");
    public static final Target CHECK_AGREGAR_OPCION = Target.the("check para agregar la opcion").locatedBy("/html/body/div[3]/div[2]/div/mat-dialog-container/app-add-list/div[1]/div/ng2-smart-table/table/thead/tr[3]/td[3]/ng2-st-actions/a[1]/i");
    public static final Target BOTON_GUARDAR_LISTAS = Target.the("boton para guardar lista administrar").located(By.id("btnCreateList"));


    public static final Target SELECCION_CAMPO_LISTAS_INICIO = Target.the("selecionamos el campo de seleccion de listas ").located(By.id("mat-select-value-1"));
    public static final Target BUSCAR_LISTAS_INICIO = Target.the("Buscamos la lista creada").located(By.id("inputListsSearchFilterSearch"));
    public static final Target BOTON_AGREGAR_OPCION_INICIO = Target.the("Boton para agregar nueva opcion").located(By.id("btnAddListOptions"));
    public static final Target NOMBRE_NUEVA_OPCION_INICIO = Target.the("Escribimos nombre de la nueva opcion").located(By.id("inputAddOptionName"));
    public static final Target IDCASE_OPCION_INICIO = Target.the("Escribimos el id case").located(By.id("inputAddOptionIdEasyCase"));
    public static final Target BOTON_GUARDAR_OPCION_INICIO = Target.the("Boton para guardar  nueva opcion").located(By.id("btnSaveAddOptionForm"));















    //public static final Target SEARCH_LISTS = Target.the("This the input list").located(By.id("inputListsSearchFilterSearch"));
}
