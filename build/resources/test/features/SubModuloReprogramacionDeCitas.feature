Feature: SubModulo Reprogramacion de Citas

  El usuario puede crear una reprogramacion de cita

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestReprogramacionDeCitas
  Scenario Outline: Reporgramacion de Cita desde el modulo de Tareas de monitoreo
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Entramos a la reprogramacion de citas desde el sudmodulo de Tareas de monitoreo
    And Escribimos la informacion de la Reprogramacion de Citas<Motivo>,<Solicitante>,<NuevaCita>,<Hora>,<Observacion>
    And Click Boton Guardar Reprogramacion de Citas
    #Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | Motivo                   | Solicitante | NuevaCita  | Hora    | Observacion | modalmessage |
      | Técnico incumple la cita | Proveedor   | 2022-11-11 | 09:19am | Prueba      |              |