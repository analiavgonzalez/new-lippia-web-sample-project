package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Log_In_Constants;
import lippia.web.constants.Workspace_Contants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class WorkspaceService extends ActionManager {

    public static void doLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(Log_In_Constants.OPTION_LOGIN_MANUALLY_BUTTON);
        setInput(Log_In_Constants.EMAIL_MANUALLY, "anyvg87@yahoo.com.ar");
        setInput(Log_In_Constants.PASSWORD_MANUALLY, "BAT123456");
        click(Log_In_Constants.LOGIN_BUTTON_MANUALLY);
        ResultsService.assertMessageDisplayed(Log_In_Constants.HOME_DIV);
    }

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
}
