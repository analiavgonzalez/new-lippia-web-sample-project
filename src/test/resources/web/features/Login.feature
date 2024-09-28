@Login @Regression 
Feature: Login
  
  Background: 
  Given el usuario se encuentra en la pantalla de inicio de Clockify

  @LoginManual @Smoke @SuccessfulScenario @Automated
  Scenario: Login exitoso manual
    When el usuario hace click en el botón "Log in manually"
    And el usuario ingresa su email "anyvg87@yahoo.com.ar"
    And el usuario ingresa su password "BAT123456"
    And el usuario hace click en el botón "Log in" para logueo manual
    Then el usuario se encuentra en el home de Clockify

  @LoginEmail @Smoke @FailedScenario @Automated
  Scenario: Login fallido por email con formato invalido
    When el usuario hace click en el botón "Log in manually"
    And el usuario ingresa su email "analia.gonzalezyahoo.com"
    Then el usuario visualiza un mensaje de error indicando que el formato de email es inválido

  @LoginManual @Smoke @FailedScenario @Automated
  Scenario: Login manual fallido
    When el usuario hace click en el botón "Log in manually"
    And el usuario ingresa su email "analia.gonzalez@yahoo.com"
    And el usuario ingresa su password "000000"
    And el usuario hace click en el botón "Log in" para logueo manual
    Then el usuario visualiza un mensaje de error indicando correo electrónico o contraseña no válidos


@LoginEmailGoogle @Smoke @SuccessfulScenario @noCandidate
Scenario: Login exitoso con google
  When el usuario hace click en el botón "Continue with Google"
  And el usuario ingresa email de google "defaultani@gmail.com" y hace click en el botón "Siguiente"
  And el usuario ingresa su password "BAT123456" y hace click en el botón "Siguiente"
  And el usuario hace click en el botón "Continue" de google
  And el usuario acepta los terminos y condiciones
  And el usuario hace click en el botón "Crear cuenta" de clockify
  Then el usuario se encuentra en el home de Clockify
