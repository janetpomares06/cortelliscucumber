package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerLoginsPage {

    public ChromeDriver driver;

    public CustomerLoginsPage(ChromeDriver driver) {
        this.driver = driver;
    }

    private By link = By.xpath("//section[@id= 'wos']//p/a[@href= 'https://access.clarivate.com/login?app=cmc']");
    //private By link = By.xpath("//section[@id= 'wos']//p/a[@text= 'Cortellis CMC Intelligence Login']");

    public void loginCortellis() {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(link)).click();

        String url = driver.findElement(link).getAttribute("href");
        driver.get( url);

        //driver.getCurrentUrl();
        //driver.findElement(link).click();
    }

}
