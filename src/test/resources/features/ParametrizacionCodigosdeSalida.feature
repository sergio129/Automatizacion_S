Feature: Codigos de Salida Parametrizacion

  EL usuario crea, edita y elimina codigos de salida

  Background:
    Given Creo, edito y elimino codigos de salida parametrizacion

  @TestCreacionCodigodeSalida
  Scenario Outline: Creacion Exitosa de Codigos de Salida
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion codigos de salida
    And Selecionamos el boton creacion codigos de salida
    And Escribimos la informacion de codigos de salida<line> y <exitcode>
    Then Se visualiza mensaje de la modal parametrizacion codigos de salida <modalmessage>
    Examples:
      | usuario      | contrasena     | line             | exitcode | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669  | Registro guardado correctamente |

  @TestEdicionCodigosdeSalida
  Scenario Outline: Edicion Parametrizacion Codigos de salida
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion codigos de salida
    And Selecionamos el boton buscar codigos de salida <line>
    And Selecionamos boton de editar codigos de salida
    And Escribimos la informacion de codigos de salida<line> y <exitcode>
    Then Se visualiza mensaje de la modal parametrizacion codigos de salida <modalmessage>
    Examples:
      | user         | password       | line             | exitcode | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669  | Registro guardado correctamente |