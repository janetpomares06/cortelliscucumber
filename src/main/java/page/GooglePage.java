package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

    public static final String CLARIVATE = "Clarivate";
    private ChromeDriver driver;

    public GooglePage(ChromeDriver driver) {
        this.driver = driver;
    }

    private By acceptAll = By.xpath("//button[@id= 'L2AGLb']");
    private By search = By.xpath("//input[@name= 'q']");

    public void acceptCookies() {

        driver.findElement(acceptAll).click();
    }

    public void enterKeyword() {

        driver.findElement(search).sendKeys(CLARIVATE);
    }

    public void goSearching() {

        driver.findElement(search).submit();
    }
}
