@Project @Regression 
Feature: Creación de proyectos

  @CreateProject @Smoke @SuccessfulScenario @Automated @Do
  Scenario: Creación exitosa de un nuevo proyecto publico
    Given el usuario está logueado en la página de Clockify
    And el usuario se encuentra en la pantalla de Proyectos
    When el usuario presiona el botón Create new project
    And el usuario ingresa el nombre de proyecto
    And el usuario selecciona el valor publico para indicar que es publico
    And el usuario presiona el botón Create
    Then el usuario visualiza el mensaje de confirmación de operación exitosa.

