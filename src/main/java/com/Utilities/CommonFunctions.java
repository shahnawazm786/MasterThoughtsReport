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
	public static boolean isElementVisibile(WebDriver driver,WebElement element,long timeout) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.pollingEvery(Duration.ofMillis(500)).until(ExpectedConditions.invisibilityOf(element));
		
	}
	public static void enterText(WebDriver driver,By locator,long timeout,String text) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
		
	}
	public static void enterText(WebDriver driver,By locator,String text) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
		
	}
	
	
	public static WebElement presenceOfElementLocated(WebDriver driver,By locator,long timeout) {
		return new WebDriverWait(driver,Duration.ofSeconds(timeout))
		.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver) {
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	}
	public static void frameToBeAvailableAndSwitchToIt(WebDriver driver,int index) {
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
}
