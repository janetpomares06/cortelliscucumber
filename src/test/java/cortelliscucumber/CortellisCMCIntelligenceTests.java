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
    private String url;
    public static final String URL = "https://access.cortellis.com/login?app=cmc";
    public static final String GOOGLE_URL = "https://www.google.com/";

    public ChromeDriver driver = new ChromeDriver();

    @Given("A URL is provided")
    public void a_url_is_provided() {

        url = URL;
        log.info("A URL is provided");
    }

    @When("Found Clarivate in a Google search and navigate through Clarivate pages to Cortellis home page")
    public void found_clarivate_in_a_google_search_and_navigate_through_clarivate_pages_to_cortellis_home_page() {
        driver.get(GOOGLE_URL);
        googlepage = new GooglePage(driver);
        googlepage.acceptCookies();
        googlepage.enterKeyword();
        googlepage.goSearching();
        log.info("Found Clarivate in a Google search and navigate through Clarivate pages to Cortellis home page");
    }

    @Then("Access to Cortellis login page and check the URL")
    public void access_to_cortellis_login_page_and_check_the_url() {
        googlesearchpage = new GoogleSearchPage(driver);
        clarivateHomePage = new ClarivateHomePage(driver);
        genericsManufacturingPage = new GenericsManufacturingPage(driver);
        cortellisHomePage = new CortellisHomePage(driver);
        customerLoginsPage = new CustomerLoginsPage(driver);
        cortellisLoginPage = new CortellisLoginPage(driver);
        googlesearchpage.enterClarivate();
        clarivateHomePage.acceptAllCookies();
        clarivateHomePage.goGenericAndManufacturing();
        genericsManufacturingPage.goOurSolutions();
        genericsManufacturingPage.goCortellisCMCIntelligence();
        cortellisHomePage.loginCortellis();
        customerLoginsPage.loginCortellis();
        Assertions.assertEquals(url, cortellisLoginPage.getUrl(), "The URL provided is not the URL reached through the steps");
    }


}
