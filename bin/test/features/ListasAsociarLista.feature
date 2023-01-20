Feature: El usuario puede Crear asociacion de listas, Editar y Eliminar

  Background:
    Given Creacion, Edicion y Eliminar Listar Asociar listas

  @TestCreacionAsociacionListas
  Scenario Outline: Creacion Exitosa de asociacion de listas
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas Asociacion listas
    And Click Boton crear Asociar Lista
    And Escribimos informacion Listas a asociar<ListaPadre>,<OptListaPadre>,<ListaHija>,<OptListaHija>Guardamos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | ListaPadre          | OptListaPadre  | ListaHija           | OptListaHija   | modalmensaje                    |
      | PruebaAutomatizada7 | OpcionnuevaQA2 | PruebaAutomatizada7 | OpcionnuevaQA1 | Registro guardado correctamente |

  @TestEditarAsociacionListas
  Scenario Outline: Edicion Exitosa de asociacion de listas
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas Asociacion listas
    And Buscamos Asociacion de Lista<BuscarLista>,<BuscarOpcion>
    And Click Boton Editar Asociar Lista
    And Escribimos informacion Listas a asociar<ListaPadre>,<OptListaPadre>,<ListaHija>,<OptListaHija>Guardamos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | BuscarLista         | BuscarOpcion   | ListaPadre          | OptListaPadre | ListaHija           | OptListaHija  | modalmensaje                    |
      | PruebaAutomatizada7 | OpcionnuevaQA2 | PruebaAutomatizada7 | OpcionnuevaQA | PruebaAutomatizada7 | OpcionnuevaQA | Registro guardado correctamente |

  @TestEliminarAsociacionListas
  Scenario Outline: Eliminacion Exitosa de asociacion de listas
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas Asociacion listas
    And Buscamos Asociacion de Lista<BuscarLista>,<BuscarOpcion>
    And Click Boton Eliminar Asociar Lista
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | BuscarLista         | BuscarOpcion  | modalmensaje                     |
      | PruebaAutomatizada7 | OpcionnuevaQA | Registro eliminado correctamente |

  @TestValidacionCampos
  Scenario Outline: Validacio de campos Exitosa de asociacion de listas
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas Asociacion listas
    And Click Boton crear Asociar Lista
    And Click Boton Guardar Asociar Lista
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                      |
      | Todos los campos son obligatorios |
