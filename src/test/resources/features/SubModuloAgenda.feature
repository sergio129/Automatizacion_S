Feature: SubModulo agenda
  El Usuario
  Puede registrar y editar informacion el en sudmodulo de Agenda

  Background:
    Given Regristro de informacion Sub modulo Agenda

  @Testllamada
  Scenario Outline: Registro Exitoso modulo de agenda
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Escribimos en el modulo agenda el <tipocontacto>
    And clic en agregar modulo agenda
    And Escribimos en el modulo agenda campos a llamar <numeroallamar>,<departamento>,<municipio>
    Then Seleccionamos el boton llamar

    Examples:
      | tipocontacto | numeroallamar | departamento | municipio |
      | asegurado    | 311233        | Antioquia    | Medellin  |