Feature: Page login
  As a user
  I need to enter the sura application
  Background:
    Given I entering in the application
  @TestLogin
  Scenario Outline: Inputs null or undefined
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    Then I view the message <message>

    Examples:
      | message |












