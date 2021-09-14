Feature: Strategy parameterization
  As a user
  I need to edition a strategy parameterization

  Background:
    Given I edition a strategy parameterization

  @TestContingencyStrategyParameterizationEdition
  Scenario Outline: Contingency strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the contingency strategy with the name contingency search <namecontingencysearch> and the description <description>
    Then I view the modal save strategy parameterization with <modalmessage>

  Examples:
    | user          | password  | description          | namecontingencysearch  |modalmessage                    |
    | yaira.acevedo | YMAe1710* | pruebas contingencia | Contingencia           |Registro guardado correctamente |


  @TestCoordinationStrategyParameterizationEdition
  Scenario Outline: Coordination strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the coordination strategy with the description <description> and the time assignment <timeassignment> and the first expiration <firstexpiration> and the second expiration <secondexpiration>
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user          | password  | description    | timeassignment | firstexpiration | secondexpiration | modalmessage                    |
      | yaira.acevedo | YMAe1710* | prueba edicion | 5              | 15              | 22               | Registro guardado correctamente |


  @TestMonitoringStrategyParameterizationEdition
  Scenario Outline: Monitoring strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the monitoring strategy with the description <description> and the preventive time <preventivetime> and the time monitoring site <timemonitoringsite> and the time monitoring completion <timemonitoringcompletion>
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user          | password  | description    | preventivetime | timemonitoringsite | timemonitoringcompletion | modalmessage                    |
      | yaira.acevedo | YMAe1710* | prueba edicion | 5              | 13                 | 22                       | Registro guardado correctamente |


  @TestTaskMonitoringStrategyParameterizationEdition
  Scenario Outline: Task monitoring strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the task monitoring strategy with the description <description>
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user          | password  | description               | modalmessage                    |
      | yaira.acevedo | YMAe1710* | pruebas tareas estrategia | Registro guardado correctamente |


  @TestServicesStrategyParameterizationEdition
  Scenario Outline: Services strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the services strategy with the description <description> and the services <service>
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user          | password  | description               | service              | modalmessage                    |
      | yaira.acevedo | YMAe1710* | pruebas tareas estrategia | Abogado en sitio arl | Registro guardado correctamente |


  @TestNotificationStrategyParameterizationEdition
  Scenario Outline: Notification strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the notification strategy with the description <description> and the notification message <notificationmessage> and the notification time <notificationtime>
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user          | password  | description                     | notificationmessage | notificationtime | modalmessage                     |
      | yaira.acevedo | YMAe1710* | pruebas notificacion estrategia | Notificacion prueba | 8000             |  Registro guardado correctamente |