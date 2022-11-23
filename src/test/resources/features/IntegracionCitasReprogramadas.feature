Feature: Tablero Citas Reprogramadas

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCambioEstadoTableroCitasReprogramadas
  Scenario Outline:Cambio de estado exitoso desde tablero citas reprogramadas
    When  Gestionamos en Sara
    And Entramos a el Modulo de Integracion
    And Entramos a Citas Reprogramadas, Buscamos por filtros, Estado del servicio: "Aceptado y en desplazamiento", linea: "Hogares" y Departamento: "Bogota D.C."
    And Gestionamos la opcion de actualizacion masiva de citas reprogramadas, Usuario: "Katerin", Estado: "En sitio"
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                    |
      | Los casos han sido actualizados |


  @TestEliminarRegistroTableroCitasReprogramadas
  Scenario Outline:Eliminacion Exitosa de registro desde tablero citas reprogramadas
    When  Gestionamos en Sara
    And Entramos a el Modulo de Integracion
    And Entramos a Citas Reprogramadas, Buscamos por filtros, Estado del servicio: "Aceptado y en desplazamiento", linea: "Autos" y Departamento: "Bogota D.C."
    And Gestionamos la Eliminacion de registro de Tablero Citas Reprogramadas
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | modalmensaje                     |
      | Registro eliminado correctamente |