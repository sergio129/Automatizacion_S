Feature: Gestion de servicios duplicados

  Background:
    Given Se hace la gestion de los servicios que se crean duplicados

  @TestGestionServiciosDuplicados
  Scenario Template:
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Integracion Servicios Duplicados y Gestionamos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                    |
      | Sergio.anaya | Colombia_2026* | Registro guardado correctamente |