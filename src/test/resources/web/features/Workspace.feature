@Workspace @Regression 
Feature: Creación de projectos
  
  Background: 
  Given el usuario está logueado en la página de Clockify
  And el usuario se encuentra en la pantalla de Manage Workspace

@WorkspaceCreation @Smoke @SuccessfulScenario
Scenario: Creación exitosa de un nuevo workspace
And el Workspace "Basic automation" no existe
When el usuario hace click en el botón "Crear nuevo espacio de trabajo"
And el usuario ingresa el nombre del workspace "Basic automation"
And el usuario hace click en el botón "Crear"
Then el usuario visualiza un mensaje indicando que se ha creado correctamente
And el usuario visualiza el nuevo Workspace en la grilla 

@UpdateWorkspace @Smoke @SuccessfulScenario
Scenario: Modificación exitosa de nombre de workspace
And el workspace "Test workspace Ani" se encuentra registrado
When el usuario hace click en el botón "Configuración" del workspace "Test workspace Ani"
And el usuario ingresa "Prueba" en el campo "Workspace name" del tab "general"
And el usuario presiona el botón "Enter"
Then el usuario visualiza un mensaje de procesamiento
And el usuario hace click en el botón "Manage Workspace"
And el usuario visualiza el nuevo nombre de Workspace en la grilla

@DeleteWorkspace @SuccessfulScenario
Scenario: Eliminación exitosa de workspace
And el workspace "Prueba" se encuentra registrado
And el workspace no se encuentra activo
When el usuario hace click en el botón "X" del workspace "Prueba"
And el usuario ingresa "DELETE" en el campo "Escribe DELETE para confirmar" 
And el usuario presiona el botón "Eliminar espacio de trabajo"
Then el usuario visualiza un mensaje indicando "haz salido de este espacio de trabajo"
And el usuario no visualiza el Workspace en la grilla

@WorkspaceActive @Smoke @SuccessfulScenario
Scenario: Activación exitosa de workspace
And el workspace "Analía González's workspace" se encuentra registrado
When el usuario hace click en el botón "Activar" del workspace "Analía González's workspace"
Then el usuario visualiza un mensaje indicando "Se cambio el espacio de trabajo predeterminado"
And el usuario visualiza el nuevo Workspace "Analía González's workspace" activo en la grilla

@WorkspaceCreation @Smoke @FailedScenario
Scenario: Creación fallida de un nuevo workspace
When el usuario hace click en el botón "Crear nuevo espacio de trabajo"
And el usuario ingresa el nombre del workspace "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"
Then el usuario visualiza un mensaje de error indicando "El nombre del espacio de trabajo debe tener entre 1 y 50 caracteres"
And el usuario visualiza el botón "Crear" deshabilitado

@DeleteWorkspace @FailedScenario
Scenario: Eliminación fallida de workspace
And el workspace "Prueba123" se encuentra registrado
And el workspace no se encuentra activo
When el usuario hace click en el botón "X" del workspace "Prueba123"
And el usuario ingresa "DELETES" en el campo "Escribe DELETE para confirmar" 
Then el usuario visualiza el botón "Eliminar espacio de trabajo" deshabilitado