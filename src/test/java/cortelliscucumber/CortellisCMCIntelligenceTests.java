package cortelliscucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

@Slf4j
public class CortellisCMCIntelligenceTests {

    private GooglePage googlepage;
    private GoogleSearchPage googlesearchpage;
    private ClarivateHomePage clarivateHomePage;
    private GenericsManufacturingPage genericsManufacturingPage;
    private CortellisHomePage cortellisHomePage;
    private CustomerLoginsPage customerLoginsPage;
    private CortellisLoginPage cortellisLoginPage;
    public static final String CORTELLIS_LOGIN_URL = "https://access.cortellis.com/login?app=cmc";

    public ChromeDriver driver = new ChromeDriver();
    @Given("A URL is provided")
    public void a_url_is_provided() {
        driver.get("https://www.google.com/");

        googlepage = new GooglePage(driver);
        googlepage.acceptCookies();
        log.info("A URL is provided");
    }
    @When("Found Clarivate in a Google search and navigate through Clarivate pages to Cortellis home page")
    public void found_clarivate_in_a_google_search_and_navigate_through_clarivate_pages_to_cortellis_home_page() {
        googlepage.enterKeyword();
        googlepage.goSearching();
        log.info("Found Clarivate in a Google search and navigate through Clarivate pages to Cortellis home page");
    }
    @Then("Access to Cortellis login page and check the URL")
    public void access_to_cortellis_login_page_and_check_the_url() {
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
        log.info("Access to Cortellis login page and check the URL");

    }


}
