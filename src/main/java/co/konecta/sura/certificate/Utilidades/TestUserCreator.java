package co.konecta.sura.certificate.Utilidades;

import co.konecta.sura.certificate.Modelos.User;

public class TestUserCreator {
    public static User UsuarioValido() {
        User user = new User();
        user.setUsername(TestLeerDatos.getTestLeerDatos("valido.user.name"));
        user.setPassword(TestLeerDatos.getTestLeerDatos("valido.user.password"));
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
