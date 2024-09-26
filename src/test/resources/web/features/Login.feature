@Login @Regression 
Feature: Login
  
  Background: 
  Given el usuario se encuentra en la pantalla de inicio de Clockify

@LoginEmailGoogle @Smoke @SuccessfulScenario @noCandidate
Scenario: Login exitoso con google
  When el usuario hace click en el botón "Continue with Google"
  And el usuario ingresa email de google "defaultani@gmail.com" y hace click en el botón "Siguiente"
  And el usuario ingresa su password "BAT123456" y hace click en el botón "Siguiente"
  And el usuario hace click en el botón "Continue" de google
  And el usuario acepta los terminos y condiciones
  And el usuario hace click en el botón "Crear cuenta" de clockify
  Then el usuario se encuentra en el home de Clockify

@LoginManual @Smoke @SuccessfulScenario @Automated
Scenario: Login exitoso manual
When el usuario hace click en el botón "Log in manually"
And el usuario ingresa su email "anyvg87@yahoo.com.ar"
And el usuario ingresa su password "BAT123456"
And el usuario hace click en el botón "Log in" para logueo manual
Then el usuario se encuentra en el home de Clockify

#@LoginEmail @Smoke @SuccessfulScenario @noCandidate
#Scenario: Login exitoso con email
#When el usuario ingresa su email "analia.gonzalez@yahoo.com"
#And el usuario hace click en el botón "Continue with email"
#And el usuario ingresa a su correo personal y copia el código
#And el usuario ingresa el codigo obtenido por email
#Then el usuario se encuentra en el home de Clockify
#
#@LoginEmail @FailedScenario @noCandidate
#Scenario: Login fallido por código inválido
#When el usuario ingresa su email "analia.gonzalez@yahoo.com"
#And el usuario hace click en el botón "Continue with email"
#And el usuario ingresa a su correo personal y copia el código
#And el usuario ingresa un código inválido
#Then el usuario visualiza un mensaje de error indicando que el codigo es inválido

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
