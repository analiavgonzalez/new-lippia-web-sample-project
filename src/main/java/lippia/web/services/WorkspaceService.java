package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Workspace_Contants;

public class WorkspaceService extends ActionManager {

    public static String _workspaceName;

    public static void goToWorkspacePage() {
        click(Workspace_Contants.CONFIG_BUTTON_XPATH);
        click(Workspace_Contants.MANAGEW_BUTTON_XPATH);
    }

    public static void verifyWorkspaceNonexistent(String workspace) {

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

    public static void generateWorkspaceName() {
        _workspaceName=WorkspaceGeneratorName.generateWorkspaceName();
        setInput(Workspace_Contants.WORKSPACE_NAME_TEXT_XPATH, _workspaceName);

    }
}



