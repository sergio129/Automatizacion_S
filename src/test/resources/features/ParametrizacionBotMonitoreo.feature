Feature: Gestion de Tablero de Bot de Ofertamiento

  Background:
    Given Modulo Parametrizaciones

  @TestParamatrizacionBotMonitoreo
  Scenario Template:Creacion Exitosa de Parametrizacion Bot de Monitoreo
    When Ingresamos a la aplicacion con usuario Sergio.anaya y contraseñaColombia_2021
    And Entramos a Parametrizacion Bot de monitoreo
    And Selecionamos el boton Crear Parametrizacion Bot Monitoreo
    And Escribimos datos Parametrizacion Bot de monitoreo: <Nombre>,<GestionServicio>,<Linea>,<TipoServicio>,<TipoTarea>,<Departamento>,<Municipio>,<ServicioEspecial>
    And Selecionamos el Boton Guardar Parametrizacion bot de monitoreo
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Nombre                 | GestionServicio | Linea | TipoServicio | TipoTarea          | Departamento | Municipio   | ServicioEspecial | modalmensaje                    |
      | Pruebas automatizacion | Si              | Autos | Grua Motos   | Monitoreo en Sitio | Bogota D.C.  | Bogota D.C. | No               | Registro guardado correctamente |

  @TestEditarParamatrizacionBotMonitoreo
  Scenario Template:Edicion Exitosa de Parametrizacion Bot de Monitoreo
    When Ingresamos a la aplicacion con usuario Sergio.anaya y contraseñaColombia_2021
    And Entramos a Parametrizacion Bot de monitoreo
    And Buscamos por nombre de Parametrizacion:"Pruebas QA"
    And Seleccionamos el boton Editar Parametrizacion bot de monitoreo
    And Escribimos datos Parametrizacion Bot de monitoreo: <Nombre>,<GestionServicio>,<Linea>,<TipoServicio>,<TipoTarea>,<Departamento>,<Municipio>,<ServicioEspecial>
    And Selecionamos el Boton Guardar Parametrizacion bot de monitoreo
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Nombre                 | GestionServicio | Linea | TipoServicio | TipoTarea          | Departamento | Municipio   | ServicioEspecial | modalmensaje                    |
      | Pruebas automatizacion | No              | Autos | Grua Motos   | Monitoreo en Sitio | Bogota D.C.  | Bogota D.C. | No               | Registro guardado correctamente |