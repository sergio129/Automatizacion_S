Feature: Parametrizacion de Ramos

  El usuario puede crear Ramos

  Background:
    Given I create bouquets parameterization

  @TestCreacionDeRamos
  Scenario Outline: Creacion de Exitosa de Ramos
    When I entering in the application with user <user> and password <password>
    And I enter bouquets parameterization
    And I select button create bouquets parameterization
    And I write information in bouquets parameterization and save <bouquets>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | bouquets                 | modalmessage                       |  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion11 | Registros guardados correctamente. |  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion11 | El ramo ya existe.                 |  |
