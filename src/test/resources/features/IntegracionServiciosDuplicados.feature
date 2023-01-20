Feature: Gestion de servicios duplicados

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestGestionServiciosDuplicados
  Scenario Template:Gestion de Servicios Duplicados
    When Gestionamos en Sara
    And Entramos a Integracion Servicios Duplicados y Gestionamos
    Then Se visualiza la ventana nuevamente para gestionar otro servicio<modalmensaje>
    Examples:
     | modalmensaje |
     | menu         |