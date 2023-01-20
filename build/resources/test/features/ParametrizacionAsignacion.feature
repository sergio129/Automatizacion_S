Feature: Assignment parameterization
  As a user
  I need to create, edition or delete a assignment parameterization

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionParametrizacionAsignacion
  Scenario Outline: Successful assignment parameterization
    When Gestionamos en Sara
    And I entering assignment parameterization
    And I select button create assignment
    And I type information in the assignment with the role <roleassignment> and the user <userassignment> and the line <lineassignment> and the service <serviceassignment> and the department <departmentassignment>,<cordinacion>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | roleassignment | userassignment   | lineassignment | serviceassignment | departmentassignment | cordinacion | modalmessage                    |
      | Admin Backlog  | yoarlys carrillo | Hogares        | Hospedaje Viajero | Antioquia            | No          | Registro guardado correctamente |


  @TestAssignmentParameterizationEdition
  Scenario Outline: Assignment parameterization successful edition
    When Gestionamos en Sara
    And I entering assignment parameterization
    And Buscamos por usuario Parametrizacion Asignacion "yoarlys carrillo"
    And I select button edition assignment
    And I type information in the assignment with the role <roleassignment> and the user <userassignment> and the line <lineassignment> and the service <serviceassignment> and the department <departmentassignment>,<cordinacion>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | roleassignment | userassignment    | lineassignment | serviceassignment | departmentassignment | cordinacion | modalmessage                    |
      | Admin Backlog  | Sergio Luis Anaya | Hogares        | Vigilante Sp      | Bogota               | Si          | Registro guardado correctamente |


  @TestAssignmentParameterizationDelete
  Scenario Outline: Assignment parameterization successful delete
    When Gestionamos en Sara
    And I entering assignment parameterization
    And I type search in the assignment parameterization with the user <userassignment>
    And I select button delete assignment
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | userassignment   | modalmessage                     |
      | Yoarlys Carrillo | Registro eliminado correctamente |


  @TestAssignmentRequiredFields
  Scenario Outline: Assignment parameterization required fields
    When Gestionamos en Sara
    And I entering assignment parameterization
    And I select button create assignment
    And I no type information assignment
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |