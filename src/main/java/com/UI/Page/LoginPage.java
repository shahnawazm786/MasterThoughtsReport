package com.UI.Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Elements
	@FindBy(id="user-name")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Products']")
	private WebElement dashboardSpan;
	// Methods
	public void enterUserName(String username) {
		txtUserName.sendKeys(username);
	}

	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void verifyLoginSuccssful() {
		assertTrue(dashboardSpan.isDisplayed());
	}
}
