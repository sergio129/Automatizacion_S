Feature: Pruebas Login

  Background:
    Given Ingrear a Sara con nuevo login

  @Testruebas
  Scenario Outline: Login
    When Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"
    Then I view the message <message>

    Examples:
      | message |
