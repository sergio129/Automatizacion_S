Feature: Creacion, Edicion y eliminacion de parametrizacion cierre de expediente.

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionParametrizacionCierreExpediente
  Scenario Outline: Creacion Exitosa de Prefijos
    When Gestionamos en Sara
    And Entramos Parametrizacion Cierre de Expediente
    And Seleccionamos el boton crear Parametrizacion Cierre de Expediente
    And Escribimos la informacion de parametrizacion Cierre de Expediente<linea>,<servicio>,<Campo>
    And Seleccionamos el boton guardar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | linea | servicio         | Campo    | modalmensaje                           |
      | ARL   | Emergencia Salud | Celosias | Parametrización agregada correctamente |

  @TestEdicionParametrizacionCierreExpediente
  Scenario Outline: Edicion Exitosa de Prefijos
    When Gestionamos en Sara
    And Entramos Parametrizacion Cierre de Expediente
    And Buscamos Parametrizacion Cierre de expediente por Linea:"Emergencia Salud", Servicio:"Emergencia Salud"
    And Seleccionamos el boton Editar Parametrizacion Cierre de Expediente
    And Escribimos la informacion de parametrizacion Cierre de Expediente<linea>,<servicio>,<Campo>
    And Seleccionamos el boton guardar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | linea  | servicio     | Campo                | modalmensaje                           |
      | Viajes | Certificados | ¿Concluido servicio? | Parametrización agregada correctamente |

  @TestEliminarParametrizacionCierreExpediente
  Scenario Outline: Edicion Exitosa de Prefijos
    When Gestionamos en Sara
    And Entramos Parametrizacion Cierre de Expediente
    And Buscamos Parametrizacion Cierre de expediente por Linea:"Hogares", Servicio:"Abogado En Sitio"
    And Seleccionamos el Boton Eliminar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                                |
      | Se elimino correctamente la parametrización |

  @TestValidarCamposParametrizacionCierreExpediente
  Scenario Outline: Edicion Exitosa de Prefijos
    When Gestionamos en Sara
    And Entramos Parametrizacion Cierre de Expediente
    And Seleccionamos el boton crear Parametrizacion Cierre de Expediente
    And Seleccionamos el boton guardar Parametrizacion Cierre de Expediente
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                      |
      | Todos los campos son obligatorios |
