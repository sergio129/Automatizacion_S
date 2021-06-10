Feature: Page submodule documentation CNM
  As a user
  I need to create documentation CNM

  Scenario Outline: Successful documentation CNM submodule
    Given I am entry in the application documentation with user <user> and password <password>
    And I am entry for documentation CNM and set number case <numberCase>
    When set information management person <managementperson> and generates complaint <generatescomplaint> and observation <observation>
    Then user view the modal save documentation CNM with <modalmessage>

    Examples:
      | user            | password      | numberCase      | managementperson     | generatescomplaint |  observation                                  |  modalmessage                   |
      |yaira.acevedo    | YMAe8807**    |202104149600102  | Administrativo Aya   | No                 |pruebas automaticas creacion documentacion CNM |  Registro guardado correctamente|

  Scenario Outline: Successful documentation CNM submodule with filed complaint
    Given I am entry in the application documentation with user <user> and password <password>
    And I am entry for documentation CNM and set number case <numberCase>
    When set information with complaint management person <managementperson> and generates complaint <generatescomplaint> and observation <observation> and filed complaint <filedcomplaint>
    Then user view the modal save documentation CNM with <modalmessage>

    Examples:
      | user            | password      | numberCase      | managementperson     | generatescomplaint |  observation                                  |filedcomplaint       |  modalmessage                   |
      |yaira.acevedo    | YMAe8807**    |202104149600102  | Administrativo Aya   | No                 |pruebas automaticas creacion documentacion CNM |  15242411           |Registro guardado correctamente  |

  Scenario Outline: Documentation CNM submodule required fields
    Given I am entry in the application documentation with user <user> and password <password>
    And I am entry for documentation CNM and set number case <numberCase>
    When No set information documentation CNM
    Then user view the modal save documentation CNM with <modalmessage>

    Examples:
      |  user         | password   |numberCase         | modalmessage                                    |
      |yaira.acevedo  | YMAe8807** |202105030008697    | Todos los campos son obligatorios               |