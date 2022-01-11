package co.konecta.sura.certificate.stepsdefinitions.Parametrizacion;

import co.konecta.sura.certificate.task.Parametrizacion.NotificacionesPushTask;
import co.konecta.sura.certificate.userinterface.Inicio.HomePage;
import co.konecta.sura.certificate.userinterface.Parametrizacion.ListasPage;
import co.konecta.sura.certificate.userinterface.Parametrizacion.NotificacionesPushPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import static co.konecta.sura.certificate.userinterface.Inicio.HomePage.*;
import static co.konecta.sura.certificate.userinterface.Parametrizacion.NotificacionesPushPage.*;

public class NotificacionesPushStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^I create or edition a push notifications$")
    public void iCreateOrEditionPushNotifications() {
    }

    @And("^I entering push notifications$")
    public void IEnteringPushNotifications() throws InterruptedException {
        Thread.sleep(5000);
        actor.attemptsTo(Click.on(ListasPage.BUTTON_INITIAL_TAB));
        actor.attemptsTo(Click.on(ListasPage.BUTTON_PARAMETRIZACION));
        Thread.sleep(3000);
        actor.attemptsTo(Click.on(co.konecta.sura.certificate.userinterface.Inicio.HomePage.SCROLL_PARAMETERIZATION));
        actor.attemptsTo(Click.on(NotificacionesPushPage.OPTION_PUSH_NOTIFICATIONS));
        Thread.sleep(3000);

    }


    @And("^I select button create push notifications$")
    public void ISelectButtonCreatePushNotifications() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_CREATE_PUSH_NOTIFICATIONS));
    }
    @And("^I select button save push notifications$")
    public void ISelectButtonSavePushNotifications() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_SAVE_PUSH_NOTIFICATIONS));
    }

    @And("^I write information in the push notifications of the following fields (.*)and(.*)and(.*)and(.*)and(.*)and(.*)and(.*)and(.*)$")
    public void IWriteInformationPushNotifications(String line, String service, String servicestatus, String roles, String timetomoment1, String timetomoment2, String appointmenttime1, String appointmenttime2) {
        actor.attemptsTo(NotificacionesPushTask.withPushNotificationParameterization(line, service, servicestatus, roles, timetomoment1, timetomoment2, appointmenttime1, appointmenttime2));

    }

    @And("^I select filter push notifications (.*)and(.*)and(.*)and(.*)$")
    public void ISelectFilterPushNotifications(String line, String service, String servicestatus, String roles) {
        actor.attemptsTo(
                Click.on(INPUT_LINE_FILTER_PUSH_NOTIFICATIONS),
                Enter.theValue(line).into(INPUT_SEARCH_LINE_FILTER_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_FILTER_PUSH_NOTIFICATIONS),
                Enter.theValue(service).into(INPUT_SEARCH_SERVICE_FILTER_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_SERVICE_STATUS_FILTER_PUSH_NOTIFICATIONS),
                Enter.theValue(servicestatus).into(INPUT_SEARCH_STATUS_FILTER_SERVICE_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE),
                Click.on(INPUT_ROLES__FILER_PUSH_NOTIFICATIONS),
                Enter.theValue(roles).into(INPUT_SEARCH_ROLES_FILER_PUSH_NOTIFICATIONS).thenHit(Keys.ENTER).thenHit(Keys.ESCAPE)
        );

    }
    @And("^I select button search for push notifications$")
    public void ISelectButtonSearchForPushNotifications() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_SEARCH_PUSH_NOTIFICATIONS));
        Thread.sleep(3000);
    }

    @And("^I select button Edit push notifications$")
    public void ISelectButtonEditPushNotifications() throws InterruptedException {
        actor.attemptsTo(Click.on(BUTTON_EDIT_PUSH_NOTIFICATIONS));
        Thread.sleep(3000);
    }
    @And("^I select button delete push notifications$")
    public void ISelectButtonDeletePushNotifications() throws InterruptedException {
        actor.attemptsTo(

                Click.on(BUTTON_DELETE_PUSH_NOTIFICATIONS),
                Click.on(OPTION_YES_PUSH_NOTIFICATIONS)
        );

        Thread.sleep(3000);
    }

    @Then("^I view the modal save push notification with (.*)$")
    public void iViewTheModalPushNotificationsWith(String message) throws InterruptedException {
        Thread.sleep(2000);
        actor.attemptsTo(
                Ensure.that(MODAL_VALIDATION).text().contains(message));


    }


}