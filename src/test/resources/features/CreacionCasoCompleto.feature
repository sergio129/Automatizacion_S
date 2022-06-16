Feature: Creacion de expediente con interaccion con diferentes modulo

  Background:
    Given Creacion de caso interaccion modulos

  @TestCreacionCaso
  Scenario Outline:Creacion de Caso
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2021 |
    And Seleccionamos el boton de Crear Caso
    And Escribimos el numero de caso en L202121344537270 y lo pegamos
    And Escribmos la informacion de la creacion de expediente
      | NombreSol   | Telefono1   | Placa  | DireccionServicio | UbicacionServicio | DetalleDireccion | Departamento | Municicpio | GestorCordi | Linea | Servicio |
      | Juan Felipe | 31035048745 | DTA54R | Calle 92144       | Produccion        | Pruebas QA       | Cordoba      | Lorica     | Si          | Autos | Grua     |
    And Hacemos Cambio de Estado
      | CambioEstado |
      | Abierto      |
    And Hacemos Gestion de proveedor
      | Proveedor      | RespuestaProveedor | TiempoMonitoreoSitio | TiempoMonitoreoDestino | CelularTecnico | TelfonoCentral | TelfonoCentral1 | Observaciones |
      | RECURSO PROPIO | Toma Servicio      | 20                   | 50                     | 3103642145     | 3103642145     | 3103642145      | Pruebas QA    |
    And Hacemos Cambio de Estado
      | CambioEstado |
      | Programado   |
    And Hacemos Cambio de Estado
      | CambioEstado                 |
      | Aceptado y en desplazamiento |

    Examples:
    Then Se visualiza mensaje de la modal<modalmensaje>
      | modalmensaje                    |
      | Registro guardado correctamente |