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
    
    public static void clickOnButtonOptionLogin( String button) {
        String buttonClicked = null;

        if(button.equals("Continue with Google")) {
            buttonClicked = LogInConstants.OPTION_LOGIN_GOOGLE_BUTTON;
        }else{
            buttonClicked = LogInConstants.OPTION_LOGIN_MANUALLY_BUTTON;
        }

        click(buttonClicked);
    }

    public static void clickButtonLogIn() {
        click(LogInConstants.LOGIN_BUTTON_MANUALLY);
    }
    
    public static void emailGoogle(String email) {
        setInput(LogInConstants.EMAIL_GOOGLE,email);
    }

    public static void passwordGoogle(String password) {
        setInput(LogInConstants.PASSWORD_GOOGLE, password);
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

    public static void clickOnNextButton() {
        click(LogInConstants.EMAIL_NEXT_BUTTON_GOOGLE);
    }

    public static void clickOnContinueButton() {
        click(LogInConstants.CONTINUE_BUTTON_GOOGLE);
    }

    public static void clickOnTyC() {
        click(LogInConstants.AGREE_TYC_LABEL_CLOCKIFY);
    }

    public static void clickOnRegisterButton() {
        click(LogInConstants.REGISTER_BUTTON_CLOCKIFY);
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
}
