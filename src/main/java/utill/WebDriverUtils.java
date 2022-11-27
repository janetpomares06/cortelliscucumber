package utill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {

    private static WebDriver driver;
    public static void setDriver(WebDriver webDdriver) {
        if (driver == null) {
            driver = webDdriver;
        }
    }
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new AssertionError("Driver is null. Initialize driver before calling this method.");
        }
        return driver;
    }

}
