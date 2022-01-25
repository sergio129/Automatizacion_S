package co.konecta.sura.certificate.Interfaces.Casos.SubModuloGestionSalud;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubModuloGestionSaludPage {
    public static final Target EXPANSION_MODULO_GESTION_SALUD = Target.the("Campo para la expansion del modulo gestion salud").located(By.id("healthManagementTitle"));
    public static final Target BOTON_CREAR_EMERGENCIA_SALUD = Target.the("boton para la creacion de registro emergencia salud").located(By.id("addButton"));



}
