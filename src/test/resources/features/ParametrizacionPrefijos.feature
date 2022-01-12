Feature: Parametrizacion Prefijos
  El usuario crea, edita y elimina prefijos

  Background:
    Given Creo, Edito y elimino Prefijos

  @TestCreacionPrefijos
  Scenario Outline: Creacion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion prefijos
    And Selecionamos el boton creacion prefijos
    And Escribimos la informacion de prefijos linea<linea>, servicio<servicio>, prefijos<prefijos>
    And Selecionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal parametrizacion prefijos <modalmensaje>
    Examples:
      | usuario      | contrasena     | linea            | servicio         | prefijos | modalmensaje                    |
      | sergio.anaya | Colombia_2025* | Emergencia salud | Emergencia salud | 555      | Registro guardado correctamente |

  @TestValidacionDeCampos
  Scenario Outline: Validacion de Campos Parametrizacion prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion prefijos
    And Selecionamos el boton creacion prefijos
    And Selecionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal parametrizacion prefijos <modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                      |
      | sergio.anaya | Colombia_2025* | Todos los campos son obligatorios |