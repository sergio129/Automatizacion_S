Feature: Modulo de Casos Usuarios Registrados

  Background:
    Given Listar Usuarios Registrados

  @TestUsuariosRegistrados
  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And entramos el modulo de Casos Usuarios Registrados
    And Listamos Usuarios Registrados por<Rol>
   # Then Se visualiza ventana usuarios registrados<modalmensaje>
    Examples:
      | usuario      | contrasena     | Rol           |  |
      | Sergio.Anaya | Colombia_2026* | Admin Backlog |  |

  @TestUsuariosRegistradosTodosLosRoles
  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And entramos el modulo de Casos Usuarios Registrados
    And Listamos Usuarios Registrados Todos los Roles
    Examples:
      | usuario      | contrasena     |
      | Sergio.Anaya | Colombia_2026* |