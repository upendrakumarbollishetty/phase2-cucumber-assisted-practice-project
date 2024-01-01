package phase2_bdd_cucumber.testrunner;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/features/Login.feature", 
	glue = {"phase2_bdd_cucumber/stepdefinitions"}, plugin = { "" }, tags = "")
public class LoginTestRunner {

}



