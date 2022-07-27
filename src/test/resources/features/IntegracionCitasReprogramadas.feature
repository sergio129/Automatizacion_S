Feature: Tablero Citas Reprogramadas

  Background:
    Given Tablero Citas Reprogramadas

  @TestCambioEstadoTableroCitasReprogramadas
  Scenario Outline:Cambio de estado exitoso desde tablero citas reprogramadas
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Ingresamos a integracion Citas Reprogramadas
    And Buscamos por filtros, Estado del servicio, linea y departamento de citas reprogramadas
      | EstadoServicio               | Linea | Departamento |
      | Aceptado y en desplazamiento | Autos | Bogota D.C.  |
    And Seleccionamos el Servicio
    And Gestionamos la opcion de actualizacion masiva de citas reprogramadas
      | Usuario | estado   |
      | Katerin | En Sitio |
    Examples:
    Then Se visualiza mensaje de la modal<modalmensaje>
      | modalmensaje                    |
      | Registro guardado correctamente |