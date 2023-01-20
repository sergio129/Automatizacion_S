Feature: Alert recipients parameterization
  As a user
  I need to create, edition or delete a alert recipients parameterization

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionDestinarioAlerta
  Scenario Outline: Creacion exitosa de destinatarios de Alerta
    When Gestionamos en Sara
    And I entering alert recipients parameterization
    And I select button create alert recipients
    And I type information in the alert with the name <namealert> and the line <linealert> and the service <servicealert> and the department <departmentalert> and the municipality <municipalityalert> and the email <emailalert>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | namealert   | linealert | servicealert      | departmentalert | municipalityalert | emailalert                        | modalmessage                    |
      | Pruebas QA3 | Hogares   | Hospedaje Viajero | Antioquia       | Belen             | yoarlys.carrillo@grupokonecta.com | Registro guardado correctamente |


  @TestAlertParameterizationEdition
  Scenario Outline: Alert recipients parameterization successful edition
    When Gestionamos en Sara
    And I entering alert recipients parameterization
    And I select button search alert recipients<namealert>
    And I select button edition alert recipients
    And I type information in the alert with the name <namealert> and the line <linealert> and the service <servicealert> and the department <departmentalert> and the municipality <municipalityalert> and the email <emailalert>
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | namealert       | linealert         | servicealert      | departmentalert | municipalityalert | emailalert         | modalmessage                    |
      | Pruebas alertaa | Conductor elegido | Conductor Elegido | Boyaca          | Tunja             | pruebasa@gmail.com | Registro guardado correctamente |


  @TestEliminarDestinatarioAlerta
  Scenario Outline: Alert recipients parameterization successful delete
    When Gestionamos en Sara
    And I entering alert recipients parameterization
    And I search name alert <namealert> and select button delete alert recipients
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | namealert       | modalmessage                     |
      | Pruebas alertaa | Registro eliminado correctamente |


  @TestValidacionDeCamposDestinatariosAlerta
  Scenario Outline:Alert recipients parameterization required fields
    When Gestionamos en Sara
    And I entering alert recipients parameterization
    And I select button create alert recipients
    And I no type information alert recipients
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | modalmessage                         |
      | Los campos marcados son obligatorios |