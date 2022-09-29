#language:es

Característica: Busqueda y edicion alertas UCK ingresando los filtros de busqueda

  Antecedentes:
    Dado que realizó una busqueda y edición en el modulo alerta UCK

  @TestBusquedaEdiciónUCK

  Esquema del escenario: Busqueda  alertas UCK ingresando informacion en todos los filtros de busqueda
    Cuando Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    Y Ingresamos al modulo alertas UCK
    Y Escribimos la informacion en los campos de seleccion <nombrealerta>,<linea>,<servicio>,<estadoservicio>,<guardianes>,<flujosespeciales>,<tipomonitoreo>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | nombrealerta | linea            | servicio         | estadoservicio               | guardianes | flujosespeciales | tipomonitoreo | observacion              | validaciones     | motivo                  | tipogestion           | modalmessage                    |
      | Sergio QA    | Emergencia salud | Emergencia salud | Aceptado y en desplazamiento | prueba     | no               | prueba        | edicion de campos prueba | Validacion Lider | Solicitud del proveedor | Guardianes de la vida | Registro guardado correctamente |


  @TestBusquedaporlineayservicio
  Esquema del escenario: Busqueda informacion en los filtros linea y servicio
    Cuando Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo <linea>,<servicio>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | linea            | servicio        | observacion                      | validaciones     | motivo                  | tipogestion           |
      | Emergencia salud | mergencia salud | pruebas conecta modulo de alerta | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |

  @TestBusquedaporNombreAlerta
  Esquema del escenario: Busqueda filtro nombre de alerta
    Cuando Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo seleccion nombre de alerta <nombrealerta>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | nombrealerta | observacion                      | validaciones     | motivo                  | tipogestion           | modalmessage |
      | Sergio QA    | pruebas conecta modulo de alerta | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |              |

  @TestBusquedaporEstadodelservicio
  Esquema del escenario: Busqueda informacion estado de servicio
    Cuando Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo selccion estado servicio <estadoservicio>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | estadoservicio               | observacion                        | validaciones     | motivo                  | tipogestion   | modalmessage |
      | Aceptado y en desplazamiento | pruebas conecta estado de servicio | Validacion Lider | Solicitud del proveedor | Gestión líder |              |