Feature: Parametrizacion Motivos de llamada
  As a user
  I need to create, edit and delete call reasons parameterization

  Background:
    Given I create, edit and delete call reasons parameterization

  @TestCreacionMotivoDeLlamadaSolicitudDeServicio
  Scenario Outline: Creacion Exitosa de motivos de llamada con solicitud de servicio, sin Evento Catastrofico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And Escribimos la informacion de motivos de llamada con solicitud de servicio<name>,Tipo:"Solicitud de servicio",Estado:"Inhabilitado",Linea:<line>,Validacion"Prueba duplicidad Backlog"
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | usuario      | contrasena     | name                    | line  | modalmessage                                                                                  |  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion2 | Hogar | Registro guardado correctamente                                                               |  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion2 | Hogar | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |  |

  @TestCreacionMotivoDeLlamadaSolicitudDeServicioConEventoCatastrofico
  Scenario Outline: Creacion Exitosa de motivos de llamada con solicitud de servicio, Con Evento Catastrofico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And Con Evento Catastrofico
    And Escribimos la informacion de motivos de llamada con solicitud de servicio<name>,Tipo:"Solicitud de servicio",Estado:"Inhabilitado",Linea:<line>,Validacion"Prueba duplicidad Backlog"
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | name                                        | line  | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCreacionMotivosDeLlamdaSeguimientoServicioConEvento
  Scenario Outline: Creacion de motivo de llamada Seguimiento de Servicio con Evento
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And Con Evento Catastrofico
    And Escribimos la informacion de motivos de llamada Seguimiento de Servicio Nombre:<name>,Tipo:"Seguimiento a un servicio",Estado:"Habilitado",Linea:<line>,opcion<option>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | name                                        | line  | option | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCreacionMotivosDeLlamdaSeguimientoServicioSinEvento
  Scenario Outline: Creacion de motivo de llamada Seguimiento de Servicio sin Evento Catastrofrico
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And Escribimos la informacion de motivos de llamada Seguimiento de Servicio Nombre:<name>,Tipo:"Seguimiento a un servicio",Estado:"Habilitado",Linea:<line>,opcion<option>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | name                                        | line  | option | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico9 | Hogar | 55     | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2026* | Pruebas Automatizacion Evento Catastrofico9 | Hogar | 55     | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |
#########################################################################Tarea Yoarlys###############################
  @TestCallCreateGeneralInformationNotCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I write information in call reasons general information parameterization and <name> Tipo:"Información general",Estado:"Habilitado",Linea:<line>,Gestionfinal:"Información de servicio",servicio:"Conductor Elegido"
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | usuario         | contrasena    | name                                        | line  | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | Pruebas Automatizacion Evento Catastrofico3 | Autos | Registro guardado correctamente |
