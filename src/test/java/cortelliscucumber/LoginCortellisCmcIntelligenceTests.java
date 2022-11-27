package cortelliscucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginCortellisCmcIntelligenceTests {
    @Given("Go to Login in Cortellis CMC Intelligence")
    public void go_to_login_in_cortellis_cmc_intelligence() {
        log.info("Go to Login in Cortellis CMC Intelligencee");

    }
    @When("Click on Cortellis CMC Intelligence login link in Cortellis product")
    public void click_on_cortellis_cmc_intelligence_login_link_in_cortellis_product() {
        log.info("Click on Cortellis CMC Intelligence login link in Cortellis product");

    }
    @Then("You are redirected to  Cortellis CMC Intelligence login page and URL is https:\\/\\/access.cortellis.com\\/login?app=cmc")
    public void you_are_redirected_to_cortellis_cmc_intelligence_login_page_and_url_is_https_access_cortellis_com_login_app_cmc() {
        log.info("You are redirected to  Cortellis CMC Intelligence login page and URL is https:\\/\\/access.cortellis.com\\/login?app=cmc");

    }

}
