package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {
    public static void pageLogin(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickButtonLogIn() {
        click(LogInConstants.LOGIN_BUTTON_MANUALLY);
    }

    public static void enterEmailManually(String email) {
        setInput(LogInConstants.EMAIL_MANUALLY, email);
    }

    public static void enterPasswordManually(String pass) {
        setInput(LogInConstants.PASSWORD_MANUALLY, pass);
    }

    public static void clickOnLogInButton(String arg0) {
        setInput(LogInConstants.LOGIN_BUTTON_MANUALLY, arg0);
    }

    public static void clickOnPassword() {
        click(LogInConstants.PASSWORD_MANUALLY);
    }

    public static void madeEasyLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(LogInConstants.OPTION_LOGIN_MANUALLY_BUTTON);
        setInput(LogInConstants.EMAIL_MANUALLY, "anyvg87@yahoo.com.ar");
        setInput(LogInConstants.PASSWORD_MANUALLY, "BAT123456");
        click(LogInConstants.LOGIN_BUTTON_MANUALLY);
        WebActionManager.waitVisibility(LogInConstants.HOME_DIV);
        ResultsService.verifyActionResult(LogInConstants.HOME_DIV);
    }

    public static void clickOnButtonLogInManually() {
        click(LogInConstants.OPTION_LOGIN_MANUALLY_BUTTON);
    }

    public static void goToHomeClockify() {
        WebActionManager.waitVisibility(LogInConstants.HOME_DIV);
        ResultsService.verifyActionResult(LogInConstants.HOME_DIV);
    }

    public static void verifyInvalidEmailMessage() {
        LoginService.clickOnPassword();
        ResultsService.assertMessageDisplayed(LogInConstants.INVALID_EMAIL_SPAN);
    }

    public static void verifyInvalidEmailOrPasswordMessage() {
        WebActionManager.waitVisibility(LogInConstants.INVALID_EMAILPASS_SPAN);
        ResultsService.assertErrorMessageDisplayed(LogInConstants.INVALID_EMAILPASS_SPAN);
    }
}
