package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Log_In_Constants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class Log_in_Services extends ActionManager {
    public static void pageLogin(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    
    public static void clickOnButtonOptionLogin( String button) {
        String buttonClicked = null;

        if(button.equals("Continue with Google")) {
            buttonClicked = Log_In_Constants.OPTION_LOGIN_GOOGLE_BUTTON;
        }else{
            buttonClicked = Log_In_Constants.OPTION_LOGIN_MANUALLY_BUTTON;
        }

        click(buttonClicked);
    }

    public static void clickButtonLogIn() {
        click(Log_In_Constants.LOGIN_BUTTON_MANUALLY);
    }
    
    public static void emailGoogle(String email) {
        setInput(Log_In_Constants.EMAIL_GOOGLE,email);
    }

    public static void passwordGoogle(String password) {
        setInput(Log_In_Constants.PASSWORD_GOOGLE, password);
    }

    public static void enterEmailManually(String email) {
        setInput(Log_In_Constants.EMAIL_MANUALLY, email);
    }

    public static void enterPasswordManually(String pass) {
        setInput(Log_In_Constants.PASSWORD_MANUALLY, pass);
    }

    public static void clickOnLogInButton(String arg0) {
        setInput(Log_In_Constants.LOGIN_BUTTON_MANUALLY, arg0);
    }



    public static void clickOnNextButton() {
        click(Log_In_Constants.EMAIL_NEXT_BUTTON_GOOGLE);
    }

    public static void clickOnContinueButton() {
        click(Log_In_Constants.CONTINUE_BUTTON_GOOGLE);
    }

    public static void clickOnTyC() {
        click(Log_In_Constants.AGREE_TYC_LABEL_CLOCKIFY);
    }

    public static void clickOnRegisterButton() {
        click(Log_In_Constants.REGISTER_BUTTON_CLOCKIFY);
    }

    public static void clickOnPassword() {
        click(Log_In_Constants.PASSWORD_MANUALLY);
    }

    public static void madeEasyLogin() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
        click(Log_In_Constants.OPTION_LOGIN_MANUALLY_BUTTON);
        setInput(Log_In_Constants.EMAIL_MANUALLY, "anyvg87@yahoo.com.ar");
        setInput(Log_In_Constants.PASSWORD_MANUALLY, "BAT123456");
        click(Log_In_Constants.LOGIN_BUTTON_MANUALLY);
        //ResultsService.assertMessageDisplayed(Log_In_Constants.HOME_DIV);
        ResultsService.verifyActionResult(Log_In_Constants.HOME_DIV);
    }
}
