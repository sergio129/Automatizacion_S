Feature: Parametrizacion Estrategias
  As a user
  I need to edition a strategy parameterization

  Background:
    Given I edition a strategy parameterization

  @TestContingencyStrategyParameterizationEdition
  Scenario Outline: Contingency strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I type information in the contingency strategy with the name contingency search <namecontingencysearch> and the description <description>
    And I save button strategy parameterization
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user         | password       | description | namecontingencysearch | modalmessage                    |
      | sergio.anaya | Colombia_2026* | Prueba      | Contingencia          | Registro guardado correctamente |


  @TestCoordinationStrategyParameterizationEdition
  Scenario Outline: Coordination strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering strategy parameterization
    And I entering search strategy parameterization <namecontingencysearch>
    And I type information in the coordination strategy with the description <description> and the time assignment <timeassignment> and the first expiration <firstexpiration> and the second expiration <secondexpiration>
    And I save button strategy parameterization
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user         | password       | namecontingencysearch                 | description                                                              | timeassignment | firstexpiration | secondexpiration | modalmessage                    |
      | Sergio.anaya | Colombia_2026* | Estrategia de coordinación automática | {"status":"true","pqr_time":"2","one_end_date":"11","two_end_date":"20"} | 2              | 11              | 20               | Registro guardado correctamente |


  @TestMonitoringStrategyParameterizationEdition
  Scenario Outline: Monitoring strategy parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I entering search strategy parameterization <namecontingencysearch>
    And I type information in the monitoring strategy with the description <description> and the preventive time <preventivetime> and the time monitoring site <timemonitoringsite> and the time monitoring completion <timemonitoringcompletion>
    And I save button strategy parameterization
    Then I view the modal save strategy parameterization with <modalmessage>

    Examples:
      | user         | password       | namecontingencysearch                      | description                                                                | preventivetime | timemonitoringsite | timemonitoringcompletion | modalmessage                    |
      | sergio.anaya | Colombia_2026* | Estrategia de monitoreo servicios click si | {"status":"true","preventive_time":"2","site_time":"0","ending_time":"10"} | 2              | 0                  | 10                       | Registro guardado correctamente |
