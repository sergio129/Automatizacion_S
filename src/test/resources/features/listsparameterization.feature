Feature: Lists parameterization
  As a user
  I need to create or edition a lists parameterization

  Background:
    Given I create or edition a lists parameterization


  @TestListParameterization
  Scenario Outline: Successful lists parameterization
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I select button create lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    Then I view the modal save lists parameterization with <modalmessage>

    Examples:
      | user         | password       | roles         | modules            | lists           | options1 | options2 | modalmessage                      |
      | sergio.anaya | Colombia_2024* | prueba angela | Escalamientos sura | Tipo de gestión | Prueba   | GDI      | Registros guardados correctamente |


  @TestListParameterizationWithOption
  Scenario Outline: Successful lists parameterization with option
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I select button create lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And I create new list option with option name <optionname> and id easycase <ideasycase>
    Then I view the modal save lists parameterization with <modalmessage>

    Examples:
      | user         | password       | roles | modules            | lists           | options1      | options2      | optionname    | ideasycase | modalmessage                      |
      | sergio.anaya | Colombia_2022* | Admin | Escalamientos sura | Tipo de gestion | Opción Prueba | Banca seguros | prueba opcion | 12134      | Registros guardados correctamente |


  @TestListParameterizationEdition
  Scenario Outline: Lists parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I select button edition lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    Then I view the modal save lists parameterization with <modalmessage>

    Examples:
      | user         | password       | roles         | modules            | lists              | options1  | options2 | modalmessage                      |
      | sergio.anaya | Colombia_2024* | prueba angela | Escalamientos sura | Persona de gestión | Monitoreo | CNM      | Registros guardados correctamente |


  @TestControlBoardsParameterizationRequiredFields
  Scenario Outline: Lists parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I no type information lists parameterization
    Then I view the modal save lists parameterization with <modalmessage>
    Examples:
      | user         | password       | modalmessage                    |
      | sergio.anaya | Colombia_2024* | Todos los campos son requeridos |