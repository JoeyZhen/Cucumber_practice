package com.edureka.cucumber_selenium;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
	
	WebDriver driver;
	
	@Before
	public void setupBrowser()
	{
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currDir + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	
	@Given("I am on the login page")
	public void navigateToBaseUrl() {
		
		driver.navigate().to("https://www.facebook.com/");
	    
	}
	@When("I enter {string} and {string}")
	public void login(String username, String password) {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		email.clear();
		email.sendKeys(username);
		pass.clear();
		pass.sendKeys(password);
		
	    
	}
	@Then("I should login successfully")
	public void successfulLogin() {
		
		System.out.println("Logged in successfully");
	   
	}

}
