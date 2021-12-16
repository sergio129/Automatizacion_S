Feature: Alert recipients parameterization
  As a user
  I need to create, edition or delete a alert recipients parameterization

  Background:
    Given I create, edition or delete a alert recipients parameterization

  @TestAlertParameterization
  Scenario Outline: Successful alert recipients parameterization
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I select button create alert recipients
    And I type information in the alert with the name <namealert> and the line <linealert> and the service <servicealert> and the department <departmentalert> and the municipality <municipalityalert> and the email <emailalert>
    Then I view the modal save alert recipients parameterization with <modalmessage>

    Examples:
      | user         | password       | namealert       | linealert | servicealert       | departmentalert | municipalityalert | emailalert                    | modalmessage                    |
      | Sergio.anaya | Colombia_2024* | Pruebas alertaa | Autos     | Abogado Preliminar | Antioquia       | Belen             | sergio.anaya@grupokonecta.com | Registro guardado correctamente |


  @TestAlertParameterizationEdition
  Scenario Outline: Alert recipients parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I select button search alert recipients<namealert>
    And I select button edition alert recipients
    And I type information in the alert with the name <namealert> and the line <linealert> and the service <servicealert> and the department <departmentalert> and the municipality <municipalityalert> and the email <emailalert>
    Then I view the modal save alert recipients parameterization with <modalmessage>

    Examples:
      | user         | password       | namealert       | linealert         | servicealert      | departmentalert | municipalityalert | emailalert         | modalmessage                    |
      | sergio.anaya | Colombia_2024* | Pruebas alertaa | Conductor elegido | Conductor Elegido | Boyaca          | Tunja             | pruebasa@gmail.com | Registro guardado correctamente |


  @TestAlertParameterizationDelete
  Scenario Outline: Alert recipients parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I search name alert <namealert> and select button delete alert recipients
    Then I view the modal save alert recipients parameterization with <modalmessage>

    Examples:
      | user         | password       | namealert       | modalmessage                     |
      | sergio.anaya | Colombia_2024* | Pruebas alertaa | Registro eliminado correctamente |


  @TesAlertRequiredFields
  Scenario Outline:Alert recipients parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I select button create alert recipients
    And I no type information alert recipients
    Then I view the modal save alert recipients parameterization with <modalmessage>

    Examples:
      | user         | password       | modalmessage                         |
      | sergio.anaya | Colombia_2024* | Los campos marcados son obligatorios |