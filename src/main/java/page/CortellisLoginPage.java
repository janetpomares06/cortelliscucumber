package page;

import org.openqa.selenium.chrome.ChromeDriver;

public class CortellisLoginPage {
    public ChromeDriver driver;

    public CortellisLoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

}
