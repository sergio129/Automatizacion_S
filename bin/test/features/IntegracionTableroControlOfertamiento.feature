Feature: Gestion de Tablero de Bot de Ofertamiento

  Background:
    Given Modulo Integracion

  @TestReofertmaientoManual
  Scenario Template:Gestion de Tablero de control Ofertamiento
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a el Modulo de Integracion
    And Ingresamos al SubModulo Tableros de control Ofertamiento y buscamos por Expediente:<Exp>
    And Gestionamos y hacemos el Reofertamiento
    Then Se muestra el mensaje que fue ofertado exitosamente<mensaje>
    Examples:
      | Exp              | mensaje              |
      | A202205110013040 | Tipo de ofertamiento |
