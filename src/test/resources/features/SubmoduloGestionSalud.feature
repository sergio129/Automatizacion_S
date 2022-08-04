Feature: SubModulo Gestion Salud
  El Usuario
  Puede registrar y editar informacion el en sudmodulo de gestion salud

  Background:
    Given Regristro de informacion Sub modulo Gestion Salud


  @GestionSalud
  Scenario Outline: Registro Exitoso Gestion Salud
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "202208040013430"
    And Click en crear registro emergencia salud
    And Escribimos datos comunes emergencia Salud:
      | CanalIngreso            | TipoDocumento        | NumeroDocumento |
      | Ingreso #888 Emergencia | Cédula de Ciudadanía | 7777777         |
    And Tiene una Emergencia?:"Si"
    And Preguntamos si tiene Dificultad en la atencion en salud
      | DificultadSalud | TipoDificultad                  |
      | Si              | Soporte App y/o Pagina sura.com |
    And Escribimos los datos de tiene emergencia Si
      | TipoEmergencia           | ServicioPrestado      | NombreAcompanante | Parentesco | Telefono    | PrestadorServicio |
      | Emergencia por accidente | Atención Domiciliaria | Jesus Doria       | Novio(a)   | 31025487451 | Forja             |
    And Escribimos las observaciones: "Pruebas QA" y guardamos
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | mensaje                         |
      | Registro guardado correctamente |

  @GestionSaludEditar
  Scenario Outline: Edicion Exitosa Modulo Gestion Salud
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Hacemos Busqueda del caso: "202208040013430"
    And Click en editar registro emergencia salud
    And Escribimos datos comunes emergencia Salud:
      | CanalIngreso        | TipoDocumento        | NumeroDocumento |
      | Conexión Asistencia | Cédula de Ciudadanía | 1000000         |
    And Tiene una Emergencia?:"No"
    And Preguntamos si tiene Dificultad en la atencion en salud
      | DificultadSalud | TipoDificultad                  |
      | Si              | Soporte App y/o Pagina sura.com |
    And Escribimos los datos de tiene emergencia Si
      | TipoEmergencia           | ServicioPrestado      | NombreAcompanante | Parentesco | Telefono   | PrestadorServicio |
      | Emergencia por accidente | Atención Domiciliaria | Jesus Doria       | Novio(a)   | 3102548741 | Forja             |
    And Escribimos las observaciones: "Pruebas QA" y guardamos
    Then Se visualiza mensaje de la modal<mensaje>
    Examples:
      | mensaje                         |
      | Registro guardado correctamente |


