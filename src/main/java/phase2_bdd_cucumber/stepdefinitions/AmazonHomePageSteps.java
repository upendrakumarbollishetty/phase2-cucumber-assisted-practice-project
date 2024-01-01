package phase2_bdd_cucumber.stepdefinitions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonHomePageSteps {



	String driverPath ="C:\\Users\\upend\\eclipse-workspace\\phase2-bdd-cucumber\\drivers\\windows\\chromedriver.exe";
	String siteUrl = "https://www.amazon.in/";
	WebDriver driver;
	
	@Given("Open the Chrome and Launch the amazon application")
	public void open_the_chrome_and_launch_the_amazon_application() {
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(siteUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("User on amazon homepage")
	public void user_on_amazon_homepage() {
	    assertEquals(siteUrl, driver.getCurrentUrl());
	}

	private void assertEquals(String siteUrl2, String currentUrl) {
		// TODO Auto-generated method stub
		
	}

	@Then("Verify meta title of the page")
	public void verify_meta_title_of_the_page() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}
	
	@When("Navigate user on dirrent link")
	public void navigate_user_on_dirrent_link() {
		 driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	}

	@Then("Verify meta title of the curent page")
	public void verify_meta_title_of_the_curent_page() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertNotEquals(actualTitle, expectedTitle);
	}

	private void assertNotEquals(String actualTitle, String expectedTitle) {
		// TODO Auto-generated method stub
		
	}
}

