package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WorkspaceService extends ActionManager {

    public static void goToWorkspacePage() {
        WebActionManager.waitVisibility(WorkspaceConstants.CONFIG_BUTTON);
        WebActionManager.waitClickable(WorkspaceConstants.CONFIG_BUTTON);
        click(WorkspaceConstants.CONFIG_BUTTON);
        WebActionManager.waitClickable(WorkspaceConstants.MANAGEW_BUTTON);
        click(WorkspaceConstants.MANAGEW_BUTTON);
    }

    public static void clickOnCreateNewWorkspace() {
        click(WorkspaceConstants.CREATE_BUTTON);
    }

    public static void clickOnCreateButton() {
        click(WorkspaceConstants.CREATE_NEW_BUTTON);
    }

    public static void createNewWorkspace(String workspace) {
        click(WorkspaceConstants.CREATE_BUTTON);
        setInput(WorkspaceConstants.WORKSPACE_NAME_TEXT, workspace);
        click(WorkspaceConstants.CREATE_NEW_BUTTON);
    }

    public static void setNewWorkspaceName(String name) {
        //cuando debugueo funciona correctamente pero sino falla
        WebActionManager.waitVisibility(WorkspaceConstants.WORKSPACE_NAME_EDITION);
        click(WorkspaceConstants.WORKSPACE_NAME_EDITION);
        WebElement delete = WebActionManager.getElement(WorkspaceConstants.WORKSPACE_NAME_EDITION);
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        setInput(WorkspaceConstants.WORKSPACE_NAME_EDITION,name);
        click(WorkspaceConstants.TITLE_UPDATE);
    }

    public static void clickOnConfigurationButton() {
        WebActionManager.waitVisibility(WorkspaceConstants.SEARCH_ANI_WORKSPACE);
        click(WorkspaceConstants.SEARCH_ANI_WORKSPACE);
    }

    public static void goToWorkspaceList() {
        //click(Workspace_Contants.SEARCH_UPDATED_WORKSPACE);
        ResultsService.verifyActionResult(WorkspaceConstants.SEARCH_UPDATED_WORKSPACE);
    }

    public static void generateWorkspaceName() {
        setInput(WorkspaceConstants.WORKSPACE_NAME_TEXT, WorkspaceGeneratorNameService.generateWorkspaceName());
    }

    public static void verifyCreationMessage() {
        WebActionManager.waitVisibility(WorkspaceConstants.MSG_SUCCESSFUL_CREATION);
        ResultsService.assertMessageDisplayed(WorkspaceConstants.MSG_SUCCESSFUL_CREATION);
    }
}



