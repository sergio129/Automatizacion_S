Feature: Monitoring
  As a user
  I need to create or edition a task monitoring

  Background:
    Given I create or edition a task monitoring for a case

  @TestTaskMonitoringComplete
  Scenario Outline: Successful task monitoring creation
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    Then I view the modal save task monitoring <modalmessage>

    Examples:
      | user         | password       | numberCase      | name   | type                                | date       | expiredhour | userMonitoring | modalmessage                    |
      | Sergio.anaya | Colombia_2025* | 202121312837234 | Prueba | Monitoreo finalizacion del servicio | 2021-05-31 | 09:19am     | Yesenia        | Registro guardado correctamente |

  @TestTaskMonitoringEdition
  Scenario Outline: Successful task monitoring edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I select button edition monitoring task
    And I type information in the field state <state>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    Then I view the modal save task monitoring <modalmessage>

    Examples:
      |  user            | password    |numberCase          |state     | type                               | date        | expiredhour | userMonitoring      | modalmessage                         |
      |yaira.acevedo     | YMAe8807**  |202121312837234     | Vencida  |Monitoreo finalizacion del servicio | 2021-05-31  | 05:19am     | Yaira Manuela       | Registro guardado correctamente |

  @TestTaskMonitoringRequiredFields
  Scenario Outline: Task monitoring submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information task monitoring
    Then I view the modal save task monitoring <modalmessage>

    Examples:
      | user             | password    |   numberCase         |modalmessage                           |
      |yaira.acevedo     | YMAe8807**  |202106010009071       |Todos los campos son obligatorios |