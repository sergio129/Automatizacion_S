Feature: Page sub-module sura climbing
  As a user
  I need to create or edition a sura climbing

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestSuraClimbingComplete
  Scenario Outline: Successful sura climbing submodule
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Seleccionamos el boton Crear Escalamientos Sura
    And Escribimos la informacion de Escalamientos Sura
      | TipoGestion           | PersonaGestion | TipoRespuesta   | GeneraQueja | Radicado | Obervaciones |
      | Guardianes de la vida | Integracion    | No especificado | Si          | R555445  | Pruebas QA   |
    Then I view the modal save sura climbing with <modalmessage>
    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |


  @TestSuraClimbingEdition
  Scenario Outline: Sura climbing submodule successful edition
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Seleccionamos el boton Editar Escalamiento sura
    And Escribimos la informacion de Escalamientos Sura
      | TipoGestion           | PersonaGestion | TipoRespuesta   | GeranaQuedja | Radicado | Obervaciones |
      | Guardianes de la vida | Integracion    | No especificado | Si           | R555445  | Pruebas QA   |
    Then I view the modal save sura climbing with <modalmessage>
    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |


  @TestSuraClimbingRequiredFields
  Scenario Outline: Sura climbing submodule required fields
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I no type information sura climbing
    Then I view the modal save sura climbing with <modalmessage>
    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |