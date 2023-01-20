Feature: Integracion Gestion de solicitudes de reclamacion

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"


  @TestSolicitudReclamacionEstadoGestionado

  Scenario Template:Solicitud de reclamaciones Estado Gestionado
    When Gestionamos en Sara
    And Ingresamos a Integracion Solicitudes de reclamacion
    And Buscamos por numero de placa: "QA1128"
    And Seleccionamos el boton de gestionar solicitud de reclamaciones
    And Agregamos una Gestion de Solicitud de reclamaciones: <Tipo_Gestion>,<Persona_Gestion>,<Observaciones>
    And Seleccionamos un estado de Solicitud de reclamaciones:"Gestionado"
    And Guardamos la gestion
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Tipo_Gestion | Persona_Gestion | Observaciones         | modalmensaje |
      | GDI Crisis   | Front           | Pruebas Automatizadas | XXXXXX       |