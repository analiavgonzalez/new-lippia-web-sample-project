package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Log_In_Constants;
import lippia.web.constants.Project_Constants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ProjectService extends ActionManager {
    public static void doLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(Log_In_Constants.OPTION_LOGIN_MANUALLY_BUTTON);
        setInput(Log_In_Constants.EMAIL_MANUALLY, "anyvg87@yahoo.com.ar");
        setInput(Log_In_Constants.PASSWORD_MANUALLY, "BAT123456");
        click(Log_In_Constants.LOGIN_BUTTON_MANUALLY);
        ResultsService.assertMessageDisplayed(Log_In_Constants.HOME_DIV);
    }

    public static void goToProjectsPage() {
        click(Project_Constants.MENU_PROJECT_XPATH);
    }

    public static void clickOnCreateNewProjectButton() {
        click(Project_Constants.CREATE_PROJECT_XPATH);
    }
}
