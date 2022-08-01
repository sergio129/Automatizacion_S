Feature: Page create case
  As a user
  I need to create or edition a case

  Background:
    Given I create or edition a case

  @TestCaseComplete
  Scenario Outline: Successful case creation
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Seleccionamos el boton de Crear Caso
    And Escribimos el numero de caso en L202121344537270 y lo pegamos
    And Escribmos la informacion de la creacion de expediente
      | NombreSol   | Telefono1   | Placa  | DireccionServicio | UbicacionServicio | DetalleDireccion | Departamento | Municicpio | GestorCordi | Linea | Servicio |
      | Juan Felipe | 31035048745 | DTA54R | Calle 92144       | Produccion        | Pruebas QA       | Cordoba      | Lorica     | Si          | Autos | Grua     |
    #Gestionamos el cambio de estado
    Then I view the modal save case with <message>

    Examples:
     | message                         |
     | Registro guardado correctamente |

  @TestCaseEdition
  Scenario Outline: Successful case edition
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I select button case edition with case <numberCase>
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
    Then I view the modal save case with <message>

    Examples:
      | numberCase       | applicantName | phone1  | licensePlate | serviceAddress | serviceLocation | department | municipality | clickCase | line  | service          | addressdetail | message                         |
      | A202121344537290 | pruebas uno   | 1312314 | GTRE34Emmm   | pruebas uno    | pruebas  uno    | Antioquia  | Itagui       | No        | Autos | Abogado en sitio | xxx uno       | Registro guardado correctamente |


  @TestCaseRequiredFields
  Scenario Outline: Case submodule required fields
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And I no type information in the case creation
    Then I view the modal save case with <message>

    Examples:
      | message                           |
      | Todos los campos son obligatorios |