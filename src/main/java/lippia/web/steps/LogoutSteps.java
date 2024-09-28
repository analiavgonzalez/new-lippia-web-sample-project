package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogoutService;

public class LogoutSteps {
    @Given("el usuario se encuentra logueado en Clockify")
    public void doLogin() {
        LogoutService.doLogin();
    }

    @When("el usuario hace click en el nombre de usuario")
    public void clickOnUserName() {
        LogoutService.clickOnUserName();
    }

    @And("el usuario hace click en Cerrar Sesion")
    public void clickOnCloseSession() {
        LogoutService.clickOnCloseSession();
    }

    @Then("el sistema cierra la sesion y presenta la pantalla de login")
    public void verifyLogoutAndRedirect() {
        LogoutService.verifyLogoutAndRedirect();

    }
}
