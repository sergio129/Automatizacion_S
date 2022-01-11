Feature: Codigos de Salida Parametrizacion

  EL usuario crea, edita y elimino codigos de salida

  Background:
    Given Creo, edito y elimino codigos de salida parametrizacion

  @TestCreacionCodigodeSalida
  Scenario Outline: Creacion Exitosa de Codigos de Salida
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Codigos de Salida Parametrizacion
    And Selecionamos el boton creacion de codigos de salida
    And Escribo la informacion de los codigos de salida<linea> y <CodigoSalida>
    Then Veo mensaje de modal codigos de salida<modalmensaje>
    Examples:
      | usuario      | contrasena     | linea            | CodigoSalida | modalmensaje                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669      | Registro guardado correctamente |

  @TestEdicionCodigosdeSalida
  Scenario Outline: Edicion exitosa de codigos de salida
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Codigos de Salida Parametrizacion
    And Selecionamos el boton buscar codigo de salida <linea>
    And Selecionamos el boton editar codigos de salida
    And Escribo la informacion de los codigos de salida<linea> y <CodigoSalida>
    Then Veo mensaje de modal codigos de salida<modalmensaje>
    Examples:
      | usuario      | contrasena     | linea            | CodigoSalida | modalmensaje                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669      | Registro guardado correctamente |