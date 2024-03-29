Feature: Parametrizacion Tableros de Control UCK

  Background:
    Given Editar UCK

  @TestEdicionUCK
  Scenario Outline: Edicion Exitosa UCK
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entramos a parametrizacion Tables de control uck
    And Hacemos una busqueda por fecha de tableros uck<fecha>
    And Escribimos la informacion de tableros uck<motivo>,<asegurado>,<habilitar>,<observacion>
    Then Se visualiza mensaje de la modal<modalmessage>
    Examples:
      | fecha           | motivo                      | asegurado                                 | habilitar | observacion | modalmessage                    |
      | 1 February 2022 | Solicitud por Avería Pesado | Grua Pesados(¿Póliza de manejo especial?) | No        | Prueba      | Registro guardado correctamente |