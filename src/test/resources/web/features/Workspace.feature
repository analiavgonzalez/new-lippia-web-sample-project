@Workspace @Regression  @Do
Feature: Creación de Workspace
  
  Background: 
  Given el usuario está logueado en la pagina de Clockify
  And el usuario se encuentra en la pantalla de Manage Workspace

  @WorkspaceCreation @Smoke @SuccessfulScenario @Automated
  Scenario: Creación exitosa de un nuevo workspace con nombre aleatorio
    When el usuario hace click en el botón Crear nuevo espacio de trabajo
    And el usuario ingresa el nombre del workspace
    And el usuario hace click en el botón Crear
    Then el usuario visualiza un mensaje indicando que se ha creado correctamente

  @UpdateWorkspace @Smoke @SuccessfulScenario @Automated
  Scenario: Modificación exitosa de nombre de workspace
    And el workspace "Ani workspace" ya existe
    When el usuario hace click en el botón Configuración del workspace Ani workspace
    And el usuario ingresa "Update workspace" en el campo Workspace name y presiona el botón Enter
    Then el usuario hace click en el botón Manage Workspace
    And el usuario visualiza el nuevo workspace Update workspace en la grilla

