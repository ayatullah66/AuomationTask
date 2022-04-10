package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.ScreenShots;


public class TestBase {

	public static WebDriver driver;


	@BeforeSuite
	public void StartDriver() {

		String chromepath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
	}
	
	
	@AfterSuite
	public void CloseDriver() {
		driver.quit();
	}
	
	
	@AfterMethod
	public void ScreenshotOnFailure(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed!");
			System.out.println("Taking a Screenshot ....");
			ScreenShots.captureScreenShot(driver, result.getName());
		}
	}
	


}
