Feature: Generar Reportes

  Background:
    Given Generar Reportes

  @TestGenerarTodosLosReportes
  Scenario Outline: Generar Reportes
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a el modulo de reportes
    And Filtramos por nombre de reporte<Name>, Fechas: <Fechainicio>,<FechaFin>
    Examples:
      | Name                 | Fechainicio        | FechaFin           |
      | Servicios por estado | 1 de marzo de 2022 | 2 de marzo de 2022 |




