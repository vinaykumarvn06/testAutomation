package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class utilclass {
	public static WebDriver driver;
	public static Scenario scenario;
	public utilclass(WebDriver driver)
	{
		this.driver = driver;
		
	}
public static void takeScreenShot() {
		
		
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);		
		 scenario.embed(screenshot, "image/png");;
	}
}
