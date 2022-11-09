Feature: Modulo de Casos Usuarios Registrados

  Background:
    Given Listar Usuarios Registrados

  @TestUsuariosRegistrados
  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2026 |
    And entramos el modulo de Casos Usuarios Registrados
    And Listamos Usuarios Registrados por<Rol>
   # Then Se visualiza ventana usuarios registrados<modalmensaje>
    Examples:
     | Rol           |
     | Admin Backlog |

  @TestUsuariosRegistradosTodosLosRoles
  Scenario:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And entramos el modulo de Casos Usuarios Registrados
    And Listamos Usuarios Registrados Todos los Roles
