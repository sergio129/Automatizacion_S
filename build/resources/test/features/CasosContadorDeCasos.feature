Feature: Contador de Casos

  Background: Buscar Casos asignado
    Given Buscar Casos asignado por todos los filtros

  @TestBusquedaDeCasos
  Scenario Outline: Buscar Casos Asiganados por estado
    When Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"
    And Entramos a Casos Buscar Casos
    And Filtramos por Estado del servicio contador de caso <Estado_Servicio>
    And Filtramos por fecha inicio contador de casos <FechaInicio>
    And Filtramos por Fecha Fin contador de casos <FechaFin>
    And Filtramos por Reporte contador de casos <Reporte>
    And Semuestra la cantidad de casos<mensaje>
    Examples:
      | Estado_Servicio | FechaInicio            | FechaFin               | Reporte                   | mensaje         |
      | Concluido       | 1 de noviembre de 2022 | 2 de noviembre de 2022 | Expedientes por proveedor | Estado servicio |


  @TestBusquedaDeCasosTodosLosEstados
  Scenario Outline: Buscar Casos Asiganados por todos los estados
    When Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"
    And Entramos a Casos Buscar Casos
    And Seleccionamos Check de todos los estados
    And Filtramos por fecha inicio contador de casos <FechaInicio>
    And Filtramos por Fecha Fin contador de casos <FechaFin>
    And Filtramos por Reporte contador de casos <Reporte>
    And Semuestra la cantidad de casos<mensaje>
    Examples:
      | FechaInicio          | FechaFin              | Reporte                   | mensaje         |
      | 1 de febrero de 2022 | 24 de febrero de 2022 | Expedientes por proveedor | Estado servicio |