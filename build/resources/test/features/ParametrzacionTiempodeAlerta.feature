Feature: Parametrizacion tiempos de alertas
  As a user
  I need to create, edition or delete a alert time parameterization

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestAlertTimeParameterization
  Scenario Outline: Successful alert parameterization
    When Gestionamos en Sara
    And Entramos el el modulo de parametrizacion tiempos de alertas
    And Seleccionamos el boton creacion tiempos de alertas
    And Escribimos la informacion de parametrizacion tiempos alerta, <Linea>, <Servicio>, <Tiempo>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | Linea | Servicio         | Tiempo | modalmessage                    |
      | ARL   | Emergencia salud | 32     | Registro guardado correctamente |


  @TestEdicionTiemposDeAlerta
  Scenario Outline: Alert time parameterization successful edition
    When Gestionamos en Sara
    And Entramos el el modulo de parametrizacion tiempos de alertas
    And Seleccionamos el boton editar tiempos de alertas
    And Escribimos la informacion de parametrizacion tiempos alerta, <Linea>, <Servicio>, <Tiempo>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | Linea | Servicio | Tiempo | modalmessage                    |
      | Autos | Policia  | 25     | Registro guardado correctamente |


  @TestAlertTimeParameterizationDelete
  Scenario Outline: Alert time parameterization successful delete
    When Gestionamos en Sara
    And Entramos el el modulo de parametrizacion tiempos de alertas
    And Seleccionamos el boton eliminar tiempos de alertas
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                     |
      | Registro eliminado correctamente |

