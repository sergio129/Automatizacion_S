Feature: Call reasons parameterization
  As a user
  I need to create, edit and delete call reasons parameterization

  Background:
    Given I create, edit and delete call reasons parameterization

  @TestCallCreateServiceRequestNotCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When I entering in the application with user <user> and password <password>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I write information in call reasons parameterization and <name> and <line>
    And I Select button save call reasons parameterization
    Then I view the modal save call reasons parameterization <modalmessage>

    Examples:
      | user         | password       | name                   | line | modalmessage                      |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion | Auto | Registros guardados correctamente |

