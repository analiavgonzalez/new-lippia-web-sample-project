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
        switch (button) {
            case "Continue with Google":
                buttonClicked = Log_In_Constants.GOOGLE_BUTTON_XPATH;
                break;
            case "Log in manually":
                buttonClicked = Log_In_Constants.MANUALLY_BUTTON_XPATH;
                break;
            case "Siguiente":
                //buttonClicked = Log_In_Constants.MANUALLY_BUTTON_XPATH;
                break;
            default:
                throw new IllegalArgumentException("Invalid type: " + buttonClicked);
        }
        click(buttonClicked);
    }
}
