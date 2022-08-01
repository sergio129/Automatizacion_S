Feature: Alert time parameterization
  As a user
  I need to create, edition or delete a alert time parameterization

  Background:
    Given I create, edition or delete alert time parameterization

  @TestAlertTimeParameterization
  Scenario Outline: Successful alert parameterization
    When I entering in the application with user <user> and password <password>
    And I entering alert time parameterization
    And I select button create alert time
    And I type information in the alert time with the service <servicealert> and the time <time>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | servicealert | time | modalmessage                    |
      | Sergio.anaya | Colombia_2026* | Policia      | 32   | Registro guardado correctamente |


  @TestEdicionTiemposDeAlerta
  Scenario Outline: Alert time parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering alert time parameterization
    And I select button edition alert time
    And I type information in the alert time with the service <servicealert> and the time <time>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | servicealert | time | modalmessage                    |
      | Sergio.anaya | Colombia_2026* | Policia      | 25   | Registro guardado correctamente |


  @TestAlertTimeParameterizationDelete
  Scenario Outline: Alert time parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I entering alert time parameterization
    And I select button delete alert time
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | modalmessage                     |
      | Sergio.anaya | Colombia_2026* | Registro eliminado correctamente |
