Feature: Page submodule state management
  As a user
  I need to manage status

  @TestStateManagement
  Scenario Outline: Successful state management
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I type information in the field status name <statusname>
    Then I view the modal save management status with <message>
    Examples:
      | statusname                   | message            |
      | Programado                   | Detalle expediente |
      | Aceptado y en desplazamiento | Detalle expediente |
      | Aceptado                     | Detalle expediente |
      | Desplazamiento               | Detalle expediente |
      | En sitio                     | Detalle expediente |
      | Concluido                    | Detalle expediente |
      | Cancelado                    | Detalle expediente |
      | Rechazado                    | Detalle expediente |

  @TestCambioEstados
  Scenario Outline: Cambio de Estados Expediente: Aceptado y en desplazamiento
    Given I performed case status changes
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And I type information in the field status name <statusname>
    Then I view the modal save management status with <message>

    Examples:
      | statusname                   | message            |
      | Aceptado y en desplazamiento | Detalle expediente |