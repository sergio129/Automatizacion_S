Feature: Page submodule documentation CNM
  As a user
  I need to create documentation CNM

  Background:
    Given I create a documentation CNM for a case

  @TestDocumentationCNMComplete
  Scenario Outline: Successful documentation CNM submodule
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation>
    Then I view the modal save documentation CNM with <modalmessage>

    Examples:
      | user            | password      | numberCase      | managementpersondocumentation | generatescomplaintdocumentation |  observationdocumentation                     |  modalmessage                   |
      |yaira.acevedo    | YMAe8807*     |202104062454881  | Administrativo Aya            | No                              |pruebas automaticas creacion documentacion CNM |  Registro guardado correctamente|

  @TestDocumentationCNMCompleteWithComplaint
  Scenario Outline: Successful documentation CNM submodule with filed complaint
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information complaint in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation> and filed complaint <filedcomplaint>
    Then I view the modal save documentation CNM with <modalmessage>

    Examples:
      | user            | password      | numberCase      | managementpersondocumentation    | generatescomplaintdocumentation |  observationdocumentation                     |filedcomplaint       |  modalmessage                   |
      |yaira.acevedo    | YMAe8807*     |202104149600102  | Administrativo Aya               | Si                              |pruebas automaticas creacion documentacion CNM |  15242411           |Registro guardado correctamente  |

  @TestDocumentationCNMRequiredFields
  Scenario Outline: Documentation CNM submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information documentation CNM
    Then I view the modal save documentation CNM with <modalmessage>

    Examples:
      |  user         | password   |numberCase         | modalmessage                                    |
      |yaira.acevedo  | YMAe8807*  |202105030008697    | Todos los campos son obligatorios               |