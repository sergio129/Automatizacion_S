Feature: Push notifications

  As a user
  I need to create or edition a Push notifications

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionNotificacionPush
  Scenario Outline: Creacion Exitosa de Notificaciones Push
    When Gestionamos en Sara
    And I entering push notifications
    And I select button create push notifications
    And I write information in the push notifications of the following fields <line>and<service>and<servicestatus>and<roles>and<Timetomoment1>and<Timetomoment2>and<appointmenttime1>and<appointmenttime2>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | line  | service          | servicestatus | roles            | Timetomoment1 | Timetomoment2 | appointmenttime1 | appointmenttime2 | modalmessage                           |
      | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | 105           | 4             | 55               | 5                | EXITO:Registro guardado correctamente. |


  @TestEditarNotificacionPush
  Scenario Outline: Edicion Exitosa de parametrizacion notificaciones push
    When Gestionamos en Sara
    And I entering push notifications
    And I select filter push notifications <linefilter>and<service>and<servicestatus>and<roles>
    And I select button search for push notifications
    And I select button Edit push notifications
    And I write information in the push notifications of the following fields <line>and<service>and<servicestatus>and<roles>and<Timetomoment1>and<Timetomoment2>and<appointmenttime1>and<appointmenttime2>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | linefilter | line  | service          | servicestatus | roles            | Timetomoment1 | Timetomoment2 | appointmenttime1 | appointmenttime2 | modalmessage                     |
      | Autos      | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | 105           | 4             | 55               | 5                | Registro guardado correctamente. |

  @TestPushNotificationsDelete
  Scenario Outline: push notification Delete
    When Gestionamos en Sara
    And I entering push notifications
    And I select filter push notifications <line>and<service>and<servicestatus>and<roles>
    And I select button search for push notifications
    And I select button delete push notifications
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | line  | service          | servicestatus | roles            | modalmessage                           |
      | Autos | Abogado En Sitio | Aceptado      | Emergencia salud | Parametrización elimada correctamente. |


  @TestPushNotificationsFields
  Scenario Outline: push notification Fields
    When Gestionamos en Sara
    And I entering push notifications
    And I select button create push notifications
    And I select button save push notifications
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | modalmessage                              |
      | Debe llenar todos los campos obligatorios |




