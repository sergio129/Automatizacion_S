package co.konecta.sura.certificate.Interfaces.Roles;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListarRolesPage {
    public static final Target BOTON_CREAR_ROL = Target.the("Boton para crear roles").located(By.id("btnAddListRoles"));
    public static final Target CAMPO_NOMBRE_ROL = Target.the("Escribimos el nombre del Rol").located(By.id("inputCreateNameRolListRoles"));
    public static final Target CAMPO_HABILIDADES_ROL = Target.the("Escribimos habilidades del Rol").located(By.id("inputCreateAbilitiesListRoles"));
    public static final Target CAMPO_EASY_CASE_ROL = Target.the("Selecionamos el campo easy case rol").located(By.id("selectRolEasyCaseListRoles"));
    public static final Target BUSCAR_EASY_CASE_ROL = Target.the("buscamos el easy case rol").located(By.id("inputRolEasyCaseListRoles"));
    public static final Target BOTON_GUARDAR_ROL = Target.the("boton guardar rol").located(By.id("btnSaveFormListRoles"));

    public static final Target BOTON_ASOCIAR_MENU_ROL = Target.the("boton asociar menu rol").located(By.id("btnAssociateMenuToRoleListRoles"));
    public static final Target BOTON_ASOCIAR_USUARIOS_ROL = Target.the("boton asociar usuario rol").located(By.id("btnAssociateUsersToRoleListRoles"));
    public static final Target BOTON_EDITAR_ROL = Target.the("Boton Editar rol").located(By.id("btnEditListRoles"));
    public static final Target BOTON_ELIMINAR_ROL = Target.the("Boton Eliminar rol").located(By.id("btnDeletedListRoles"));
    public static final Target OPCION_SI_ELIMINAR_ROL = Target.the("Opcion Si Eliminar rol").located(By.id("sweetalertConfirmButton"));
    public static final Target BUSCAR_ROL_INICIO = Target.the("Buscar rol por nombre/Habilidad inicio ").located(By.id("inputSearchListRoles"));

    public static final Target CAMPO_ASIGNAR_USUARIO = Target.the("Campo asignar rol").located(By.id("selectAssignedUsersToRolListRoles"));
    public static final Target BUSCAR_ASIGNAR_USUARIO = Target.the("buscar Asociar usuario lista rol").located(By.id("inputAssignedUsersToRolListRoles"));

    public static final Target BOTON_GUARDAR_ASOCIAR_USUARIO = Target.the("Boton guardar lista rol").located(By.id("btnSaveFormAssignedUsersToRolListRoles"));
    public static final Target PERMISOS_LISTAS_ADMINISTRAR_TAREAS = Target.the("Campos Permisos Administrar Tareas").located(By.id("AssociateMenuOptionsListRoles0"));
    public static final Target SELECCIONAR_ADMINISTRAR_TAREAS = Target.the("Selecionamos un elemento de la lista").located(By.cssSelector("[class='mat-option mat-option-multiple ng-star-inserted']"));
    public static final Target PERMISOS_LISTAS_CAMPO_BUSCAR = Target.the("Campos Buscar Casos").located(By.id("AssociateMenuOptionsListRoles1"));
    public static final Target SELECCIONAR_CASOS_BUSCAR = Target.the("Selecionamos elemento de lista de casos").locatedBy("/html/body/div[4]/div[4]/div/div/div/mat-option[5]/span");


    public static final Target PERMISOS_LISTAS_USUARIOS_REGISTRADOS = Target.the("Campos Permisos usuarios registrados").located(By.id("AssociateMenuOptionsListRoles2"));
    public static final Target SELECCIONAR_USUARIOS_REGISTRADOS = Target.the("Selecionamos elemento de lista usuarios registrados").locatedBy("/html/body/div[4]/div[4]/div/div/div/mat-option/span");

    public static final Target PERMISOS_LISTAS_CONTADOR_CASOS = Target.the("Campos Permisos contador de casos").located(By.id("AssociateMenuOptionsListRoles3"));
    public static final Target SELECCIONAR_CONTADOR_CASOS = Target.the("Selecionamos elemento de lista contador de casos").locatedBy("/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span");
    public static final Target GUARDAR_ASOCIAR_MENU_ROL = Target.the("Boton guardar asociacion de casos").located(By.id("btnSaveAssociateMenuOptionsListRoles"));
    public static final Target OPCION_SI_GUARDAR_ASOCIAR_MENU_ROL = Target.the("Boton guardar asociacion de casos").located(By.id("sweetalertConfirmButton"));


























}
