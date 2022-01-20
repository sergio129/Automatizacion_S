Feature: Traffic light parameterization
  As a user
  I need to create or edition a traffic light parameterization

  Background:
    Given I create or edition a traffic light parameterization

  @TestCreacionParametrizacionDeSemaforos
  Scenario Outline: Successful traffic light parameterization
    When I entering in the application with user <user> and password <password>
    And I entering traffic light parameterization
    And I select button create traffic light parameterization
    And I type information in the traffic light parameterization with the roles <rolestraffic> and service status <servicestatus> and line <line> and service <service> and from1 <from1> and until1 <until1> and from2 <from2> and until2 <until2> and from3 <from3> and until3 <until3> and from4 <from4> and until4 <until4> and from5 <from5> and until5 <until5> and from6 <from6> and until6 <until6>
    Then I view the modal save traffic light parameterization with <modalmessage>

    Examples:
      | user         | password       | rolestraffic       | servicestatus | line  | service            | from1 | until1 | from2 | until2 | from3 | until3 | from4 | until4 | from5 | until5 | from6 | until6 | modalmessage                    |
      | Sergio.anaya | Colombia_2024* | Backoffice Reporte | programado    | Autos | Abogado preliminar | 01    | 10     | 11    | 30     | 31    | 50     | 51    | 75     | 76    | 81     | 82    | 90     | Registro guardado correctamente |


  @TestTrafficLightParameterizationEdition
  Scenario Outline: Traffic light parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering traffic light parameterization
    And I type search in the traffic light parameterization with the roles <rolestraffic>
    And I select button edition traffic light parameterization
    And I type information in the traffic light parameterization with the roles <rolestraffic> and service status <servicestatus> and line <line> and service <service> and from1 <from1> and until1 <until1> and from2 <from2> and until2 <until2> and from3 <from3> and until3 <until3> and from4 <from4> and until4 <until4> and from5 <from5> and until5 <until5> and from6 <from6> and until6 <until6>
    Then I view the modal save traffic light parameterization with <modalmessage>

    Examples:
      | user         | password       | rolestraffic       | servicestatus | line    | service      | from1 | until1 | from2 | until2 | from3 | until3 | from4 | until4 | from5 | until5 | from6 | until6 | modalmessage                    |
      | sergio.anaya | Colombia_2024* | Backoffice Reporte | En sitio      | Hogares | Cerrajero Ho | 05    | 15     | 16    | 32     | 33    | 55     | 56    | 68     | 69    | 81     | 82    | 90     | Registro guardado correctamente |


  @TestTrafficLightParameterizationDelete
  Scenario Outline: Control boards closure case parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I entering traffic light parameterization
    And I type search in the traffic light parameterization with the roles <rolestraffic>
    And I select button delete traffic light parameterization
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user         | password       | rolestraffic       | modalmessage                     |
      | sergio.anaya | Colombia_2024* | Backoffice Reporte | Registro eliminado correctamente |


  @TestTrafficLightParameterizationRequiredFields
  Scenario Outline: Traffic light parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering traffic light parameterization
    And I no type information traffic light parameterization
    Then I view the modal save traffic light parameterization with <modalmessage>

    Examples:
      | user         | password       | modalmessage                      |
      | Sergio.anaya | Colombia_2024* | Todos los campos son obligatorios |