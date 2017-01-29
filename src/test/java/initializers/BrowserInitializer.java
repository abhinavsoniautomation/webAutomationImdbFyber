package initializers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created with IntelliJ IDEA.
 * User: abhinav
 * Date: 31/01/17
 * Time: 12:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class BrowserInitializer {
    public static WebDriver initializeBrowser(){
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.ANY);
        return new FirefoxDriver();
    }
}
