package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.ProjectService;

public class ProjectSteps {
    @Given("el usuario está logueado en la página de Clockify")
    public void doLoginToProject() {
        LoginService.madeEasyLogin();
    }

    @And("el usuario se encuentra en la pantalla de Proyectos")
    public void goToProjects() {
        ProjectService.goToProjectsPage();
    }

    @When("el usuario presiona el botón Create new project")
    public void clickOnCreateNewProjectButton() {
    ProjectService.clickOnCreateNewProjectButton();
    }

    @And("el usuario ingresa el nombre de proyecto")
    public void setProjectName() {
        ProjectService.setProjectName();
    }

    @And("el usuario selecciona el valor publico para indicar que es publico")
    public void setPublicProject() {
        ProjectService.setPublicProject();
    }

    @And("el usuario presiona el botón Create")
    public void clickCreateNewProject() {
        ProjectService.clickCreateNewProject();
    }

    @Then("el usuario visualiza el mensaje de confirmación de operación exitosa.")
    public void verifySuccessfulMessage() {
        ProjectService.verifySuccessfulMessage();
    }
}
