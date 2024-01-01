package phase2_bdd_cucumber.testrunner;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/features/Login.feature", 
	glue = {"phase2_bdd_cucumber/stepdefinitions"},
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}, tags = "")
public class SmokeLoginTestRunner {

}



