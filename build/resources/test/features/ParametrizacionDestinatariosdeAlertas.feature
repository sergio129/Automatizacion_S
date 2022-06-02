Feature: Alert recipients parameterization
  As a user
  I need to create, edition or delete a alert recipients parameterization

  Background:
    Given I create, edition or delete a alert recipients parameterization

  @TestCreacionDestinarioAlerta
  Scenario Outline: Creacion exitosa de destinatarios de Alerta
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I select button create alert recipients
    And I type information in the alert with the name <namealert> and the line <linealert> and the service <servicealert> and the department <departmentalert> and the municipality <municipalityalert> and the email <emailalert>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password      | namealert   | linealert | servicealert      | departmentalert | municipalityalert | emailalert                        | modalmessage                    |
      | sergio.anaya | Colombia_2021 | Pruebas QA1 | Hogares   | Hospedaje Viajero | Antioquia       | Belen             | yoarlys.carrillo@grupokonecta.com | Registro guardado correctamente |


  @TestAlertParameterizationEdition
  Scenario Outline: Alert recipients parameterization successful edition
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I select button search alert recipients<namealert>
    And I select button edition alert recipients
    And I type information in the alert with the name <namealert> and the line <linealert> and the service <servicealert> and the department <departmentalert> and the municipality <municipalityalert> and the email <emailalert>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | namealert       | linealert         | servicealert      | departmentalert | municipalityalert | emailalert         | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | Pruebas alertaa | Conductor elegido | Conductor Elegido | Boyaca          | Tunja             | pruebasa@gmail.com | Registro guardado correctamente |


  @TestEliminarDestinatarioAlerta
  Scenario Outline: Alert recipients parameterization successful delete
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I search name alert <namealert> and select button delete alert recipients
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | namealert       | modalmessage                     |
      | yoarlys.carillo | Colombia2020* | Pruebas alertaa | Registro eliminado correctamente |


  @TestValidacionDeCamposDestinatariosAlerta
  Scenario Outline:Alert recipients parameterization required fields
    When I entering in the application with user <user> and password <password>
    And I entering alert recipients parameterization
    And I select button create alert recipients
    And I no type information alert recipients
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user            | password      | modalmessage                         |
      | yoarlys.carillo | Colombia2020* | Los campos marcados son obligatorios |