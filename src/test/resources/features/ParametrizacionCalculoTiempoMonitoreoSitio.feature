Feature: Parametrizacion Calculo tiempo monitoreo sitio

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestCreacionCalculo_tiempo_monitoreo_sitio
  Scenario Outline: Creacion Exitosa Cálculo de tiempo de monitoreo en sitio
    When Gestionamos en Sara
    And Ingresamos a parametrizacion Cálculo de tiempo de monitoreo en sitio
    And Seleccionamos el boton Crear  parametrización cálculo de tiempo de monitoreo en sitio
    And Datos Cálculo de tiempo de monitoreo en sitio<Nombre>,<Momento_Servicio>,<Linea>,<Tipo_Servicio>,<Departamento>,<Municipio>,<Delta>
    Then Se visualiza mensaje de la modal<modalmensaje>
    Examples:
      | Nombre         | Momento_Servicio       | Linea | Tipo_Servicio | Departamento | Municipio | Delta | modalmensaje                    |
      | Automatizacion | Nocturno (9 pm - 6 am) | Autos | Grua          | Cordoba      | Lorica    | 999   | Registro guardado correctamente |