package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {
    public ChromeDriver driver;

    public GoogleSearchPage(ChromeDriver driver) {
        this.driver = driver;
    }
    public void enterClarivate(){
        driver.findElement(By.linkText("clarivate.com")).click();
    }

}
