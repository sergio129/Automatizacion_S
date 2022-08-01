Feature: SubModulo Cierre expediente
  El Usuario
  Puede registrar y editar informacion el en sudmodulo cierre expediente

  Background:
    Given Regristro de informacion Sub modulo Cierre expediente

  @Testeditarcierre
  Scenario Outline: Edicion exitosa cierre expediente
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en el modulo cierre de expediente
    And Escribimos en los campos <hora>,<maniobras>,<maniobrasjustificada>,<adicional>,<zonaroja>,<zonadestapada>,<adicionaljustificacion>,<asumecliente>,<convenio>
    And click en el boton guardar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | hora | maniobras | maniobrasjustificada | adicional | zonaroja | zonadestapada | adicionaljustificacion | asumecliente | convenio | modalmensaje                    |
      | tres | calle     | prueba               | si        | no       | no            | si                     | no           | si       | Registro guardado correctamente |

  @TesteditarCierreCheckBanderazofallido
  Scenario Outline: Edicion exitosa cierre expediente foraneo fallido
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en el modulo cierre de expediente
    And Seleccionamos el check banderazo fonaneo fallido
    And Escribimos en el campo <kilometrofallido>
    And Escribimos en los campos <hora>,<maniobras>,<maniobrasjustificada>,<adicional>,<zonaroja>,<zonadestapada>,<adicionaljustificacion>,<asumecliente>,<convenio>
    And click en el boton guardar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | kilometrofallido | hora  | maniobras | maniobrasjustificada | adicional | zonaroja | zonadestapada | adicionaljustificacion | asumecliente | convenio | modalmensaje                    |
      | PRUEBA           | calle | prueba    | si                   | no        | no       | si            | no                     | si           | no       | Registro guardado correctamente |


  @TesteditarCierreCheckBanderazo
  Scenario Outline: Edicion exitosa cierre expediente foraneo fallido
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en el modulo cierre de expediente
    And Seleccionamos el check banderazo fonaneo
    And Escribo en el campo <kilometro>
    And Escribimos en los campos <hora>,<maniobras>,<maniobrasjustificada>,<adicional>,<zonaroja>,<zonadestapada>,<adicionaljustificacion>,<asumecliente>,<convenio>
    And click en el boton guardar
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | kilometro | hora  | maniobras | maniobrasjustificada | adicional | zonaroja | zonadestapada | adicionaljustificacion | asumecliente | convenio | modalmensaje                    |
      | tres      | calle | prueba    | si                   | no        | no       | si            | no                     | si           | no       | Registro guardado correctamente |

  @Testcrearcierre
  Scenario Outline: Edicion exitosa cierre expediente
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en el modulo cierre de expediente
    And Clic en el icono crear
    And Escribimos en el campos <observacion>
    And click en el boton guardar observacion
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | observacion            | modalmensaje                    |
      | pruebassssssss KONECTA | Registro guardado correctamente |