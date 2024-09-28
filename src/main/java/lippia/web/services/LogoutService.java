package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.LogoutConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogoutService extends ActionManager {
    public static void doLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(LogInConstants.OPTION_LOGIN_MANUALLY_BUTTON);
        setInput(LogInConstants.EMAIL_MANUALLY, "anyvg87@yahoo.com.ar");
        setInput(LogInConstants.PASSWORD_MANUALLY, "BAT123456");
        click(LogInConstants.LOGIN_BUTTON_MANUALLY);
        WebActionManager.waitVisibility(LogInConstants.HOME_DIV);
        ResultsService.assertMessageDisplayed(LogInConstants.HOME_DIV);
    }

    public static void clickOnUserName() {
        click(LogoutConstants.USER_NAME);
    }

    public static void clickOnCloseSession() {
        click(LogoutConstants.CLOSE_SESSION);
    }

    public static void verifyLogoutAndRedirect() {
        ResultsService.verifyActionResult(LogInConstants.EMAIL_MANUALLY);
    }
}
