package co.konecta.sura.certificate.Modelos.Parametrizaciones;

public class CalculoTiempoMonitoreoSitioModel {
    private String nombre;
    private String momentoServicio;
    private String linea;
    private String tipoServicio;
    private String departamento;
    private String municipio;
    private String delta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMomentoServicio() {
        return momentoServicio;
    }

    public void setMomentoServicio(String momentoServicio) {
        this.momentoServicio = momentoServicio;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }
}
