package co.konecta.sura.certificate.Interfaces.Casos.UsuariosRegistrados;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuariosRegistradosPage {
    public static final Target OPCION_USUARIOS_REGISTRADOS = Target.the("ENTRAR A LA OPCION CASOS USUARIOS REGISTRADOS").located(By.id("moLoggedUsers"));
    public static final Target CAMPO_ROLES_USUARIOS_REGISTRADOS = Target.the("CAMPO ROLES  USUARIOS REGISTRADOS").located(By.id("selectRolesRegisteredUsers"));
    public static final Target BUSCAR_ROLES_USUARIOS_REGISTRADOS = Target.the("BUSCAR ROLES ROLES  USUARIOS REGISTRADOS").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target TODOS_LOS_ROLES_USUARIOS_REGISTRADOS = Target.the("SELECCIONAR TODOS LOS ROLES  USUARIOS REGISTRADOS").located(By.id("inputRolesRegisteredUsers"));
    public static final Target MODAL_USUARIOS_REGISTRADOS = Target.the("MODAL USUARIOS REGISTRADOS").located(By.cssSelector("[role='columnheader']"));

}
