package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.GoogleHomeService;
import lippia.web.services.Log_in_Services;

public class Log_In_Steps {
    @Given("el usuario se encuentra en la pantalla de inicio de Clockify")
    public void pantallaDeInicioDeClockify() {
        Log_in_Services.navegarWeb();
    }

    @When("el usuario hace click en el botón {string}")
    public void elUsuarioHaceClickEnElBotón(String arg0) {

    }


}
