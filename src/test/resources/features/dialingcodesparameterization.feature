Feature: Dialing codes parameterization
  As a user
  I need to create or edition of delete dialing codes parameterization

  Background:
    Given I create or edition of delete dialing codes parameterization

  @TestDialingCodesParameterizationCreate
  Scenario Outline: Successful create dialing codes parameterization
    When I entering in the application with user <user> and password <password>
    And I enter dialing codes parameterization
    And I select button create dialing codes parameterization
    And I Write information in dialing codes parameterization<department> and <municipality> and <indicative>
    Then I view the modal save dialing codes parameterization <modalmessage>
    Examples:
      | user         | password       | department | municipality | indicative | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Cordoba    | Lorica       | +65        | Registro guardado correctamente |

  @TestDialingCodesParameterizationEdit
  Scenario Outline: Successful Edit dialing codes parameterization
    When I entering in the application with user <user> and password <password>
    And I enter dialing codes parameterization
    And I select button search and edit dialing codes parameterization<department> and <municipality>
    And I Write information in dialing codes parameterization<department> and <municipality> and <indicative>
    Then I view the modal save dialing codes parameterization <modalmessage>
    Examples:
      | user         | password       | department | municipality | indicative | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Vichada    | Lorica       | +78        | Registro guardado correctamente |

