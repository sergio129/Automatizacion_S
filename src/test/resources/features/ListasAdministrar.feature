Feature: Listas Administrar
  As a user
  el usuario Crea, Edita y Desactiva administrar listas

  Background:
    Given Crear, Editar, Desactivar administar listas


  @TestCrearListasAdministrarSinOpcion
  Scenario Outline: Creacion Exitosa de listas sin opcion
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a listas administrar
    And Selecionamos el boton crear listas administrar
    And Escribimos la informacion de listas administrar Nombre de lista<nombrelista>, nombre opcion<nombreopcion>, id case<idcase>
    And Selecionamos el boton guardar listas administrar
    Then Se visualiza mensaje de la modal listas administrar <modalmensaje>
    Examples:
      | usuario      | contrasena     | nombrelista         | nombreopcion | idcase    | modalmensaje                    |
      | Sergio.anaya | Colombia_2025* | Prueba_Automatizada | Prueba       | Prueba123 | Registro guardado correctamente |

  @TestCrearListasAdministrarConOpcion
  Scenario Outline: Creacion Exitosa de listas con opcion
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a listas administrar
    And Selecionamos el boton crear listas administrar
    And Escribimos la informacion de listas administrar Nombre de lista<nombrelista>, nombre opcion<nombreopcion>, id case<idcase>
    And Selecionamos el boton guardar listas administrar
    And Buscamos<nombrelista> y creamos la opcion<opcionnueva> y <idcase> lista administar
    Then Se visualiza mensaje de la modal listas administrar <modalmensaje>
    Examples:
      | usuario      | contrasena     | nombrelista         | nombreopcion | idcase    | opcionnueva              | modalmensaje                    |
      | Sergio.anaya | Colombia_2025* | PruebaAutomatizada5 | Prueba       | Prueba123 | nuevaPruebaAutomatizada5 | Registro guardado correctamente |