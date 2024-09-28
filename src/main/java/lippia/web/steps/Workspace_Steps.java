package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.Workspace_Contants;
import lippia.web.services.Log_in_Services;
import lippia.web.services.ResultsService;
import lippia.web.services.WorkspaceService;

public class Workspace_Steps {

    @Given("el usuario está logueado en la pagina de Clockify")
    public void makeLoginToWorkspace() {
        Log_in_Services.madeEasyLogin();
    }

    @And("el usuario se encuentra en la pantalla de Manage Workspace")
    public void goToWorkspacePage() {
        WorkspaceService.goToWorkspacePage();
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
       WebActionManager.waitVisibility(Workspace_Contants.MSG_SUCCESSFUL_CREATION_XPATH);
       ResultsService.assertMessageDisplayed(Workspace_Contants.MSG_SUCCESSFUL_CREATION_XPATH);
    }

    @And("el workspace {string} ya existe")
    public void createNewWorkspace(String name) {
        WorkspaceService.createNewWorkspace(name);
    }

    @And("el usuario ingresa {string} en el campo Workspace name y presiona el botón Enter")
    public void setNewWorkspaceName(String name) {
        WorkspaceService.setNewWorkspaceName(name);
    }

    @Then("el usuario hace click en el botón Manage Workspace")
    public void clickOnManageButton() {
        WorkspaceService.goToWorkspacePage();
    }

    @When("el usuario hace click en el botón Configuración del workspace Ani workspace")
    public void clickOnConfigurationButton() {
        WorkspaceService.clickOnConfigurationButton();
    }

    @And("el usuario visualiza el nuevo workspace Update workspace en la grilla")
    public void goToWorkspaceList() {
        WorkspaceService.goToWorkspaceList();
    }
}