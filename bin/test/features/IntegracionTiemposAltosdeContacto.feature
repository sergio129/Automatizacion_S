Feature: Tiempos altos de Contacto

  Necesito Gestionar los tiempos altos de contacto

  Background:
    Given Gestion de tiempos altos de contacto

  @TestGestionTiemposAltosdeContacto
  Scenario Outline: Gestion de expedientes con tiempos altos de contacto
    When Ingresamos a la aplicacion
      | usuario      | contrasena    |
      | Sergio.anaya | Colombia_2022 |
    And Entro a integracion tiempos altos de contacto
    And Hacemos un filtro por <linea>y<servicio>y<municipio>y<familia> y buscamos<gestion>
    Then Veo mensaje de gestion exitosa de tiempos altos de contacto<mensajemodal>
    Examples:
      | linea   | servicio          | municipio | familia      | gestion     | mensajemodal                    |
      | Renting | Paso De Corriente | Caucasia  | Carro-Taller | Sin novedad | Registro guardado correctamente |