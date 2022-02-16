Feature: Lists parameterization
  As a user
  I need to create or edition a lists parameterization

  Background:
    Given I create or edition a lists parameterization


  @TestCreacionParametrizacionLista
  Scenario Outline: Creacion Parametrizacion de lista
    When Ingresamos a la aplicacion con usuario<user> y contraseña<password>
    And I entering lists parameterization
    And I select button create lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And Selecionamos el boton guardar lista
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | roles            | modules            | lists           | options1        | options2      | modalmessage                      |
      | sergio.anaya | Colombia_2026* | Emergencia salud | Escalamientos sura | Tipo de gestión | GDA Integracion | GDA Monitoreo | Registros guardados correctamente |


  @TestCreacionParametrizacionListaOpciones
  Scenario Outline: Successful lists parameterization with option
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I select button create lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And Selecionamos boton crear opcion parametrizacion listas
    And I create new list option with option name <optionname> and id easycase <ideasycase>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | roles            | modules            | lists           | options1        | options2      | optionname    | ideasycase | modalmessage                      |
      | sergio.anaya | Colombia_2026* | Emergencia salud | Escalamientos sura | Tipo de gestión | GDA Integracion | GDA Monitoreo | prueba opcion | 12134      | Registros guardados correctamente |


  @TestEdicionParametrizacionListas
  Scenario Outline: Lists parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I select button edition lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And Selecionamos el boton guardar lista
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | roles            | modules            | lists              | options1        | options2      | modalmessage                      |
      | sergio.anaya | Colombia_2026* | Emergencia salud | Escalamientos sura | Persona de gestión | GDA Integracion | GDA Monitoreo | Registros guardados correctamente |


  @TestValidaciondeCamposParametrizacionListas
  Scenario Outline: Lists parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering lists parameterization
    And I no type information lists parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | modalmessage                    |
      | sergio.anaya | Colombia_2026* | Todos los campos son requeridos |