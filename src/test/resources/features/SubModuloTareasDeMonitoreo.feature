Feature: Monitoring
  As a user
  I need to create or edition a task monitoring

  Background:
    Given I create or edition a task monitoring for a case

  @TestTaskMonitoringComplete
  Scenario Outline: Successful task monitoring creation
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I entering the advanced search and type case number <numberCase>
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And Selecionamos el Boton Guardar Tarea de Monitoreo
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | usuario      | contrasena     | numberCase       | name   | type                                | date       | expiredhour | userMonitoring    | modalmessage                    |
      | Sergio.anaya | Colombia_2026* | B202201064435401 | Prueba | Monitoreo finalizacion del servicio | 2021-05-31 | 09:19am     | Sergio Luis Anaya | Registro guardado correctamente |

  @TestTaskMonitoringEdition
  Scenario Outline: Successful task monitoring edition
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I entering the advanced search and type case number <numberCase>
    And I select button edition monitoring task
    And I type information in the field state <state>
    #And I type information in the field type <type>
    #And I type information in the field date <date>
    #And I type information in the field expired hour <expiredhour>
    #And I type information in the field user <userMonitoring>
    And Selecionamos el Boton Guardar Tarea de Monitoreo
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | usuario      | contrasena     | numberCase       | state   | modalmessage                    |
      | Sergio.anaya | Colombia_2026* | B202201064435401 | Cerrada | Registro guardado correctamente |

  @TestValidacionCamposTareasDeMonitoreo
  Scenario Outline: Task monitoring submodule required fields
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I entering the advanced search and type case number <numberCase>
    And I no type information task monitoring
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | usuario      | contrasena     | numberCase       | modalmessage                      |
      | Sergio.anaya | Colombia_2026* | B202201064435401 | Todos los campos son obligatorios |