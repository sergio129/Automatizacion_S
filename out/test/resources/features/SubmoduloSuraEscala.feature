Feature: Page sub-module sura climbing
  As a user
  I need to create or edition a sura climbing

  Background:
    Given I create or edition a sura climbing for a case

  @TestSuraClimbingComplete
  Scenario Outline: Successful sura climbing submodule
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And Seleccionamos el boton Crear Escalamientos Sura
    And Escribimos la informacion de Escalamientos Sura
      | TipoGestion           | PersonaGestion | TipoRespuesta   | GeneraQueja | Radicado | Obervaciones |
      | Guardianes de la vida | Integracion    | No especificado | Si          | R555445  | Pruebas QA   |
    Then I view the modal save sura climbing with <modalmessage>
    Examples:
      | user         | password      | numberCase      | modalmessage                    |
      | sergio.anaya | Colombia_2022 | C05CD3DA5C94742 | Registro guardado correctamente |


  @TestSuraClimbingEdition
  Scenario Outline: Sura climbing submodule successful edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And Seleccionamos el boton Editar Escalamiento sura
    And Escribimos la informacion de Escalamientos Sura
      | TipoGestion           | PersonaGestion | TipoRespuesta   | GeranaQuedja | Radicado | Obervaciones |
      | Guardianes de la vida | Integracion    | No especificado | Si           | R555445  | Pruebas QA   |
    Then I view the modal save sura climbing with <modalmessage>
    Examples:
      | user            | password      | numberCase      | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | C05CD3DA5C94742 | Registro guardado correctamente |


  @TestSuraClimbingRequiredFields
  Scenario Outline: Sura climbing submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information sura climbing
    Then I view the modal save sura climbing with <modalmessage>
    Examples:
      | user            | password      | numberCase      | modalmessage                      |
      | yoarlys.carillo | Colombia2020* | 202105030008697 | Todos los campos son obligatorios |