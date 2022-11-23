Feature: Modulo de Casos Usuarios Registrados

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestUsuariosRegistrados
  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Gestionamos en Sara
    And entramos el modulo de Casos Usuarios Registrados
    And Listamos Usuarios Registrados por<Rol>
   # Then Se visualiza ventana usuarios registrados<modalmensaje>
    Examples:
     | Rol           |
     | Admin Backlog |

  @TestUsuariosRegistradosTodosLosRoles
  Scenario:Creacion Exitosa de parametrizacion Ofertamiento
    When Gestionamos en Sara
    And entramos el modulo de Casos Usuarios Registrados
    And Listamos Usuarios Registrados Todos los Roles
