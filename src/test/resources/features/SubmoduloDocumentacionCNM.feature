Feature: SubModulo Documentacion CNM
  As a user
  I need to create documentation CNM

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"


  @TestDocumentacionCNM
  Scenario Outline: Creacion Exitosa de Registro Documentacion CNM
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Escribimos los datos de Documentacion CNM
      | PersonaGestion     | GeneraQueja | Radicajo | Observaciones |
      | Administrativo Aya | Si          | R5554454 | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |

  @TestDocumentationCNMCompleteWithComplaint
  Scenario Outline: Successful documentation CNM submodule with filed complaint
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Escribimos los datos de Documentacion CNM
      | PersonaGestion     | GeneraQueja | Radicajo | Observaciones |
      | Administrativo Aya | Si          | R5554454 | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |

  @TestDocumentationCNMRequiredFields
  Scenario Outline: Documentation CNM submodule required fields
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I no type information documentation CNM
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |