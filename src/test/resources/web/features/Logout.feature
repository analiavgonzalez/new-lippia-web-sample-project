@Logout @Regression
Feature: Logout

  @SuccessfulScenario
  Scenario: Logout exitoso
  Given el usuario se encuentra logueado en Clockify
  When el usuario hace click en el nombre de usuario
    And el usuario hace click en Cerrar Sesion
    Then el sistema cierra la sesion y presenta la pantalla de login