Feature: Integracion Gestion de Expedientes

  Background:
    Given Gestion, Edicion de expedientes: Integracion

  @TestEdicionExpedienteIntegracion

  Scenario Template:Gestion de Servicios Duplicados
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Ingresamos a Integracion Gestion
    And Escribimos la informacion de Integracion Gestion<FCita>,<Hora>,<Nomb>,<Tf1>,<Tf2>,<DpSl>,<MpSl>,<MpSl>,<DServ>
    Examples:
      | usuario      | contrasena     | FCita              | Hora | Nomb   | Tf1        | Tf1        | DpSl        | MpSl        | MpSl   | DServ   |
      | Sergio.anaya | Colombia_2027* | 4 de marzo de 2022 | 6    | Prueba | 3103904286 | 3103904286 | Bogota D.C. | Bogota D.C. | SVF98S | Clle 20 |