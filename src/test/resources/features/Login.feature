Feature: Pruebas Login

  Background:
    Given Ingresar a Sara con nuevo login

  @TestPruebasLogin
  Scenario Outline: Login
    When Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"
  When Gestionamos en Sara
    Then Se visualiza mensaje de la modal<mensaje>

    Examples:
      | mensaje |
