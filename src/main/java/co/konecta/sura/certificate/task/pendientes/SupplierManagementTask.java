package co.konecta.sura.certificate.task.pendientes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

//import static co.konecta.sura.certificate.userinterface.HomePage.*;
import static co.konecta.sura.certificate.userinterface.pendientes.SupplierManagementPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SupplierManagementTask implements Task {

    public String supplierName;
    public String supplierResponse;
    public String timeMonitoringSite;
    public String timeMonitoringDestination;
    public String technicalCellPhone;
    public String centralPhone1;
    public String centralPhone2;
    public String observations;

    public SupplierManagementTask(String supplierName, String supplierResponse, String timeMonitoringSite, String timeMonitoringDestination, String technicalCellPhone, String centralPhone1, String centralPhone2, String observations) {
        this.supplierName = supplierName;
        this.supplierResponse = supplierResponse;
        this.timeMonitoringSite = timeMonitoringSite;
        this.timeMonitoringDestination = timeMonitoringDestination;
        this.technicalCellPhone = technicalCellPhone;
        this.centralPhone1 = centralPhone1;
        this.centralPhone2 = centralPhone2;
        this.observations = observations;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_SUPPLIER_NAME),
                Enter.theValue(supplierName).into(INPUT_SEARCH_SUPPLIER_NAME).thenHit(Keys.ENTER),
                Click.on(INPUT_SUPPLIER_RESPONSE),
                Enter.theValue(supplierResponse).into(INPUT_SEARCH_SUPPLIER_RESPONSE).thenHit(Keys.ENTER),
                Enter.theValue(timeMonitoringSite).into(INPUT_TIME_MONITORING_SITE),
                Enter.theValue(timeMonitoringDestination).into(INPUT_TIME_MONITORING_DESTINATION),
                Enter.theValue(technicalCellPhone).into(INPUT_TECHNICAL_CELLPHONE),
                Enter.theValue(centralPhone1).into(INPUT_CENTRAL_PHONE1),
                Enter.theValue(centralPhone2).into(INPUT_CENTRAL_PHONE2),
               // Click.on(MODAL_VALIDATION),
                Enter.theValue(observations).into(INPUT_OBSERVATIONS)

        );
    }

        public static SupplierManagementTask withInformationSupplier(String supplierName,String supplierResponse, String timeMonitoringSite, String timeMonitoringDestination, String technicalCellPhone, String centralPhone1, String centralPhone2, String observations){
            return instrumented(SupplierManagementTask.class, supplierName,supplierResponse,timeMonitoringSite,timeMonitoringDestination,technicalCellPhone,centralPhone1,centralPhone2,observations);
        }

}
