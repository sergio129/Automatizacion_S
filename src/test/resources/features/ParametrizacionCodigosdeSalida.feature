Feature: Codigos de Salida Parametrizacion

  EL usuario crea, edita y elimina codigos de salida

  Background:
    Given Creo, edito y elimino codigos de salida parametrizacion

  @TestCreacionCodigoSalida
  Scenario Outline: Creacion Exitosa de Codigos de Salida
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a parametrizacion codigos de salida
    And Selecionamos el boton creacion codigos de salida
    And Escribimos la informacion de codigos de salida<line> y <exitcode>
    And Selecionamos el boton guardar codigo de salida
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | line             | exitcode | modalmensaje                    |
      | Emergencia salud | 5486669  | Registro guardado correctamente |

  @TestEdicionCodigoSalida
  Scenario Outline: Edicion Parametrizacion Codigos de salida
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a parametrizacion codigos de salida
    And Selecionamos el boton buscar codigos de salida <line>
    And Selecionamos boton de editar codigos de salida
    And Escribimos la informacion de codigos de salida<line> y <exitcode>
    And Selecionamos el boton guardar codigo de salida
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | line    | exitcode | modalmensaje                    |
      | Hogares | 5486669  | Registro guardado correctamente |

  @TestEliminarCodigoSalida
  Scenario Outline: Eliminacion Parametrizacion Codigos de salida
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a parametrizacion codigos de salida
    And Selecionamos el boton buscar codigos de salida <line>
    And Selecionamos boton de eliminar codigos de salida
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | line             | modalmensaje                     |  |
      | Emergencia salud | Registro eliminado correctamente |  |


  @TestvalidaciondeCampos
  Scenario Outline: Validacion de campos de codigos de salida
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a parametrizacion codigos de salida
    And Selecionamos el boton creacion codigos de salida
    And Selecionamos el boton guardar codigo de salida
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                      |
      | Todos los campos son obligatorios |

