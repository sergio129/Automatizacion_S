Feature: Parametrizacion de Bot de ofertamiento

  Background:
    Given :Creacion, Edicion y Activar/Desactivar Parametrizacion

  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Ofertamiento
    And Selecionamos el boton crear parametrizacion de Ofertamiento
    And Digitamos la informacion de la parametrizacion de ofertamiento<Nombre>,<Coordinacion>,<Ofertamiento>,<Tiempo>,<Line>,<Servicio>,<Departamento>,<Municipio>
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | Nombre                 | Coordinacion | Ofertamiento      | Tiempo | Line             | Servicio         | Departamento | Municipio | modalmensaje                      |
      | Sergio.anaya | Colombia_2026* | Pruebas_automatizacion | Si           | Abogados Rionegro | 15     | Emergencia salud | Emergencia salud | Cordoba      | Lorica    | Registros guardados correctamente |