Feature: Codigos de Salida Parametrizacion

  EL usuario crea, edita y elimina codigos de salida

  Background:
    Given Creo, edito y elimino codigos de salida parametrizacion

  @TestCreacionCodigodeSalida
  Scenario Outline: Creacion Exitosa de Codigos de Salida
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I enter exit code parameterization
    And I select button create exit code parameterization
    And I write information in exit code parameterization<line> and <exitcode>
    Then I view the modal save exit codes parameterization <modalmessage>
    Examples:
      | usuario      | contrasena     | line             | exitcode | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669  | Registro guardado correctamente |

  @TestExitCodeParameterizationEdit
  Scenario Outline: Successful edit exit code parameterization
    When I entering in the application with user <user> and password <password>
    And I enter exit code parameterization
    And I select button search exit code parameterization <line>
    And I select button edit exit code parameterization
    And I write information in exit code parameterization<line> and <exitcode>
    Then I view the modal save exit codes parameterization <modalmessage>
    Examples:
      | user         | password       | line             | exitcode | modalmessage                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | 5486669  | Registro guardado correctamente |