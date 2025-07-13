package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Actitime_utility
{
	public WebDriver driver=new ChromeDriver();

	@BeforeClass()
	public void login() {
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/hello1/login.do");
		
	}

	@AfterClass()
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
//		TC01_logOut logout=new TC01_logOut(driver);
//		logout.logOutExecute();
		driver.quit();
	}
	
}
