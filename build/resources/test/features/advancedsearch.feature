Feature: Page advanced search case
As a user
I need to perform an advanced search

  Scenario Outline: Successful advanced search case complete
    Given I am entry in the application with user <user> and password <password>
    And I am entry the advanced search case
    When set case <numberCase> and license plate <licensePlate> and security code <securityCode> and click case <clickCase> and assigned to <assignedTo> and department <department> and municipality <municipality> and line <line> and case closure status <caseClosureStatus> and class <class> and case status <caseStatus> and service status <serviceStatus> and service <service> and type service <typeService> and special service <specialService> and customer type <customerType> and supplier <supplier>
    Then user view the case

    Examples:
      |  user         | password  |numberCase      | licensePlate  |securityCode   | clickCase |  assignedTo                      |department  |municipality |line      |caseClosureStatus            |class                      |caseStatus                 |serviceStatus                |service   | typeService |specialService   |customerType |supplier                       |
      |yaira.acevedo  | YMAe8807* |2020031428606   |    EHL563     | 28606         | No        |Juan Chalarca                     |Antioquia   |Itagui       |Autos     |Pendiente                    |Coordinacion tradicional   | Pendiente por finalizar   |Concluido                    |Grua      | Guardianes1 |Noo              |Intermedio   |24 H CAR SERVICE SAS MEDELLIN  |


  Scenario Outline: Successful advanced search case optional
    Given I am entry in the application with user <user> and password <password>
    And I am entry the advanced search case
    When set search optional case <numberCase> and license plate <licensePlate> and department <department> and line <line> and service <service>
    Then user view the case

    Examples:
      |  user         | password  |numberCase      | licensePlate  |department  |line         |service                   |
      |yaira.acevedo  | YMAe8807* |202104062454881 | xxxx          |Antioquia   |Autos        |Abogado En Sitio          |