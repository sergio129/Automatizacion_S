Feature: Contador de Casos

  Background: Buscar Casos asignado
    Given Buscar Casos asignado por todos los filtros

  @TestBusquedaDeCasos
  Scenario Outline: Buscar Casos Asiganados
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Casos Buscar Casos
   And Filtramos por Estado del servicio contador de caso <Estado_Servicio>
    And Filtramos por fecha inicio contador de casos <FI>
    And Filtramos por fecha fin contador de casos <FF>
    And Filtramos por Reporte contador de casos<reporte>
    Examples:
      | usuario      | contrasena     | Estado_Servicio | FI         | mensaje |
      | Sergio.anaya | Colombia_2026* | Abierto         | 2022-01-11 |         |