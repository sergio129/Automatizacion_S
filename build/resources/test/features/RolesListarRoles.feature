Feature: Creacion, Edicion, Asociacion y Eliminar lista de Roles


  Background:
    Given Creacion, Edicion, Asociacion y Eliminar lista de Roles

  @TestCreacionListaRoles
  Scenario Outline: Creacion Exitosa de Rol
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Roles Lista roles
    And Damos Clic en Crear Lista Roles
    And Escribimos la informacion SubModulo Cierre de Expediente<NombreRol>,<HabilidadRol>,<EasyCase>
    #And Guardamos informacion SubModulo Cierre Expediente
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | usuario      | contrasena     | NombreRol              | HabilidadRol | EasyCase  | mensaje                         |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion | pruebas      | Rol Front | Registro guardado correctamente |

  @TestEdicionListaRoles
  Scenario Outline: Edicion Exitosa de Rol
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Roles Lista roles
    And Buscamos Lista Rol<BuscarRol>
    And Editamos Lista de Rol
    And Escribimos la informacion SubModulo Cierre de Expediente<NombreRol>,<HabilidadRol>,<EasyCase>
    #And Guardamos informacion SubModulo Cierre Expediente
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | usuario      | contrasena     | BuscarRol              | NombreRol               | HabilidadRol | EasyCase  | mensaje                         |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion | Pruebas Automatizacion2 | prueba2s     | Rol Front | Registro guardado correctamente |

  @TestEliminarListaRoles
  Scenario Outline: Edicion Exitosa de Rol
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Roles Lista roles
    And Buscamos Lista Rol<BuscarRol>
    And Eliminamos Lista de Rol
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | usuario      | contrasena     | BuscarRol               | mensaje                          |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion2 | Registro eliminado correctamente |