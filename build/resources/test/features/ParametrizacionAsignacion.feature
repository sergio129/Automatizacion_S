Feature: Assignment parameterization
  As a user
  I need to create, edition or delete a assignment parameterization

  Background:
    Given I create, edition or delete a assignment parameterization

  @TestCreacionParametrizacionAsignacion
  Scenario Outline: Successful assignment parameterization
    When I entering in the application with user <user> and password <password>
    And I entering assignment parameterization
    And I select button create assignment
    And I type information in the assignment with the role <roleassignment> and the user <userassignment> and the line <lineassignment> and the service <serviceassignment> and the department <departmentassignment>,<cordinacion>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | roleassignment | userassignment   | lineassignment | serviceassignment | departmentassignment | cordinacion | modalmessage                    |
      | Sergio.anaya | Colombia_2027* | Admin Backlog  | yoarlys carrillo | Hogares        | Hospedaje Viajero | Antioquia            | No          | Registro guardado correctamente |


  @TestAssignmentParameterizationEdition
  Scenario Outline: Assignment parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering assignment parameterization
    And Buscamos por usuario Parametrizacion Asignacion "yoarlys carrillo"
    And I select button edition assignment
    And I type information in the assignment with the role <roleassignment> and the user <userassignment> and the line <lineassignment> and the service <serviceassignment> and the department <departmentassignment>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | roleassignment | userassignment    | lineassignment | serviceassignment | departmentassignment | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | Admin Backlog  | Sergio Luis Anaya | Hogares        | Vigilante Sp      | Bogota               | Registro guardado correctamente |


  @TestAssignmentParameterizationDelete
  Scenario Outline: Assignment parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I entering assignment parameterization
    And I type search in the assignment parameterization with the user <userassignment>
    And I select button delete assignment
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | userassignment   | modalmessage                     |
      | yoarlys.carillo | Colombia2020* | Yoarlys Carrillo | Registro eliminado correctamente |


  @TestAssignmentRequiredFields
  Scenario Outline: Assignment parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering assignment parameterization
    And I select button create assignment
    And I no type information assignment
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | modalmessage                      |
      | yoarlys.carillo | Colombia2020* | Todos los campos son obligatorios |