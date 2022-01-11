Feature: Push notifications

  As a user
  I need to create or edition a Push notifications

  Background:
    Given I create or edition a push notifications

  @TestPushNotifications
  Scenario Outline: Succesful push notifications
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select button create push notifications
    And I write information in the push notifications of the following fields <line>and<service>and<servicestatus>and<roles>and<Timetomoment1>and<Timetomoment2>and<appointmenttime1>and<appointmenttime2>
    Then I view the modal save push notification with <modalmessage>
    Examples:
      | user         | password       | line  | service          | servicestatus | roles            | Timetomoment1 | Timetomoment2 | appointmenttime1 | appointmenttime2 | modalmessage                     |
      | sergio.anaya | Colombia_2025* | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | 105           | 4             | 55               | 5                | Registro guardado correctamente. |


  @TestPushNotificationsEdit
  Scenario Outline: push notification edit
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select filter push notifications <line>and<service>and<servicestatus>and<roles>
    And I select button search for push notifications
    And I select button Edit push notifications
    And I write information in the push notifications of the following fields <line>and<service>and<servicestatus>and<roles>and<Timetomoment1>and<Timetomoment2>and<appointmenttime1>and<appointmenttime2>
    Then I view the modal save push notification with <modalmessage>
    Examples:
      | user         | password       | line  | service          | servicestatus | roles            | Timetomoment1 | Timetomoment2 | appointmenttime1 | appointmenttime2 | modalmessage                     |
      | sergio.anaya | Colombia_2025* | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | 105           | 4             | 55               | 5                | Registro guardado correctamente. |

  @TestPushNotificationsDelete
  Scenario Outline: push notification Delete
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select filter push notifications <line>and<service>and<servicestatus>and<roles>
    And I select button search for push notifications
    And I select button delete push notifications
    Then I view the modal save push notification with <modalmessage>
    Examples:
      | user         | password       | line  | service          | servicestatus | roles            | modalmessage                           |
      | sergio.anaya | Colombia_2025* | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | Parametrización elimada correctamente. |


  @TestPushNotificationsFields
  Scenario Outline: push notification Fields
    When I entering in the application with user <user> and password <password>
    And I entering push notifications
    And I select button create push notifications
    And I select button save push notifications
    Then I view the modal save push notification with <modalmessage>
    Examples:
      | user         | password       | modalmessage                              |
      | sergio.anaya | Colombia_2025* | Debe llenar todos los campos obligatorios |




