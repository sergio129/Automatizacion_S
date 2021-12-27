Feature: Exit code parameterization
  As a ser
  I need to create, edit and delete exit code parameterization

  Background:
    Given I create, edit and delete exit code parameterization

  @TestExitCodeParameterizationCreate
  Scenario Outline: Successful create exit code parameterization
    When I entering in the application with user <user> and password <password>
    And I enter exit code parameterization
    And I select button create exit code parameterization
    And I write information in exit code parameterization<line> and <exitcode>
    And I select button save exit code parameterization
    Then I view the modal save dialing codes parameterization <modalmessage>
    Examples:
      | user         | password       | line             | exitcode | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669  | Registro guardado correctamente |