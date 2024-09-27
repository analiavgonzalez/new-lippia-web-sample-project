package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Log_In_Constants;
import lippia.web.constants.Project_Constants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ProjectService extends ActionManager {

    public static void goToProjectsPage() {
        click(Project_Constants.MENU_PROJECT_XPATH);
    }

    public static void clickOnCreateNewProjectButton() {
        click(Project_Constants.CREATE_PROJECT_XPATH);
    }
}
