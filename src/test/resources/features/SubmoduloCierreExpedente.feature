Feature: SubModulo Cierre expediente
  El Usuario
  Puede registrar y editar informacion el en sudmodulo cierre expediente

  Background:
    Given Regristro de informacion Sub modulo Cierre expediente

  @Testeditarcierre
  Scenario Outline: Edicion exitosa cierre expediente
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Click en el modulo cierre de expediente
    And Escribimos en los campos <hora>,<maniobras>,<maniobrasjustificada>,<adicional>,<zonaroja>,<zonadestapada>,<adicionaljustificacion>,<asumecliente>,<convenio>
    And click en el boton guardar
    Then Se visualiza mensaje de la modal<modalmensaje>

    Examples:
      | usuario         | contrasena    | NumeroCaso      | hora | maniobras | maniobrasjustificada | adicional | zonaroja | zonadestapada | adicionaljustificacion | asumecliente | convenio | modalmensaje                    |
      | yoarlys.carillo | Colombia2021* | 202121344537266 | tres | calle     | prueba               | si        | no       | no            | si                     | no           | si       | Registro guardado correctamente |