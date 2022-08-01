Feature: Control boards parameterization
  As a user
  I need to create, edition or delete a control boards parameterization

  Background:
    Given I create, edition or delete a control boards parameterization


  @TestCreacionExitosaParametrizacionTablerosDeControl
  Scenario Outline: Successful control boards cases parameterization
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And I type information in the case board parameterization with the board name <boardname> and fields show <fieldsshow>
    And I type filters in the case board parameterization with the case status <casestatus> and status service <statusservice> and department request <departmentrequest> and service <service> and special service <specialservice>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | boardname             | fieldsshow | casestatus | statusservice | departmentrequest | service          | specialservice | modalmessage                    |
      | Tablero pruebas casos | fieldsshow | Pendiente  | Programado    | Antioquia         | Abogado En Sitio | Noo            | Registro guardado correctamente |


  @TestControlBoardsTaskMonitoringParameterization
  Scenario Outline: Successful control boards task monitoring parameterization
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And I type information in the monitoring task board parameterization with the board name <boardname> and fields show <fieldsshow>
    And I type filters in the monitoring task board parameterization with the supplier <supplier> and monitoring type <monitoringtype> and assigned user <assigneduser>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | boardname              | fieldsshow | supplier                      | monitoringtype     | assigneduser        | modalmessage                    |
      | Tablero pruebas tareas | fieldsshow | 24 H CAR SERVICE SAS MEDELLIN | Monitoreo en Sitio | Yaira Manuela Admin | Registro guardado correctamente |


  @TestControlBoardsClosureCaseParameterization
  Scenario Outline: Successful control boards closure case parameterization
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And I type information in the closure case board parameterization with the board name <boardname> and fields show <fieldsshow>
    And I type filters in the closure case board parameterization with the service <service> and supplier <supplier> and special service <specialservice> and assigned user <assigneduser>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | boardname                            | fieldsshow | service              | supplier                          | specialservice | assigneduser         | modalmessage                    |
      | Tablero pruebas cierre de expediente | fieldsshow | Abogado En Sitio Arl | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Noo            | Angela Prueba Prueba | Registro guardado correctamente |


  @TestControlBoardsCasesParameterizationEdition
  Scenario Outline: Control boards cases parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button edition control boards parameterization
    And I type information in the case board parameterization with the board name <boardname> and fields show <fieldsshow>
    And I type filters in the case board parameterization with the case status <casestatus> and status service <statusservice> and department request <departmentrequest> and service <service> and special service <specialservice>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | boardname             | fieldsshow | casestatus | statusservice | departmentrequest | service          | specialservice | modalmessage                    |
      | Tablero pruebas casos | fieldsshow | Pendiente  | Programado    | Antioquia         | Abogado En Sitio | Noo            | Registro guardado correctamente |


  @TestControlBoardsTaskMonitoringParameterizationEdition
  Scenario Outline: Control boards task monitoring parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button edition control boards parameterization
    And I type information in the monitoring task board parameterization with the board name <boardname> and fields show <fieldsshow>
    And I type filters in the monitoring task board parameterization with the supplier <supplier> and monitoring type <monitoringtype> and assigned user <assigneduser>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | boardname              | fieldsshow | supplier                      | monitoringtype     | assigneduser        | modalmessage                    |
      | Tablero pruebas tareas | fieldsshow | 24 H CAR SERVICE SAS MEDELLIN | Monitoreo en Sitio | Yaira Manuela Admin | Registro guardado correctamente |


  @TestControlBoardsClosureCaseParameterizationEdition
  Scenario Outline: Control boards closure case parameterization successful edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button edition control boards parameterization
    And I type information in the closure case board parameterization with the board name <boardname> and fields show <fieldsshow>
    And I type filters in the closure case board parameterization with the service <service> and supplier <supplier> and special service <specialservice> and assigned user <assigneduser>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | boardname                            | fieldsshow | service              | supplier                          | specialservice | assigneduser         | modalmessage                    |
      | Tablero pruebas cierre de expediente | fieldsshow | Abogado En Sitio Arl | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Noo            | Angela Prueba Prueba | Registro guardado correctamente |


  @TestControlBoardsParameterizationDelete
  Scenario Outline: Control boards closure case parameterization successful delete
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button delete control boards parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                     |
      | registro eliminado correctamente |


  @TestControlBoardsParameterizationRequiredFields
  Scenario Outline: Control boards parameterization required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering control boards parameterization
    And I select button create control boards parameterization
    And I no type information control boards parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                      |
      | Todos los campos son obligatorios |