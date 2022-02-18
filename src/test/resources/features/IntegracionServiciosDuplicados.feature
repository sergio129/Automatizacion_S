Feature: Gestion de servicios duplicados

  Background:
    Given Se hace la gestion de los servicios que se crean duplicados

  @TestGestionServiciosDuplicados
  Scenario Template:Gestion de Servicios Duplicados
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Integracion Servicios Duplicados y Gestionamos
    Then Se visualiza la ventana nuevamente para gestionar otro servicio<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje |
      | Sergio.anaya | Colombia_2026* | menu         |