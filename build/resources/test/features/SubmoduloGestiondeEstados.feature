Feature: Page submodule state management
  As a user
  I need to manage status

  @TestStateManagement
  Scenario Outline: Successful state management
    Given I performed case status changes
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I type information in the field status name <statusname>
    Then I view the modal save management status with <message>
    Examples:
      | numberCase      | statusname                   | message            |
      | 202121344537266 | Programado                   | Detalle expediente |
      | 202121344537266 | Aceptado y en desplazamiento | Detalle expediente |
      | 222222222222222 | Aceptado                     | Detalle expediente |
      | 222222222222222 | Desplazamiento               | Detalle expediente |
      | 222222222222222 | En sitio                     | Detalle expediente |
      | 222222222222222 | Concluido                    | Detalle expediente |
      | 222222222222222 | Cancelado                    | Detalle expediente |
      | 222222222222222 | Rechazado                    | Detalle expediente |

  @TestCambioEstados
  Scenario Outline: Cambio de Estados Expediente: Aceptado y en desplazamiento
    Given I performed case status changes
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I type information in the field status name <statusname>
    Then I view the modal save management status with <message>

    Examples:
      | numberCase      | statusname                   | message            |
      | 202121344537266 | Aceptado y en desplazamiento | Detalle expediente |