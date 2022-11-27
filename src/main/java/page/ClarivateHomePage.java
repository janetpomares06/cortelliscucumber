package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClarivateHomePage {

    private ChromeDriver driver;

    public ClarivateHomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    private By acceptAll = By.id("onetrust-accept-btn-handler");
    private By link = By.linkText("Generics & Manufacturing");
    private By menuitem = By.id("menu-item-7");

    public void acceptAllCookies() {

        driver.executeScript("arguments[0].click();", driver.findElement(acceptAll));
    }

    public void goGenericAndManufacturing() {

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(menuitem)).click();

        driver.findElement(link).click();
    }
}
