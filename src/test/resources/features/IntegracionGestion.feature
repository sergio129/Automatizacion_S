Feature: Integracion Gestion de Expedientes

  Background:
    Given Gestion, Edicion de expedientes: Integracion

  @TestEdicionExpedienteIntegracion

  Scenario Template:Gestion de Servicios Duplicados
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Ingresamos a Integracion Gestion
    And Escribimos la informacion de Integracion Gestion<FCita>,<Hora>,<Nomb>,<Tlf>,<DpSl>,<MpSl>,<Placa>,<DServ>,<UbServ>,<DllDirecc>,<ServEsp>,<GCord>,<linea>,<Servicio>
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | FCita              | Hora | Nomb   | Tlf        | DpSl        | MpSl        | Placa  | DServ   | UbServ | DllDirecc | ServEsp | GCord | linea | Servicio         | modalmensaje                    |
      | 7 de marzo de 2022 | 06   | Prueba | 3103904286 | Bogota D.C. | Bogota D.C. | SVF98S | Clle 20 | QA     | QA        | No      | No    | Autos | Abogado En Sitio | Registro guardado correctamente |