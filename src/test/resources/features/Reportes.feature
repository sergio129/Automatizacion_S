Feature: Generar Reportes

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestGenerarTodosLosReportes
  Scenario Outline: Generar Reportes
    When Gestionamos en Sara
    And Entramos a el modulo de reportes
    And Filtramos por nombre de reporte<Name>, Fechas: <Fechainicio>,<FechaFin>
    Examples:
      | Name                 | Fechainicio        | FechaFin           |
      | Servicios por estado | 1 de marzo de 2022 | 2 de marzo de 2022 |




