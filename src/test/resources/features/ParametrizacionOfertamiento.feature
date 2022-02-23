Feature: Parametrizacion de Bot de ofertamiento

  Background:
    Given Creacion, Edicion y Activar/Desactivar Parametrizacion

  @TestCreacionOfertamiento
  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Ofertamiento
    And Selecionamos el boton crear parametrizacion de Ofertamiento
    And Digitamos la informacion de la parametrizacion de ofertamiento<Nombre>,<Coordinacion>,<Ofertamiento>,<Tiempo>,<Linea>,<Servicio>,<Departamento>,<Municipio>
    And Selecionamos el Boton de guardar Parametrizacion de Ofertamiento
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | Nombre                | Coordinacion | Ofertamiento      | Tiempo | Linea            | Servicio         | Departamento | Municipio | modalmensaje                    |
      | Sergio.anaya | Colombia_2026* | PruebasAutomatizacion | No           | Abogados Rionegro | 15     | Emergencia salud | Emergencia salud | Cordoba      | Lorica    | Registro guardado correctamente |

  @TestEdicionOfertamiento
  Scenario Outline:Edicion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Ofertamiento
    And Buscamos Parametrizacion de Ofertamiento por nombre: "PruebasAutomatizacion"
    And Selecionamos el boton Editar parametrizacion de Ofertamiento
    And Digitamos la informacion de la parametrizacion de ofertamiento<Nombre>,<Coordinacion>,<Ofertamiento>,<Tiempo>,<Linea>,<Servicio>,<Departamento>,<Municipio>
    And Selecionamos el Boton de guardar Parametrizacion de Ofertamiento
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | Nombre                | Coordinacion | Ofertamiento      | Tiempo | Linea | Servicio         | Departamento | Municipio | modalmensaje                    |
      | Sergio.anaya | Colombia_2026* | PruebasAutomatizacion | No           | Abogados Rionegro | 15     | ARL   | Emergencia salud | Antioquia    | Medellin  | Registro guardado correctamente |


  @TestActivarDesactivarOfertamiento
  Scenario Outline:Activar/desactivar parametrizacion Ofertamiento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Ofertamiento
    And Buscamos Parametrizacion de Ofertamiento por nombre: "PruebasAutomatizacion"
    And Selecionamos el boton de Activar/Desactivar Parametrizacion Ofertamiento
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | usuario      | contrasena     | modalmensaje                                       |
      | Sergio.anaya | Colombia_2026* | Parametrización habilitada/deshabilitada con éxito |