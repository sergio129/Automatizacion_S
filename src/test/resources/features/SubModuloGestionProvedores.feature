Feature: Submodulo Gestion de proveedores
  As a user
  I need to create or edition supplier management

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestSupplierManagementComplete
  Scenario Outline: Gestion Exitosa de proveedor
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "B720EE583C6D530"
    And Hacemos Gestion de proveedor
      | Proveedor      | RespuestaProveedor | TiempoMonitoreoSitio | TiempoMonitoreoDestino | CelularTecnico | TelfonoCentral | TelfonoCentral1 | Observaciones |
      | RECURSO PROPIO | Toma Servicio      | 20                   | 50                     | 3103642145     | 3103642145     | 3103642145      | Pruebas QA    |
    Then I view the modal save supplier with <modalmessage>
    Examples:
      | modalmessage                    |
      | Registro guardado correctamente |


  @TestSupplierManagementEdition
  Scenario Outline: Supplier management submodule successful edition
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "A00000000000008"
    And I type information edition in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | suppliername                      | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                          | modalmessage                    |
      | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Toma servicio    | 18                 | 30                        | 3112554785         | 3214785598    | 320447859     | pruebas automaticas proveedor edicion | Registro guardado correctamente |


  @TestSupplierManagementNoTakeService
  Scenario Outline: Supplier management submodule does not take service
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "A00000000000008"
    And I type information not service in the fields supplier name <suppliername> and supplier response <supplierresponse> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | suppliername           | supplierresponse        | observations                                   | modalmessage                    |
      | ABACOL ASISTE SAS CALI | Pendiente por gestionar | pruebas automaticas proveedor no toma servicio | Registro guardado correctamente |


  @TestSupplierManagementCaseAppointment
  Scenario Outline: Expediente nuevo con asignacion de cita- nuevo proveedor toma de servicio
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "A00000000000008"
    And I type information case appointment in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    Then I view the modal save supplier with <modalmessage>

    Examples:
      | suppliername                      | supplierresponse | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                            | modalmessage                    |
      | 1A ELEGIDOS Y SOLUCIONES SAS CALI | Toma Servicio    | 30                        | 31248758965        | 3214859665    | 3204478596    | pruebas automaticas proveedor caso cita | Registro guardado correctamente |


  @TestSupplierManagementRequiredFields
  Scenario Outline: Supplier management submodule required fields
    When Gestionamos en Sara
    And Hacemos Busqueda del caso: "A00000000000008"
    And I no type information supplier
    Then I view the modal save supplier with <modalmessage>

    Examples:
      |  | modalmessage                      |
      |  | Todos los campos son obligatorios |
