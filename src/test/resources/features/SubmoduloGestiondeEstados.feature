Feature: Page submodule state management
  As a user
  I need to manage status

@TestStateManagement
  Scenario Outline: Successful state management
    Given I performed case status changes
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the field status name <statusname>
    Then I view the modal save management status with <message>

    Examples:
      | user         | password       | numberCase      | statusname                   | message            |
      | Sergio.Anaya | Colombia_2025* | 202105030008702 | Programado                   | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202104149600102 | Aceptado y en desplazamiento | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202105030000007 | Aceptado                     | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202105030000007 | Desplazamiento               | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202105060008734 | En sitio                     | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202105030000016 | Concluido                    | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202105030008698 | Cancelado                    | Detalle expediente |
      | Sergio.Anaya | Colombia_2025* | 202105030008701 | Rechazado                    | Detalle expediente |

