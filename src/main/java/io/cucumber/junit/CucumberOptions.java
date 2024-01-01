package io.cucumber.junit;

public @interface CucumberOptions {

	String[] glue();

	String features();

	String tags();

	String[] plugin();

}
