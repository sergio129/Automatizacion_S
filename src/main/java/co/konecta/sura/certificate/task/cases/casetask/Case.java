package co.konecta.sura.certificate.task.cases.casetask;

import co.konecta.sura.certificate.userinterface.cases.cases.CasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Case implements Task {

    private CaseModel datacase;

    public Case(CaseModel datacase){
        this.datacase = datacase;
    }
    CharSequence charSequence = "v";
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    SendKeys.of(Keys.CONTROL + "V").into( CasePage.INPUT_NUMBER_CASE),
                    Enter.theValue(datacase.getApplicantName()).into(CasePage.INPUT_APPLICANT_NAME),
                    Enter.theValue(datacase.getPhone1()).into(CasePage.INPUT_PHONE1),
                    //Enter.theValue(datacase.getLicensePlate()).into(CreateCasePage.INPUT_NUMBERCASE),

                    Click.on( CasePage.INPUT_DEPARTMENT ),
                    Click.on( CasePage.INPUT_DEPARTMENT_FILTER ),
                    Enter.theValue( datacase.getDepartment()).into( CasePage.INPUT_DEPARTMENT_FILTER ).thenHit(Keys.ENTER),

                    Enter.theValue(datacase.getLicensePlate()).into(CasePage.INPUT_LICENSE_PLATE),
                    Enter.theValue(datacase.getServiceAddress()).into(CasePage.INPUT_SERVICE_ADDRESS),
                    Enter.theValue(datacase.getServiceLocation()).into(CasePage.INPUT_SERVICE_LOCATION),
                    Enter.theValue(datacase.getAddressDetail()).into(CasePage.INPUT_ADDRESS_DETAIL),

                    Click.on( CasePage.INPUT_CLICK_CASE),
                    Click.on( CasePage.INPUT_CLICK_CASE_FILTER),
                    Enter.theValue(datacase.getClickCase()).into(CasePage.INPUT_CLICK_CASE_FILTER).thenHit(Keys.ENTER),

                    Click.on( CasePage.INPUT_LINE),
                    Click.on( CasePage.INPUT_LINE_FILTER),
                    Enter.theValue(datacase.getLine()).into(CasePage.INPUT_LINE_FILTER).thenHit(Keys.ENTER),

                    Click.on( CasePage.INPUT_SERVICE ),
                    Click.on( CasePage.INPUT_SERVICE_FILTER ),
                    Enter.theValue(datacase.getService()).into(CasePage.INPUT_SERVICE_FILTER).thenHit(Keys.ENTER),

                    WaitUntil.the(CasePage.INPUT_MUNICIPALITY, isVisible()).forNoMoreThan(3).milliseconds(),
                    Click.on( CasePage.INPUT_MUNICIPALITY),
                    Click.on( CasePage.INPUT_MUNICIPALITY_FILTER ),
                    Enter.theValue(datacase.getMunicipality()).into(CasePage.INPUT_MUNICIPALITY_FILTER).thenHit(Keys.ENTER),

                    Click.on( CasePage.BUTTON_SAVE_CASE )

            );

    }

    public static Case whitDataCase(CaseModel datacase) {
        return instrumented(Case.class, datacase);

    }

}
