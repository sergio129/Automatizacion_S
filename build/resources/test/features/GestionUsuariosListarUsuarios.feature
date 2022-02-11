Feature: Crear, Editar, Eliminar, Desloquear, Conexion Remota

  El usuario puede hacer las siguientes accion Crear, Editar, Eliminar, Desloquear, Conexion Remota

  Background:
    Given Hacer toda la gestion de usuarios

  @TestCreacionUsuario
  Scenario Outline: Creacion Exitosa de usuario
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a gestion de usuarios listar usuarios
    And Selecionamos el Boton Crear Listar Usuarios
    And Escribimos informacion de Listar Usuarios<NombreUsuario>,<Identificador>,<Correo>,<Rol>,<Asignacion>
    And Selecionamos el boton Guardar Listar Usuarios
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | NombreUsuario  | Identificador | Correo                    | Rol         | Asignacion       | modalmensaje                                        |
      | Sergio.anaya | Colombia_2026* | Automatizacion | prueba        | Automatizacion@prueba.com | Rol Gerente | Automatizacion.A | Registro guardado correctamente                     |
      | Sergio.anaya | Colombia_2026* | Automatizacion | prueba        | Automatizacion@prueba.com | Rol Gerente | Automatizacion.A | El usuario prueba no existe en el directorio activo |


  @TestEdicionUsuario
  Scenario Outline: Edicion Exitosa de usuario
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a gestion de usuarios listar usuarios
    And Buscamos en Lista de usuarios por Identificador:"sergio.anaya"
    And Selecionamos el Boton Editar Listar Usuarios
    And Escribimos informacion de Listar Usuarios<NombreUsuario>,<Identificador>,<Correo>,<Rol>,<Asignacion>
    And Selecionamos el boton Guardar Listar Usuarios
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | NombreUsuario            | Identificador | Correo                        | Rol           | Asignacion   | modalmensaje                    |
      | Sergio.anaya | Colombia_2026* | Sergio Luis Anaya Romero | sergio.anaya  | sergio.anaya@grupokonecta.com | Admin Backlog | sergio.anaya | Registro guardado correctamente |

  @TestConexionRemotaUsuario
  Scenario Outline: Conexion remota Exitosa de usuario
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a gestion de usuarios listar usuarios
    And Buscamos en Lista de usuarios por Identificador:"prueba.backloga"
    And visualizamos Informacion y Hacemos conexion remota
    Then Se visualiza ventana nueva ventana de conexion remota<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje |
      | Sergio.anaya | Colombia_2026* | menu         |
  @TestDeslogueoUsuario
  Scenario Outline: Conexion remota Exitosa de usuario
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a gestion de usuarios listar usuarios
    And Buscamos en Lista de usuarios por Identificador:"sergio.anaya"
    And visualizamos Informacion y Hacemos el deslogueo
    Then Se visualiza ventana nueva ventana de conexion remota<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje |
      | Sergio.anaya | Colombia_2026* | menu         |
