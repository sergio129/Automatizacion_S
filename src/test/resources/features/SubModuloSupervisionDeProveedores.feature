Feature: Page submodule supplier monitoring
  As a user
  I need to create or edition a supplier monitoring

  Background:
    Given I create or edition a supplier monitoring for a case

  @TestSupplierMonitoringComplete
  Scenario Outline: Successful supplier monitoring submodule
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I type information in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    Then I view the modal save supplier monitoring with <modalmessage>

    Examples:
      | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                  | supplierobservation                              | modalmessage                    |
      | A00000000000012 | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor creacion | pruebas automaticas monitoreo proveedor creacion | Registro guardado correctamente |


  @TestSupplierMonitoringEdition
  Scenario Outline: Supplier monitoring submodule edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I type information edition in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    Then I view the modal save supplier monitoring with <modalmessage>

    Examples:
      | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                 | supplierobservation                             | modalmessage                    |
      | 202105030000007 | Central        | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor edicion | pruebas automaticas monitoreo proveedor edicion | Registro guardado correctamente |


  @TestSupplierMonitoringCompleteWithComplaint
  Scenario Outline: Successful supplier monitoring submodule with filed complaint
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I type information complaint in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation> and filed complaint <filedcomplaint>
    Then I view the modal save supplier monitoring with <modalmessage>

    Examples:
      | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                        | supplierobservation                                    | filedcomplaint | modalmessage                    |
      | 202105040000008 | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor creacion queja | pruebas automaticas monitoreo proveedor creacion queja | 12254875       | Registro guardado correctamente |


  @TestSupplierMonitoringCompleteEditionComplaint
  Scenario Outline: Successful supplier monitoring submodule edition with filed complaint
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I type information edition complaint in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation> and filed complaint <filedcomplaint>
    Then I view the modal save supplier monitoring with <modalmessage>

    Examples:
      | numberCase      | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                        | supplierobservation                                   | filedcomplaint | modalmessage                    |
      | 202105040000008 | Central        | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor creacion queja | pruebas automaticas monitoreo proveedor edicion queja | 23423424       | Registro guardado correctamente |


  @TestSupplierMonitoringRequiredFields
  Scenario Outline: Supplier monitoring submodule required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I entering the advanced search and type case number <numberCase>
    And I no type information supplier monitoring
    Then I view the modal save supplier monitoring with <modalmessage>

    Examples:
      | numberCase      | modalmessage                      |
      | 202105040000009 | Todos los campos son obligatorios |
