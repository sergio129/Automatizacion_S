Feature: Creacion, Edicion y eliminacion de parametrizacion cierre de expediente.

  Background:
    Given Gestion la Creacion, Edicion y eliminacion de parametrizacion cierre de expediente

  @TestCreacionParametrizacionCierreExpediente
  Scenario Outline: Creacion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos Parametrizacion Cierre de Expediente
    And Seleccionamos el boton crear Parametrizacion Cierre de Expediente
    And Escribimos la informacion de parametrizacion Cierre de Expediente<linea>,<servicio>,<Campo>
    And Seleccionamos el boton guardar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | linea            | servicio         | Campo    | modalmensaje                           |
      | Sergio.anaya | Colombia_2026* | Emergencia Salud | Emergencia Salud | Celosias | Parametrización agregada correctamente |

  @TestEdicionParametrizacionCierreExpediente
  Scenario Outline: Edicion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos Parametrizacion Cierre de Expediente
    And Buscamos Parametrizacion Cierre de expediente por Linea:"Emergencia Salud", Servicio:"Emergencia Salud"
    And Selecionamos el boton Editar Parametrizacion Cierre de Expediente
    And Escribimos la informacion de parametrizacion Cierre de Expediente<linea>,<servicio>,<Campo>
    And Seleccionamos el boton guardar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | linea  | servicio     | Campo                | modalmensaje                           |
      | Sergio.anaya | Colombia_2026* | Viajes | Certificados | ¿Concluido servicio? | Parametrización agregada correctamente |

  @TestEliminarParametrizacionCierreExpediente
  Scenario Outline: Edicion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos Parametrizacion Cierre de Expediente
    And Buscamos Parametrizacion Cierre de expediente por Linea:"Emergencia Salud", Servicio:"Emergencia Salud"
    And Seleccionamos el Boton Eliminar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                                |
      | Sergio.anaya | Colombia_2026* | Se elimino correctamente la parametrización |

  @TestValidarCamposParametrizacionCierreExpediente
  Scenario Outline: Edicion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos Parametrizacion Cierre de Expediente
    And Seleccionamos el boton crear Parametrizacion Cierre de Expediente
    And Seleccionamos el boton guardar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                      |
      | Sergio.anaya | Colombia_2026* | Todos los campos son obligatorios |
