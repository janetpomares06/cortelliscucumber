package cortelliscucumber;

import cucumber.api.CucumberOptions;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("cortelliscucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//@CucumberOptions(tags = {"@Step1, @Step2, @Step3, @Step4"})
public class RunCucumberTest {
}
