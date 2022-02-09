Feature: Crear, Editar, Eliminar, Desloquear, Conexion Remota

  el usuario puede hacer las siguientes accion Crear, Editar, Eliminar, Desloquear, Conexion Remota

  Background:
    Given Hacer toda la gestion de usuarios

  Scenario Outline: Creacion Exitosa de usuario
    Examples:
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a gestion de usuarios listar usuarios

    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                    |
      | Sergio.anaya | Colombia_2026* | Registro guardado correctamente |