package phase2_bdd_cucumber.testrunner;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/features", 
	glue = {"phase2_bdd_cucumber/stepdefinitions"}, tags = "", plugin = { "" })
public class TestRunner { }



