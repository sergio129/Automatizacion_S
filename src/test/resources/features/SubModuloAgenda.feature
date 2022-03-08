Feature: SubModulo Gestion Salud
  El Usuario
  Puede registrar y editar informacion el en sudmodulo de gestion salud

  Background:
    Given Regristro de informacion Sub modulo Gestion Salud

  @TestEmergenciaSi
  Scenario Outline: Registro Exitoso Gestion Salud tipo de emergencia si
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Click en el submodulo agenda
    And Escribimos en el campo <tipocontacto> clic en agregar
    And Escribimos la informacion en los campos <numeroallamar>,<departamento>,<municipio>
    And Selecionamos el boton llamar
    Then Se visualiza mensaje de la modal<modalmensaje>
