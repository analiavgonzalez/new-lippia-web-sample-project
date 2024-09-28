package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;

import java.util.Random;

public class ProjectService extends ActionManager {

    private static final Random random = new Random();

    public static void goToProjectsPage() {
        WebActionManager.waitVisibility(ProjectConstants.MENU_PROJECT);
        click(ProjectConstants.MENU_PROJECT);
    }

    public static void clickOnCreateNewProjectButton() {
        click(ProjectConstants.CREATE_PROJECT);
    }

    public static void setProjectName() {
        int randomNumber = random.nextInt(100);
        String projectName= "BAT "  + randomNumber;
        setInput(ProjectConstants.PROJECT_NAME, projectName);
    }

    public static void setPublicProject() {
        click(ProjectConstants.PUBLIC_CHECKBOX);
    }

    public static void clickCreateNewProject() {
        click(ProjectConstants.CREATE_NEW_PROJECT);
    }

    public static void verifySuccessfulMessage() {
        WebActionManager.waitVisibility(ProjectConstants.DIV_CREATION_MSG);
        ResultsService.assertMessageDisplayed(ProjectConstants.DIV_CREATION_MSG);
    }
}
