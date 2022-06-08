Feature: Parametrizacion Prefijos
  El usuario crea, edita y elimina prefijos

  Background:
    Given Creo, Edito y elimino Prefijos

  @TestCreacionPrefijos @Test1
  Scenario Outline: Creacion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion prefijos
    And Selecionamos el boton creacion prefijos
    And Escribimos la informacion de prefijos linea<linea>, servicio<servicio>, prefijos<prefijos>
    And Selecionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena    | linea | servicio | prefijos | modalmensaje                    |
      | sergio.anaya | Colombia_2021 | Autos | Grua     | 888      | Registro guardado correctamente |

  @TestEditarPrefijos
  Scenario Outline: Edicion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion prefijos
    And Se filtra por linea<linea>, Servicio<servicio>, prefijos<prefijos> y Buscamos
    And Selecionamos el boton editar prefijos
    And Escribimos la informacion de prefijos linea<linea>, servicio<servicio>, prefijos<prefijos>
    And Selecionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena    | linea | servicio | prefijos | modalmensaje                    |
      | sergio.anaya | Colombia_2021 | Autos | Grua     | 908      | Registro guardado correctamente |

  @TestEliminarPrefijos
  Scenario Outline: Eliminacion Exitosa de Prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion prefijos
    And Se filtra por linea<linea>, Servicio<servicio>, prefijos<prefijos> y Buscamos
    And Selecionamos el boton eliminar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena    | linea | servicio | prefijos | modalmensaje                     |
      | sergio.anaya | Colombia_2021 | Hogar | Plomero  | 908      | Registro eliminado correctamente |

  @TestValidacionDeCampos
  Scenario Outline: Validacion de Campos Parametrizacion prefijos
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion prefijos
    And Selecionamos el boton creacion prefijos
    And Selecionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                      |
      | sergio.anaya | Colombia_2026* | Todos los campos son obligatorios |