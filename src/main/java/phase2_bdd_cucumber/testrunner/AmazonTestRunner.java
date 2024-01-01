package phase2_bdd_cucumber.testrunner;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/features/amazon-product-search2.feature", 
	glue = {"phase2_bdd_cucumber/stepdefinitions"},
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags = "")
public class AmazonTestRunner {

}



