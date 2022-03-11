package co.konecta.sura.certificate.Interfaces.SubAgenda;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgendaPage {

    public static final Target SELECCIONAR_CAMPO = Target.the("selecciono modulo agenda").located(By.xpath("//mat-accordion/app-list-schedule/mat-expansion-panel/div/div/mat-card-content//div[1]/mat-form-field/div/div[1]/div/mat-select"));
    public static final Target CAMPO_TIPO_CONTACTO = Target.the("escribo en el campo tipo contacto ").located(By.cssSelector("[aria-label='Tipo de contacto']"));
    public static final Target CAMPO_BUSCAR_LLAMADA = Target.the("escribo en el campo LLAMADA ").located(By.cssSelector("[placeholder='Buscar']"));
    public static final Target CAMPO_NUMERO_LLAMADA = Target.the("escribo en el campo numero telefono ").located(By.cssSelector("[placeholder='Número a llamar']"));
    public static final Target CAMPO_DEPARTAMENTO_AGENDA= Target.the("escribo en el campo departamento").located(By.cssSelector("[aria-label='Departamento']"));
    public static final Target CAMPO_TIPO_MUNICIPIO_AGENDA = Target.the("escribo en el campo ciudad").located(By.cssSelector("[aria-label='Municipio ']"));
    public static final Target ICONO_LLAMAR = Target.the("clic en llamar  ").located(By.cssSelector("[aria-label='Llamar']"));
    public static final Target AGREGAR_LLAMADA = Target.the("selecciono modulo agenda").located(By.xpath("//mat-accordion/app-list-schedule/mat-expansion-panel/div/div/mat-card-content//div[2]/button/span/mat-icon"));
}
