Feature: Tablero Citas Reprogramadas

  Background:
    Given Modulo Integracion

  @TestCambioEstadoTableroCitasReprogramadas
  Scenario Outline:Cambio de estado exitoso desde tablero citas reprogramadas
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a el Modulo de Integracion
    And Entramos a Citas Reprogramadas, Buscamos por filtros, Estado del servicio: "Aceptado y en desplazamiento", linea: "Autos" y Departamento: "Bogota D.C."
    And Gestionamos la opcion de actualizacion masiva de citas reprogramadas, Usuario: "Katerin", Estado: "En sitio"
    Examples:
    Then Se visualiza mensaje de la modal<modalmensaje>
      | modalmensaje                    |
      | Registro guardado correctamente |