package com.UI.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.CommonFunctions;

import static org.junit.Assert.*;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// elements 
	@FindBy(css="div[class='bot_column']")
	private WebElement logo;
	
	@FindBy(id="user-name")
	private WebElement inputUser;
	
	@FindBy(id="password")
	private WebElement inputPassword;
	@FindBy(id="login-button")
	private WebElement signInButton;
	
	public void verifyLogoDisplayed() {
		assertTrue("Logo is displayed", CommonFunctions.isElementDisplayed(logo));
	}
	public void verifyInputUserTextBoxDisplayed() {
		assertTrue("Logo is displayed", CommonFunctions.isElementDisplayed(inputUser));
	}
	public void verifyPasswordTextBoxDisplayed() {
		assertTrue("Logo is displayed", CommonFunctions.isElementDisplayed(inputPassword));
	}
	public void verifySinginButtonDisplayed() {
		assertFalse("Logo is displayed", CommonFunctions.isElementDisplayed(signInButton));
	}
}
