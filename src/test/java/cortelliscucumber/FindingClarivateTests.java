package cortelliscucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;
import lombok.extern.slf4j.Slf4j;
import sun.jvm.hotspot.utilities.Assert;

@Slf4j
public class FindingClarivateTests {

    private GooglePage googlepage;
    private GoogleSearchPage googlesearchpage;
    private ClarivateHomePage clarivateHomePage;
    private GenericsManufacturingPage genericsManufacturingPage;
    private CortellisHomePage cortellisHomePage;
    private CustomerLoginsPage customerLoginsPage;
    private CortellisLoginPage cortellisLoginPage;
    public static final String CORTELLIS_LOGIN_URL = "https://access.cortellis.com/login?app=cmc";

    public ChromeDriver driver = new ChromeDriver();

    @Given("Open Google Chrome")
    public void open_google_chrome() {
        driver.get("https://www.google.com/");

        googlepage = new GooglePage(driver);
        googlepage.acceptCookies();

        log.info("Open Google Chrome");
    }
    @When("I search for {string} and click on Clarivate link")
    public void i_search_for_and_click_on_clarivate_link(String string) {
        googlepage.enterKeyword();
        googlepage.goSearching();

        log.info("I search for {string} and click on Clarivate link");
    }
    @Then("I am redirected to Clarivate website")
    public void i_am_redirected_to_clarivate_website() {
        googlesearchpage = new GoogleSearchPage(driver);
        clarivateHomePage = new ClarivateHomePage(driver);
        genericsManufacturingPage =  new GenericsManufacturingPage(driver);
        cortellisHomePage  = new CortellisHomePage(driver);
        customerLoginsPage = new CustomerLoginsPage(driver);
        cortellisLoginPage = new CortellisLoginPage(driver);
        googlesearchpage.enterClarivate();
        clarivateHomePage.acceptAllCookies();
        clarivateHomePage.goGenericAndManufacturing();
        genericsManufacturingPage.goOurSolutions();
        genericsManufacturingPage.goCortellisCMCIntelligence();
        cortellisHomePage.loginCortellis();
        customerLoginsPage.loginCortellis();
        cortellisLoginPage.getUrl();
        Assertions.assertEquals(cortellisLoginPage.getUrl(),CORTELLIS_LOGIN_URL);

        log.info("I am redirected to Clarivate website");
    }
}
