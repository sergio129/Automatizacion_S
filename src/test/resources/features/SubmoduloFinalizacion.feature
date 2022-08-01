Feature: Ending
  As a user
  I need to create or edition a ending

  Background:
    Given I create or edition a ending for a case

  @TestEndingComplete
  Scenario Outline: Successful ending creation
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numbercase>
    And Seleccionamos el Boton Crear Finalizacion
    And Escribimos informacion de Finalizacion
      | Finalizacion | TipoRespuesta | Observaciones |
      | Asegurado    | SMS           | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | numbercase      | modalmessage                    |
      | C05CD3DA5C94742 | Registro guardado correctamente |

  @TestEndingEdition
  Scenario Outline: Successful ending edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numbercase>
    And I select button edition ending
    And Escribimos informacion de Finalizacion
      | Finalizacion | TipoRespuesta | Observaciones |
      | Asegurado    | SMS           | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | numbercase      | modalmessage                    |
      | C05CD3DA5C94742 | Registro guardado correctamente |

  @TestEndingRequiredFields
  Scenario Outline: Ending submodule required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numbercase>
    And I no type information ending
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | numbercase      | modalmessage                      |
      | 202106104435443 | Todos los campos son obligatorios |



