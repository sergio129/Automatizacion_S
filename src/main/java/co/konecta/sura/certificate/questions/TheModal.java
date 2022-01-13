package co.konecta.sura.certificate.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.konecta.sura.certificate.Interfaces.Inicio.HomePage.MODAL_VALIDATION;


public class TheModal  implements Question<Boolean> {

    private final String messageModal;

    public TheModal(String messageModal) {
        this.messageModal = messageModal;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return MODAL_VALIDATION.of(messageModal).resolveFor(actor).isVisible();
    }

    public static TheModal isVisible(String messageModal){
        return  new TheModal(messageModal);
    }
}
