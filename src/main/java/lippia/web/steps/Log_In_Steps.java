package lippia.web.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.Log_In_Constants;
import lippia.web.services.Log_in_Services;
import lippia.web.services.ResultsService;

public class Log_In_Steps {
    @Given("el usuario se encuentra en la pantalla de inicio de Clockify")
    public void pantallaDeInicioDeClockify() {
        Log_in_Services.pageLogin();
    }

    @When("el usuario hace click en el botón {string}")
    public void clickOnButton(String arg0) {
        Log_in_Services.clickOnButtonOptionLogin(arg0);
    }

    /*********************** SELECCION DE OPCIONES DE LOGIN ******************************/
    @And("el usuario hace click en el botón {string} para logueo manual")
    public void clickButtonLogIn(String arg0) {
        Log_in_Services.clickButtonLogIn();
    }

    /*********************** LOGICA LOGIN CON GOOGLE ******************************/
    @And("el usuario ingresa email de google {string} y hace click en el botón {string}")
    public void enterEmailAndClickOnNext(String email, String arg1) {
        Log_in_Services.emailGoogle(email);
        Log_in_Services.clickOnNextButton();
    }
    @And("el usuario ingresa su password {string} y hace click en el botón {string}")
    public void enterPassAndClickOnNext(String password, String arg1) {
        Log_in_Services.passwordGoogle(password);
        Log_in_Services.clickOnNextButton();
    }
    @And("el usuario hace click en el botón {string} de google")
    public void clickOnContinueButton(String arg0) {
        Log_in_Services.clickOnContinueButton();
    }
    @And("el usuario acepta los terminos y condiciones")
    public void clickOnTyC() {
        Log_in_Services.clickOnTyC();
    }
    @And("el usuario hace click en el botón {string} de clockify")
    public void clickOnRegisterButton(String arg0) {
        Log_in_Services.clickOnRegisterButton();
    }


    /*********************** LOGICA LOGIN MANUAL ******************************/
    @And("el usuario ingresa su email {string}")
    public void enterEmailManual(String email) {
        Log_in_Services.enterEmailManually(email);
    }
    @And("el usuario ingresa su password {string}")
    public void enterPasswordManually(String pass) {
        Log_in_Services.enterPasswordManually(pass);
    }
    @When("el usuario hace click en el botón Log in")
    public void clickOnLogInButton(String arg0) {
        Log_in_Services.clickOnLogInButton(arg0);
    }

    /*********************** LOGICA UNA VEZ LOGUEADO ******************************/
    @Then("el usuario se encuentra en el home de Clockify")
    public void goToHomeClockify() {
        Log_in_Services.verifyResult();
    }
    /*********************** LOGICA VALIDACION DE ERRORES ******************************/
    @Then("el usuario visualiza un mensaje de error indicando que el formato de email es inválido")
    public void verifyInvalidEmailMessage() {
        ResultsService.assertMessageDisplayed(Log_In_Constants.INVALID_EMAIL_SPAN);
    }
    @Then("el usuario visualiza un mensaje de error indicando correo electrónico o contraseña no válidos")
    public void verifyInvalidEmailOrPasswordMessage() {
        ResultsService.assertMessageDisplayed(Log_In_Constants.INVALID_EMAILPASS_SPAN);
    }



}
