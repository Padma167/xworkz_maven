package com.xworkz.main;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.xworkz.page.home.HomePage;
import com.xworkz.page.register.RegisterPage;

public class MainMethod {
	public static void main(String[] args)
	{
		int count=0;
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/xworkz-selenium/");
		driver.manage().window().maximize();
		takeScreenShot(driver, count++);
		HomePage homePage = new HomePage(driver);
		homePage.isRegisterLinkDisplayed();
		RegisterPage registerPage = new RegisterPage(driver);
		takeScreenShot(driver, count++);
		registerPage.enterEmailID("padma167@gmail.com");
		takeScreenShot(driver, count++);
		registerPage.enterPassword("password");
		takeScreenShot(driver, count++);
		registerPage.reenterPassword("password");
		takeScreenShot(driver, count++);
		String script = "scrollBy(526,649)";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(script);
		registerPage.selectCourse(4);
		takeScreenShot(driver, count++);
		registerPage.selectGender();
		takeScreenShot(driver, count++);
/*		String script1 = "scrollBy(-526,-649)";
		js.executeScript(script1);
		homePage.isLoginLinkDisplayed(); */
		
		driver.close();
		//driver.quit();
	}
	static void takeScreenShot(WebDriver driver, int i)
	{
		try {
		TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
		String filename = "Test";
		filename=filename+i;
		File screenshotAs = takeScreenShot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, new File("E:\\Screenshot\\"+filename+".jpeg"));
		i++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
