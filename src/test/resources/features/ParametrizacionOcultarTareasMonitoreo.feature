Feature: Hide monitoring tasks parameterization
  As a user
  I need to create, edition or delete a hide monitoring tasks parameterization

  Background:
    Given I create, edition or delete a hide monitoring tasks parameterization

  @TestHideMonitoringTasksParameterization
  Scenario Outline: Successful hide monitoring tasks parameterization
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering hide monitoring tasks parameterization
    And I select button create hide monitoring tasks
    And I type information in the hide monitoring tasks with the line <linetasks> and the service <servicetasks> and the task type <tasktype>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | linetasks | servicetasks     | tasktype             | modalmessage                    |
      | Autos     | Abogado en sitio | Monitoreo preventivo | Registro guardado correctamente |

  @TestHideMonitoringTasksParameterizationEdition
  Scenario Outline: Hide monitoring tasks parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering hide monitoring tasks parameterization
    And I type filters with the line <linesearch> and the service <servicesearch> and the task type <tasktypesearch>  and select button search hide monitoring task parameterization and select button edition hide monitoring tasks
    And I type information in the hide monitoring tasks with the line <linetasks> and the service <servicetasks> and the task type <tasktype>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | linesearch       | servicesearch | tasktypesearch     | linetasks | servicetasks | tasktype           | modalmessage                    |
      | Emergencia salud | Cerrajero     | Elertas especiales | Renting   | Grua         | Monitoreo en Sitio | Registro guardado correctamente |


  @TestHideMonitoringTasksParameterizationDelete
  Scenario Outline: Hide monitoring tasks parameterization successful delete
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering hide monitoring tasks parameterization
    And I select button delete hide monitoring tasks
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                     |
      | Registro eliminado correctamente |


  @TestHideMonitoringTasksRequiredFields
  Scenario Outline: Hide monitoring tasks parameterization required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering hide monitoring tasks parameterization
    And I select button create hide monitoring tasks
    And I no type information hide monitoring tasks
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |