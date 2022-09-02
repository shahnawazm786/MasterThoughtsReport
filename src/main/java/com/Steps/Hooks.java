package com.Steps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		
	}
	@After
	public void tearup(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			//File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		     FileHandler.copy(source, new File("QED_Page_Screenshot.png"));
			//final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshot,"image/png", "Errors");
			String image=((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			scenario.attach(image,"image/png", "Errors");
			
			
		}
		driver.quit();
	}

}
