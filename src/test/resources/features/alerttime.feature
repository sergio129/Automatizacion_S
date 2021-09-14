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
    Then I view the modal save alert time parameterization with <modalmessage>

    Examples:
      | user          | password | servicealert | time | modalmessage                    |
      | yaira.acevedo | YMAe8807* | Cerrajero   | 32   | Registro guardado correctamente |


  @TestAlertTimeParameterizationEdition
  Scenario Outline: Alert time parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering alert time parameterization
    And I select button edition alert time
    And I type information in the alert time with the service <servicealert> and the time <time>
    Then I view the modal save alert time parameterization with <modalmessage>

    Examples:
      | user          | password  | servicealert | time | modalmessage                    |
      | yaira.acevedo | YMAe8807* | Cerrajero    | 25   | Registro guardado correctamente |


  @TestAlertTimeParameterizationDelete
  Scenario Outline: Alert time parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I select button delete alert time
    Then I view the modal save alert time parameterization with <modalmessage>

    Examples:
      | user          | password  | modalmessage                   |
      | yaira.acevedo | YMAe8807* |registro eliminado correctamente|

