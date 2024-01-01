package phase2_bdd_cucumber.testrunner;

public @interface CucumberOptions {

	String[] glue();

	String features();

}
