Feature: Pruebas Login


  @TestPruebasLogin
  Scenario Outline: Login
    Given Ingresar a Sara con nuevo login
    When Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"
    Then Se visualiza nombre de usuario logueado<user>
    Examples:
      | user |
      |      |
