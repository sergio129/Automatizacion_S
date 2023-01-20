Feature: Parametrizacion Indicativos de Marcacion
  El usuario
  Crea, edita y elimina indicativos de marcacion

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionIndicativosDeMarcacion @Test1
  Scenario Outline: Creacion Exitosa de indicativos de marcacion
    When Gestionamos en Sara
    And I enter dialing codes parameterization
    And I select button create dialing codes parameterization
    And I Write information in dialing codes parameterization<department> and <municipality> and <indicative>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | department | municipality  | indicative | modalmessage                    |
      | Vichada    | Santa Barbara | +70        | Registro guardado correctamente |

  @TestDialingCodesParameterizationEdit
  Scenario Outline: Successful Edit dialing codes parameterization
    When Gestionamos en Sara
    And I enter dialing codes parameterization
    And I select button search dialing codes parameterization<department> and <municipality>
    And I select button edit dialing codes parameterization
    And I Write information in dialing codes parameterization<department> and <municipality> and <indicative>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
     | department | municipality  | indicative | modalmessage                    |
     | Vichada    | Santa Barbara | +78        | Registro guardado correctamente |

  @TestDialingCodesParameterizationDelete
  Scenario Outline: Successful delete dialing codes parameterization
    When Gestionamos en Sara
    And I enter dialing codes parameterization
    And I select button search dialing codes parameterization<department> and <municipality>
    And I select button delete dialing codes parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | department | municipality  | modalmessage                     |
      | Vichada    | Santa Barbara | Registro eliminado correctamente |

  @TestDialingCodesParameterizationFields
  Scenario Outline: Successful valid fields dialing codes parameterization
    When Gestionamos en Sara
    And I enter dialing codes parameterization
    And I select button create dialing codes parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                         |
      | Los campos marcados son obligatorios |
