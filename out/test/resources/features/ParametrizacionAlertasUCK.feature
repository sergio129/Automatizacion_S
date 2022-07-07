Feature: Parametrizacion de Alertas UCK

  Background:
    Given Creacion, Edicion y Eliminar Alerta UCK

  @TestCreacionParametrizacionAlertasUCK
  Scenario Outline: Creacion Exitosa de parametrizacion alertas UCK
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Alertas UCK
    And Selecionamos el boton crear Alerta UCK
    And Escribimos la Informacion alerta UCK <Nombre>,<Linea>,<Servicio>,<Guardianes>,<FlujoE>,<EstadoS>,<TMonitoreo>,<Cordinacion>,<EstadoExp>,<Proveedor>,<TareasM>
    And Escribimos Tiempos de los siguientes Roles, Gestion CNM:"1",Unidad Control:"2", Lider:"3", Cordinador:"5", Gerente:"6"
    And Selecionamos el boton guardar Alerta UCK
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | Nombre                 | Linea | Servicio         | Guardianes | FlujoE        | EstadoS   | TMonitoreo                          | Cordinacion | EstadoExp | Proveedor        | TareasM | modalmessage                    |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion | Autos | Abogado en sitio | Guardianes | Influenciador | Concluido | Monitoreo finalizacion del servicio | Si          | Pendiente | PROVEEDOR PRUEBA | Cerrada | Registro guardado correctamente |


  @TestEdicionParametrizacionAlertasUCK
  Scenario Outline: Edicion Exitosa de parametrizacion alertas UCK
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Alertas UCK
    And Buscamos parametrizacion Alerta UCK Nombre Alerta:"Pruebas Automatizacion"
    And Selecionamos el boton Editar Parametrizacion Alerta UCK
    And Escribimos la Informacion alerta UCK <Nombre>,<Linea>,<Servicio>,<Guardianes>,<FlujoE>,<EstadoS>,<TMonitoreo>,<Cordinacion>,<EstadoExp>,<Proveedor>,<TareasM>
    And Escribimos Tiempos de los siguientes Roles, Gestion CNM:"8",Unidad Control:"9", Lider:"7", Cordinador:"3", Gerente:"4"
    And Selecionamos el boton guardar Alerta UCK
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | Nombre                 | Linea | Servicio         | Guardianes | FlujoE        | EstadoS    | TMonitoreo                          | Cordinacion | EstadoExp | Proveedor        | TareasM | modalmessage                    |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion | Hogar | Abogado en sitio | Guardianes | Influenciador | Programado | Monitoreo finalizacion del servicio | Si          | Pendiente | PROVEEDOR PRUEBA | Cerrada | Registro guardado correctamente |

  @TestEliminarParametrizacionAlertasUCK
  Scenario Outline: Eliminar Exitosa de parametrizacion alertas UCK
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Alertas UCK
    And Buscamos parametrizacion Alerta UCK Nombre Alerta:"Pruebas Automatizacion"
    And Selecionamos el Boton de Eliminar Parametrizacion Alerta UCK
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | modalmessage                     |
      | Sergio.anaya | Colombia_2027* | Registro eliminado correctamente |