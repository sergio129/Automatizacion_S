Feature: Tiempos altos de Contacto

  Necesito Gestionar los tiempos altos de contacto

  Background:
    Given Gestion de tiempos altos de contacto

  @TestGestionTiemposAltosdeContacto
  Scenario Outline: Gestion de expedientes con tiempos altos de contacto
    When Ingresamos a la aplicacion con usuario<usuario> y contraseña<contrasena>
    And Entro a integracion tiempos altos de contacto
    And Hacemos un filtro por <linea>y<servicio>y<municipio>y<familia> y buscamos<gestion>
    Then Veo mensaje de gestion exitosa de tiempos altos de contacto<mensajemodal>
    Examples:
      | usuario      | contrasena     | linea | servicio         | municipio   | familia   | gestion     | mensajemodal                    |
      | Sergio.anaya | Colombia_2025* | Autos | Abogado en sitio | Bogota D.C. | CORRIENTE | Sin novedad | Registro guardado correctamente |