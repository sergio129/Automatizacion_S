Feature: Page submodule supplier management
  As a user
  I need to create or edition supplier management

  Background:
    Given I create or edition a provider for a case

  @TestSupplierManagementComplete
  Scenario Outline: Successful supplier management submodule
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | user            | password      | numberCase       | suppliername            | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                  | modalmessage                    |
      | yoarlys.carillo | Colombia2020* | 3333333333333333 | 34 SERVICE SAS MEDELLIN | Toma servicio    | 15                 | 21                        | 3125847853         | 3122557485    | 321485578     | pruebas automaticas proveedor | Registro guardado correctamente |


  @TestSupplierManagementEdition
  Scenario Outline: Supplier management submodule successful edition
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information edition in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | user          | password  | numberCase      | suppliername                      | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                          | modalmessage                    |
      | yaira.acevedo | YMAe8807* | 202106010009046 | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Toma servicio    | 18                 | 30                        | 3112554785         | 3214785598    | 320447859     | pruebas automaticas proveedor edicion | Registro guardado correctamente |


  @TestSupplierManagementNoTakeService
  Scenario Outline: Supplier management submodule does not take service
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information not service in the fields supplier name <suppliername> and supplier response <supplierresponse> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | user          | password  | numberCase      | suppliername           | supplierresponse        | observations                                   | modalmessage                    |
      | yaira.acevedo | YMAe8807* | 202104170008526 | ABACOL ASISTE SAS CALI | Pendiente por gestionar | pruebas automaticas proveedor no toma servicio | Registro guardado correctamente |


  @TestSupplierManagementCaseAppointment
  Scenario Outline: Supplier management submodule case appointment
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I type information case appointment in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | user          | password  | numberCase      | suppliername                      | supplierresponse | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                            | modalmessage                    |
      | yaira.acevedo | YMAe8807* | 202104170008524 | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Toma             | 30                        | 31248758965        | 3214859665    | 3204478596    | pruebas automaticas proveedor caso cita | Registro guardado correctamente |


  @TestSupplierManagementRequiredFields
  Scenario Outline: Supplier management submodule required fields
    When I entering in the application with user <user> and password <password>
    And I entering the advanced search and type case number <numberCase>
    And I no type information supplier
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | user          | password  | numberCase      | modalmessage                      |
      | yaira.acevedo | YMAe8807* | 202104190008528 | Todos los campos son obligatorios |
