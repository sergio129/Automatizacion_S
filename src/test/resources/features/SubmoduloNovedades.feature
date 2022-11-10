Feature: Novelty
  As a user
  I need to create or edition a novelty

  Background:
    Given Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2026 |

  @TestNoveltyComplete
  Scenario Outline: Creacion de novedades
    When  Ingresamos a la aplicacion y gestionamos
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I select button create novelty
    And Hacemos Gestion de Novedades
      | ReportaNovedad  | CausaNovedad                   | GenerarQueja | Radicado | Observaciones |
      | Abogado virtual | Cambio abogado virtual a sitio | Si           | A7445544 | Pruebas QA    |
    Then I view the modal save novelty with <message>
    Examples:
       | message                         |
      | Registro guardado correctamente |

  @TestNoveltyEdition
  Scenario Outline: Successful novelty edition
    When  Ingresamos a la aplicacion y gestionamos
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I select button edition novelty
    And Hacemos Gestion de Novedades
      | ReportaNovedad  | CausaNovedad                   | GenerarQueja | Radicado | Observaciones |
      | Abogado virtual | Cambio abogado virtual a sitio | Si           | A7445544 | Pruebas QA    |
    Then I view the modal save novelty with <message>
    Examples:
      | message                         |
      | Registro guardado correctamente |

  @TestNoveltyRequiredFields
  Scenario Outline: Novelty submodule required fields
    When  Ingresamos a la aplicacion y gestionamos
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I no type information novelty
    Then I view the modal save novelty with <message>
    Examples:
    | message                           |
      | Todos los campos son obligatorios |