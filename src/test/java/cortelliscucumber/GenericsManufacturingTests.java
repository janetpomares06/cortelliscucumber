package cortelliscucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericsManufacturingTests {
    @Given("I am in Generics and Manufacturing page")
    public void i_am_in_generics_and_manufacturing_page() {
        log.info("I am in Generics and Manufacturing page");

    }
    @When("Scroll down the page and Click on Our Solution link")
    public void scroll_down_the_page_and_click_on_our_solution_link() {
        log.info("Scroll down the page and Click on Our Solution link");

    }
    @Then("Click on Cortellis CMC Intelligence to get Cortellis CMC Intelligence page.")
    public void click_on_cortellis_cmc_intelligence_to_get_cortellis_cmc_intelligence_page() {
        log.info("Click on Cortellis CMC Intelligence to get Cortellis CMC Intelligence page");

    }

}
