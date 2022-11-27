package page;

import org.openqa.selenium.chrome.ChromeDriver;

public class CortellisLoginPage {
    private ChromeDriver driver;

    public CortellisLoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
