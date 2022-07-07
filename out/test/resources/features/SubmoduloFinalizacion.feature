Feature: Ending
  As a user
  I need to create or edition a ending

  Background:
    Given I create or edition a ending for a case

  @TestEndingComplete
  Scenario Outline: Successful ending creation
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And Seleccionamos el Boton Crear Finalizacion
    And Escribimos informacion de Finalizacion
      | Finalizacion | TipoRespuesta | Observaciones |
      | Asegurado    | SMS           | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password      | numbercase      | modalmessage                    |
      | sergio.anaya | Colombia_2022 | C05CD3DA5C94742 | Registro guardado correctamente |

  @TestEndingEdition
  Scenario Outline: Successful ending edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And I select button edition ending
    And Escribimos informacion de Finalizacion
      | Finalizacion | TipoRespuesta | Observaciones |
      | Asegurado    | SMS           | Pruebas QA    |
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password      | numbercase      | modalmessage                    |
      | sergio.anaya | Colombia_2022 | C05CD3DA5C94742 | Registro guardado correctamente |

  @TestEndingRequiredFields
  Scenario Outline: Ending submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And I no type information ending
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user            | password      | numbercase      | modalmessage                      |
      | yoarlys.carillo | Colombia2020* | 202106104435443 | Todos los campos son obligatorios |



