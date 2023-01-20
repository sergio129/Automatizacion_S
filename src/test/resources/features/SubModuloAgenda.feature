Feature: SubModulo agenda
  El Usuario
  Puede registrar y editar informacion el en sudmodulo de Agenda

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @Testllamada
  Scenario Outline: Registro Exitoso modulo de agenda
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Escribimos en el modulo agenda el <tipocontacto>
    And clic en agregar modulo agenda
    And Escribimos en el modulo agenda campos a llamar <numeroallamar>,<departamento>,<municipio>
    Then Seleccionamos el boton llamar

    Examples:
      | tipocontacto | numeroallamar | departamento | municipio |
      | asegurado    | 311233        | Antioquia    | Medellin  |