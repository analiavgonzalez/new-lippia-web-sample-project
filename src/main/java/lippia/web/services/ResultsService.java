package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
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
}
