Feature: High Contact Times Integration
  Tiempos altos de contacto
  As a ser
  I need to management the high contact time integration

  Background:
    Given I management the high contact time integration

  @TestHighContactTimesIntegrationManagement
  Scenario Outline: Successful management the high contact time integration
    When I entering in the application with user <user> and password <password>
    And I enter high contact times integration
    And we make a filter<line>, we search and manage<management>
    Then I view the modal save high contact times integration<modalmessage>
    Examples:
      | user         | password       | line  | management  | modalmessage                    |
      | Sergio.anaya | Colombia_2025* | Autos | Sin novedad | Registro guardado correctamente |