Feature: Parametrizacion Motivos de llamada
  As a user
  I need to create, edit and delete call reasons parameterization

  Background:
    Given I create, edit and delete call reasons parameterization

  @TestCallCreateServiceRequestNotCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When I entering in the application with user <user> and password <password>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I write information in call reasons parameterization and <name> and <line>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | name                    | line  | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion2 | Hogar | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion2 | Hogar | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCallCreateServiceRequestCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When I entering in the application with user <user> and password <password>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I Select check catastrophic event
    And I write information in call reasons Service Request parameterization and <name> and <line>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | name                                        | line  | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCallCreateFollowupToaServiceCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When I entering in the application with user <user> and password <password>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I Select check catastrophic event
    And I write information in call reasons Follow up To a Service parameterization and <name> and <line> and <option>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | name                                        | line  | option | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCallCreateFollowupToaServiceNotCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When I entering in the application with user <user> and password <password>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I write information in call reasons Follow up To a Service parameterization and <name> and <line> and <option>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | name                                        | line  | option | modalmessage                                                                                  |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | Registro guardado correctamente                                                               |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | 55     | No se puede guardar, Ya se encuentra parametrizado un servicio de llamada con el mismo nombre |

  @TestCallCreateGeneralInformationNotCatastrophicEvent
  Scenario Outline: Successful call reasons Service Request Not Catastrophic Event
    When I entering in the application with user <user> and password <password>
    And I enter call reasons parameterization
    And I select button create call reasons parameterization
    And I write information in call reasons general information parameterization and <name> and <line> and <finalmanagement>
    And I Select button save call reasons parameterization
    Then Se visualiza mensaje de la modal<modalmessage>

    Examples:
      | user         | password       | name                                        | line  | finalmanagement          | modalmessage                    |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | Transferencia de llamada | Registro guardado correctamente |
      | Sergio.anaya | Colombia_2025* | Pruebas Automatizacion Evento Catastrofico3 | Hogar | Transferencia de llamada | Registro guardado correctamente |