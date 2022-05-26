Feature: Page create case
  As a user
  I need to create or edition a case

  Background:
    Given I create or edition a case

  @TestCaseComplete
  Scenario Outline: Successful case creation
    When I entering the case creation page with user <user> and password <password>
    And I select creation case button
    And Escribimos el numero de caso en L202121344537270 y lo pegamos
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    Then I view the modal save case with <message>

    Examples:
      | user         | password       | numberCase      | applicantName          | phone1  | licensePlate | serviceAddress | serviceLocation | department | municipality | clickCase | line  | service | message                         | addressdetail |
      | Sergio.anaya | Colombia_2026* | 202121344537266 | Pruebas Automatizacion | 1312314 | GTRE34E      | pruebas        | pruebas         | Antioquia  | Medellin     | No        | Autos | Grua    | Registro guardado correctamente | xxx           |

  @TestCaseEdition
  Scenario Outline: Successful case edition
    When I entering the case creation page with user <user> and password <password>
    And I select button case edition with case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    Then I view the modal save case with <message>

    Examples:
      | user         | password       | numberCase       | applicantName | phone1  | licensePlate | serviceAddress | serviceLocation | department | municipality | clickCase | line  | service          | addressdetail | message                         |
      | Sergio.anaya | Colombia_2026* | A202121344537290 | pruebas uno   | 1312314 | GTRE34Emmm   | pruebas uno    | pruebas  uno    | Antioquia  | Itagui       | No        | Autos | Abogado en sitio | xxx uno       | Registro guardado correctamente |


  @TestCaseRequiredFields
  Scenario Outline: Case submodule required fields
    When I entering the case creation page with user <user> and password <password>
    And I no type information in the case creation
    Then I view the modal save case with <message>

    Examples:
      | user         | password       | message                           |
      | Sergio.anaya | Colombia_2026* | Todos los campos son obligatorios |