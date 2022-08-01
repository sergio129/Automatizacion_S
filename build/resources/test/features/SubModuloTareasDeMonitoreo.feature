Feature: Monitoring
  As a user
  I need to create or edition a task monitoring

  Background:
    Given I create or edition a task monitoring for a case

  @TestTaskMonitoringComplete
  Scenario Outline: Successful task monitoring creation
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And Selecionamos el Boton Guardar Tarea de Monitoreo
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | name   | type                                | date       | expiredhour | userMonitoring    | modalmessage                    |
      | Prueba | Monitoreo finalizacion del servicio | 2022-02-31 | 09:19am     | Sergio Luis Anaya | Registro guardado correctamente |

  @TestTaskMonitoringEdition
  Scenario Outline: Successful task monitoring edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I select button edition monitoring task
    And I type information in the field state <state>
    #And I type information in the field type <type>
    #And I type information in the field date <date>
    #And I type information in the field expired hour <expiredhour>
    #And I type information in the field user <userMonitoring>
    And Selecionamos el Boton Guardar Tarea de Monitoreo
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | state   | modalmessage                    |
      | Cerrada | Registro guardado correctamente |

  @TestValidacionCamposTareasDeMonitoreo
  Scenario Outline: Task monitoring submodule required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I no type information task monitoring
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |