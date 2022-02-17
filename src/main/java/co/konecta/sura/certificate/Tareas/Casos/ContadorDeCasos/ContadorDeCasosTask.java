package co.konecta.sura.certificate.Tareas.Casos.ContadorDeCasos;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class ContadorDeCasosTask implements Task {
    private ContadorCasosModel contadorCasosModel;


    @Override
    public <T extends Actor> void performAs(T actor) {



    }
    public static ContadorDeCasosTask EscribirFechas(ContadorCasosModel contadorCasosModel){
        return new ContadorDeCasosTask(contadorCasosModel);
    }
}
