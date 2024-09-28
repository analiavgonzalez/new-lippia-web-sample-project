package lippia.web.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;

public class LogInSteps {
    @Given("el usuario se encuentra en la pantalla de inicio de Clockify")
    public void pantallaDeInicioDeClockify() {
        LoginService.pageLogin();
    }

    /*********************** SELECCION DE OPCIONES DE LOGIN ******************************/
    @And("el usuario hace click en el botón Log in para logueo manual")
    public void clickButtonLogIn() {
        LoginService.clickButtonLogIn();
    }

    /*********************** LOGICA LOGIN MANUAL ******************************/
    @And("el usuario ingresa su email {string}")
    public void enterEmailManual(String email) {
        LoginService.enterEmailManually(email);
    }
    @And("el usuario ingresa su password {string}")
    public void enterPasswordManually(String pass) {
        LoginService.enterPasswordManually(pass);
    }
    @When("el usuario hace click en el botón Log in")
    public void clickOnLogInButton(String arg0) {
        LoginService.clickOnLogInButton(arg0);
    }

    /*********************** LOGICA UNA VEZ LOGUEADO ******************************/
    @Then("el usuario se encuentra en el home de Clockify")
    public void goToHomeClockify() {
        LoginService.goToHomeClockify();
    }
    /*********************** LOGICA VALIDACION DE ERRORES ******************************/
    @Then("el usuario visualiza un mensaje de error indicando que el formato de email es inválido")
    public void verifyInvalidEmailMessage() {
        LoginService.verifyInvalidEmailMessage();

    }
    @Then("el usuario visualiza un mensaje de error indicando correo electrónico o contraseña no válidos")
    public void verifyInvalidEmailOrPasswordMessage() {
        LoginService.verifyInvalidEmailOrPasswordMessage();
    }

    @When("el usuario hace click en el botón Log in manually")
    public void clickOnButtonLogInManually() {
        LoginService.clickOnButtonLogInManually();
    }
}
