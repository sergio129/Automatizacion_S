package co.konecta.sura.certificate.Utilidades.AdministrarTareas;

import co.konecta.sura.certificate.Modelos.AdministrarTareas.TareasMonitoreoModel;
import co.konecta.sura.certificate.Modelos.Login.User;
import co.konecta.sura.certificate.Utilidades.Login.TestLeerDatos;

import java.util.ResourceBundle;

public class FiltrosTareasMonitoreoUtilities {

    public static ResourceBundle resourceBundle() {
        if (System.getProperty("env") != null) {
            return ResourceBundle.getBundle(System.getProperty("env"));
        } else {
            return ResourceBundle.getBundle(" AdminTareasMonitoreo");
        }
    }

    public static String getTestLeerDatosTareasMonitoreo(String filtros) {
        return resourceBundle().getString(filtros);
    }

    public static TareasMonitoreoModel FiltrosTareasMonitoreo() {
        TareasMonitoreoModel tareas = new TareasMonitoreoModel();
        tareas.setNombre(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Nombre"));
        tareas.setCaso(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.caso"));
        tareas.setEstadoTarea(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Estado_Tarea"));
        tareas.setTipoMonitoreo(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Tipo_Monitoreo"));
        tareas.setFechaInicio(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Fecha_Inicio"));
        tareas.setUsuarioAsignado(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Usuario_asignado"));
        tareas.setLinea(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Linea"));
        tareas.setGestionCoordinacion(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Gestion_coordinacion"));
        tareas.setFechaFin(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Fecha_fin"));
        tareas.setTareasVencidas(getTestLeerDatosTareasMonitoreo("TareasMonitoreo.Tareas_vencidas"));
        return tareas;
    }
}
