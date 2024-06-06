package steps;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver = null;
	LoginPage loginPage = new LoginPage(driver);
	

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
				
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		
		driver.manage()
				.timeouts()
				.implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage()
				.timeouts()
				.pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://practice.expandtesting.com/login");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		// driver.findElement(By.id("username")).sendKeys(username);
		// driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		loginPage.clickLogin();
		// driver.findElement(By.cssSelector("button[type='submit']")).click();
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {

		loginPage.checkLogOutIsDisplayed();
		loginPage.clickLogOutIsDisplayed();
		// driver.findElement(By.cssSelector("a[href='/logout']")).click();;
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}


}