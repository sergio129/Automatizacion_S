Feature: Lists parameterization
  As a user
  I need to create or edition a lists parameterization

  Background:
    Given I create or edition a lists parameterization


  @TestCreacionParametrizacionLista
  Scenario Outline: Creacion Parametrizacion de lista
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering lists parameterization
    And Seleccionamos el Boton Crear Parametrizacion de Listas
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And Seleccionamos el boton guardar lista
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | roles            | modules            | lists           | options1        | options2      | modalmessage                      |
      | Emergencia salud | Escalamientos sura | Tipo de gestión | GDA Integracion | GDA Monitoreo | Registros guardados correctamente |


  @TestCreacionParametrizacionListaOpciones
  Scenario Outline: Successful lists parameterization with option
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering lists parameterization
    And Seleccionamos el Boton Crear Parametrizacion de Listas
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And Seleccionamos boton crear opcion parametrizacion listas
    And I create new list option with option name <optionname> and id easycase <ideasycase>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | roles            | modules            | lists           | options1        | options2      | optionname    | ideasycase | modalmessage                      |
      | Emergencia salud | Escalamientos sura | Tipo de gestión | GDA Integracion | GDA Monitoreo | prueba opcion | 12134      | Registros guardados correctamente |


  @TestEdicionParametrizacionListas
  Scenario Outline: Lists parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering lists parameterization
    And I select button edition lists parameterization
    And I type information in the lists parameterization with the roles <roles> and modules <modules> and lists <lists> and options1 <options1> and options2 <options2>
    And Seleccionamos el boton guardar lista
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | roles            | modules            | lists              | options1        | options2      | modalmessage                      |
      | Emergencia salud | Escalamientos sura | Persona de gestión | GDA Integracion | GDA Monitoreo | Registros guardados correctamente |


  @TestValidaciondeCamposParametrizacionListas
  Scenario Outline: Lists parameterization required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering lists parameterization
    And I no type information lists parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                    |
      | Todos los campos son requeridos |