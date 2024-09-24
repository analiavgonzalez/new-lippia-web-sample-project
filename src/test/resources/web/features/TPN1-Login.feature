@Login @Regression 
Feature: Login
  
  Background: 
  Given el usuario se encuentra en la pantalla de inicio de Clockify

@LoginEmailGoogle @Smoke @SuccessfulScenario
Scenario: Login exitoso con google
When el usuario hace click en el botón "Continue with Google"
And el usuario ingresa email de google "testing@gmail.com"
And el usuario ingresa su password "Str0ngPass"
Then el usuario se encuentra en el home de Clockify

@LoginManual @Smoke @SuccessfulScenario
Scenario: Login exitoso manual 
When el usuario hace click en el botón "Log in manually"
And el usuario ingresa su email "analia.gonzalez@yahoo.com" 
And el usuario ingresa su password "3TR0N4" 
And el usuario hace click en el botón "Log in" 
Then el usuario se encuentra en el home de Clockify

@LoginEmail @Smoke @SuccessfulScenario @noCandidate
Scenario: Login exitoso con email
When el usuario ingresa su email "analia.gonzalez@yahoo.com" 
And el usuario hace click en el botón "Continue with email" 
And el usuario ingresa a su correo personal y copia el código
And el usuario ingresa el codigo obtenido por email
Then el usuario se encuentra en el home de Clockify

@LoginEmail @FailedScenario @noCandidate
Scenario: Login fallido por código inválido
When el usuario ingresa su email "analia.gonzalez@yahoo.com" 
And el usuario hace click en el botón "Continue with email" 
And el usuario ingresa a su correo personal y copia el código
And el usuario ingresa un código inválido
Then el usuario visualiza un mensaje de error indicando que el codigo es inválido

@LoginEmail @Smoke @FailedScenario
Scenario: Login fallido por email con formato invalido
When el usuario ingresa el email "analia.gonzalezyahoo.com" 
Then el usuario visualiza un mensaje de error indicando que el formato de email es inválido

@LoginManual @Smoke @FailedScenario
Scenario: Login manual fallido
When el usuario hace click en el botón "Log in manually"
And el usuario ingresa su email "analia.gonzalez@yahoo.com" 
And el usuario ingresa su password "000000" 
And el usuario hace click en el botón "Log in" 
Then el usuario visualiza un mensaje de error indicando correo electrónico o contraseña no válidos
