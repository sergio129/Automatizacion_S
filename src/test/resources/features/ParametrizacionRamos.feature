Feature: Bouquets parameterization

  As a user
  I need to create bouquets parameterization

  Background:
    Given I create bouquets parameterization

  @TestBouquetsParameterization
  Scenario Outline: Successful bouquets parameterization
    When I entering in the application with user <user> and password <password>
    And I enter bouquets parameterization
    And I select button create bouquets parameterization
    And I write information in bouquets parameterization and save <bouquets>
    Then I view the modal save  bouquets parameterization <modalmessage>
    Examples:
      | user         | password       | bouquets                 | modalmessage                       |  |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion11 | Registros guardados correctamente. |  |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion11 | El ramo ya existe.                 |  |