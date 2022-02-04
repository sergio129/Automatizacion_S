Feature: El usuario puede Crear asociacion de listas, Editar y Eliminar

  Background:
    Given Creacion, Edicion y Eliminar Listar Asociar listas

  @TestCreacionAsociacionListas
  Scenario Outline: Creacion Exitosa de asociacion de listas
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a listas Asociacion listas
    And Click Boton crear Asociar Lista
    And Escribimos informacion Listas a asociar<ListaPadre>,<OptListaPadre>,<ListaHija>,<OptListaHija>Guardamos
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | ListaPadre          | OptListaPadre  | ListaHija           | OptListaHija   | modalmensaje                    |
      | Sergio.anaya | Colombia_2026* | PruebaAutomatizada7 | OpcionnuevaQA2 | PruebaAutomatizada7 | OpcionnuevaQA1 | Registro guardado correctamente |
