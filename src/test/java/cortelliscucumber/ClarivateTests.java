package cortelliscucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import page.ClarivateHomePage;
import page.ClarivateHomePage.*;

@Slf4j
public class ClarivateTests {

    //ChromeDriver driver = new ChromeDriver();
    //private ClarivateHomePage clarivateHomePage = new ClarivateHomePage(driver);

    @Given("Accepting all cookies in Clarivate home page")
    public void accepting_all_cookies_in_clarivate_home_page() {
        //clarivateHomePage = new ClarivateHomePage(driver);
        //clarivateHomePage.acceptAllCookies();
        log.info("Accepting all cookies in Clarivate home page");
    }
    @When("Select Product and Services")
    public void select_product_and_services() {
        //clarivateHomePage.goProductsAndServices();
        log.info("Select Product and Services");
    }
    @Then("Clicking on Generics.. Generics and manufacturing is open")
    public void clicking_on_generics_generics_and_manufacturing_is_open() {
        //clarivateHomePage.goGenericAndManufacturing();
        log.info("Clicking on Generics.. Generics and manufacturing is open");
    }

}
