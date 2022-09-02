package com.Steps;

import org.openqa.selenium.WebDriver;

import com.UI.Page.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageSteps {

	WebDriver driver=Hooks.driver;
	HomePage homePage=new HomePage(driver);
	@Given("veify the logo on home page")
	public void veify_the_logo_on_home_page() {
		System.out.println("Logo");
		homePage.verifyLogoDisplayed();
	}

	@Given("verify the user input text on home page")
	public void verify_the_user_input_text_on_home_page() {
		System.out.println("input");
		homePage.verifyInputUserTextBoxDisplayed();
	}

	@And("verify the user password text on home page")
	public void verify_the_user_password_text_on_home_page() {
		System.out.println("Password");
		homePage.verifyPasswordTextBoxDisplayed();
	}

	@Given("verify the login button on home page")
	public void verify_the_login_button_on_home_page() {
		System.out.println("Signin");
		homePage.verifySinginButtonDisplayed();
	}
}
