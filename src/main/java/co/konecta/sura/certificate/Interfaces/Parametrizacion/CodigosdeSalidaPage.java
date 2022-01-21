package co.konecta.sura.certificate.Interfaces.Parametrizacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CodigosdeSalidaPage {
    public static final Target BUTTON_CREATE_EXIT_CODE = Target.the("This the button create exit code parameterization").located(By.id("btnAddCodeSearch"));
    public static final Target INPUT_LINE_EXIT_CODE = Target.the("This the input line exit code parameterization").located(By.id("selectCreateLineExitCode"));
    public static final Target INPUT_SEARCH_LINE_EXIT_CODE = Target.the("This the input search line exit code parameterization").located(By.id("inputCreateLineExitCodeSearch"));
    public static final Target EXIT_CODE = Target.the("This the exit code parameterization").located(By.id("inputCreateCodeSearch"));
    public static final Target BUTTON_SAVE_EXIT_CODE = Target.the("This the button save exit code parameterization").located(By.id("btnSaveFormCodeSearch"));

    public static final Target INPUT_LINE_EXIT_CODE_HOME = Target.the("This the input line exit code  home parameterization").located(By.id("selectLineExitCode"));
    public static final Target INPUT_SEARCH_LINE_EXIT_CODE_HOME = Target.the("This the input search line exit code home parameterization").located(By.id("inputLineExitCodeSearch"));
    public static final Target BUTTON_SEARCH_EXIT_CODE_HOME = Target.the("This the button search home exit code parameterization").located(By.id("btnSearchCodeSearch"));

    public static final Target BUTTON_EDIT_EXIT_CODE_HOME = Target.the("boton para editar codigos de salida").located(By.id("btnEditCodeSearch"));
    public static final Target BUTTON_DELETE_EXIT_CODE_HOME = Target.the("Boton para eliminar parametrizacion codigos de salida").located(By.id("btnDeletedCodeSearch"));
    public static final Target OPTION_YES_DELETE_EXIT_CODE_HOME = Target.the("opcion si para confirmar la eliminacion").locatedBy("/html/body/div[5]/div/div[3]/button[1]");
















}