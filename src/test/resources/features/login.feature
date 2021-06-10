Feature: Page login
  As a user I need to enter the sura application

  Scenario Outline: Inputs null or undefined
    Given i am entry in the application
    When i enter the user <user> and the password <password>
    Then user view <message> in the input


    Examples:
      |user          | password       |       message           |
      |yaira.acevedo |    YMAe8807*   |                         |
      |              |    123         | Campo requerido*        |
      |yaira.acevedo |                | Campo requerido*        |










