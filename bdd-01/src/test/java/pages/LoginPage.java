package pages;

// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageFactory.LoginPageFactory;

public class LoginPage {
    protected WebDriver driver;

	// private By txt_username = By.id("username");
	// private By txt_password = By.id("password");
	// private By btn_login = By.cssSelector("button[type='submit']");
	// private By btn_logout = By.cssSelector("a[href='/logout']");
	
    LoginPageFactory loginPageFactory = null;
	
	public LoginPage(WebDriver driver) {
	
        this.driver = driver;
        loginPageFactory = new LoginPageFactory(driver);
		
		// if(!driver.getTitle().equals("Login form page for Automation Testing Practice")) {
			
		// 	throw new IllegalStateException("This is not Login Page. The Current page is "
		// 	+driver.getCurrentUrl());
		// }
	}
	
	
	public void enterUsername(String username) {
        // driver.findElement(txt_username).sendKeys(username);
        loginPageFactory.getUsername().sendKeys(username);
	}
	
	public void enterPassword(String password) {
        // driver.findElement(txt_password).sendKeys(password);
        loginPageFactory.getPassword().sendKeys(password);
	}
	
	public void clickLogin() {
        // driver.findElement(btn_login).click();
        loginPageFactory.getLogin().click();
	}
	
    public void checkLogOutIsDisplayed() {
        // driver.findElement(btn_logout).isDisplayed();
        loginPageFactory.getLogout().isDisplayed();
    }
    
    public void clickLogOutIsDisplayed() {
        // driver.findElement(btn_logout).click();
        loginPageFactory.getLogout().click();
        
	}
	
	public void loginValidUser(String username, String password) {
		// driver.findElement(txt_username).sendKeys(username);
		// driver.findElement(txt_password).sendKeys(password);
        // driver.findElement(btn_login).click();
        
        loginPageFactory.getUsername().sendKeys(username);
		loginPageFactory.getPassword().sendKeys(password);
		loginPageFactory.getLogin().click();
	}    
}
