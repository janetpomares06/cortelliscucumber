package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClarivateHomePage {

    public ChromeDriver driver;

    public ClarivateHomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    private By acceptAll = By.xpath("//button[@id= 'onetrust-accept-btn-handler']");
    private By dropdown = By.xpath("//a[@id= 'dropdown']");


    public void acceptAllCookies(){
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(acceptAll)).click();

        WebElement ele = driver.findElement(By.id("onetrust-accept-btn-handler"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    public void goProductsAndServices(){
        //driver.findElement(dropdown).click();

    }

    public void goGenericAndManufacturing(){
        driver.findElement(By.id("menu-item-7")).click();
        driver.findElement(By.linkText("Generics & Manufacturing")).click();
    }
}
