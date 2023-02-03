package co.konecta.sura.certificate.Utilidades.Login;

import co.konecta.sura.certificate.Modelos.Login.User;
import co.konecta.sura.certificate.Utilidades.Login.TestLeerDatos;

public class TestUserCreator {
    public static User UsuarioValido() {
        User user = new User();
        user.setUsername(TestLeerDatos.getTestLeerDatos("valido.user.name"));
        user.setPassword(TestLeerDatos.getTestLeerDatos("valido.user.password"));
        user.setEstrellas(TestLeerDatos.getTestLeerDatos("valido.user.NumeroEstrellas"));
        user.setJustificacion(TestLeerDatos.getTestLeerDatos("valido.user.Justificacion"));
        return user;
    }

    public static User getTipoUsuario(String tipo) {
        switch (tipo) {
            case "Usuario Valido":
                return UsuarioValido();
            default:
                throw  new RuntimeException("Intente con otro usuario o contraseña: "+tipo);
        }
    }
}
