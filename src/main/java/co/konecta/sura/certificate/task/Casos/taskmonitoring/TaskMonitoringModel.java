package co.konecta.sura.certificate.task.Casos.taskmonitoring;

public class TaskMonitoringModel {

    private String name;
    private String state;
    private String type;
    private String date;
    private String hour;
    private String user;

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
