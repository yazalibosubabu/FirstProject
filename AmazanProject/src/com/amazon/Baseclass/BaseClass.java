package com.amazon.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public static	WebDriver driver;
	@Parameters("browser")
	@BeforeSuite
	public static void script(@Optional("chrome") String browser) {
		
		if(browser.equalsIgnoreCase("firefox")){
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
			else if (browser.equalsIgnoreCase("chrome")){
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\thripura\\Desktop\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
			}
else if (browser.equalsIgnoreCase("ie")){
				
				System.setProperty("webdriver.ie.driver", "C:\\Users\\thripura\\Desktop\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
			}
	}
	@AfterSuite
	public static void closeBrowser() {
		driver.quit();

	}

}
