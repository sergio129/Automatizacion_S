Feature: El usuario puede Crear asociacion de listas, Editar y Eliminar

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionAsociacionListas
  Scenario Outline: Creacion Exitosa de asociacion de listas
    When Gestionamos en Sara
    And Entramos a listas Asociacion listas
    And Click Boton crear Asociar Lista
    And Escribimos informacion Listas a asociar<ListaPadre>,<OptListaPadre>,<ListaHija>,<OptListaHija>Guardamos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | ListaPadre          | OptListaPadre  | ListaHija           | OptListaHija   | modalmensaje                    |
      | PruebaAutomatizada7 | OpcionnuevaQA2 | PruebaAutomatizada7 | OpcionnuevaQA1 | Registro guardado correctamente |

  @TestEditarAsociacionListas
  Scenario Outline: Edicion Exitosa de asociacion de listas
    When Gestionamos en Sara
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
    When Gestionamos en Sara
    And Entramos a listas Asociacion listas
    And Buscamos Asociacion de Lista<BuscarLista>,<BuscarOpcion>
    And Click Boton Eliminar Asociar Lista
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | BuscarLista         | BuscarOpcion  | modalmensaje                     |
      | PruebaAutomatizada7 | OpcionnuevaQA | Registro eliminado correctamente |

  @TestValidacionCampos
  Scenario Outline: Validacio de campos Exitosa de asociacion de listas
    When Gestionamos en Sara
    And Entramos a listas Asociacion listas
    And Click Boton crear Asociar Lista
    And Click Boton Guardar Asociar Lista
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                      |
      | Todos los campos son obligatorios |
