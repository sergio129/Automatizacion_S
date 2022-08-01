Feature: Listas Administrar
  As a user
  el usuario Crea, Edita y Desactiva administrar listas

  Background:
    Given Crear, Editar, Desactivar administar listas


  @TestCrearListasAdministrarSinOpcion
  Scenario Outline: Creacion Exitosa de listas sin opcion
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas administrar
    And Seleccionamos el boton crear listas administrar
    And Escribimos la informacion de listas administrar Nombre de lista<nombrelista>, nombre opcion<nombreopcion>, id case<idcase>
    And Seleccionamos el boton guardar listas administrar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | nombrelista         | nombreopcion | idcase    | modalmensaje                    |
      | Prueba_Automatizada | Prueba       | Prueba123 | Registro guardado correctamente |

  @TestCrearListasAdministrarConOpcion
  Scenario Outline: Creacion Exitosa de listas con opcion
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas administrar
    And Seleccionamos el boton crear listas administrar
    And Escribimos la informacion de listas administrar Nombre de lista<nombrelista>, nombre opcion<nombreopcion>, id case<idcase>
    And Seleccionamos el boton guardar listas administrar
    And Buscamos<nombrelista> y creamos la opcion<opcionnueva> y <idcase> lista administar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | nombrelista         | nombreopcion | idcase    | opcionnueva              | modalmensaje                    |
      | PruebaAutomatizada7 | Prueba       | Prueba123 | nuevaPruebaAutomatizada7 | Registro guardado correctamente |

  @TestCrearOpcionDeListaExistente
  Scenario Outline: Creacion exitosa de opcion desde lista existente
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas administrar
    And Buscamos<NombreLista> y creamos la opcion<OpcionNueva> y <idcase> lista administar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | NombreLista         | OpcionNueva    | idcase    | modalmensaje                    |
      | PruebaAutomatizada7 | OpcionnuevaQA2 | Prueba123 | Registro guardado correctamente |

  @TestEdicionOpcionDeLista
  Scenario Outline: Edicion Exitosa de Opcion de Lista Existente
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas administrar
    And Buscamos<Lista> y <OpcionLista> Listas Administrar
    And Editamos <NombreOpcion>,<Posicion>,<idcase> Listas Administrar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Lista               | OpcionLista    | NombreOpcion   | Posicion | idcase | modalmensaje                    |
      | PruebaAutomatizada7 | OpcionnuevaQA3 | OpcionnuevaQA2 | 3        | 123456 | Registro guardado correctamente |

  @TestActivar/desactivarOpcionDeLista
  Scenario Outline: Activar o desactivar opciones de lista
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas administrar
    And Buscamos<Lista> y <OpcionLista> Listas Administrar
    And Seleccionamos el check activar/desactivar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Lista               | OpcionLista    | modalmensaje    |
      | PruebaAutomatizada7 | OpcionnuevaQA2 | Proceso exitoso |

  @TestValidacionDeCamposCreacionListas
  Scenario Outline: Creacion Exitosa de listas sin opcion
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a listas administrar
    And Seleccionamos el boton crear listas administrar
    And Seleccionamos el boton guardar listas administrar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                                            |
      | Ingrese el nombre de la lista y por lo menos una opción |
