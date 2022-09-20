Feature: Page login
  As a user
  I need to enter the sura application
  Background:
    Given Ingreso a Sara

  @TestLogin
  Scenario Outline: Inputs null or undefined
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2024 |
    Then I view the message <message>
    Examples:
      | message |












