Feature: Integracion Gestion de Expedientes

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestEdicionExpedienteIntegracion

  Scenario Template:Gestion de Servicios Duplicados
    When Gestionamos en Sara
    And Ingresamos a Integracion Gestion
    And Escribimos la informacion de Integracion Gestion<FCita>,<Hora>,<Nomb>,<Tlf>,<DpSl>,<MpSl>,<Placa>,<DServ>,<UbServ>,<DllDirecc>,<ServEsp>,<GCord>,<linea>,<Servicio>
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | FCita              | Hora | Nomb   | Tlf        | DpSl        | MpSl        | Placa  | DServ   | UbServ | DllDirecc | ServEsp | GCord | linea | Servicio         | modalmensaje                    |
      | 7 de marzo de 2022 | 06   | Prueba | 3103904286 | Bogota D.C. | Bogota D.C. | SVF98S | Clle 20 | QA     | QA        | No      | No    | Autos | Abogado En Sitio | Registro guardado correctamente |