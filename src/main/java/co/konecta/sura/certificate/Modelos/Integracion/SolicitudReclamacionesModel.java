package co.konecta.sura.certificate.Modelos.Integracion;

public class SolicitudReclamacionesModel {
    private String buscarPlaca;
    private String tipoGestion;
    private String personaGestion;
    private String observaciones;
    private String estado;
    private String fechaReprogramacion;
    private String horaReprogramacion;

    public String getBuscarPlaca() {
        return buscarPlaca;
    }

    public void setBuscarPlaca(String buscarPlaca) {
        this.buscarPlaca = buscarPlaca;
    }

    public String getTipoGestion() {
        return tipoGestion;
    }

    public void setTipoGestion(String tipoGestion) {
        this.tipoGestion = tipoGestion;
    }

    public String getPersonaGestion() {
        return personaGestion;
    }

    public void setPersonaGestion(String personaGestion) {
        this.personaGestion = personaGestion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaReprogramacion() {
        return fechaReprogramacion;
    }

    public void setFechaReprogramacion(String fechaReprogramacion) {
        this.fechaReprogramacion = fechaReprogramacion;
    }

    public String getHoraReprogramacion() {
        return horaReprogramacion;
    }

    public void setHoraReprogramacion(String horaReprogramacion) {
        this.horaReprogramacion = horaReprogramacion;
    }
}
