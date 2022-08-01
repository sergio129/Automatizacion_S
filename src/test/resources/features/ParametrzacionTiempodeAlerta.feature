Feature: Alert time parameterization
  As a user
  I need to create, edition or delete a alert time parameterization

  Background:
    Given I create, edition or delete alert time parameterization

  @TestAlertTimeParameterization
  Scenario Outline: Successful alert parameterization
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering alert time parameterization
    And I select button create alert time
    And I type information in the alert time with the service <servicealert> and the time <time>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | servicealert | time | modalmessage                    |
      | Policia      | 32   | Registro guardado correctamente |


  @TestEdicionTiemposDeAlerta
  Scenario Outline: Alert time parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering alert time parameterization
    And I select button edition alert time
    And I type information in the alert time with the service <servicealert> and the time <time>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | servicealert | time | modalmessage                    |
      | Policia      | 25   | Registro guardado correctamente |


  @TestAlertTimeParameterizationDelete
  Scenario Outline: Alert time parameterization successful delete
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering alert time parameterization
    And I select button delete alert time
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                     |
      | Registro eliminado correctamente |

