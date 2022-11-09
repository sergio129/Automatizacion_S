Feature: Traffic light parameterization
  As a user
  I need to create or edition a traffic light parameterization

  Background:
    Given Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2026 |

  @TestCreacionParametrizacionDeSemaforos
  Scenario Outline: Crecion Exitosa de parametrizacion de semaforos
    When  Ingresamos a la aplicacion y gestionamos
    And I entering traffic light parameterization
    And I select button create traffic light parameterization
    And I type information in the traffic light parameterization with the roles <rolestraffic> and service status <servicestatus> and line <line> and service <service> and from1 <from1> and until1 <until1> and from2 <from2> and until2 <until2> and from3 <from3> and until3 <until3> and from4 <from4> and until4 <until4> and from5 <from5> and until5 <until5> and from6 <from6> and until6 <until6>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | rolestraffic            | servicestatus | line  | service            | from1 | until1 | from2 | until2 | from3 | until3 | from4 | until4 | from5 | until5 | from6 | until6 | modalmessage                    |
      | Backoffice de Monitoreo | programado    | Autos | Abogado preliminar | 01    | 10     | 11    | 30     | 31    | 50     | 51    | 75     | 76    | 81     | 82    | 90     | Registro guardado correctamente |


  @TestEdicionParametrizacionDeSemaforos
  Scenario Outline: Edicion Exitosa de parametrizacion de semaforos
    When  Ingresamos a la aplicacion y gestionamos
    And I entering traffic light parameterization
    And I type search in the traffic light parameterization with the roles <rolestraffic>
    And I select button edition traffic light parameterization
    And I type information in the traffic light parameterization with the roles <rolestraffic> and service status <servicestatus> and line <line> and service <service> and from1 <from1> and until1 <until1> and from2 <from2> and until2 <until2> and from3 <from3> and until3 <until3> and from4 <from4> and until4 <until4> and from5 <from5> and until5 <until5> and from6 <from6> and until6 <until6>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | rolestraffic            | servicestatus | line    | service      | from1 | until1 | from2 | until2 | from3 | until3 | from4 | until4 | from5 | until5 | from6 | until6 | modalmessage                    |
      | Backoffice de Monitoreo | En sitio      | Hogares | Cerrajero Ho | 05    | 15     | 16    | 32     | 33    | 55     | 56    | 68     | 69    | 81     | 82    | 90     | Registro guardado correctamente |


  @TestEliminacionParametrizacionDeSemaforos
  Scenario Outline: Control boards closure case parameterization successful delete
    When  Ingresamos a la aplicacion y gestionamos
    And I entering traffic light parameterization
    And I type search in the traffic light parameterization with the roles <rolestraffic>
    And I select button delete traffic light parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | rolestraffic            | modalmessage                     |
      | Backoffice de Monitoreo | Registro eliminado correctamente |


  @TestValidacionDeCampos
  Scenario Outline: Traffic light parameterization required fields
    When  Ingresamos a la aplicacion y gestionamos
    And I entering traffic light parameterization
    And I no type information traffic light parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |