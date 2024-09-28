package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Workspace_Contants;

public class WorkspaceService extends ActionManager {

    public static void goToWorkspacePage() {
        WebActionManager.waitClickable(Workspace_Contants.CONFIG_BUTTON_XPATH);
        click(Workspace_Contants.CONFIG_BUTTON_XPATH);
        WebActionManager.waitClickable(Workspace_Contants.MANAGEW_BUTTON_XPATH);
        click(Workspace_Contants.MANAGEW_BUTTON_XPATH);
    }

    public static void clickOnCreateNewWorkspace() {
        click(Workspace_Contants.CREATE_BUTTON_XPATH);
    }

    public static void setWorkspaceName(String name) {
        setInput(Workspace_Contants.WORKSPACE_NAME_TEXT_XPATH, name);
    }

    public static void clickOnCreateButton() {
        click(Workspace_Contants.CREATE_NEW_BUTTON_XPATH);
    }

    public static void createNewWorkspace(String workspace) {
        click(Workspace_Contants.CREATE_BUTTON_XPATH);
        setInput(Workspace_Contants.WORKSPACE_NAME_TEXT_XPATH, workspace);
        click(Workspace_Contants.CREATE_NEW_BUTTON_XPATH);
    }

    public static void setNewWorkspaceName(String name) {
        //cuando debugueo funciona correctamente pero sino falla
        WebActionManager.waitVisibility(Workspace_Contants.WORKSPACE_NAME_EDITION_XPATH);
        setInput(Workspace_Contants.WORKSPACE_NAME_EDITION_XPATH,name,false,true,name);
    }

    public static void clickOnConfigurationButton() {
        click(Workspace_Contants.SEARCH_ANI_WORKSPACE_XPATH);
    }

    public static void goToWorkspaceList() {
        //click(Workspace_Contants.SEARCH_UPDATED_WORKSPACE_XPATH);
        ResultsService.verifyActionResult(Workspace_Contants.SEARCH_UPDATED_WORKSPACE_XPATH);
    }
}



