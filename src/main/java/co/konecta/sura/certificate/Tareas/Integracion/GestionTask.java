package co.konecta.sura.certificate.Tareas.Integracion;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
@AllArgsConstructor
public class GestionTask implements Task {
    String FCita;
    String Hora;
    String Nomb;
    String Tlf;
    String DpSl;
    String MpSl;
    String Placa;
    String DServ ;
    String UbServ ;
    String DllDirecc ;
    String ServEsp;
    String GCord;
    String linea;
    String Servicio;
    @Override
    public <T extends Actor> void performAs(T actor) {


    }
    public static  GestionTask EscribirDatosGestion(String FCita ,String Hora,String Nomb,String Tlf,String DpSl,String MpSl,String Placa,String DServ ,String UbServ ,String DllDirecc ,String ServEsp,String GCord,String linea,String Servicio){
       return new GestionTask(FCita ,Hora,Nomb,Tlf,DpSl,MpSl,Placa,DServ ,UbServ ,DllDirecc ,ServEsp,GCord,linea,Servicio);
    }
}
