Feature: Novelty
  As a user
  I need to create or edition a novelty

  Background:
    Given I create or edition a novelty for a case

  @TestNoveltyComplete
  Scenario Outline: Successful novelty creation
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I select button create novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    Then I view the modal save novelty with <message>

    Examples:
      | user         | password       | numberCase      | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement     | message                         |
      | Sergio.Anaya | Colombia_2024* | 202106104435443 | Acompañamiento Emocional  | Abogado Virtual            | No                      | observacion novedades pruebas | Registro guardado correctamente |

  @TestNoveltyEdition
  Scenario Outline: Successful novelty edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I select button edition novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    Then I view the modal save novelty with <message>

    Examples:
      | user             | password    | numberCase     | whoreportsnewsmanagements | causenoveltynewsmanagement |complaintnewsmanagement |observationnewsmanagement         | message                         |
      |yaira.acevedo     | YMAe8807*   |202106104435443 | Cliente                   | Acepte                     |No                      |observacion novedades edicion     | Registro guardado correctamente |

  @TestNoveltyRequiredFields
  Scenario Outline: Novelty submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numbercase>
    And I no type information novelty
    Then I view the modal save novelty with <message>

    Examples:
      | user             | password    |numbercase          | message                          |
      |yaira.acevedo     | YMAe8807*   |202121312837234     |Todos los campos son obligatorios |