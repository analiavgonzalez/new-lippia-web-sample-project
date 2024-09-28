package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;

public class WorkspaceService extends ActionManager {

    public static void goToWorkspacePage() {
        WebActionManager.waitClickable(WorkspaceConstants.CONFIG_BUTTON);
        click(WorkspaceConstants.CONFIG_BUTTON);
        WebActionManager.waitClickable(WorkspaceConstants.MANAGEW_BUTTON);
        click(WorkspaceConstants.MANAGEW_BUTTON);
    }

    public static void clickOnCreateNewWorkspace() {
        click(WorkspaceConstants.CREATE_BUTTON);
    }

    public static void setWorkspaceName(String name) {
        setInput(WorkspaceConstants.WORKSPACE_NAME_TEXT, name);
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
        setInput(WorkspaceConstants.WORKSPACE_NAME_EDITION,name,false,true,name);
    }

    public static void clickOnConfigurationButton() {
        click(WorkspaceConstants.SEARCH_ANI_WORKSPACE);
    }

    public static void goToWorkspaceList() {
        //click(Workspace_Contants.SEARCH_UPDATED_WORKSPACE);
        ResultsService.verifyActionResult(WorkspaceConstants.SEARCH_UPDATED_WORKSPACE);
    }
}



