package LearntestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screencapture {
	WebDriver driver;
	public static void main(String[] args)throws IOException {
		ChromeOptions qa= new ChromeOptions();
		qa.addArguments("--remote-allow-origins=*");
		qa.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(qa);
		driver.get("https://www.amazon.in/");

		// screen capture

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\Jaya Prakash\\Desktop\\Online java class\\Selenium\\Screenshots java\\p1.png");		
		FileHandler.copy(scrFile, dest);

		// Element capture 

		WebElement signin = driver.findElement(By.id("gw-sign-in-button"));
		File scrFile1 = signin.getScreenshotAs(OutputType.FILE);
		File dest2 = new File ("C:\\Users\\Jaya Prakash\\Desktop\\Online java class\\Selenium\\Screenshots java\\p2.png");		
		FileHandler.copy(scrFile1, dest2);

		// logo capture 


		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		File scrFile11 = logo.getScreenshotAs(OutputType.FILE);
		File dest1= new File ("C:\\Users\\Jaya Prakash\\Desktop\\Online java class\\Selenium\\Screenshots java\\logo.png");		
		FileHandler.copy(scrFile11, dest1);

		
		driver.quit();


	}

}
