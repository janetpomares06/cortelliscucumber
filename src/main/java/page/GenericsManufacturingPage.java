package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericsManufacturingPage {
    public ChromeDriver driver;

    public GenericsManufacturingPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void goOurSolutions(){
        driver.findElement(By.linkText("Our solutions")).click();
    }

    public void goCortellisCMCIntelligence() {

        WebElement ele = driver.findElement(By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']"))).click();
        //driver.findElement(By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']")).click(); //.getText(); ////div[@class= 'container']//div[@class= 'grid-view']"))
        //driver.close();
    }
}
