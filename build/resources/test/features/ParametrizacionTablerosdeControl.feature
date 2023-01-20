Feature: Parametrizacion Tableros de control
  As a user
  I need to create, edition or delete a control boards parameterization

  Background:
  Given  Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionExitosaParametrizacionTablerosDeControl
  Scenario Outline:Creacion Exitosa de Tableros de Control
    When  Gestionamos en Sara
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And Ingresamos la informacion Basica de tableros de control Nombre Tablero:"Nombre_Tablero", Tipo de Tablero: "Casos"
    And Ingresamos informacion basica para la crecion de tableros de control, Campos a mostrar:"Estado servicio",Roles:"Admin Backlog",Asesores:"Arnulfo Gomez",Solo mis Expedientes:"Si"
    And Guardamos el tablero de control
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |


  @TestCreacionExitosaParametrizacionTablerosDeControlFiltros
  Scenario Outline:Creacion Exitosa de Tableros de Control con filtros
    When  Gestionamos en Sara
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And Ingresamos la informacion Basica de tableros de control Nombre Tablero:"Tablero Tareas de monitoreo", Tipo de Tablero: "Tareas de monitoreo"
    And Ingresamos informacion basica para la crecion de tableros de control, Campos a mostrar:"Estado servicio",Roles:"Admin Backlog",Asesores:"Arnulfo Gomez",Solo mis Expedientes:"Si"
    And Filtros de datos comunes inpendientemente del tipo de tablero de control Linea:"Autos" Usuario asignado:"Arnulfo Gomez", Responsable:"Arnulfo Gomez"
    And Filtros de de datos comunes tableros de Casos,Tareas Monitoreo y Cierre de expedientes:Gestion coordinacion:"Si", Servicio:"Cerrajero Motos",Proveedor:"ASISTIMOTOS",Servicio especial:"Soat y Guardianes"
    And Filtros para tipo de tablero control Casos, Estado expediente:"Cancelado",Estado servicio:"Aceptado",Departamento:"Atlantico"
    And Filtros para tipo de tablero control Tareas monitoreo:Estado de tareas:"Pendiente", Tipo monitoreo:"Monitoreo preventivo"
    And Filtros Para tipo de tablero control Cierre de expedientes: Tipo servicio:"Guardianes", Estado de cierre:"Documentado"
    And Guardamos el tablero de control
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |


  @TestControlBoardsParameterizationDelete
  Scenario Outline: Control boards closure case parameterization successful delete
    When  Gestionamos en Sara
    And I entering control boards parameterization
    And I select button delete control boards parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                     |
      | registro eliminado correctamente |


  @TestControlBoardsParameterizationRequiredFields
  Scenario Outline: Control boards parameterization required fields
    When  Gestionamos en Sara
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And I no type information control boards parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |