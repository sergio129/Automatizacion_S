Feature: Page sub-module sura climbing
  As a user
  I need to create sura climbing

  Scenario Outline: Successful sura climbing submodule
    Given I am entry in the application sura climbing with user <user> and password <password>
    And I am entry and set number case <numberCase>
    When set information sura climbing management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    Then user view the modal save sura climbing with <modalmessage>

    Examples:
      |  user         | password   |numberCase        |managementtype                 |managementperson           |responsetype      |generatescomplaint       |   observations                        |modalmessage                          |
      |yaira.acevedo  | YMAe8807** |202105060008734   |Guardianes de la vida          | Sebastian Ossa Taborda    |Adulto mayor      |No                       | pruebas automaticas escalamiento sura |Registro guardado correctamente       |


  Scenario Outline: Sura climbing submodule successful edition
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry and set number case <numberCase>
    When set information edition sura climbing management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    Then user view the modal save sura climbing with <modalmessage>

    Examples:
      |  user         | password   |numberCase        |managementtype                 |managementperson           |responsetype           |generatescomplaint       | observations                                   |modalmessage                          |
      |yaira.acevedo  | YMAe8807** |202105060008734   |Mi águila                      | CNM                       |Lesiones o muerte      |No                       | pruebas automaticas escalamiento sura edicion  |Registro guardado correctamente       |


  Scenario Outline: Successful sura climbing submodule with filed complaint
    Given I am entry in the application sura climbing with user <user> and password <password>
    And I am entry and set number case <numberCase>
    When set information sura climbing with complaint management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations> and filed complaint <filedcomplaint>
    Then user view the modal save sura climbing with <modalmessage>

    Examples:
      |  user         | password   |numberCase         |managementtype                 |managementperson           |responsetype      |generatescomplaint   |observations                                        |   filedcomplaint       |      modalmessage                    |
      |yaira.acevedo  | YMAe8807** |2021050100000009   |Guardianes de la vida          | Sebastian Ossa Taborda    |Adulto mayor      |Si                   |pruebas automaticas escalamiento sura con queja     |24242411                |Registro guardado correctamente       |


  Scenario Outline: Successful sura climbing submodule edition with filed complaint
    Given I am entry in the application sura climbing with user <user> and password <password>
    And I am entry and set number case <numberCase>
    When set information edition sura climbing with complaint management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations> and filed complaint <filedcomplaint>
    Then user view the modal save sura climbing with <modalmessage>

    Examples:
      |  user         | password   |numberCase         |managementtype                 |managementperson           |responsetype          |generatescomplaint   |observations                                              |   filedcomplaint       |      modalmessage                    |
      |yaira.acevedo  | YMAe8807** |2021050100000009   |Mi águila                      | CNM                       |Lesiones o muerte     |Si                   |pruebas automaticas escalamiento sura con queja edicion   | 123456                 |Registro guardado correctamente       |


  Scenario Outline: Sura climbing submodule required fields
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry and set number case <numberCase>
    When No set information sura climbing
    Then user view the modal save sura climbing with <modalmessage>

    Examples:
      |  user         | password   |numberCase         | modalmessage                                    |
      |yaira.acevedo  | YMAe8807** |202105030008697    | Todos los campos son obligatorios               |