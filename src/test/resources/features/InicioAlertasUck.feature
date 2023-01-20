#language:es

Característica: Busqueda y edicion alertas UCK ingresando los filtros de busqueda

  Antecedentes:
    Dado Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestBusquedaEdiciónUCK

  Esquema del escenario: Busqueda  alertas UCK ingresando informacion en todos los filtros de busqueda
    Cuando Gestionamos en Sara
    Y Ingresamos al modulo alertas UCK
    Y Escribimos la informacion en los campos de seleccion <nombrealerta>,<linea>,<servicio>,<estadoservicio>,<guardianes>,<flujosespeciales>,<tipomonitoreo>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y Hacemos la gestion de la Alertas UCK
      | observacion              | validaciones     | motivo                  | tipogestion           |
      | edicion de campos prueba | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | nombrealerta     | linea | servicio         | estadoservicio               | guardianes | flujosespeciales | tipomonitoreo | modalmessage                    |
      | Tareas monitoreo | Autos | Abogado En Sitio | Aceptado y en desplazamiento | No         | no               | no            | Registro guardado correctamente |


  @TestBusquedaporlineayservicio
  Esquema del escenario: Busqueda informacion en los filtros linea y servicio
    Cuando Gestionamos en Sara
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo <linea>,<servicio>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y Hacemos la gestion de la Alertas UCK
      | observacion              | validaciones     | motivo                  | tipogestion           |
      | edicion de campos prueba | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | linea             | servicio          | modalmessage     |
      | Conductor elegido | Conductor elegido | Error al guardar |

  @TestBusquedaporNombreAlerta
  Esquema del escenario: Busqueda filtro nombre de alerta
    Cuando Gestionamos en Sara
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo seleccion nombre de alerta <nombrealerta>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y Hacemos la gestion de la Alertas UCK
      | observacion              | validaciones     | motivo                  | tipogestion           |
      | edicion de campos prueba | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | nombrealerta | modalmessage |
      | Sergio QA    |              |

  @TestBusquedaporEstadodelservicio
  Esquema del escenario: Busqueda informacion estado de servicio
    Cuando Gestionamos en Sara
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo selccion estado servicio <estadoservicio>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y Hacemos la gestion de la Alertas UCK
      | observacion              | validaciones     | motivo                  | tipogestion           |
      | edicion de campos prueba | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |
    Entonces Se visualiza mensaje de la modal<modalmessage>
    Ejemplos:
      | estadoservicio               | modalmessage |
      | Aceptado y en desplazamiento |              |