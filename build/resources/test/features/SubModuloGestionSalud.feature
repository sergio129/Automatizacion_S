Feature: SubModulo Gestion Salud
  El Usuario
  Puede registrar y editar informacion el en sudmodulo de gestion salud

  Background:
    Given Regristro de informacion Sub modulo Gestion Salud

  @TestEmergenciaSi
  Scenario Outline: Registro Exitoso Gestion Salud tipo de emergencia si
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en crear registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud:Si <TipoEmergencia>,<ServicioPrestado>,<NombreAcompanante>,<Parentesco>,<Telefono>,<PrestadorServicio>,<Observaciones>
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | TipoEmergencia            | ServicioPrestado | NombreAcompanante | Parentesco | Telefono    | PrestadorServicio | Observaciones          | modalmensaje                    |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | Si              | Emergencia por enfermedad | Hola Doctor      | Pruebas automa    | Novio(a)   | 31036666544 | Santa Rita        | pruebas Automatizacion | Registro guardado correctamente |


  @TestEdicionEmergenciaSi
  Scenario Outline: Edicion Exitoso Gestion Salud tipo de emergencia si
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en editar registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud:Si <TipoEmergencia>,<ServicioPrestado>,<NombreAcompanante>,<Parentesco>,<Telefono>,<PrestadorServicio>,<Observaciones>
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | TipoEmergencia            | ServicioPrestado | NombreAcompanante | Parentesco | Telefono    | PrestadorServicio | Observaciones          | mensaje                         |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 888888889       | Si              | Emergencia por enfermedad | Hola Doctor      | Pruebas automa    | Novio(a)   | 31036666544 | Santa Rita        | pruebas Automatizacion | Registro guardado correctamente |


  @TestEmergenciaNoDificultaNo
  Scenario Outline: Registro Exitoso de emergencia No dificulta no
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en crear registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud dificultad No<AtencionSalud>,<Observaciones>
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | AtencionSalud | Observaciones          | mensaje                         |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | No              | No            | pruebas Automatizacion | Registro guardado correctamente |


  @TestEdicionEmergenciaNoDificultaNo
  Scenario Outline: Edicion Exitoso de emergencia No dificulta no
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en editar registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud dificultad No<AtencionSalud>,<Observaciones>
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | AtencionSalud | Observaciones          | mensaje                         |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | No              | No            | pruebas Automatizacion | Registro guardado correctamente |

  @TestEmergenciaNoDificultadSi
  Scenario Outline: Registro Exitoso de emergencia dificultad si
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en crear registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud dificulta Si<AtencionSalud>,<Atencion>,<Observaciones>
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | AtencionSalud | Atencion         | Observaciones          | mensaje                         |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | No              | si            | Vacunación Covid | pruebas Automatizacion | Registro guardado correctamente |

  @TestEdicionEmergenciaNoDificultadSi
  Scenario Outline: Edicion Exitoso de emergencia dificultad si
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en editar registro emergencia salud
    And Escribimos datos comunes emergencia Salud<CanalIngreso>,<TipoDocumento>,<NumeroDocumento>,<TieneEmergencia>
    And Escribimos la informacion de Emergencia salud dificulta Si<AtencionSalud>,<Atencion>,<Observaciones>
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento | TieneEmergencia | AtencionSalud | Atencion         | Observaciones          | mensaje                         |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 88888888        | No              | si            | Vacunación Covid | pruebas Automatizacion | Registro guardado correctamente |


  @ValidarCampos
  Scenario Outline: Edicion Exitoso de emergencia dificultad si
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "CE4FF3AD43112DF"
    And Click en crear registro emergencia salud
    And Seleccionamos el boton guardar Emergencia salud
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | mensaje                          |
      | Verifica los campos obligatorios |