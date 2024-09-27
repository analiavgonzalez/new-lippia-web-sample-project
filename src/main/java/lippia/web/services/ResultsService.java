package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Log_In_Constants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.NoSuchElementException;

public class ResultsService extends ActionManager {

    public static void assertMessageDisplayed(String messageIdentifier) {
        Assert.assertFalse(getMessage(messageIdentifier).isEmpty());
    }

    public static String getMessage(String messageIdentifier) {
        WebElement element = verifyMessageElement(messageIdentifier);
        return element != null ? element.getText() : "";
    }

    private static WebElement verifyMessageElement(String messageIdentifier) {
        try {
            return getElement(messageIdentifier);
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public static void verifyResult() {
        Assert.assertFalse(getStats().isEmpty());
    }
    public static String getStats() {
        return stats().getText();
    }
    private static WebElement stats() {
        return getElement(Log_In_Constants.OPTION_LOGIN_MANUALLY_BUTTON);
    }
}
