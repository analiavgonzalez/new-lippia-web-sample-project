package lippia.web.services;
import com.crowdar.core.PropertyManager;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class Log_in_Services {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
}
