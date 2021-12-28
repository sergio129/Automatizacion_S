package co.konecta.sura.certificate.task.parameterization.CallReasonsTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ServiceRequestTask implements Task {
    public String name;
    public String line;
    public ServiceRequestTask(String name, String line){
        this.name=name;
        this.line=line;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

}
