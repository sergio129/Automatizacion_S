Feature: Generar Reportes

  Background:
    Given Generar Reportes

  @TestGenerarTodosLosReportes
  Scenario Outline: Generar Reportes
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a el modulo de reportes
    And Filtramos por nombre de reporte<Name>, Fechas: <Fechainicio>,<FechaFin>
    Examples:
      | usuario      | contrasena     | Name                                | Fechainicio        | FechaFin           |
      | Sergio.anaya | Colombia_2027* | Servicios por estado                | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos de coordinación             | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Gestión escalamientos               | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos de monitoreo                | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Gestión monitoreo proveedor         | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Gestión novedades                   | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Documentación CNM                   | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos de Escalamiento             | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Gestión Proveedores                 | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos de finalización             | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Notificaciones sonora y luminosa    | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Transcripción voz a texto           | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Trazabilidad de estados             | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos de gestion asesor por roles | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Contactos asistencia                | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Agendamientos                       | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Triaje de servicios                 | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Información general transferencia   | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Gestión gestor de soluciones        | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Cierre de expedientes               | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Casos no integrados                 | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Reporte de Citas                    | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos de gestión                  | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Conexión Emergencia Salud           | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Tiempos altos de contacto           | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Servicios Dobles                    | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Servicios Desprogramados            | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Eventos catastróficos               | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Medición AHT Discriminado           | 1 de marzo de 2022 | 2 de marzo de 2022 |
      | Sergio.anaya | Colombia_2027* | Alertas UCK                         | 1 de marzo de 2022 | 2 de marzo de 2022 |



