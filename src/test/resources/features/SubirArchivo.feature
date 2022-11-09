Feature: Parametrizacion Provedores

  Background:
    Given subir Archivo

  @TestSubirArchivo
  Scenario: Creacion Exitosa de Prefijos
    When Ingresamos a la aplicacion
      | usuario       | contrasena     |
      | arnulfo.gomez | Chinche102691* |
    Then Subimos el achivo