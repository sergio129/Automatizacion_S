Feature: SubModulo Documentacion CNM
  As a user
  I need to create documentation CNM

  Background:
    Given I create a documentation CNM for a case

  @TestDocumentationCNMComplete
  Scenario Outline: Creacion Exitosa de Registro Documentacion CNM
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and Radicado <Radi>, observation <observationdocumentation>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | numberCase      | managementpersondocumentation | generatescomplaintdocumentation | Radi      | observationdocumentation                       | modalmessage                    |
      | Sergio.anaya | Colombia_2026* | 202121344537266 | Administrativo Aya            | Si                              | R66655411 | pruebas automaticas creacion documentacion CNM | Registro guardado correctamente |

  @TestDocumentationCNMCompleteWithComplaint
  Scenario Outline: Successful documentation CNM submodule with filed complaint
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and Radicado <Radi>, observation <observationdocumentation>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | numberCase      | managementpersondocumentation | generatescomplaintdocumentation | observationdocumentation                       | Radi     | modalmessage                    |
      | Sergio.anaya | Colombia_2027* | 202121344537266 | Administrativo Aya            | Si                              | pruebas automaticas creacion documentacion CNM | 15242411 | Registro guardado correctamente |

  @TestDocumentationCNMRequiredFields
  Scenario Outline: Documentation CNM submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information documentation CNM
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | numberCase      | modalmessage                      |
      | yoarlys.carillo | Colombia2020* | 202104062454881 | Todos los campos son obligatorios |