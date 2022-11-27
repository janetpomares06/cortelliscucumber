package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericsManufacturingPage {
    private ChromeDriver driver;

    public GenericsManufacturingPage(ChromeDriver driver) {
        this.driver = driver;
    }

    private By link = By.linkText("Our solutions");
    private By href = By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']");

    public void goOurSolutions() {

        driver.findElement(link).click();
    }

    public void goCortellisCMCIntelligence() {

        driver.executeScript("arguments[0].click();", driver.findElement(href));

    }
}
