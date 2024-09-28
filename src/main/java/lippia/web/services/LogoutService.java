package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Log_In_Constants;
import lippia.web.constants.Logout_Constants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogoutService extends ActionManager {
    public static void doLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(Log_In_Constants.OPTION_LOGIN_MANUALLY_BUTTON);
        setInput(Log_In_Constants.EMAIL_MANUALLY, "anyvg87@yahoo.com.ar");
        setInput(Log_In_Constants.PASSWORD_MANUALLY, "BAT123456");
        click(Log_In_Constants.LOGIN_BUTTON_MANUALLY);
        WebActionManager.waitVisibility(Log_In_Constants.HOME_DIV);
        ResultsService.assertMessageDisplayed(Log_In_Constants.HOME_DIV);
    }

    public static void clickOnUserName() {
        click(Logout_Constants.USER_NAME);
    }

    public static void clickOnCloseSession() {
        click(Logout_Constants.CLOSE_SESSION);
    }

    public static void verifyLogoutAndRedirect() {
        ResultsService.verifyActionResult(Log_In_Constants.EMAIL_MANUALLY);
    }
}
