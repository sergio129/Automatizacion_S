Feature: Push notifications

  As a user
  I need to create or edition a Push notifications

  Background:
    Given I create or edition a push notifications

  @TestCreacionNotificacionPush
  Scenario Outline: Creacion Exitosa de Notificaciones Push
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select button create push notifications
    And I write information in the push notifications of the following fields <line>and<service>and<servicestatus>and<roles>and<Timetomoment1>and<Timetomoment2>and<appointmenttime1>and<appointmenttime2>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password      | line  | service          | servicestatus | roles            | Timetomoment1 | Timetomoment2 | appointmenttime1 | appointmenttime2 | modalmessage                           |
      | sergio.anaya | Colombia_2021 | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | 105           | 4             | 55               | 5                | EXITO:Registro guardado correctamente. |


  @TestEditarNotificacionPush
  Scenario Outline: Edicion Exitosa de parametrizacion notificaciones push
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select filter push notifications <linefilter>and<service>and<servicestatus>and<roles>
    And I select button search for push notifications
    And I select button Edit push notifications
    And I write information in the push notifications of the following fields <line>and<service>and<servicestatus>and<roles>and<Timetomoment1>and<Timetomoment2>and<appointmenttime1>and<appointmenttime2>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | linefilter | line  | service          | servicestatus | roles            | Timetomoment1 | Timetomoment2 | appointmenttime1 | appointmenttime2 | modalmessage                     |
      | sergio.anaya | Colombia_2026* | Autos      | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | 105           | 4             | 55               | 5                | Registro guardado correctamente. |

  @TestPushNotificationsDelete
  Scenario Outline: push notification Delete
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select filter push notifications <line>and<service>and<servicestatus>and<roles>
    And I select button search for push notifications
    And I select button delete push notifications
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | line  | service          | servicestatus | roles            | modalmessage                           |
      | sergio.anaya | Colombia_2026* | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | Parametrización elimada correctamente. |


  @TestPushNotificationsFields
  Scenario Outline: push notification Fields
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select button create push notifications
    And I select button save push notifications
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | user         | password       | modalmessage                              |
      | sergio.anaya | Colombia_2025* | Debe llenar todos los campos obligatorios |




