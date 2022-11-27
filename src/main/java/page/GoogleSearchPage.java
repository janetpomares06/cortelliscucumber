package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

    public static final String CLARIVATE_URL = "clarivate.com";
    private ChromeDriver driver;

    public GoogleSearchPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void enterClarivate() {

        driver.findElement(By.linkText(CLARIVATE_URL)).click();
    }

}
