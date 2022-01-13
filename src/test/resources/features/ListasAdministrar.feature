Feature: Listas Administrar
  As a user
  el usuario Crea, Edita y Desactiva administrar listas

  Background:
    Given Crear, Editar, Desactivar administar listas


  @TestCrearListasAdministrar
  Scenario Outline: Successful list
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a listas administrar
    And Selecionamos el boton crear listas administrar
    And Escribimos la informacion de listas administrar Nombre de lista<nombrelista>, nombre opcion<nombreopcion>, id case<idcase>
    And Selecionamos el boton guardar listas administrar
    Then Se visualiza mensaje de la modal listas administrar <modalmensaje>
    Examples:
      | usuario      | contrasena     | nombrelista         | nombreopcion | idcase    | modalmensaje                    |
      | Sergio.anaya | Colombia_2025* | Prueba_Automatizada | Prueba       | Prueba123 | Registro guardado correctamente |