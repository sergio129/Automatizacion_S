Feature: Parametrizacion Prefijos
  El usuario crea, edita y elimina prefijos

  Background:
    Given Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2026 |

  @TestCreacionPrefijos
  Scenario Outline: Creacion Exitosa de Prefijos
    When Ingresamos a la aplicacion y gestionamos
    And Entramos a parametrizacion prefijos
    And Seleccionamos el boton creacion prefijos
    And Escribimos la informacion de prefijos linea<linea>, servicio<servicio>, prefijos<prefijos>
    And Seleccionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | linea | servicio | prefijos | modalmensaje                    |
      | Autos | Grua     | 888      | Registro guardado correctamente |

  @TestEditarPrefijos
  Scenario Outline: Edicion Exitosa de Prefijos
    When  Ingresamos a la aplicacion y gestionamos
    And Entramos a parametrizacion prefijos
    And Se filtra por linea<linea>, Servicio<servicio>, prefijos<prefijos> y Buscamos
    And Seleccionamos el boton editar prefijos
    And Escribimos la informacion de prefijos linea<linea>, servicio<servicio>, prefijos<prefijos>
    And Seleccionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | linea | servicio | prefijos | modalmensaje                    |
      | Autos | Grua     | 908      | Registro guardado correctamente |

  @TestEliminarPrefijos
  Scenario Outline: Eliminacion Exitosa de Prefijos
    When Ingresamos a la aplicacion y gestionamos
    And Entramos a parametrizacion prefijos
    And Se filtra por linea<linea>, Servicio<servicio>, prefijos<prefijos> y Buscamos
    And Seleccionamos el boton eliminar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | linea | servicio | prefijos | modalmensaje                     |
      | Hogar | Plomero  | 908      | Registro eliminado correctamente |

  @TestValidacionDeCampos
  Scenario Outline: Validacion de Campos Parametrizacion prefijos
    When  Ingresamos a la aplicacion y gestionamos
    And Entramos a parametrizacion prefijos
    And Seleccionamos el boton creacion prefijos
    And Seleccionamos el boton guardar prefijos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                      |
      | Todos los campos son obligatorios |