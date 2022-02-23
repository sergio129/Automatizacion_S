Feature: SubModulo Reprogramacion de Citas

  El usuario puede crear una reprogramacion de cita

  Background:
    Given Creacion de Reprogramacion de cita

  @TestReprogramacionDeCitas
  Scenario Outline: Reporgramacion de Cita desde el modulo de Tareas de monitoreo
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Entramos a la reprogramacion de citas desde el sudmodulo de Tareas de monitoreo
    And Escribimos la informacion de la Reprogramacion de Citas<Motivo>,<Solicitante>,<NuevaCitaDiaMesActual>,<Hora>,<Observacion>
    And Click Boton Guardar Reprogramacion de Citas
    #Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | NumeroCaso      | Motivo                   | Solicitante | NuevaCitaDiaMesActual | Hora    | Observacion | modalmessage |
      | Sergio.Anaya | Colombia_2026* | A00000000000012 | Técnico incumple la cita | Proveedor   | 26                    | 09:19am | Prueba      |              |