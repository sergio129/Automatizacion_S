Feature: Administrar Listas, Tareas de monitoreo

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionParametrizacionAsignacion
  Scenario Outline: Gestion tareas monitoreo
    When Gestionamos en Sara
    And Ingresamos a Administrar Tareas, Tareas de monitoreo
    And Hacemos los filtros de Administrar Tareas de monitoreo
    #Estos filtros estan en el archivo AdminTareasMonitoreo.properties
    And Gestionamos por Actualizacion masiva Usuario:"Karen Teresa Anaya Robledo", Estado dela tarea:"Pendiente"

    Examples: