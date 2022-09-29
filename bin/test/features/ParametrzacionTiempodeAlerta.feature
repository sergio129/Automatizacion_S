Feature: Parametrizacion tiempos de alertas
  As a user
  I need to create, edition or delete a alert time parameterization

  Background:
    Given I create, edition or delete alert time parameterization

  @TestAlertTimeParameterization
  Scenario Outline: Successful alert parameterization
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos el el modulo de parametrizacion tiempos de alertas
    And Seleccionamos el boton creacion tiempos de alertas
    And Escribimos la informacion de parametrizacion tiempos alerta, <Linea>, <Servicio>, <Tiempo>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | Linea | Servicio         | Tiempo | modalmessage                    |
      | ARL   | Emergencia salud | 32     | Registro guardado correctamente |


  @TestEdicionTiemposDeAlerta
  Scenario Outline: Alert time parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos el el modulo de parametrizacion tiempos de alertas
    And Seleccionamos el boton editar tiempos de alertas
    And Escribimos la informacion de parametrizacion tiempos alerta, <Linea>, <Servicio>, <Tiempo>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | Linea | Servicio | Tiempo | modalmessage                    |
      | Autos | Policia  | 25     | Registro guardado correctamente |


  @TestAlertTimeParameterizationDelete
  Scenario Outline: Alert time parameterization successful delete
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos el el modulo de parametrizacion tiempos de alertas
    And Seleccionamos el boton eliminar tiempos de alertas
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                     |
      | Registro eliminado correctamente |

