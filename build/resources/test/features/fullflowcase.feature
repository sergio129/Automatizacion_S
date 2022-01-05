Feature: Page create information of cases
  As a user
  I need to create a complete flow of cases

  Background:
    Given I perform case creation full flow of different service

  @TestCreateFlowCompleteCars
  Scenario Outline: Successful create flow complete cars
    When I entering the case creation page with user <user> and password <password>
    And I select creation case button
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    And I type information in the field status name <statusname1>
    And I type information in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    And I type information in the field status name <statusname2>
    And I type information in the field status name <statusname3>
    And I select button create novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation>
    And I select button create ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    And I type information in the field status name <statusname4>
    Then I view the information status is <statusname4>

    Examples:
      | user         | password       | numberCase       | applicantName     | phone1     | licensePlate | serviceAddress   | serviceLocation               | department | municipality | clickCase | line  | service              | addressdetail                | statusname1 | suppliername                  | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                  | statusname2                  | name   | type                                | date       | expiredhour | userMonitoring | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation        | supplierobservation                          | statusname3 | managementtype        | managementperson       | responsetype | generatescomplaint | observations                          | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement            | managementpersondocumentation | generatescomplaintdocumentation | observationdocumentation                       | endingwith | typeresponse | observationending                  | statusname4 |
      | Sergio.Anaya | Colombia_2025* | 2021060944354533 | solicitante autos | 3122554788 | FRT56R       | Calle 34e #43-54 | Avenida colombia prueba autos | Putumayo   | San Pedro    | Si        | Autos | Abogado En Sitio Arl | Cerca a supermercado pruebas | Programado  | 24 H CAR SERVICE SAS MEDELLIN | Toma servicio    | 13                 | 33                        | 3122554385         | 3221454746    | 3214576585    | pruebas proveedor automaticas | Aceptado y en desplazamiento | Prueba | Monitoreo finalizacion del servicio | 2021-05-31 | 09:19am     | Yaira Manuela  | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas autos | pruebas automaticas monitoreo flujo completo | En sitio    | Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | No                 | pruebas automaticas escalamiento sura | Acompañamiento emocional  | Abogado Virtual            | No                      | observacion flujo completo novedades | Administrativo Aya            | No                              | pruebas automaticas creacion documentacion CNM | Proveedor  | SMS          | prueba finalizacion autos completa | Concluido   |


  @TestCreateFlowCompleteHomes
  Scenario Outline: Successful create flow complete homes
    When I entering the case creation page with user <user> and password <password>
    And I select creation case button
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    And I type information in the field status name <statusname1>
    And I type information in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    And I type information in the field status name <statusname2>
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And I type information in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    And I type information in the field status name <statusname3>
    And I type information in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    And I select button create novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation>
    And I select button create ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    And I type information in the field status name <statusname4>
    Then I view the information status is <statusname4>

    Examples:
      | user          | password   | numberCase      | applicantName       | phone1     | licensePlate | serviceAddress    | serviceLocation    | department  | municipality | clickCase | line    | service      | addressdetail       | statusname1 | suppliername            | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations            | statusname2                  | name                  | type                                | date       | expiredhour | userMonitoring | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                  | supplierobservation                   | statusname3 | managementtype        | managementperson       | responsetype | generatescomplaint | observations                           | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement            | managementpersondocumentation | generatescomplaintdocumentation | observationdocumentation                       | endingwith | typeresponse | observationending         | statusname4 |
      | yaira.acevedo | YMAe8807** | 202106094435467 | solicitante hogares | 3123541234 | LRT34F       | Carrera 34 #45-54 | Urbanizacion hogar | Bogota D.C. | Bogota D.C.  | No        | Hogares | Electricista | Apartamento pruebas | Programado  | A.A TIEMPO GRUAS   CALI | Toma servicio    | 22                 | 43                        | 3124562123         | 3226544786    | 3214577567    | pruebas proveedor hogar | Aceptado y en desplazamiento | Prueba flujo completo | Monitoreo finalizacion del servicio | 2021-05-31 | 10:21am     | Yaira Manuela  | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor creacion | pruebas automaticas monitoreo hogares | En sitio    | Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | No                 | pruebas automaticas escalamiento hogar | Acompañamiento emocional  | Abogado Virtual            | No                      | observacion flujo completo novedades | Administrativo Aya            | No                              | pruebas automaticas creacion documentacion CNM | Proveedor  | SMS          | prueba finalizacion hogar | Concluido   |


  @TestCreateFlowCompleteChosenDriver
  Scenario Outline: Successful create flow complete chosen driver
    When I entering the case creation page with user <user> and password <password>
    And I select creation case button
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    And I type information in the field status name <statusname1>
    And I type information in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    And I type information in the field status name <statusname2>
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And I type information in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    And I type information in the field status name <statusname3>
    And I type information in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    And I select button create novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation>
    And I select button create ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    And I type information in the field status name <statusname4>
    Then I view the information status is <statusname4>

    Examples:
      | user          | password   | numberCase      | applicantName         | phone1     | licensePlate | serviceAddress     | serviceLocation       | department | municipality | clickCase | line              | service           | addressdetail                 | statusname1 | suppliername          | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                | statusname2                  | name   | type                                | date       | expiredhour | userMonitoring | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                  | supplierobservation                     | statusname3 | managementtype        | managementperson       | responsetype | generatescomplaint | observations                           | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement            | managementpersondocumentation | generatescomplaintdocumentation | observationdocumentation                        | endingwith | typeresponse | observationending         | statusname4 |
      | yaira.acevedo | YMAe8807** | 202106094435467 | solicitante conductor | 3123554234 | DER45E       | Avenida 43C #12-43 | Parcelacion conductor | Arauca     | San Rafael   | No        | Conductor elegido | Conductor Elegido | Apartamento conductor pruebas | Programado  | ALIANZA TERRESTRE SAS | Toma servicio    | 11                 | 32                        | 3124565423         | 3226544386    | 3214572367    | pruebas proveedor conductor | Aceptado y en desplazamiento | Prueba | Monitoreo finalizacion del servicio | 2021-05-31 | 09:19am     | Yaira Manuela  | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor creacion | pruebas automaticas monitoreo conductor | En sitio    | Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | No                 | pruebas automaticas escalamiento hogar | Acompañamiento emocional  | Abogado Virtual            | No                      | observacion flujo completo novedades | Administrativo Aya            | No                              | pruebas automaticas documentacion CNM conductor | Proveedor  | SMS          | prueba finalizacion hogar | Concluido   |


  @TestCreateFlowCompleteRenting
  Scenario Outline: Successful create flow complete renting
    When I entering the case creation page with user <user> and password <password>
    And I select creation case button
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    And I type information in the field status name <statusname1>
    And I type information in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    And I type information in the field status name <statusname2>
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And I type information in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    And I type information in the field status name <statusname3>
    And I type information in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    And I select button create novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation>
    And I select button create ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    And I type information in the field status name <statusname4>
    Then I view the information status is <statusname4>

    Examples:
      | user          | password  | numberCase      | applicantName       | phone1     | licensePlate | serviceAddress    | serviceLocation       | department | municipality | clickCase | line    | service   | addressdetail        | statusname1 | suppliername            | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations              | statusname2                  | name   | type                                | date       | expiredhour | userMonitoring | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation                 | supplierobservation                   | statusname3 | managementtype        | managementperson       | responsetype | generatescomplaint | observations                             | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement           | managementpersondocumentation | generatescomplaintdocumentation | observationdocumentation                      | endingwith | typeresponse | observationending           | statusname4 |
      | yaira.acevedo | YMAe8807* | 202106094435467 | solicitante renting | 3123543234 | FDE34E       | Calle 12C #12d-43 | Unidad prueba renting | Caldas     | La Estrella  | No        | Renting | Audiencia | Casa renting pruebas | Programado  | VIP CAR S.A.S. MEDELLIN | Toma servicio    | 43                 | 56                        | 3124545423         | 3226523386    | 3204576567    | pruebas proveedor renting | Aceptado y en desplazamiento | Prueba | Monitoreo finalizacion del servicio | 2021-05-31 | 09:19am     | Yaira Manuela  | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas asesor renting | pruebas automaticas monitoreo renting | En sitio    | Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | No                 | pruebas automaticas escalamiento renting | Acompañamiento emocional  | Abogado Virtual            | No                      | observacion flujo renting novedades | Administrativo Aya            | No                              | pruebas automaticas documentacion CNM renting | Proveedor  | SMS          | prueba finalizacion renting | Concluido   |


  @TestCreateFlowCompleteCarsClickYes
  Scenario Outline: Successful create flow complete cars click yes
    When I entering the case creation page with user <user> and password <password>
    And I select creation case button
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    And I type information in the field status name <statusname1>
    And I type information in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    And I type information in the field status name <statusname2>
    And I select button create monitoring task
    And I type information in the field name <name>
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And I type information in the fields monitoring with <monitoringwith> and time of service <timeofservice> and response to monitoring <responsetomonitoring> and generates complaint <generatescomplaint> and adviser observation <adviserobservation> and supplier observation <supplierobservation>
    And I type information in the field status name <statusname3>
    And I type information in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    And I type information in the field status name <statusname4>
    And I select button create novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    And I type information in the fields management person <managementpersondocumentation> and generates complaint <generatescomplaintdocumentation> and observation <observationdocumentation>
    And I select button create ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>
    And I type information in the field status name <statusname5>
    Then I view the information status is <statusname5>

    Examples:
      | user          | password   | numberCase      | applicantName     | phone1     | licensePlate | serviceAddress   | serviceLocation               | department | municipality | clickCase | line  | service              | addressdetail                | statusname1 | suppliername                  | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                  | statusname2 | name                  | type                                | date       | expiredhour | userMonitoring | monitoringwith | timeofservice        | responsetomonitoring | generatescomplaint | adviserobservation        | supplierobservation                          | statusname3    | managementtype        | managementperson       | responsetype | generatescomplaint | observations                          | statusname4 | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement            | managementpersondocumentation | generatescomplaintdocumentation | observationdocumentation                       | endingwith | typeresponse | observationending                  | statusname5 |
      | yaira.acevedo | YMAe8807** | 202106094435467 | solicitante autos | 3122554788 | VFG34E       | Calle 45 #12c-54 | Avenida colombia prueba autos | Antioquia  | Medellin     | Si        | Autos | Abogado En Sitio Arl | Cerca a supermercado pruebas | Programado  | 24 H CAR SERVICE SAS MEDELLIN | Toma servicio    | 13                 | 33                        | 3122554385         | 3221454746    | 3214576585    | pruebas proveedor automaticas | Aceptado    | Prueba tarea click si | Monitoreo finalizacion del servicio | 2021-05-31 | 09:19am     | Yaira Manuela  | Asegurado      | Monitoreo preventivo | Acepte               | No                 | pruebas automaticas autos | pruebas automaticas monitoreo flujo completo | Desplazamiento | Guardianes de la vida | Sebastian Ossa Taborda | Adulto mayor | No                 | pruebas automaticas escalamiento sura | En sitio    | Acompañamiento emocional  | Abogado Virtual            | No                      | observacion flujo completo novedades | Administrativo Aya            | No                              | pruebas automaticas creacion documentacion CNM | Proveedor  | SMS          | prueba finalizacion autos completa | Concluido   |


  @TestEditionFlowCompleteCars
  Scenario Outline: Successful edition flow complete cars
    Given I entering the case creation page with user <user> and password <password>
    When I select button case edition with case <numberCase>
    And I type information in the field number case <numberCase>
    And I type information in the field applicant name <applicantName>
    And I type information in the field phone1 <phone1>
    And I type information in the field license plate <licensePlate>
    And I type information in the field serviceaddress <serviceAddress>
    And I type information in the field location <serviceLocation>
    And I type information in the field department <department>
    And I type information in the field municipality <municipality>
    And I type information in the field click case <clickCase>
    And I type information in the field line <line>
    And I type information in the field service <service>
    And I type information in the field address detail <addressdetail>
    And I type information edition in the fields supplier name <suppliername> and supplier response <supplierresponse> and time monitoring site <timemonitoringsite> and time monitoring destination <timemonitoringdestination> and technical cellphone <technicalcellphone> and central phone 1 <centralphone1> and central phone 2 <centralphone2> and observations <observations>
    And I select button edition monitoring task
    And I type information in the field type <type>
    And I type information in the field date <date>
    And I type information in the field expired hour <expiredhour>
    And I type information in the field user <userMonitoring>
    And I type information edition in the fields management type <managementtype> and management person <managementperson> and response type <responsetype> and generates complaint <generatescomplaint> and observations <observations>
    And I select button edition novelty
    And I type information in the field who reports <whoreportsnewsmanagements>
    And I type information in the field cause novelty <causenoveltynewsmanagement>
    And I type information in the field complaint news <complaintnewsmanagement>
    And I type information in the field novelty observation <observationnewsmanagement>
    And I select button edition ending
    And I type information in the field ending with <endingwith>
    And I type information in the type responses <typeresponse>
    And I type information in the field observation ending <observationending>

    Examples:
      | user          | password   | numberCase      | applicantName             | phone1     | licensePlate | serviceAddress   | serviceLocation                       | department | municipality | clickCase | line  | service          | addressdetail                | suppliername            | supplierresponse | timemonitoringsite | timemonitoringdestination | technicalcellphone | centralphone1 | centralphone2 | observations                          | name                  | type                                | date       | expiredhour | userMonitoring       | monitoringwith | timeofservice      | responsetomonitoring     | generatescomplaint | adviserobservation                 | supplierobservation                   | managementtype | managementperson | responsetype      | whoreportsnewsmanagements | causenoveltynewsmanagement | complaintnewsmanagement | observationnewsmanagement          | endingwith | typeresponse | observationending                 |
      | yaira.acevedo | YMAe8807** | 202106297651234 | solicitante autos edicion | 3122554784 | FDSW34E      | Calle 35e #44-54 | Avenida colombia prueba autos edicion | Antioquia  | Itagui       | No        | Autos | Abogado En Sitio | Cerca a supermercado edicion | VIP CAR S.A.S. MEDELLIN | Toma servicio    | 17                 | 34                        | 3122354385         | 3221252746    | 3211256585    | pruebas proveedor automaticas edicion | pruebas edicion tarea | Monitoreo finalizacion del servicio | 2021-05-31 | 11:23am     | Angela Prueba Prueba | Central        | Monitoreo en sitio | Acompañamiento asegurado | No                 | pruebas automaticas asesor edicion | pruebas automaticas monitoreo edicion | Mi águila      | CNM              | lesiones o muerte | Cliente                   | Acompañamiento asegurado   | No                      | observacion flujo completo edicion | Asegurado  | Llamada      | prueba finalizacion autos edicion |
