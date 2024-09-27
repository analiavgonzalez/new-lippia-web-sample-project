package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.Workspace_Contants;
import lippia.web.services.ResultsService;
import lippia.web.services.WorkspaceService;

public class Workspace_Steps {
    @Given("el usuario está logueado en la página de Clockify")
    public void doLogin() {
        WorkspaceService.doLogin();
    }

    @And("el usuario se encuentra en la pantalla de Manage Workspace")
    public void goToWorkspacePage() {
        WorkspaceService.goToWorkspacePage();
    }

    @And("el Workspace {string} no existe")
    public void verifyWorkspaceNonexistent (String workspace) {
        WorkspaceService.verifyWorkspaceNonexistent(workspace);

    }

    @When("el usuario hace click en el botón Crear nuevo espacio de trabajo")
    public void clickOnCreateNewWorkspace() {
        WorkspaceService.clickOnCreateNewWorkspace();
    }

    @And("el usuario ingresa el nombre del workspace {string}")
    public void setWorkspaceName(String name) {
        WorkspaceService.setWorkspaceName(name);
    }

    @And("el usuario hace click en el botón Crear")
    public void clickOnCreateButton() {
        WorkspaceService.clickOnCreateButton();
    }

    @Then("el usuario visualiza un mensaje indicando que se ha creado correctamente")
    public void verifyCreationMessage() {
        ResultsService.assertMessageDisplayed(Workspace_Contants.MSG_SUCCESSFUL_CREATION_XPATH);
    }

    @And("el usuario visualiza el nuevo {string} Workspace en la grilla")
    public void verifyNewWorkspaceCreated(String name) {

    }
}
