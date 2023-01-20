Feature: Parametrizacion de Bot de ofertamiento

  Background:
    Given Creacion, Edicion y Activar-Desactivar Parametrizacion

  @TestCreacionOfertamiento
  Scenario Outline:Creacion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a Parametrizacion Ofertamiento
    And Seleccionamos el boton crear parametrizacion de Ofertamiento
    And Digitamos la informacion de la parametrizacion de ofertamiento<Nombre>,<Coordinacion>,<Ofertamiento>,<Tiempo>,<Linea>,<Servicio>,<Departamento>,<Municipio>
    And Seleccionamos el Boton de guardar Parametrizacion de Ofertamiento
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Nombre                | Coordinacion | Ofertamiento      | Tiempo | Linea            | Servicio         | Departamento | Municipio | modalmensaje                    |
      | PruebasAutomatizacion | No           | Abogados Rionegro | 15     | Emergencia salud | Emergencia salud | Cordoba      | Lorica    | Registro guardado correctamente |

  @TestEdicionOfertamiento
  Scenario Outline:Edicion Exitosa de parametrizacion Ofertamiento
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a Parametrizacion Ofertamiento
    And Buscamos Parametrizacion de Ofertamiento por nombre: "PruebasAutomatizacion"
    And Seleccionamos el boton Editar parametrizacion de Ofertamiento
    And Digitamos la informacion de la parametrizacion de ofertamiento<Nombre>,<Coordinacion>,<Ofertamiento>,<Tiempo>,<Linea>,<Servicio>,<Departamento>,<Municipio>
    And Seleccionamos el Boton de guardar Parametrizacion de Ofertamiento
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Nombre                | Coordinacion | Ofertamiento      | Tiempo | Linea | Servicio         | Departamento | Municipio | modalmensaje                    |
      | PruebasAutomatizacion | No           | Abogados Rionegro | 15     | ARL   | Emergencia salud | Antioquia    | Medellin  | Registro guardado correctamente |


  @TestActivarDesactivarOfertamiento
  Scenario Outline:Activar/desactivar parametrizacion Ofertamiento
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a Parametrizacion Ofertamiento
    And Buscamos Parametrizacion de Ofertamiento por nombre: "PruebasAutomatizacion"
    And Seleccionamos el boton de Activar/Desactivar Parametrizacion Ofertamiento
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                                       |
      | Parametrización habilitada/deshabilitada con éxito |