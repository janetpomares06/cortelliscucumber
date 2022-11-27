package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CortellisHomePage {
    public ChromeDriver driver;

    public CortellisHomePage(ChromeDriver driver) {
        this.driver = driver;
    }
    //private By login = By.xpath("//i[@class= 'material-icons']");
    private By login = By.xpath("//a[@href= 'https://clarivate.com/login/']");

    public void loginCortellis(){
        //driver.findElement(login).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(login)).click();

    }
}
