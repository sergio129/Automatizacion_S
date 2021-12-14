Feature: Case closure parameterization
  As a user
  I need to create, edition or delete a case closure parameterization

  Background:
    Given I create, edition or delete a case closure parameterization

  @TestCaseClosureParameterization
  Scenario Outline: Successful case closure parameterization
    When I entering in the application with user <user> and password <password>
    And I entering case closure parameterization
    And I select button create case closure parameterization
    And I type information in the case closure parameterization with the line <lineclosure> and service <serviceclosure> and field <fieldclosure>
    Then I view the modal save case closure parameterization with <modalmessage>

    Examples:
      | user         | password       | lineclosure | serviceclosure | fieldclosure | modalmessage                           |
      | sergio.anaya | Colombia_2024* | Autos       | Grua           | Categoría Vh | Parametrización agregada correctamente |


  @TestCaseClosureParameterizationEdition
  Scenario Outline: Case closure parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering case closure parameterization
    And I select button edition case closure parameterization
    And I type information in the case closure parameterization with the line <lineclosure> and service <serviceclosure> and field <fieldclosure>
    Then I view the modal save lists parameterization with <modalmessage>

    Examples:
      | user          | password  | lineclosure | serviceclosure | fieldclosure | modalmessage                           |
      | yaira.acevedo | YMAe1710* |Autos         | Grua           | Zona roja    | Parametrización agregada correctamente |


  @TestCaseClosureParameterizationDelete
  Scenario Outline: Closure case parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I entering case closure parameterization
    And I select button delete case closure parameterization
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password  | modalmessage                                |
      | yaira.acevedo | YMAe1710* | Se elimino correctamente la parametrizacion |

  @TestCaseClosureParameterizationRequiredFields
  Scenario Outline: Case closure parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering case closure parameterization
    And I no type information case closure parameterization
    Then I view the modal save lists parameterization with <modalmessage>

    Examples:
      | user          | password   | modalmessage                     |
      | yaira.acevedo | YMAe1710*  |Todos los campos son obligatorios |