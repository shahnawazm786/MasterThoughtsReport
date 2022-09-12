package com.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	static WebDriverWait wait;
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
	
	public static void isElementClickable(WebDriver driver,WebElement element,long timeout)
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.pollingEvery(Duration.ofMillis(500)).until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void isElementVisibile(WebDriver driver,WebElement element,long timeout) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.pollingEvery(Duration.ofMillis(500)).until(ExpectedConditions.invisibilityOf(element));
	}

}
