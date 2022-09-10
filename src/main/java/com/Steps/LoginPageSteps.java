package com.Steps;

import org.openqa.selenium.WebDriver;

import com.UI.Page.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	WebDriver driver=Hooks.driver;
	LoginPage loginPage=new LoginPage(driver);
	
	@Given("user enter user name {string}")
	public void user_enter_user_name(String username) {
		loginPage.enterUserName(username);
	}
	@And("user enter password {string}")
	public void user_enter_password(String pass) {
		loginPage.enterPassword(pass);
	}
	@When("user click on signin button")
	public void  user_click_on_signin_button() {
		loginPage.clickOnLoginButton();
	}
	@Then("user can login successfully")
	public void user_can_login_successfully() {
		loginPage.verifyLoginSuccssful();
	}
	
}
