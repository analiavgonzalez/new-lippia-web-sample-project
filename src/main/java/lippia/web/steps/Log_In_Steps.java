package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.Log_in_Services;

public class Log_In_Steps {
    @Given("el usuario se encuentra en la pantalla de inicio de Clockify")
    public void pantallaDeInicioDeClockify() {
        Log_in_Services.pageLogin();
    }

    @When("el usuario hace click en el botón {string}")
    public void clickOnButton(String arg0) {
        Log_in_Services.clickOnButtonOptionLogin(arg0);
    }


}
