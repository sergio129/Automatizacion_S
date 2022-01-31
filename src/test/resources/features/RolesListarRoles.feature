Feature: Creacion, Edicion, Asociacion y Eliminar lista de Roles


  Background:
    Given Creacion, Edicion, Asociacion y Eliminar lista de Roles
@TestEdicionSinBanderazo
 Scenario Outline: Edicion Exitosa Cierre de expediente sin banderazo
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a Roles Lista roles
    And Escribimos la informacion SubModulo Cierre de Expediente
    And Guardamos informacion SubModulo Cierre Expediente
    Then Se visualiza mensaje de la modal Gestion Salud <mensaje>
    Examples:
      | usuario      | contrasena     | NumeroCaso       |
      | Sergio.anaya | Colombia_2026* | Z000000000000011 |
