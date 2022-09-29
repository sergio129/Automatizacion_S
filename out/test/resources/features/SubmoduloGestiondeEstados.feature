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
      | user            | password      | numberCase      | statusname                   | message            |
      | yoarlys.carillo | Colombia2020* | 202121344537266 | Programado                   | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 202121344537266 | Aceptado y en desplazamiento | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 222222222222222 | Aceptado                     | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 222222222222222 | Desplazamiento               | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 222222222222222 | En sitio                     | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 222222222222222 | Concluido                    | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 222222222222222 | Cancelado                    | Detalle expediente |
      | yoarlys.carillo | Colombia2020* | 222222222222222 | Rechazado                    | Detalle expediente |

  @TestCambioEstados
  Scenario Outline: Cambio de Estados Expediente: Aceptado y en desplazamiento
    Given I performed case status changes
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the field status name <statusname>
    Then I view the modal save management status with <message>

    Examples:
      | user         | password       | numberCase      | statusname                   | message            |
      | Sergio.anaya | Colombia_2026* | 202121344537266 | Aceptado y en desplazamiento | Detalle expediente |