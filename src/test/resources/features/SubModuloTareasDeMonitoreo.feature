Feature: Tareas de Monitoreo
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
    And Seleccionamos el boton crear tarea de monitoreo
    And Escribimos los datos de la tare de monitoreo<Nombre>,<TipoTarea>,<FechaVencimiento>,<HoraVencimiento>,<Usuario>
    And Seleccionamos el Boton Guardar Tarea de Monitoreo
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | Nombre | TipoTarea                           | FechaVencimiento | HoraVencimiento | Usuario           | modalmessage                    |
      | Prueba | Monitoreo finalizacion del servicio | 2022-02-31       | 09:19am         | Sergio Luis Anaya | Registro guardado correctamente |

  @TestTaskMonitoringEdition
  Scenario Outline: Successful task monitoring edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I select button edition monitoring task
    And Hacemos el cambio de estado de la tarea: "Cerrada"
    And Seleccionamos el Boton Guardar Tarea de Monitoreo
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |

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