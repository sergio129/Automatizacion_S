Feature: Parametrizacion Motivos de llamada
  As a user
  I need to create, edit and delete call reasons parameterization

  Background:
    Given I create, edit and delete call reasons parameterization

  @TestCreacionMotivoDeLlamadaSolicitudDeServicio
  Scenario Outline: Creacion Exitosa de motivos de llamada con solicitud de servicio, sin Evento Catastrofico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Seleccionamos el Boton crear Parametrizacion Motivos de Llamada
    And Escribimos la informacion de motivos de llamada con solicitud de servicio<name>,Tipo:"Solicitud de servicio",Estado:"Inhabilitado",Linea:<line>,Validacion"Prueba duplicidad Backlog"
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | usuario      | contrasena     | name                    | line  | modalmessage                                                                                  |  |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion2 | Hogar | Registro guardado correctamente                                                               |  |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion2 | Hogar | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |  |

  @TestCreacionMotivoDeLlamadaSolicitudDeServicioConEventoCatastrofico
  Scenario Outline: Creacion Exitosa de motivos de llamada con solicitud de servicio, Con Evento Catastrofico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Seleccionamos el Boton crear Parametrizacion Motivos de Llamada
    And Con Evento Catastrofico
    And Escribimos la informacion de motivos de llamada con solicitud de servicio<name>,Tipo:"Solicitud de servicio",Estado:"Inhabilitado",Linea:<line>,Validacion"Prueba duplicidad Backlog"
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | name                                        | line  | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCreacionMotivosDeLlamdaSeguimientoServicioConEvento
  Scenario Outline: Creacion de motivo de llamada Seguimiento de Servicio con Evento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Seleccionamos el Boton crear Parametrizacion Motivos de Llamada
    And Con Evento Catastrofico
    And Escribimos la informacion de motivos de llamada Seguimiento de Servicio Nombre:<name>,Tipo:"Seguimiento a un servicio",Estado:"Habilitado",Linea:<line>,opcion<option>
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | name                                        | line  | option | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCreacionMotivosDeLlamdaSeguimientoServicioSinEvento
  Scenario Outline: Creacion de motivo de llamada Seguimiento de Servicio sin Evento Catastrofrico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Seleccionamos el Boton crear Parametrizacion Motivos de Llamada
    And Escribimos la informacion de motivos de llamada Seguimiento de Servicio Nombre:<name>,Tipo:"Seguimiento a un servicio",Estado:"Habilitado",Linea:<line>,opcion<option>
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | name                                        | line  | option | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico9 | Hogar | 55     | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico9 | Hogar | 55     | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCallCreateGeneralInformationNotCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Seleccionamos el Boton crear Parametrizacion Motivos de Llamada
    And I write information in call reasons general information parameterization and <name> Tipo:"Información general",Estado:"Habilitado",Linea:<line>,Gestionfinal:"Información de servicio",servicio:"Conductor Elegido"
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario         | contrasena    | name                                        | line  | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | Pruebas Automatizacion Evento Catastrofico4 | Autos | Registro guardado correctamente |

  @TestEliminarMotivosDeLLamada
  Scenario Outline: Eliminacion Exitosa de motivos de llamada
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Buscamos parametrizacion motivos de llamada por<Nombre>,<Tipo>
    And Seleccionamos el boton Eliminar de Parametrizacion Motivos de Llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | Nombre                                      | Tipo                  | modalmessage                     |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Solicitud de servicio | Registro eliminado correctamente |

  @TestValidacionCamposMotivosDeLlamada
  Scenario Outline: Eliminacion Exitosa de motivos de llamada
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Seleccionamos el Boton crear Parametrizacion Motivos de Llamada
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | modalmessage                              |
      | Sergio.anaya | Colombia_2026* | Por favor validar los campos obligatorios |


  @TestEdicionMotivoDeLlamadaSolicitudDeServicio
  Scenario Outline: Edicion  Exitosa de motivos de llamada con solicitud de servicio, sin Evento Catastrofico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Buscamos parametrizacion motivos de llamada por<Nombre>,<Tipo>
    And Seleccionamos el Boton de Editar Motivos de llamada
    And Escribimos la informacion de motivos de llamada con solicitud de servicio<name>,Tipo:"Solicitud de servicio",Estado:"Inhabilitado",Linea:<line>,Validacion"Prueba duplicidad Backlog"
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | Nombre                                      | Tipo                      | name                     | line  | modalmessage                    |  |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion Evento Catastrofico9 | Seguimiento a un servicio | Pruebas Automatizacion 4 | Autos | Registro guardado correctamente |  |


  @TestEdicionMotivoDeLlamadaSolicitudDeServicioConEventoCatastrofico
  Scenario Outline: Edicion Exitosa de motivos de llamada con solicitud de servicio, Con Evento Catastrofico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Buscamos parametrizacion motivos de llamada por<Nombre>,<Tipo>
    And Seleccionamos el Boton de Editar Motivos de llamada
    And Con Evento Catastrofico
    And Escribimos la informacion de motivos de llamada con solicitud de servicio<name>,Tipo:"Solicitud de servicio",Estado:"Habilitado",Linea:<line>,Validacion"Lugar inseguro"
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | Nombre                   | Tipo                      | name                     | line             | modalmessage                    |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion 4 | Seguimiento a un servicio | Pruebas Automatizacion 5 | Emergencia Salud | Registro guardado correctamente |


  @TestEdicionMotivosDeLlamadaSeguimientoServicioConEvento
  Scenario Outline: Edicion de motivo de llamada Seguimiento de Servicio con Evento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Parametrizacion Motivos de Llamada
    And Buscamos parametrizacion motivos de llamada por<Nombre>,<Tipo>
    And Seleccionamos el Boton de Editar Motivos de llamada
    And Con Evento Catastrofico
    And Escribimos la informacion de motivos de llamada Seguimiento de Servicio Nombre:<name>,Tipo:"Seguimiento a un servicio",Estado:"Habilitado",Linea:<line>,opcion<option>
    And Seleccionamos el boton Guardar Parametrizacion Motivos de llamada
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | Nombre                   | Tipo                  | name                     | line  | option | modalmessage                    |
      | Sergio.anaya | Colombia_2027* | Pruebas Automatizacion 5 | Solicitud de servicio | Pruebas Automatizacion 5 | Hogar | 55     | Registro guardado correctamente |