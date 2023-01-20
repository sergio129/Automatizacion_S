Feature: Parametrizacion de Ramos


  Background:Creacion de Parametrizacion de Ramos
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionDeRamos @Test1
  Scenario Outline: Creacion de Exitosa de Ramos
    When Gestionamos en Sara
    And I enter bouquets parameterization
    And I select button create bouquets parameterization
    And I write information in bouquets parameterization and save <linea>,<bouquets>
    Then Mostramos el mensaje de la modal de ramos<modalmessage>
    Examples:
      | linea            | bouquets    | modalmessage                       |
      | Emergencia salud | Pruebas QA8 | Registros guardados correctamente. |
      | Emergencia salud | Pruebas QA8 | El ramo ya existe.                 |
