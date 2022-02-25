Feature: Parametrizacion Tableros de Control UCK

  Background:
    Given Editar UCK

  @TestEdicionUCK
  Scenario Outline: Edicion Exitosa UCK
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entramos a parametrizacion Tables de control uck
    And Hacemos una busqueda por fecha de tableros uck<fecha>
    And Escribimos la informacion de tableros uck<motivo>,<asegurado>,<habilitar>,<observacion>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | usuario      | contrasena     | fecha           | motivo                      | asegurado                                 | habilitar | observacion | modalmessage                      |
      | Sergio.anaya | Colombia_2026* | 1 February 2022 | Solicitud por Avería Pesado | Grua Pesados(¿Póliza de manejo especial?) | No        | Prueba      | No se encontraron datos asociados |