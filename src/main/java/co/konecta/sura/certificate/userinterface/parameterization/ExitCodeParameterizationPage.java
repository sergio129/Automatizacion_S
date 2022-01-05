package co.konecta.sura.certificate.userinterface.parameterization;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ExitCodeParameterizationPage {
    public static final Target BUTTON_CREATE_EXIT_CODE = Target.the("This the button create exit code parameterization").located(By.id("btnAddCodeSearch"));
    public static final Target INPUT_LINE_EXIT_CODE = Target.the("This the input line exit code parameterization").located(By.id("mat-select-value-5"));
    public static final Target INPUT_SEARCH_LINE_EXIT_CODE = Target.the("This the input search line exit code parameterization").located(By.id("inputCreateLineExitCodeSearch"));
    public static final Target EXIT_CODE = Target.the("This the exit code parameterization").located(By.id("inputCreateCodeSearch"));
    public static final Target BUTTON_SAVE_EXIT_CODE = Target.the("This the button save exit code parameterization").located(By.id("btnSaveFormCodeSearch"));

    public static final Target INPUT_LINE_EXIT_CODE_HOME = Target.the("This the input line exit code  home parameterization").located(By.id("mat-select-value-173"));
    public static final Target INPUT_SEARCH_LINE_EXIT_CODE_HOME = Target.the("This the input search line exit code home parameterization").located(By.id("listLineExitCode"));


    public static final Target BUTTON_EDIT_EXIT_CODE_HOME = Target.the("This the button edit home exit code parameterization").located(By.id("btnEditCodeSearch"));
    public static final Target BUTTON_DELETE_EXIT_CODE_HOME = Target.the("This the button delete home exit code parameterization").located(By.id("btnDeletedCodeSearch"));
    public static final Target OPTION_YES_DELETE_EXIT_CODE_HOME = Target.the("This the option yes delete home exit code parameterization").located(By.id("sweetalertConfirmButton"));
















}
