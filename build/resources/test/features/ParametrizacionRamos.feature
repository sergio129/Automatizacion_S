Feature: Parametrizacion de Ramos

  El usuario puede crear Ramos

  Background:
    Given I create bouquets parameterization

  @TestCreacionDeRamos
  Scenario Outline: Creacion de Exitosa de Ramos
    When I entering in the application with user <user> and password <password>
    And I enter bouquets parameterization
    And I select button create bouquets parameterization
    And I write information in bouquets parameterization and save <linea>,<bouquets>
    Then Mostramos el mensaje de la modal de ramos<modalmessage>
    Examples:
      | user         | password       | linea            | bouquets                 | modalmessage                       |  |
      | Sergio.anaya | Colombia_2027* | Emergencia salud | Pruebas Automatizacion15 | Registros guardados correctamente. |  |
      | Sergio.anaya | Colombia_2027* | Emergencia salud | Pruebas Automatizacion15 | El ramo ya existe.                 |  |
