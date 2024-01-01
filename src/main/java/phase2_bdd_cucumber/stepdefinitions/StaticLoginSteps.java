package phase2_bdd_cucumber.stepdefinitions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticLoginSteps {

	String driverPath ="C:\\Users\\upend\\eclipse-workspace\\phase2-bdd-cucumber\\drivers\\windows\\chromedriver.exe";
	String siteUrl ="file:///C:\\Users\\upend\\eclipse-workspace\\phase2-bdd-cucumber\\src\\main\\resource\\login.html";
	WebDriver driver;
	
	@Given("^Open the Chrome and Launch the test application$")
	public void open_the_chrome_and_launch_the_test_application() {
		
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(siteUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@Given("^Maximize the browser window$")
	public void maximize_the_browser_window() {
		driver.manage().window().maximize();
	}

	@When("^Enter the username and password$")
	public void enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("password")).sendKeys("john@123");
	}

	@Then("^Click on submit button$")
	public void click_on_submit_button() {
		driver.findElement(By.name("Login")).submit();
	}

	@Then("^User Navigatted to successful login$")
	public void user_navigatted_to_successful_login() {
		WebElement sreponse = driver.findElement(By.id("sreponse"));
		assertEquals(sreponse.getText(), "Successful login");
	}

	private void assertEquals(String text, String string) {
		// TODO Auto-generated method stub
		
	}
}



