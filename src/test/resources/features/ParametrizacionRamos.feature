Feature: Parametrizacion de Ramos

  El usuario puede crear Ramos

  Background:
    Given I create bouquets parameterization

  @TestCreacionDeRamos @Test1
  Scenario Outline: Creacion de Exitosa de Ramos
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
    And I enter bouquets parameterization
    And I select button create bouquets parameterization
    And I write information in bouquets parameterization and save <linea>,<bouquets>
    Then Mostramos el mensaje de la modal de ramos<modalmessage>
    Examples:
      | linea            | bouquets    | modalmessage                       |
      | Emergencia salud | Pruebas QA8 | Registros guardados correctamente. |
      | Emergencia salud | Pruebas QA8 | El ramo ya existe.                 |
