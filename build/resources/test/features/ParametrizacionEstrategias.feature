Feature: Parametrizacion Estrategias
  As a user
  I need to edition a strategy parameterization

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestContingencyStrategyParameterizationEdition
  Scenario Outline: Contingency strategy parameterization successful edition
    When Gestionamos en Sara
    And I entering strategy parameterization
    And I type information in the contingency strategy with the name contingency search <namecontingencysearch> and the description <description>
    And I save button strategy parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | description | namecontingencysearch | modalmessage                    |
      | Prueba      | Contingencia          | Registro guardado correctamente |


  @TestCoordinationStrategyParameterizationEdition
  Scenario Outline: Coordination strategy parameterization successful edition
    When Gestionamos en Sara
    And I entering strategy parameterization
    And I entering search strategy parameterization <namecontingencysearch>
    And I type information in the coordination strategy with the description <description> and the time assignment <timeassignment> and the first expiration <firstexpiration> and the second expiration <secondexpiration>
    And I save button strategy parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | namecontingencysearch                 | description                                                              | timeassignment | firstexpiration | secondexpiration | modalmessage                    |
      | Estrategia de coordinación automática | {"status":"true","pqr_time":"2","one_end_date":"11","two_end_date":"20"} | 2              | 11              | 20               | Registro guardado correctamente |


  @TestMonitoringStrategyParameterizationEdition
  Scenario Outline: Monitoring strategy parameterization successful edition
    When Gestionamos en Sara
    And I entering push notifications
    And I entering search strategy parameterization <namecontingencysearch>
    And I type information in the monitoring strategy with the description <description> and the preventive time <preventivetime> and the time monitoring site <timemonitoringsite> and the time monitoring completion <timemonitoringcompletion>
    And I save button strategy parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | namecontingencysearch                      | description                                                                | preventivetime | timemonitoringsite | timemonitoringcompletion | modalmessage                    |
      | Estrategia de monitoreo servicios click si | {"status":"true","preventive_time":"2","site_time":"0","ending_time":"10"} | 2              | 0                  | 10                       | Registro guardado correctamente |
