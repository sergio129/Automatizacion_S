Feature: Page submodule supplier monitoring
  As a user
  I need to create supplier monitoring

  Scenario Outline: Successful supplier monitoring submodule
    Given I am entry in the application supplier monitoring with user <user> and password <password>
    And I am entry for supplier monitoring and set number case <numberCase>
    When set information monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    Then user view the modal save supplier monitoring with <modalmessage>

    Examples:
      | user          | password    | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                  | supplierobservation                             | modalmessage                      |
      |yaira.acevedo  | YMAe8807**  |202105030000007  |Asegurado       |Monitoreo preventivo  |Acepte                |No                  |pruebas automaticas asesor creacion  |pruebas automaticas monitoreo proveedor creacion | Registro guardado correctamente   |

  Scenario Outline: Supplier monitoring submodule edition
    Given I am entry in the application supplier monitoring with user <user> and password <password>
    And I am entry for supplier monitoring and set number case <numberCase>
    When set information edition monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    Then user view the modal save supplier monitoring with <modalmessage>

    Examples:
      | user          | password    | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                | supplierobservation                             | modalmessage                      |
      |yaira.acevedo  | YMAe8807**  |202105030000007  |Central         |Monitoreo preventivo  |Acepte                |No                  |pruebas automaticas asesor edicion |pruebas automaticas monitoreo proveedor edicion  | Registro guardado correctamente   |

  Scenario Outline: Successful supplier monitoring submodule with filed complaint
    Given I am entry in the application supplier monitoring with user <user> and password <password>
    And I am entry for supplier monitoring and set number case <numberCase>
    When set information complaint monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation> and filed complaint <filedcomplaint>
    Then user view the modal save supplier monitoring with <modalmessage>

    Examples:
      | user          | password    | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                        | supplierobservation                                   |  filedcomplaint   |modalmessage                      |
      |yaira.acevedo  | YMAe8807**  |202105040000008  |Asegurado       |Monitoreo preventivo  |Acepte                |No                  |pruebas automaticas asesor creacion queja  |pruebas automaticas monitoreo proveedor creacion queja | 12254875          |Registro guardado correctamente   |

  Scenario Outline: Successful supplier monitoring submodule edition with filed complaint
    Given I am entry in the application supplier monitoring with user <user> and password <password>
    And I am entry for supplier monitoring and set number case <numberCase>
    When set information edition complaint monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation> and filed complaint <filedcomplaint>
    Then user view the modal save supplier monitoring with <modalmessage>

    Examples:
      | user          | password    | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                        | supplierobservation                                   |filedcomplaint   | modalmessage                      |
      |yaira.acevedo  | YMAe8807**  |202105040000008  |Central         |Monitoreo preventivo  |Acepte                |No                  |pruebas automaticas asesor creacion queja  |pruebas automaticas monitoreo proveedor edicion queja  | 23423424        | Registro guardado correctamente   |


  Scenario Outline: Supplier monitoring submodule required fields
    Given I am entry in the application supplier monitoring with user <user> and password <password>
    And I am entry for supplier monitoring and set number case <numberCase>
    When No set information supplier monitoring
    Then user view the modal save supplier monitoring with <modalmessage>

    Examples:
      |  user         | password   |numberCase         | modalmessage                                    |
      |yaira.acevedo  | YMAe8807** |202105040000009    | Todos los campos son obligatorios               |
