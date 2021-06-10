Feature: Page create case
  As a user
  I need to create a case


  Scenario Outline: Successful case creation
    Given I am entry the case creation page with user <user> and password <password>
    When I inputing information in the field number case <numberCase>
    And I inputing information in the field applicant name <applicantName>
    And I inputing information in the field phone1 <phone1>
    And I inputing information in the field license plate <licensePlate>
    And I inputing information in the field service address <serviceAddress>
    And I inputing information in the field service location <serviceLocation>
    And I inputing information in the field department <department>
    And I inputing information in the field municipality <municipality>
    And I inputing information in the field click case <clickCase>
    And I inputing information in the field line <line>
    And I inputing information in the field service <service>
    Then user view <message> in the input

    Examples:
      |  user        | password  |numberCase      | applicantName |    phone1  | licensePlate|serviceAddress | serviceLocation|department|municipality|clickCase|line |service| message                         |
      |yaira.acevedo | YMAe8807* |20212131283723  |    pruebas    | 1312314    | GTRE34E     |pruebas        | pruebas        |Antioquia |Medellin    |No       |Autos|Grua   | registro creado correctamente   |