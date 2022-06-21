Feature: Creacion de expediente con interaccion con diferentes modulo

  Background:
    Given Creacion de caso interaccion modulos

  @TestCreacionCaso
  Scenario Outline:Creacion de Caso
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Seleccionamos el boton de Crear Caso
    #Gestionamos informacion del Expediente
    And Escribimos el numero de caso en L202121344537270 y lo pegamos
    And Escribmos la informacion de la creacion de expediente
      | NombreSol   | Telefono1   | Placa  | DireccionServicio | UbicacionServicio | DetalleDireccion | Departamento | Municicpio | GestorCordi | Linea | Servicio |
      | Juan Felipe | 31035048745 | DTA54R | Calle 92144       | Produccion        | Pruebas QA       | Cordoba      | Lorica     | Si          | Autos | Grua     |
    #Gestionamos el cambio de estado
    And Hacemos Cambio de Estado
      | CambioEstado |
      | Abierto      |
    #Gestionamos el proveedor
    And Hacemos Gestion de proveedor
      | Proveedor      | RespuestaProveedor | TiempoMonitoreoSitio | TiempoMonitoreoDestino | CelularTecnico | TelfonoCentral | TelfonoCentral1 | Observaciones |
      | RECURSO PROPIO | Toma Servicio      | 20                   | 50                     | 3103642145     | 3103642145     | 3103642145      | Pruebas QA    |
     #Gestionamos el cambio de estado
    And Hacemos Cambio de Estado
      | CambioEstado |
      | Programado   |
     #Gestionamos el cambio de estado
    And Hacemos Cambio de Estado
      | CambioEstado                 |
      | Aceptado y en desplazamiento |
    #Gestionamos el modulo de novedades
    And Seleccionamos el boton Crear novedad
    And Hacemos Gestion de Novedades
      | ReportaNovedad  | CausaNovedad                   | GenerarQueja | Radicado | Observaciones |
      | Abogado virtual | Cambio abogado virtual a sitio | No           | A7445544 | Pruebas QA    |
    #Gestionamos el modulo de Documentacion CNM
    And Escribimos los datos de Documentacion CNM
      | PersonaGestion     | GeneraQueja | Radicajo | Observaciones |
      | Administrativo Aya | Si          | R5554454 | Pruebas QA    |
    #Gestionamos el modulo de Finalizacion
    And Seleccionamos el Boton Crear Finalizacion
    And Escribimos informacion de Finalizacion
      | Finazalicion | TipoRespuesta | Observaciones |
      | Asegurado    | SMS           | Pruebas QA    |
    #Gestionamos el modulo de Escalamientos Sura
    And Seleccionamos el boton Crear Escalamientos Sura
    And Escribimos la informacion de Escalamientos Sura
      | TipoGestion           | PersonaGestion | TipoRespuesta   | GeneraQueja | Radicado | Obervaciones |
      | Guardianes de la vida | Integracion    | No especificado | Si          | R555445  | Pruebas QA   |
    Examples:
    Then Se visualiza mensaje de la modal<modalmensaje>
      | modalmensaje                    |
      | Registro guardado correctamente |