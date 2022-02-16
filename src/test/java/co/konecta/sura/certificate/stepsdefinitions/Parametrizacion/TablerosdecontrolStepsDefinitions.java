package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Parametrizacion.TablerosdeControlTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosdeControlPage.*;

public class TablerosdecontrolStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete a control boards parameterization$")
    public void iCreateOrEditionAControlBoardsParameterization() {
    }

    @And("^I entering control boards parameterization")
    public void iEnteringControlBoardsMenu() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(HomePage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(HomePage.OPTION_MENU_PARAMETERIZATION));
        actor.attemptsTo(Click.on(HomePage.OPTION_CONTROL_BOARDS_PARAMETERIZATION));
    }

    @And("^I select button create control boards parameterization$")
    public void iSelectButtonCreateControlBoardsParameterization() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_CONTROL_BOARDS_PARAMETERIZATION));
    }

    @And("^I select button edition control boards parameterization$")
    public void iSelectButtonEditionControlBoardsParameterization$() {
        actor.attemptsTo(Click.on(BUTTON_EDIT_CONTROL_BOARDS_PARAMETERIZATION));
    }

    @And("^I select button delete control boards parameterization$")
    public void iSelectButtonDeleteControlBoardsParameterization() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_CONTROL_BOARDS_PARAMETERIZATION),
                Click.on(OPTION_YES_CONTROL_BOARDS_PARAMETERIZATION));
    }

    @And("^I type information in the case board parameterization with the board name (.*) and fields show (.*)$")
    public void iTypeInformationInTheCaseBoardParameterizationNameAndFieldsShowAndOnlyMyCases(String boardName, String fieldsShow) throws InterruptedException {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION));
                Thread.sleep(2000);
        actor.attemptsTo(TablerosdeControlTask.withInformationControlBoardsParameterization( boardName, fieldsShow));
    }

    @And("^I type filters in the case board parameterization with the case status (.*) and status service (.*) and department request (.*) and service (.*) and special service (.*)$")
    public void iTypeFiltersInTheFieldsCaseBoardParameterizationStatusAndStatusServiceAndDepartmentRequestAndLineLineAndServiceAndSpecialService(String caseStatus, String statusService, String departmentRequest, String service, String specialService) {
        actor.attemptsTo(Click.on(MODULE_EXPANSION_FILTER_CONTROL_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_CASE_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(caseStatus).into(INPUT_SEARCH_CASE_STATUS_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_SERVICE_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(statusService).into(INPUT_SEARCH_SERVICE_STATUS_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_DEPARTMENT_REQUEST_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(departmentRequest).into(INPUT_SEARCH_DEPARTMENT_REQUEST_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_SERVICE_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS_PARAMETERIZATION));

    }

    @And("^I type information in the monitoring task board parameterization with the board name (.*) and fields show (.*)$")
    public void iTypeInformationInTheMonitoringTaskBoardParameterizationWithTheBoardNameAndFieldsShowAndOnlyMyCases(String boardName, String fieldsShow) {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION));
        actor.attemptsTo(TablerosdeControlTask.withInformationControlBoardsParameterization( boardName, fieldsShow));
    }

    @And("^I type filters in the monitoring task board parameterization with the supplier (.*) and monitoring type (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheMonitoringTaskBoardParameterizationWithTheClickCaseAndStatusTaskAndSupplierAndMonitoringTypeAndAssignedUser(String supplier, String typeMonitoring,String assignedUser) {
        actor.attemptsTo(Click.on(MODULE_EXPANSION_FILTER_CONTROL_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_CLICK_CASE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CLICK_CASE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_CLICK_CASE_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_TASK_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_TASK_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_TASK_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_MONITORING_TYPE_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(typeMonitoring).into(INPUT_SEARCH_MONITORING_TYPE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS_PARAMETERIZATION));
    }

    @And("^I type information in the closure case board parameterization with the board name (.*) and fields show (.*)$")
    public void iTypeInformationInTheClosureCaseBoardParameterizationWithTheBoardNameAndFieldsShowAndOnlyMyCases(String boardName, String fieldsShow) {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION));
        actor.attemptsTo(TablerosdeControlTask.withInformationControlBoardsParameterization( boardName, fieldsShow));

    }

    @And("^I type filters in the closure case board parameterization with the service (.*) and supplier (.*) and special service (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheClosureBoardParameterizationCaseWithTheServiceAndSupplierAndSpecialServiceAndAssignedUser(String service, String supplier, String specialService, String assignedUser) {
        actor.attemptsTo(Click.on(MODULE_EXPANSION_FILTER_CONTROL_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_CLICK_CASE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CLICK_CASE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_CLICK_CASE_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_LINE_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_SERVICE_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_CLOSURE_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_CLOSURE_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS_PARAMETERIZATION));

    }

    @And("^I no type information control boards parameterization$")
    public void iNoTypeInformationControlBoardsParameterization() {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS_PARAMETERIZATION));
    }



}
