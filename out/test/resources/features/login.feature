Feature: Page login
  As a user
  I need to enter the sura application

  @TestLogin
  Scenario Outline: Inputs null or undefined
    Given I entering in the application
    When I entering in the application with user <user> and password <password>
    Then I view the message <message>

    Examples:
      | user         | password       | message                           |
      | sergio.anaya | Colombia_2025* |                                   |
      |              | 123            | Todos los campos son obligatorios |
      | sergio.anaya |                | Todos los campos son obligatorios |










