package co.konecta.sura.certificate.Modelos.Login;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toSrinString(){
        return "Usuario"+getUsername()+"Contraseña: "+getPassword();
    }
}
