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
