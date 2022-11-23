Feature: Tiempos altos de Contacto

  Necesito Gestionar los tiempos altos de contacto

  Background:
    Given Ingresamos a la aplicacion con Usuario y contraseña "Usuario Valido"

  @TestGestionTiemposAltosdeContacto
  Scenario Outline: Gestion de expedientes con tiempos altos de contacto
    When Gestionamos en Sara
    And Entro a integracion tiempos altos de contacto
    And Hacemos un filtro por <linea>y<servicio>y<municipio>y<familia> y buscamos<gestion>
    Then Veo mensaje de gestion exitosa de tiempos altos de contacto<mensajemodal>
    Examples:
      | linea   | servicio          | municipio | familia      | gestion     | mensajemodal                    |
      | Renting | Paso De Corriente | Caucasia  | Carro-Taller | Sin novedad | Registro guardado correctamente |