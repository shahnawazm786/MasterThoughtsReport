package com.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
	public static boolean isElementDisplayed(WebElement element) {
		if(element.isDisplayed())
			return true;
		else
			return false;
	}
	public static boolean isElementDisplayed(WebDriver driver,By locator) {
		WebElement element=driver.findElement(locator);
		if(element.isDisplayed())
			return true;
		else
			return false;
	}
	

}
