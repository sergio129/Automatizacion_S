Feature: Control boards parameterization
  As a user
  I need to create, edition or delete a control boards parameterization

  Background:
    Given I create, edition or delete a control boards


  @TestControlBoardsCases
  Scenario Outline: Successful control boards cases
    When I entering in the application with user <user> and password <password>
    And I select button create control boards
    And I type information in the case board with the board name <boardname> and fields show1 <fieldsshow1> and fields show2 <fieldsshow2> and fields show3 <fieldsshow3> and fields show4 <fieldsshow4> and fields show5 <fieldsshow5>
    And I type filters in the case board with the case status <casestatus> and status service <statusservice> and department request <departmentrequest> and service <service> and special service <specialservice> and assigned user <assigneduser>
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user         | password       | boardname                    | fieldsshow1 | fieldsshow2       | fieldsshow3 | fieldsshow4  | fieldsshow5 | casestatus | statusservice | departmentrequest | service          | specialservice | assigneduser        | modalmessage                    |
      | Sergio.anaya | Colombia_2024* | Tablero Casos Automatizacion | Expediente  | Estado expediente | Asignado a  | Departamento | Proveedor   | Pendiente  | Programado    | Antioquia         | Abogado En Sitio | Noo            | Yaira Manuela Admin | Registro guardado correctamente |


  @TestControlBoardsTaskMonitoring
  Scenario Outline: Successful control boards task monitoring
    When I entering in the application with user <user> and password <password>
    And I select button create control boards
    And I type information in the monitoring task board with the board name <boardname> and fields show1 <fieldsshow1> and fields show2 <fieldsshow2> and fields show3 <fieldsshow3> and fields show4 <fieldsshow4> and fields show5 <fieldsshow5>
    And I type filters in the monitoring task board with the supplier <supplier> and monitoring type <monitoringtype> and assigned user <assigneduser>
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | boardname              | fieldsshow1 |fieldsshow2      | fieldsshow3 | fieldsshow4         | fieldsshow5    | supplier                      | monitoringtype     | assigneduser        | modalmessage                    |
      | yaira.acevedo | YMAe1710*  | Tablero pruebas tareas | Servicio    |Línea            | Expediente  | Nombre de la tarea  | Tipo monitoreo | 24 H CAR SERVICE SAS MEDELLIN | Monitoreo en Sitio | Yaira Manuela Admin | Registro guardado correctamente |


  @TestControlBoardsClosureCase
  Scenario Outline: Successful control boards closure case
    When I entering in the application with user <user> and password <password>
    And I select button create control boards
    And I type information in the closure case board with the board name <boardname> and fields show1 <fieldsshow1> and fields show2 <fieldsshow2> and fields show3 <fieldsshow3> and fields show4 <fieldsshow4> and fields show5 <fieldsshow5>
    And I type filters in the closure case board with the service <service> and supplier <supplier> and special service <specialservice> and assigned user <assigneduser>
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | boardname                             | fieldsshow1   |fieldsshow2               | fieldsshow3 | fieldsshow4   | fieldsshow5  | service             | supplier                          | specialservice | assigneduser         | modalmessage                    |
      | yaira.acevedo | YMAe1710*  | Tablero pruebas cierre de expediente  | Expediente    |Estado cierre expediente  | Asignado a  | Servicio      | Proveedor    |Abogado En Sitio Arl | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Noo            | Yaira Manuela Admin  | Registro guardado correctamente |


  @TestControlBoardsCasesEdition
  Scenario Outline: Control boards cases successful edition
    When I entering in the application with user <user> and password <password>
    And I select button edition control boards
    And I type edition information in the case board with the board name <boardname> and fields show1 <fieldsshow1> and fields show2 <fieldsshow2> and fields show3 <fieldsshow3> and fields show4 <fieldsshow4> and fields show5 <fieldsshow5>
    And I type filters in the case board with the case status <casestatus> and status service <statusservice> and department request <departmentrequest> and service <service> and special service <specialservice> and assigned user <assigneduser>
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | boardname             | fieldsshow1 |fieldsshow2      | fieldsshow3 | fieldsshow4        | fieldsshow5      | casestatus | statusservice | departmentrequest | service          | specialservice | assigneduser      | modalmessage                    |
      | yaira.acevedo | YMAe1710*  | Tablero pruebas casos | Línea       |Servicio         | Placa       | Documentación CNM  | Expediente click | Pendiente  | Programado    | Antioquia         | Abogado En Sitio | Noo            | Andres            | Registro guardado correctamente |


  @TestControlBoardsTaskMonitoringEdition
  Scenario Outline: Control boards task monitoring successful edition
    When I entering in the application with user <user> and password <password>
    And I select button edition control boards
    And I type edition information in the monitoring task board with the board name <boardname> and fields show1 <fieldsshow1> and fields show2 <fieldsshow2> and fields show3 <fieldsshow3> and fields show4 <fieldsshow4> and fields show5 <fieldsshow5>
    And I type filters in the monitoring task board with the supplier <supplier> and monitoring type <monitoringtype> and assigned user <assigneduser>
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | boardname              | fieldsshow1  |fieldsshow2     | fieldsshow3        | fieldsshow4  | fieldsshow5 | supplier                      | monitoringtype     | assigneduser        | modalmessage                    |
      | yaira.acevedo | YMAe1710*  | Tablero pruebas tareas | Departamento |Servicio        | Estado de la tarea | Asignado a   | Proveedor   | 24 H CAR SERVICE SAS MEDELLIN | Monitoreo en Sitio | Yaira Manuela Admin | Registro guardado correctamente |


  @TestControlBoardsClosureCaseEdition
  Scenario Outline: Control boards closure case successful edition
    When I entering in the application with user <user> and password <password>
    And I select button edition control boards
    And I type edition information in the closure case board with the board name <boardname> and fields show1 <fieldsshow1> and fields show2 <fieldsshow2> and fields show3 <fieldsshow3> and fields show4 <fieldsshow4> and fields show5 <fieldsshow5>
    And I type filters in the closure case board with the service <service> and supplier <supplier> and special service <specialservice> and assigned user <assigneduser>
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | boardname                             | fieldsshow1 |fieldsshow2          | fieldsshow3 | fieldsshow4     | fieldsshow5          | service             | supplier                          | specialservice | assigneduser        | modalmessage                    |
      | yaira.acevedo | YMAe1710*  | Tablero pruebas cierre de expediente  | Creado por  |¿Concluido servicio? | Línea       | Fecha creación  | Ultima modificación  |Abogado En Sitio Arl | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Noo            | Kevin               | Registro guardado correctamente |


  @TestControlBoardsDelete
  Scenario Outline: Control boards closure case parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I select button delete control boards
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | modalmessage                   |
      | yaira.acevedo | YMAe1710*  |Registro eliminado correctamente|

  @TestControlBoardsRequiredFields
  Scenario Outline: Control boards module required fields
    When I entering in the application with user <user> and password <password>
    And I select button create control boards
    And I no type information control boards
    Then I view the modal save control boards with <modalmessage>

    Examples:
      | user          | password   | modalmessage                     |
      | yaira.acevedo | YMAe1710*  |Todos los campos son obligatorios |