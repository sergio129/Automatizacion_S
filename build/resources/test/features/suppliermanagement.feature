Feature: Page submodule supplier management
  As a user
  I need to create supplier management

  Scenario Outline: Successful supplier management submodule
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry the advanced search case and set <numberCase>
    When set information supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then user view the modal save supplier with <modalmessage>

    Examples:
      |  user         | password   |numberCase       |suppliername                   |supplierresponse   |timemonitoringsite|timemonitoringdestination|technicalcellphone   |centralphone1   |centralphone2    |observations                 |modalmessage                                   |
      |yaira.acevedo  | YMAe8807** |202104149600102  |24 H CAR SERVICE SAS MEDELLIN  | Toma servicio     |15                |21                       |3125847853           | 3122557485     | 321485578       |pruebas automaticas proveedor|Registro guardado correctamente                |


  Scenario Outline: Supplier management submodule successful edition
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry the advanced search case and set <numberCase>
    When set information edition supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then user view the modal save supplier with <modalmessage>

    Examples:
      |  user         | password   |numberCase       |suppliername                      |supplierresponse   |timemonitoringsite|timemonitoringdestination|technicalcellphone   | centralphone1  |centralphone2    |observations                         |modalmessage                                   |
      |yaira.acevedo  | YMAe8807** |202104149600102  |1A ELEGIDOS Y SOLUCIONES SAS CALI | Toma servicio     |18                |30                       |3112554785           | 3214785598     | 320447859       |pruebas automaticas proveedor edicion|Registro guardado correctamente                |


  Scenario Outline: Supplier management submodule does not take service
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry the advanced search case and set <numberCase>
    When set information supplier not service name <suppliername> and supplier response <supplierresponse> and observations <observations>
    Then user view the modal save supplier with <modalmessage>

    Examples:
      |  user         | password    |numberCase         |suppliername                   |supplierresponse             | observations                                  |modalmessage                                    |
      |yaira.acevedo  | YMAe8807**  |202104170008526    |ABACOL ASISTE SAS CALI         | Pendiente por gestionar     | pruebas automaticas proveedor no toma servicio| Registro guardado correctamente                |


  Scenario Outline: Supplier management submodule case appointment
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry the advanced search case and set <numberCase>
    When set information case appointment supplier name <suppliername> and supplier response <supplierresponse>  and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then user view the modal save supplier with <modalmessage>

    Examples:
      |  user         | password    |numberCase       |suppliername                      | supplierresponse   |timemonitoringdestination|technicalcellphone   | centralphone1  |centralphone2    |observations                           |modalmessage                                   |
      |yaira.acevedo  | YMAe8807**  |202104170008524  |1A ELEGIDOS Y SOLUCIONES SAS CALI |  Toma Servicio     |30                       |31248758965          | 3214859665     | 3204478596      |pruebas automaticas proveedor caso cita|Registro guardado correctamente                |


  Scenario Outline: Supplier management submodule required fields
    Given I am entry in the application supplier with user <user> and password <password>
    And I am entry the advanced search case and set <numberCase>
    When No set information supplier
    Then user view the modal save supplier with <modalmessage>

    Examples:
      |  user         | password   |numberCase         | modalmessage                                    |
      |yaira.acevedo  | YMAe8807** |202104190008528    | Todos los campos son obligatorios               |
