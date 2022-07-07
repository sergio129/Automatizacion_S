Feature: SubModulo agenda
  El Usuario
  Puede registrar y editar informacion el en sudmodulo de Agenda

  Background:
    Given Regristro de informacion Sub modulo Agenda

  @Testllamada
  Scenario Outline: Registro Exitoso modulo de agenda
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Escribimos en el modulo agenda el <tipocontacto>
    And clic en agregar modulo agenda
    And Escribimos en el modulo agenda campos a llamar <numeroallamar>,<departamento>,<municipio>
    Then Selecionamos el boton llamar

    Examples:
      | usuario         | contrasena    | NumeroCaso      | tipocontacto | numeroallamar | departamento | municipio |
      | yoarlys.carillo | Colombia2020* | 202121344537266 | asegurado    | 311233        | Antioquia    | Medellin  |