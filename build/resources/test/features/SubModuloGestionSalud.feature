Feature: SubModulo Gestion Salud
  El Usuario
  Puede registrar informacion el en sudmodulo de gestion salud

  Background:
    Given Regristro de informacion Sub modulo Gestion Salud

  @TestEmergenciaSi
  Scenario Outline: Successful novelty creation
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Buscamos por numero de expediente <NumeroCaso>
    And Click en crear registro emergencia salud
    And Escribimos la informacion de Emergencia salud: <CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>,<TipoEmergencia>,<ServicioPrestado>,<NombreAcompanante>,<Parentesco>,<Telefono>,<PrestadoServicio>,<Observaciones>
    And Selecionamos el boton guardar Emergencia salud
    Then Then Se visualiza mensaje de la Then Se visualiza mensaje de la modal Gestion Salud <mensaje>

    Examples:
      | usuario      | contrasena     | NumeroCaso      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | TipoEmergencia            | ServicioPrestado | NombreAcompanante | Parentesco | Telefono    | PrestadoServicio | Observaciones          | mensaje                         |
      | sergio.anaya | Colombia_2026* | A02201170012633 | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | Si              | Emergencia por enfermedad | Hola Doctor      | Pruebas automa    | Novio(a)   | 31036666544 | Santa Rita       | pruebas Automatizacion | Registro guardado correctamente |