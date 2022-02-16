Feature: Ending
  As a user
  I need to create or edition a ending

  Background:
    Given I create or edition a ending for a case

  @TestEndingComplete
  Scenario Outline: Successful ending creation
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And I select button create ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | numbercase      | endingwith | typeresponse | observationending            | modalmessage                         |
      | sergio.anaya | Colombia_2025* | 202106104435443 | Proveedor  | SMS          | prueba creacion finalizacion | Registro guardado correctamente |

  @TestEndingEdition
  Scenario Outline: Successful ending edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And I select button edition ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | numbercase      | endingwith | typeresponse      | observationending           | modalmessage                         |
      | Sergio.Anaya | Colombia_2025* | 202106104435443 | proveedor  | Llamada más tarde | prueba edicion finalizacion | Registro guardado correctamente |

  @TestEndingRequiredFields
  Scenario Outline: Ending submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And I no type information ending
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | numbercase      | modalmessage                           |
      | sergio.anaya | Colombia_2025* | 202106104435443 | Todos los campos son obligatorios |



