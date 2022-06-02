Feature: Parametrizacion Indicativos de Marcacion
  El usuario
  Crea, edita y elimina indicativos de marcacion

  Background:
    Given I create or edition of delete dialing codes parameterization

  @TestCreacionIndicativosDeMarcacion @Test1
  Scenario Outline: Creacion Exitosa de indicativos de marcacion
    When I entering in the application with user <user> and password <password>
    And I enter dialing codes parameterization
    And I select button create dialing codes parameterization
    And I Write information in dialing codes parameterization<department> and <municipality> and <indicative>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password      | department | municipality  | indicative | modalmessage                    |
      | sergio.anaya | Colombia_2021 | Vichada    | Santa Barbara | +65        | Registro guardado correctamente |

  @TestDialingCodesParameterizationEdit
  Scenario Outline: Successful Edit dialing codes parameterization
    When I entering in the application with user <user> and password <password>
    And I enter dialing codes parameterization
    And I select button search dialing codes parameterization<department> and <municipality>
    And I select button edit dialing codes parameterization
    And I Write information in dialing codes parameterization<department> and <municipality> and <indicative>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | department | municipality  | indicative | modalmessage                    |
      | sergio.anaya | Colombia_2027* | Vichada    | Santa Barbara | +78        | Registro guardado correctamente |

  @TestDialingCodesParameterizationDelete
  Scenario Outline: Successful delete dialing codes parameterization
    When I entering in the application with user <user> and password <password>
    And I enter dialing codes parameterization
    And I select button search dialing codes parameterization<department> and <municipality>
    And I select button delete dialing codes parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | department | municipality  | modalmessage                     |  |
      | sergio.anaya | Colombia_2026* | Vichada    | Santa Barbara | Registro eliminado correctamente |  |

  @TestDialingCodesParameterizationFields
  Scenario Outline: Successful valid fields dialing codes parameterization
    When I entering in the application with user <user> and password <password>
    And I enter dialing codes parameterization
    And I select button create dialing codes parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | modalmessage                         |  |  |  |
      | sergio.anaya | Colombia_2026* | Los campos marcados son obligatorios |  |  |  |
