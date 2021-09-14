Feature: Assignment parameterization
  As a user
  I need to create, edition or delete a assignment parameterization

  Background:
    Given I create, edition or delete a assignment parameterization

  @TestAssignmentParameterization
  Scenario Outline: Successful assignment parameterization
    When I entering in the application with user <user> and password <password>
    And I entering assignment parameterization
    And I select button create assignment
    And I type information in the assignment with the role <roleassignment> and the user <userassignment> and the line <lineassignment> and the service <serviceassignment> and the department <departmentassignment>
    Then I view the modal save assignment parameterization with <modalmessage>

    Examples:
      | user          | password  | roleassignment | userassignment      | lineassignment | serviceassignment | departmentassignment | modalmessage                    |
      | yaira.acevedo |           | Admin Backlog  | Yaira Manuela Admin | Autos          | Grua              | Antioquia            | Registro guardado correctamente |


  @TestAssignmentParameterizationEdition
  Scenario Outline: Assignment parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering assignment parameterization
    And I select button edition assignment
    And I type information in the assignment with the role <roleassignment> and the user <userassignment> and the line <lineassignment> and the service <serviceassignment> and the department <departmentassignment>
    Then I view the modal save assignment parameterization with <modalmessage>

    Examples:
      | user          | password  | roleassignment | userassignment      | lineassignment | serviceassignment | departmentassignment | modalmessage                    |
      | yaira.acevedo |           | Admin Backlog  | Yaira Manuela Admin | Autos          | Audiencia         | Atlantico            | Registro guardado correctamente |


  @TestAssignmentParameterizationDelete
  Scenario Outline: Assignment parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I select button delete assignment
    Then I view the modal save assignment parameterization with <modalmessage>

    Examples:
      | user          | password   | modalmessage                   |
      | yaira.acevedo |            |registro eliminado correctamente|


  @TestAssignmentRequiredFields
  Scenario Outline: Assignment parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I select button create assignment
    And I no type information assignment
    Then I view the modal save assignment parameterization with <modalmessage>

    Examples:
      | user          | password   | modalmessage                     |
      | yaira.acevedo |            |Todos los campos son obligatorios |