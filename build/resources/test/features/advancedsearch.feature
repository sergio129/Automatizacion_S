Feature: Page advanced search case
As a user
I need to perform an advanced search

  Background:
    Given I performed a full or optional advanced search for a case

  @TestAdvancedSearchComplete
  Scenario Outline: Successful advanced search case complete
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search case
    And I type information in the fields case <numberCase> and license plate <licensePlate> and security code <securityCode> and click case <clickCase> and assigned to <assignedTo> and department <department> and municipality <municipality> and line <line> and case closure status <caseClosureStatus> and class <class> and case status <caseStatus> and service status <serviceStatus> and service <service> and type service <typeService> and special service <specialService> and customer type <customerType> and supplier <supplier>
    Then I view the case found

    Examples:
      | user         | password       | numberCase       | licensePlate | securityCode | clickCase | assignedTo        | department | municipality | line | caseClosureStatus | class                    | caseStatus | serviceStatus | service          | typeService | specialService | customerType | supplier         |
      | Sergio.anaya | Colombia_2024* | 2021091712145443 | SFG74R       | 2145443      | No        | Sergio Luis Anaya | Cordoba    | Monteria     | ARL  | Finalizado        | Coordinacion tradicional | Finalizado | Finalizado    | Emergencia Salud |             | Noo            | Intermedio   | PROVEEDOR PRUEBA |

  @TestAdvancedSearchOptional
  Scenario Outline: Successful advanced search case optional
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search case
    And I type information optional in the fields case <numberCase> and license plate <licensePlate> and department <department> and line <line> and service <service>
    Then I view the case found

    Examples:
      | user         | password       | numberCase       | licensePlate | department | line | service          |
      | sergio.anaya | Colombia_2024* | 2021091712145443 | SFG74R       | Monteria   | ARL  | Emergencia Salud |