package org.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class TestCase {

	WebDriver driver;

	@Given("Open browser and launch the URL")
	public void open_browser_and_launch_the_URL() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\GreensTechnologys\\workspace\\com.cucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com ");
		System.out.println("Given");
		String gTitle = driver.getTitle();
		System.out.println(gTitle);
	}

	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_UserName_and_valid_Password(String email, String pass) {

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("User should be able to login Successfully")
	public void User_should_be_able_to_login_Successfully() {

		driver.findElement(By.id("loginbutton")).click();
		String title = driver.getTitle();
		System.out.println("Then");
		System.out.println(title);
		Assert.assertEquals("Login123456789",title);
		driver.quit();
	}

}
