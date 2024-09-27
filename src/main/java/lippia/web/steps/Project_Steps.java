package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.Log_in_Services;
import lippia.web.services.ProjectService;

public class Project_Steps {
    @Given("el usuario está logueado en la página de Clockify")
    public void doLoginToProject() {
        Log_in_Services.madeEasyLogin();
    }

    @And("el usuario se encuentra en la pantalla de Proyectos")
    public void goToProjects() {
        ProjectService.goToProjectsPage();
    }

    @And("no existe un proyecto con nombre <project_name> y cliente <client>")
    public void noExisteUnProyectoConNombreProject_nameYClienteClient() {
        
    }

    @When("el usuario presiona el botón Create new project")
    public void clickOnCreateNewProjectButton() {
    ProjectService.clickOnCreateNewProjectButton();
    }

}
