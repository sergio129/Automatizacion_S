package co.konecta.sura.certificate.stepsdefinitions.Inicio;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.Tareas.Inicio.TablerosdeControlTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.ControlBoardsPage.*;

public class TablerosdeControlStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create, edition or delete a control boards$")
    public void iCreateOrEditionAControlBoardsParameterization() {
    }

    @And("^I select button create control boards$")
    public void iSelectButtonCreateControlBoards() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_CONTROL_BOARDS));
    }

    @And("^I select button edition control boards$")
    public void iSelectButtonEditionControlBoards() {
        actor.attemptsTo(Click.on(BUTTON_EDIT_CONTROL_BOARDS));
    }


    @And("^I select button delete control boards$")
    public void iSelectButtonDeleteControlBoards() {
        actor.attemptsTo(Click.on(BUTTON_DELETE_CONTROL_BOARDS),
                Click.on(OPTION_YES_CONTROL_BOARDS));
    }

    @And("^I type information in the case board with the board name (.*) and fields show1 (.*) and fields show2 (.*) and fields show3 (.*) and fields show4 (.*) and fields show5 (.*),(.*)$")
    public void iTypeInformationInTheFieldsBoardNameAndFieldsShowAndOnlyMyCases(String boardName, String fieldsShow1, String fieldsShow2, String fieldsShow3, String fieldsShow4, String fieldsShow5, String misexpedientes) throws InterruptedException {
        actor.attemptsTo(TablerosdeControlTask.withInformationControlBoards(boardName, fieldsShow1, fieldsShow2, fieldsShow3, fieldsShow4, fieldsShow5, misexpedientes));
    }

    @And("^I type filters in the case board with the case status (.*) and status service (.*) and department request (.*) and service (.*) and special service (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheFieldsCaseStatusAndStatusServiceAndDepartmentRequestAndLineLineAndServiceAndSpecialService(String caseStatus, String statusService, String departmentRequest, String service, String specialService, String assignedUser) {
        actor.attemptsTo(
                Click.on(MODULE_EXPANSION_FILTER_CONTROL_BOARDS),
                Click.on(INPUT_CASE_STATUS_FILTER_BOARDS),
                Enter.theValue(caseStatus).into(INPUT_SEARCH_CASE_STATUS_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_STATUS_FILTER_BOARDS),
                Enter.theValue(statusService).into(INPUT_SEARCH_SERVICE_STATUS_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_DEPARTMENT_REQUEST_FILTER_BOARDS),
                Enter.theValue(departmentRequest).into(INPUT_SEARCH_DEPARTMENT_REQUEST_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_LINE_FILTER_BOARDS),
                Click.on(INPUT_SERVICE_FILTER_BOARDS),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SPECIAL_SERVICE_FILTER_BOARDS),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS));

    }

    @And("^I type filters in the monitoring task board with the supplier (.*) and monitoring type (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheMonitoringTaskBoardWithTheClickCaseAndStatusTaskAndSupplierAndMonitoringTypeAndAssignedUser(String supplier, String typeMonitoring, String assignedUser) {
        actor.attemptsTo(
                Click.on(MODULE_EXPANSION_FILTER_CONTROL_BOARDS),
                Click.on(INPUT_CLICK_CASE_FILTER_BOARDS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CLICK_CASE_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_CLICK_CASE_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_CLICK_CASE_FILTER_BOARDS),
                Click.on(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_LINE_FILTER_BOARDS),
                Click.on(INPUT_TASK_STATUS_FILTER_BOARDS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_TASK_STATUS_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_TASK_STATUS_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_TASK_STATUS_FILTER_BOARDS),
                Click.on(INPUT_SUPPLIER_FILTER_BOARDS),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_MONITORING_TYPE_FILTER_BOARDS),
                Enter.theValue(typeMonitoring).into(INPUT_SEARCH_MONITORING_TYPE_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS));
    }

    @And("^I type filters in the closure case board with the service (.*) and supplier (.*) and special service (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheClosureCaseBoardWithTheServiceAndSupplierAndSpecialServiceAndAssignedUser(String service, String supplier, String specialService, String assignedUser) {
        actor.attemptsTo(
                Click.on(MODULE_EXPANSION_FILTER_CONTROL_BOARDS),
                Click.on(INPUT_CLICK_CASE_FILTER_BOARDS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CLICK_CASE_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_CLICK_CASE_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_CLICK_CASE_FILTER_BOARDS),
                Click.on(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_LINE_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_LINE_FILTER_BOARDS),
                Click.on(INPUT_SERVICE_FILTER_BOARDS),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SUPPLIER_FILTER_BOARDS),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SPECIAL_SERVICE_FILTER_BOARDS),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_CLOSURE_STATUS_FILTER_BOARDS),
                Hit.the(Keys.ENTER).into(INPUT_CLOSURE_STATUS_FILTER_BOARDS),
                Hit.the(Keys.ESCAPE).into(INPUT_CLOSURE_STATUS_FILTER_BOARDS),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS));

    }

    @And("^I no type information control boards$")
    public void iNoTypeInformationControlBoards() {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE),
                Click.on(BUTTON_SAVE_CONTROL_BOARDS));
    }

    @And("Seleccionamos el boton de crear Tableros de control")
    public void seleccionamosElBotonDeCrearTablerosDeControl() {
        actor.attemptsTo(Click.on(BUTTON_CREATE_CONTROL_BOARDS));
    }
}
