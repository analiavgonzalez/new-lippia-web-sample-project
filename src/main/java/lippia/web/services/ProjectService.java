package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Project_Constants;

import java.util.Random;

public class ProjectService extends ActionManager {

    public static void goToProjectsPage() {
        click(Project_Constants.MENU_PROJECT_XPATH);
    }

    public static void clickOnCreateNewProjectButton() {
        click(Project_Constants.CREATE_PROJECT_XPATH);
    }
    private static final Random random = new Random();

    public static void setProjectName() {
        int randomNumber = random.nextInt(100);
        String projectName= "BAT "  + randomNumber;
        setInput(Project_Constants.PROJECT_NAME_XPATH, projectName);
    }

    public static void setPublicProject() {
        click(Project_Constants.PUBLIC_CHECKBOX_XPATH);
    }

    public static void clickCreateNewProject() {
        click(Project_Constants.CREATE_NEW_PROJECT_XPATH);
        WebActionManager.waitClickable(Project_Constants.DIV_CREATION_MSG_XPATH);
    }

    public static void verifySuccessfulMessage() {
        WebActionManager.waitVisibility(Project_Constants.DIV_CREATION_MSG_XPATH);
        ResultsService.assertMessageDisplayed(Project_Constants.DIV_CREATION_MSG_XPATH);
    }
}
