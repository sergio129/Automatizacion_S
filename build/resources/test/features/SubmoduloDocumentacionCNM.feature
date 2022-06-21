Feature: SubModulo Documentacion CNM
  As a user
  I need to create documentation CNM

  Background:
    Given I create a documentation CNM for a case

  @TestDocumentacionCNM
  Scenario Outline: Creacion Exitosa de Registro Documentacion CNM
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And Escribimos los datos de Documentacion CMN
      | PersonaGestion     | GeneraQueja | Radicajo | Observaciones |
      | Administrativo Aya | Si          | R5554454 | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password      | numberCase      | modalmessage                    |
      | Sergio.anaya | Colombia_2022 | A02206140800006 | Registro guardado correctamente |

  @TestDocumentationCNMCompleteWithComplaint
  Scenario Outline: Successful documentation CNM submodule with filed complaint
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And Escribimos los datos de Documentacion CMN
      | PersonaGestion     | GeneraQueja | Radicajo | Observaciones |
      | Administrativo Aya | Si          | R5554454 | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | numberCase      |
      | Sergio.anaya | Colombia_2027* | 202121344537266 |

  @TestDocumentationCNMRequiredFields
  Scenario Outline: Documentation CNM submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information documentation CNM
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | numberCase      | modalmessage                      |
      | yoarlys.carillo | Colombia2020* | 202104062454881 | Todos los campos son obligatorios |