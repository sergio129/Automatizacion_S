Feature: SubModulo Gestion Salud
  El Usuario
  Puede registrar informacion el en sudmodulo de gestion salud

  Background:
    Given Regristro de informacion Sub modulo Gestion Salud

  @TestEmergenciaSi
  Scenario Outline: Registro Exitoso Gestion Salud
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Click en crear registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud:Si <TipoEmergencia>,<ServicioPrestado>,<NombreAcompanante>,<Parentesco>,<Telefono>,<PrestadorServicio>,<Observaciones>
    And Selecionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la Then Se visualiza mensaje de la modal Gestion Salud <mensaje>

    Examples:
      | usuario      | contrasena     | NumeroCaso      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | TipoEmergencia            | ServicioPrestado | NombreAcompanante | Parentesco | Telefono    | PrestadorServicio | Observaciones          | mensaje                         |
      | sergio.anaya | Colombia_2026* | A02201170012633 | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | Si              | Emergencia por enfermedad | Hola Doctor      | Pruebas automa    | Novio(a)   | 31036666544 | Santa Rita        | pruebas Automatizacion | Registro guardado correctamente |


  @TestEmergenciaNo
  Scenario Outline: Registro Exitoso Gestion Salud
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Click en crear registro emergencia salud
    And Escribimos la informacion de Emergencia salud:No <CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>,<AtencionSalud>,<Observaciones>
    And Selecionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la Then Se visualiza mensaje de la modal Gestion Salud <mensaje>

    Examples:
      | usuario      | contrasena     | NumeroCaso      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | AtencionSalud | Observaciones          | mensaje                         |
      | sergio.anaya | Colombia_2026* | A02201170012633 | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | No              | No            | pruebas Automatizacion | Registro guardado correctamente |