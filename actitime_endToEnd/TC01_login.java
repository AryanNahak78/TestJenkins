package actitime_endToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC01_login {

	public WebDriver driver;

	private By userNameTextField=By.xpath("//*[@*='username']");
	private By passwordTextField=By.xpath("//*[@*='Password']");
	private By keepLoggedIn=By.xpath("//*[@*='checkbox']");
	private By logInButton=By.id("loginButton");

	public TC01_login(WebDriver driver) {
		this.driver=driver;
	}

	public void loginExecute() {
		driver.findElement(userNameTextField).sendKeys("aryannahak78@gmail.com");
		driver.findElement(passwordTextField).sendKeys("Aryannahak@2003");
		driver.findElement(keepLoggedIn).click();
		driver.findElement(logInButton).click();
	}
}