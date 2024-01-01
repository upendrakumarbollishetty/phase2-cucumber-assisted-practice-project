package phase2_bdd_cucumber.testrunner;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/features/tags-ex.feature", 
	glue = {"phase2_bdd_cucumber/stepdefinitions"},
	tags = "not @SmokeTest and @RegressionTest"
	// tags = "not @SmokeTest or @RegressionTest"
	// tags = "not @SmokeTest and not @RegressionTest"
, plugin = { "" }
)
public class SmokeTestRunner {

}



