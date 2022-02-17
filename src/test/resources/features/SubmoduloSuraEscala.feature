Feature: Page sub-module sura climbing
  As a user
  I need to create or edition a sura climbing

  Background:
    Given I create or edition a sura climbing for a case

  @TestSuraClimbingComplete
  Scenario Outline: Successful sura climbing submodule
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    Then I view the modal save sura climbing with <modalmessage>

    Examples:
      | user            | password      | numberCase      | managementtype        | managementperson       | responsetype | generatescomplaint | observations                          | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | A00000000000012 | Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | No                 | pruebas automaticas escalamiento sura | Registro guardado correctamente |


  @TestSuraClimbingEdition
  Scenario Outline: Sura climbing submodule successful edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information edition in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    Then I view the modal save sura climbing with <modalmessage>

    Examples:
      | user            | password      | numberCase      | managementtype | managementperson | responsetype      | generatescomplaint | observations                                  | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | A00000000000012  | Mi águila      | CNM              | Lesiones o muerte | No                 | pruebas automaticas escalamiento sura edicion | Registro guardado correctamente |


  @TestSuraClimbingCompleteWithComplaint
  Scenario Outline: Successful sura climbing submodule with filed complaint
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information complaint in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations> and filed complaint <filedcomplaint>
    Then I view the modal save sura climbing with <modalmessage>

    Examples:
      | user            | password      | numberCase       | managementtype        | managementperson       | responsetype | generatescomplaint | observations                                    | filedcomplaint | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | A00000000000012| Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | Si                 | pruebas automaticas escalamiento sura con queja | 24242411       | Registro guardado correctamente |


  @TestSuraClimbingEditionComplaint
  Scenario Outline: Successful sura climbing submodule edition with filed complaint
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information edition complaint in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations> and filed complaint <filedcomplaint>
    Then I view the modal save sura climbing with <modalmessage>

    Examples:
      | user            | password      | numberCase       | managementtype | managementperson | responsetype      | generatescomplaint | observations                                            | filedcomplaint | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | A00000000000012 | Mi águila      | CNM              | Lesiones o muerte | Si                 | pruebas automaticas escalamiento sura con queja edicion | 123456         | Registro guardado correctamente |


  @TestSuraClimbingRequiredFields
  Scenario Outline: Sura climbing submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information sura climbing
    Then I view the modal save sura climbing with <modalmessage>

    Examples:
      | user            | password      | numberCase      | modalmessage                      |
      | yoarlys.carillo | Colombia2020* | 202105030008697 | Todos los campos son obligatorios |