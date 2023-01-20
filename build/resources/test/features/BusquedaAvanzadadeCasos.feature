Feature: Page advanced search case
  As a user
  I need to perform an advanced search

  Background:
    Given I performed a full or optional advanced search for a case

  @TestAdvancedSearchComplete
  Scenario Outline: Successful advanced search case complete
    When Gestionamos en Sara
    And I entering the advanced search case
    And I type information in the fields case <numberCase> and license plate <licensePlate> and security code <securityCode> and click case <clickCase> and assigned to <assignedTo> and department <department> and municipality <municipality> and line <line> and case closure status <caseClosureStatus> and class <class> and case status <caseStatus> and service status <serviceStatus> and service <service> and type service <typeService> and special service <specialService> and customer type <customerType> and supplier <supplier>
    Then I view the case found

    Examples:
      | numberCase       | licensePlate | securityCode | clickCase | assignedTo | department | municipality | line | caseClosureStatus | class | caseStatus | serviceStatus | service | typeService | specialService | customerType | supplier |
      | 1111111111111111 |              |              |           |            |            |              |      |                   |       |            |               |         |             |                |              |          |

  @TestAdvancedSearchOptional
  Scenario Outline: Successful advanced search case optional
    When Gestionamos en Sara
    And I entering the advanced search case
    And I type information optional in the fields case <numberCase> and license plate <licensePlate> and department <department> and line <line> and service <service>
    Then I view the case found
    Examples:
      | numberCase       | licensePlate | department | line  | service          |
      | 2021060944354508 | SFG74R       | Putumayo   | Autos | Emergencia Salud |