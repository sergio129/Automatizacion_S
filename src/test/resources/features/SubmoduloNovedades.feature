Feature: Novelty
  As a user
  I need to create or edition a novelty

  Background:
    Given Creacion y Edicion Modulo novedades

  @TestNoveltyComplete
  Scenario Outline: Creacion de novedades
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2021 |
    And I entering the advanced search and type case number <numberCase>
    And I select button create novelty
    And Hacemos Gestion de Novedades
      | ReportaNovedad  | CausaNovedad                   | GenerarQueja | Radicado | Observaciones |
      | Abogado virtual | Cambio abogado virtual a sitio | Si           | A7445544 | Pruebas QA    |
    Then I view the modal save novelty with <message>
    Examples:
      | numberCase      | message                         |  |  |  |
      | A02206140800006 | Registro guardado correctamente |  |  |  |

  @TestNoveltyEdition
  Scenario Outline: Successful novelty edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2021 |
    And I entering the advanced search and type case number <numberCase>
    And I select button edition novelty
    And Hacemos Gestion de Novedades
      | ReportaNovedad  | CausaNovedad                   | GenerarQueja | Radicado | Observaciones |
      | Abogado virtual | Cambio abogado virtual a sitio | Si           | A7445544 | Pruebas QA    |
    Then I view the modal save novelty with <message>
    Examples:
      | numberCase      | message                         |  |  |  |
      | A02206140800006 | Registro guardado correctamente |  |  |  |

  @TestNoveltyRequiredFields
  Scenario Outline: Novelty submodule required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2021 |
    And I entering the advanced search and type case number <numbercase>
    And I no type information novelty
    Then I view the modal save novelty with <message>
    Examples:
      |  |  | numbercase      | message                           |
      |  |  | A02206140800006 | Todos los campos son obligatorios |