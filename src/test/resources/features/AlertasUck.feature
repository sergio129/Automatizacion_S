#language:es

Característica: Busqueda y edicion alertas UCK ingresando los filtros de busqueda

  Antecedentes:

  @TestBusquedaEdiciónUCK

  Esquema del escenario: Busqueda  alertas UCK ingresando informacion en todos los filtros de busqueda
    Dado que realizó una busqueda y edición en el modulo alerta UCK
    Cuando Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    Y Ingresamos al modulo alertas UCK
    Y Escribimos la informacion en los campos de seleccion <nombrealerta>,<linea>,<servicio>,<estadoservicio>,<guardianes>,<flujosespeciales>,<tipomonitoreo>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualize pantalla de registro de busqueda

    Ejemplos:
      | usuario         | contrasena    | nombrealerta                              | linea | servicio | estadoservicio | guardianes | flujosespeciales | tipomonitoreo      | observacion              | validaciones     | motivo                  | tipogestion           |
      | yoarlys.carillo | Colombia2021* | Programado autos grua Guardianes click no | Autos | Grua     | Programado     | Guardianes | Guardianes       | Alertas especiales | edicion de campos prueba | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |


  @TestBusquedaporlineayservicio

  Esquema del escenario: Busqueda informacion en los filtros linea y servicio
    Dado que realizó una busqueda y edición en el modulo alerta UCK
    Cuando Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo <linea>,<servicio>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualize en la pantalla registro guardado exitoso

    Ejemplos:
      | usuario         | contrasena    | linea            | servicio        | observacion                      | validaciones     | motivo                  | tipogestion           |
      | yoarlys.carillo | Colombia2021* | Emergencia salud | mergencia salud | pruebas conecta modulo de alerta | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |

  @TestBusquedaporNombreAlerta
  Esquema del escenario: Busqueda filtro nombre de alerta
    Dado que realizó una busqueda y edición en el modulo alerta UCK
    Cuando Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo seleccion nombre de alerta <nombrealerta>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualize en la pantalla registro guardado exitoso

    Ejemplos:
      | usuario         | contrasena    | nombrealerta | observacion                      | validaciones     | motivo                  | tipogestion           |
      | yoarlys.carillo | Colombia2021* | Sergio QA    | pruebas conecta modulo de alerta | Validacion Lider | Solicitud del proveedor | Guardianes de la vida |

  @TestBusquedaporEstadodelservicio
  Esquema del escenario: Busqueda informacion estado de servicio
    Dado que realizó una busqueda y edición en el modulo alerta UCK
    Cuando Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    Y Ingresamos al modulo alertas UCK
    Y filtramos por el campo selccion estado servicio <estadoservicio>
    Y clic en el boton buscar
    Y clic en el boton editar
    Y escribimos en los campos <observacion> y validacion <validaciones> y motivo <motivo> y tipo de gestion <tipogestion>
    Entonces Se visualize en la pantalla registro guardado exitoso

    Ejemplos:
      | usuario         | contrasena    | estadoservicio               | observacion                        | validaciones     | motivo                  | tipogestion   |
      | yoarlys.carillo | Colombia2021* | Aceptado y en desplazamiento | pruebas conecta estado de servicio | Validacion Lider | Solicitud del proveedor | Gestión líder |