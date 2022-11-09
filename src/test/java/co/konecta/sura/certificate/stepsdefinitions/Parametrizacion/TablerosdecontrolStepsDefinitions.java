package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.Interfaces.Inicio.HomePage;
import co.konecta.sura.certificate.TablerosdeControl.ParametrizacionTablerosdeControlModel;
import co.konecta.sura.certificate.TablerosdeControl.TablerosDeControlFiltrosModel;
import co.konecta.sura.certificate.Tareas.Parametrizacion.Tableros_de_Control.TableroControlFiltrosTask;
import co.konecta.sura.certificate.Tareas.Parametrizacion.Tableros_de_Control.TableroControlOtraInformacionTask;
import co.konecta.sura.certificate.Tareas.Parametrizacion.Tableros_de_Control.TablerosdeControlInfomacionBasicaTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.konecta.sura.certificate.Interfaces.Inicio.ControlBoardsPage.*;
import static co.konecta.sura.certificate.Interfaces.Parametrizacion.TablerosdeControlPage.*;

public class TablerosdecontrolStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    ParametrizacionTablerosdeControlModel tableros = new ParametrizacionTablerosdeControlModel();
    TablerosDeControlFiltrosModel filtrosModel=new TablerosDeControlFiltrosModel();


    @Before
    public void setUp() {
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

    }

    @And("^I type filters in the case board parameterization with the case status (.*) and status service (.*) and department request (.*) and service (.*) and special service (.*)$")
    public void iTypeFiltersInTheFieldsCaseBoardParameterizationStatusAndStatusServiceAndDepartmentRequestAndLineLineAndServiceAndSpecialService(String caseStatus, String statusService, String departmentRequest, String service, String specialService) {
        actor.attemptsTo(
                Click.on(CAMPO_ESTADO_EXPEDIENTE),
                Enter.theValue(caseStatus).into(INPUT_SEARCH_CASE_STATUS_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_ESTADO_SERVICIO),
                Enter.theValue(statusService).into(INPUT_SEARCH_SERVICE_STATUS_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_DEPARTAMENTO_SOLICITA),
                Enter.theValue(departmentRequest).into(INPUT_SEARCH_DEPARTMENT_REQUEST_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_LINEA),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_LINEA),
                Hit.the(Keys.ENTER).into(CAMPO_LINEA),
                Click.on(CAMPO_SERVICIO),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_SERVICIOS_ESPECIALES),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(BOTON_GUARDAR));

    }

    @And("^I type information in the monitoring task board parameterization with the board name (.*) and fields show (.*)$")
    public void iTypeInformationInTheMonitoringTaskBoardParameterizationWithTheBoardNameAndFieldsShowAndOnlyMyCases(String boardName, String fieldsShow) {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION));
        actor.attemptsTo(TablerosdeControlInfomacionBasicaTask.withInformationControlBoardsParameterization(boardName, fieldsShow));
    }

    @And("^I type filters in the monitoring task board parameterization with the supplier (.*) and monitoring type (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheMonitoringTaskBoardParameterizationWithTheClickCaseAndStatusTaskAndSupplierAndMonitoringTypeAndAssignedUser(String supplier, String typeMonitoring, String assignedUser) {
        actor.attemptsTo(Click.on(CAMPO_LINEA),
                Click.on(CAMPO_GESTION_COORDINACION),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_GESTION_COORDINACION),
                Hit.the(Keys.ENTER).into(CAMPO_GESTION_COORDINACION),
                Click.on(CAMPO_LINEA),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_LINEA),
                Hit.the(Keys.ENTER).into(CAMPO_LINEA),
                Click.on(CAMPO_ESTADO_DE_TAREAS),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_ESTADO_DE_TAREAS),
                Hit.the(Keys.ENTER).into(CAMPO_ESTADO_DE_TAREAS),
                Click.on(CAMPO_TIPO_DE_MONITOREO),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_TIPO_DE_MONITOREO),
                Enter.theValue(typeMonitoring).into(INPUT_SEARCH_MONITORING_TYPE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(BOTON_GUARDAR));
    }

    @And("^I type information in the closure case board parameterization with the board name (.*) and fields show (.*)$")
    public void iTypeInformationInTheClosureCaseBoardParameterizationWithTheBoardNameAndFieldsShowAndOnlyMyCases(String boardName, String fieldsShow) {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION));
        actor.attemptsTo(TablerosdeControlInfomacionBasicaTask.withInformationControlBoardsParameterization(boardName, fieldsShow));

    }

    @And("^I type filters in the closure case board parameterization with the service (.*) and supplier (.*) and special service (.*) and assigned user (.*)$")
    public void iTypeFiltersInTheClosureBoardParameterizationCaseWithTheServiceAndSupplierAndSpecialServiceAndAssignedUser(String service, String supplier, String specialService, String assignedUser) {
        actor.attemptsTo(Click.on(CAMPO_LINEA),
                Click.on(CAMPO_GESTION_COORDINACION),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_GESTION_COORDINACION),
                Hit.the(Keys.ENTER).into(CAMPO_GESTION_COORDINACION),
                Click.on(CAMPO_LINEA),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_LINEA),
                Hit.the(Keys.ENTER).into(CAMPO_LINEA),
                Click.on(CAMPO_SERVICIO),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_TIPO_DE_MONITOREO),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(CAMPO_SERVICIOS_ESPECIALES),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER),
                Click.on(INPUT_CLOSURE_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_CLOSURE_STATUS_FILTER_BOARDS_PARAMETERIZATION),
                Click.on(INPUT_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION),
                Enter.theValue(assignedUser).into(INPUT_SEARCH_ASSIGNED_USER_FILTER_BOARDS_PARAMETERIZATION).thenHit(Keys.ENTER));

    }

    @And("^I no type information control boards parameterization$")
    public void iNoTypeInformationControlBoardsParameterization() {
        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Hit.the(Keys.ENTER).into(INPUT_BOARD_TYPE_PARAMETERIZATION),
                Click.on(BOTON_GUARDAR));
    }


    @And("^Seleccionamos El tipo de Tablero de control \"([^\"]*)\"$")
    public void seleccionamosElTipoDeTableroDeControl(String arg0) throws Throwable {

        actor.attemptsTo(Click.on(INPUT_BOARD_TYPE),
                Click.on(SELECCIONAR_INPUT_BOARD_TYPE.of(String.valueOf(arg0))));
        Thread.sleep(2000);

    }


    @And("Ingresamos informacion basica para la crecion de tableros de control, Campos a mostrar:{string},Roles:{string},Asesores:{string},Solo mis Expedientes:{string}")
    public void ingresamosInformacionBasicaParaLaCrecionDeTablerosDeControlCamposAMostrarRolesAsesoresSoloMisExpedientes(String Campos_mostrar, String Roles, String Asesores, String Solo_mis_Expedientes) {
        this.tableros.setCamposMostrar(Campos_mostrar);
        this.tableros.setRoles(Roles);
        this.tableros.setAsesores(Asesores);
        this.tableros.setSoloMisExpedientes(Solo_mis_Expedientes);
        actor.attemptsTo(TableroControlOtraInformacionTask.EscribirDatos(tableros));
    }

    @And("Ingresamos la informacion Basica de tableros de control Nombre Tablero:{string}, Tipo de Tablero: {string}")
    public void ingresamosLaInformacionBasicaDeTablerosDeControlNombreTableroTipoDeTablero(String Nombre_Tablero, String Tipo_Tablero) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(TablerosdeControlInfomacionBasicaTask.withInformationControlBoardsParameterization(Nombre_Tablero, Tipo_Tablero));
    }

    @And("Guardamos el tablero de control")
    public void guardamosElTableroDeControl() {
        actor.attemptsTo(TableroControlFiltrosTask.EscribirDatosFiltros(filtrosModel));
        actor.attemptsTo(Click.on(BOTON_GUARDAR));

    }

    @And("Filtros de datos comunes inpendientemente del tipo de tablero de control Linea:{string} Usuario asignado:{string}, Responsable:{string}")
    public void filtrosDeDatosComunesInpendientementeDelTipoDeTableroDeControlLineaUsuarioAsignadoResponsable(String linea, String usuario_asignado, String responsable) {
        this.filtrosModel.setLinea(linea);
        this.filtrosModel.setUsuario_asignado(usuario_asignado);
        this.filtrosModel.setResponsable(responsable);
    }

    @And("Filtros para tipo de tablero control Casos, Estado expediente:{string},Estado servicio:{string},Departamento:{string}")
    public void filtrosParaTipoDeTableroControlCasosEstadoExpedienteEstadoServicioDepartamento(String estado_expediente, String estado_servicio, String departmento) {
        this.filtrosModel.setEstado_expediente(estado_expediente);
        this.filtrosModel.setEstado_servicio(estado_servicio);
        this.filtrosModel.setDepartamento(departmento);
    }

    @And("Filtros de de datos comunes tableros de Casos,Tareas Monitoreo y Cierre de expedientes:Gestion coordinacion:{string}, Servicio:{string},Proveedor:{string},Servicio especial:{string}")
    public void filtrosDeDeDatosComunesTablerosDeCasosTareasMonitoreoYCierreDeExpedientesGestionCoordinacionServicioProveedorServicioEspecial(String gestion_coordinacion, String servicio, String proveedor, String especial) {
        this.filtrosModel.setGestion_coordinacion(gestion_coordinacion);
        this.filtrosModel.setServicio(servicio);
        this.filtrosModel.setProveedor(proveedor);
        this.filtrosModel.setServicio_especial(especial);
    }

    @And("Filtros para tipo de tablero control Tareas monitoreo:Estado de tareas:{string}, Tipo monitoreo:{string}")
    public void filtrosParaTipoDeTableroControlTareasMonitoreoEstadoDeTareasTipoMonitoreo(String estado_tarea, String tipo_monitoreo) {
        this.filtrosModel.setEstado_tareas(estado_tarea);
        this.filtrosModel.setTipo_monitoreo(tipo_monitoreo);
    }

    @And("Filtros Para tipo de tablero control Cierre de expedientes: Tipo servicio:{string}, Estado de cierre:{string}")
    public void filtrosParaTipoDeTableroControlCierreDeExpedientesTipoServicioEstadoDeCierre(String tipo_servicio, String estado_cierre) {
        this.filtrosModel.setTipo_servicio(tipo_servicio);
        this.filtrosModel.setEstado_cierre(estado_cierre);
    }
}
