Feature: Hide monitoring tasks parameterization
  As a user
  I need to create, edition or delete a hide monitoring tasks parameterization

  Background:
    Given I create, edition or delete a hide monitoring tasks parameterization

  @TestHideMonitoringTasksParameterization
  Scenario Outline: Successful hide monitoring tasks parameterization
    When I entering in the application with user <user> and password <password>
    And I entering hide monitoring tasks parameterization
    And I select button create hide monitoring tasks
    And I type information in the hide monitoring tasks with the line <linetasks> and the service <servicetasks> and the task type <tasktype>
    Then I view the modal save hide monitoring tasks parameterization with <modalmessage>

    Examples:
      | user          | password  | linetasks | servicetasks     | tasktype             | modalmessage                    |
      | yaira.acevedo | YMAe1710* | Autos     | Abogado en sitio | Monitoreo preventivo | Registro guardado correctamente |

  @TestHideMonitoringTasksParameterizationEdition
  Scenario Outline: Hide monitoring tasks parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering hide monitoring tasks parameterization
    And I type filters with the line <linesearch> and the service <servicesearch> and the task type <tasktypesearch> and select button edition hide monitoring tasks
    And I type information in the hide monitoring tasks with the line <linetasks> and the service <servicetasks> and the task type <tasktype>
    Then I view the modal save hide monitoring tasks parameterization with <modalmessage>

    Examples:
      | user          | password  | linesearch | servicesearch    | tasktypesearch       | linetasks | servicetasks | tasktype           | modalmessage                    |
      | yaira.acevedo | YMAe1710* | Autos      | Abogado en sitio | Monitoreo preventivo | Renting   | Grua         | Monitoreo en Sitio | Registro guardado correctamente |


  @TestHideMonitoringTasksParameterizationDelete
  Scenario Outline: Hide monitoring tasks parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I select button delete hide monitoring tasks
    Then I view the modal save hide monitoring tasks parameterization with <modalmessage>

    Examples:
      | user          | password   | modalmessage                   |
      | yaira.acevedo | YMAe1710*  |Registro eliminado correctamente|


  @TestHideMonitoringTasksRequiredFields
  Scenario Outline: Hide monitoring tasks parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I select button create hide monitoring tasks
    And I no type information hide monitoring tasks
    Then I view the modal save hide monitoring tasks parameterization with <modalmessage>

    Examples:
      | user          | password   | modalmessage                     |
      | yaira.acevedo | YMAe1710*  |Todos los campos son obligatorios |