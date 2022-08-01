Feature: Gestion de servicios duplicados

  Background:
    Given Se hace la gestion de los servicios que se crean duplicados

  @TestGestionServiciosDuplicados
  Scenario Template:Gestion de Servicios Duplicados
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a Integracion Servicios Duplicados y Gestionamos
    Then Se visualiza la ventana nuevamente para gestionar otro servicio<modalmensaje>
    Examples:
     | modalmensaje |
     | menu         |