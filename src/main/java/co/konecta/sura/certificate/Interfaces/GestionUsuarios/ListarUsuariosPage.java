package co.konecta.sura.certificate.Interfaces.GestionUsuarios;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListarUsuariosPage {
    //CREACION DE USUARIOS
    public static final Target BOTON_CREACION_USUARIO = Target.the("BOTON PARA LA CREACION DE USUARIOS").located(By.id("btnAddListUsers"));
    public static final Target CAMPO_NOMBRE = Target.the("CAMPO PARA ESCRIBIR NOMBRE Y APELLIDO DE USUARIO").located(By.id("inputCreateNameListUsers"));
    public static final Target CAMPO_IDENTIFICACION = Target.the("CAMPO PARA ESCRIBIR IDENTIFICACION DE USUARIO").located(By.id("inputCreateIdentifierListUsers"));
    public static final Target CAMPO_CORREO = Target.the("CAMPO PARA ESCRIBIR CORREO DE USUARIO").located(By.id("inputCreateEmailListUsers"));
    public static final Target CAMPO_ESTADO = Target.the("SELECCIONAR CAMPO ESTADO").located(By.id("selectCreateStatusListUsers"));
    public static final Target SELECCIONAR_ESTADO = Target.the("SELECCIONAMOS EL ESTADO DEL USUARIO").located(By.id("listCreateStatusListUsers"));
    public static final Target CAMPO_ROL = Target.the("SELECCIONAR CAMPO ROL").located(By.id("selectCreateRolListUsers"));
    public static final Target BUSCAR_ROL = Target.the("BUSCAMOS UN ROL").located(By.id("inputCreateRolListUsers"));
    public static final Target CAMPO_ASIGNACION_USUARIO = Target.the("ESCRIBIMOS EL USUARIO ASIGNADO").located(By.id("inputCreateUserAssignmentListUsers"));
    public static final Target CAMPO_URL_EXTERNA = Target.the("SELECCIONAR CAMPO URL EXTERNA").located(By.id("selectCreateExternalUrlAccessListUsers"));
    public static final Target SELECCIONAR_URL_EXTERNA = Target.the("SELECCIONAMOS ACCESO A LA URL EXTERNA").located(By.id("listCreateExternalUrlAccessListUsers"));
    public static final Target BOTON_GUARDAR_USUARIO = Target.the("BOTON PARA GUARDAR  USUARIO").located(By.id("btnSaveFormListUsers"));
    //CONEXION REMOTA
    public static final Target BOTON_VISUALIZAR_USUARIO = Target.the("BOTON PARA VISUALIZAR USUARIO").located(By.id("btnVisibilityListUsers"));
    public static final Target BOTON_CONEXION_REMOTA_USUARIO = Target.the("BOTON PARA HACER UNA CONEXION REMOTA A USUARIO").located(By.id("btnRemoteConnectionListUsers"));

    public static final Target BOTON_EDITAR_USUARIO = Target.the("BOTON PARA EDITAR INFORMACION DEL  USUARIO").located(By.id("btnEditListUsers"));
    public static final Target BOTON_ELIMINAR_USUARIO = Target.the("BOTON PARA ELIMINAR USUARIO").located(By.id("btnDeletedListUsers"));
    public static final Target OPCION_SI_ELIMINAR_USUARIO = Target.the("OPCION SI ELIMINAR USUARIO").located(By.id("sweetalertConfirmButton"));
    public static final Target BOTON_DESLOGUEAR_USUARIO = Target.the("BOTON PARA DESLOGUEAR USUARIO").located(By.id("btnLogOutUserListUsers"));
    public static final Target OPCION_SI_DESLOGUEAR_USUARIO = Target.the("OPCION SI PARA DESLOGUEAR USUARIO").located(By.id("sweetalertConfirmButton"));

    //BUSQUEDA
    //public static final Target CAMPO_NOMBRE_USUARIO_INICIO = Target.the("SELECCIONAR CAMPO NOMBRE USUARIO INICIO").located(By.id("selectNameUserListUsers"));
    //public static final Target BUSCAR_NOMBRE_USUARIO_INICIO = Target.the("BUSCAMOS NOMBRE DE USUARIO AL INICIO").located(By.id("inputNameUserListUsers"));

   public static final Target CAMPO_IDENTIFICADOR_USUARIO_INICIO = Target.the("SELECCIONAR CAMPO IDENTIFICADOR USUARIO INICIO").located(By.id("selectIdentifierListUsers"));
    public static final Target BUSCAR_IDENTIFICADOR_USUARIO_INICIO = Target.the("BUSCAMOS IDENTIFICADOR DE USUARIO AL INICIO").located(By.id("inputIdentifierListUsers"));

   // public static final Target CAMPO_ROL_USUARIO_INICIO = Target.the("SELECCIONAR CAMPO ROL USUARIO INICIO").located(By.id("selectRolListUsers"));
    //public static final Target BUSCAR_ROL_USUARIO_INICIO = Target.the("BUSCAMOS ROL DE USUARIO AL INICIO").located(By.id("inputRolListUsers"));
    public static final Target BOTON_BUSCAR_USUARIO_INICIO = Target.the("BOTON BUSCAR USUARIO AL INICIO").located(By.id("btnSearchListUsers"));













}
