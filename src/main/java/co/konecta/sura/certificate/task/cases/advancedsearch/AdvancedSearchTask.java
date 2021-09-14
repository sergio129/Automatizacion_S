package co.konecta.sura.certificate.task.cases.advancedsearch;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.konecta.sura.certificate.userinterface.cases.advancedsearch.AdvancedSearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AdvancedSearchTask implements Task {

    private final String numberCase;
    private final String licensePlate;
    private final String securityCode;
    private final String clickCase;
    private final String assignedTo;
    private final String department;
    private final String municipality;
    private final String line;
    private final String caseClosureStatus;
    private final String classCase;
    private final String caseStatus;
    private final String serviceStatus;
    private final String service;
    private final String typeService;
    private final String specialService;
    private final String customerType;
    private final String supplier;

    public AdvancedSearchTask(String numberCase, String licensePlate, String securityCode, String clickCase, String assignedTo, String department, String municipality, String line, String caseClosureStatus, String classCase, String caseStatus, String serviceStatus, String service, String typeService, String specialService, String customerType, String supplier) {
        this.numberCase = numberCase;
        this.licensePlate = licensePlate;
        this.securityCode = securityCode;
        this.clickCase = clickCase;
        this.assignedTo = assignedTo;
        this.department = department;
        this.municipality = municipality;
        this.line = line;
        this.caseClosureStatus = caseClosureStatus;
        this.classCase = classCase;
        this.caseStatus = caseStatus;
        this.serviceStatus = serviceStatus;
        this.service = service;
        this.typeService = typeService;
        this.specialService = specialService;
        this.customerType = customerType;
        this.supplier = supplier;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(numberCase).into(INPUT_CASE),
                Enter.theValue(licensePlate).into(INPUT_LICENSE_PLATE),
                Enter.theValue(securityCode).into(INPUT_SECURITY_CODE),
                Click.on(INPUT_CLICK_CASE),
                Click.on(INPUT_SEARCH_CLICK_CASE),
                Hit.the(Keys.ESCAPE).into(INPUT_SEARCH_CLICK_CASE),
                Click.on(INPUT_ASSIGNED_TO),
                Enter.theValue(assignedTo).into(INPUT_SEARCH_ASSIGNED_TO).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_DEPARTMENT),
                Enter.theValue(department).into(INPUT_SEARCH_DEPARTMENT).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_MUNICIPALITY),
                Enter.theValue(municipality).into(INPUT_SEARCH_MUNICIPALITY).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_LINE),
                Enter.theValue(line).into(INPUT_SEARCH_LINE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_STATUS_CLOSING_CASE),
                Enter.theValue(caseClosureStatus).into(INPUT_SEARCH_STATUS_CLOSING_CASE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_CLASS),
                Enter.theValue(classCase).into(INPUT_SEARCH_SERVICE_CLASS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_STATUS_CASE),
                Enter.theValue(caseStatus).into(INPUT_SEARCH_STATUS_CASE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_STATUS_SERVICE),
                Enter.theValue(serviceStatus).into(INPUT_SEARCH_STATUS_SERVICE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_TYPE),
                Enter.theValue(typeService).into(INPUT_SEARCH_SERVICE_TYPE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SPECIAL_SERVICE),
                Enter.theValue(specialService).into(INPUT_SEARCH_SPECIAL_SERVICE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_CUSTOMER_TYPE),
                Enter.theValue(customerType).into(INPUT_SEARCH_CUSTOMER_TYPE).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SUPPLIER),
                Enter.theValue(supplier).into(INPUT_SEARCH_SUPPLIER).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)
        );

    }

    public static AdvancedSearchTask withInformationCaseSearch(String numberCase, String licensePlate, String securityCode, String clickCase, String assignedTo, String department, String municipality, String line, String caseClosureStatus, String classCase, String caseStatus, String serviceStatus, String service, String typeService, String specialService, String customerType, String supplier){
        return instrumented(AdvancedSearchTask.class,numberCase,licensePlate,securityCode, clickCase , assignedTo, department, municipality, line, caseClosureStatus, classCase, caseStatus, serviceStatus, service, typeService, specialService, customerType, supplier
        );

    }

}

