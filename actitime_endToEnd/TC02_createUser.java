package actitime_endToEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC02_createUser {
	public WebDriver driver;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	private By userLink= By.xpath("//*[@class='navItem preventPanelsHiding navCell relative notSelected']//*[text()='Users']/..");
	private By newUserButton=By.xpath("//*[text()='New User']");
	private By firstNameTextField=By.xpath("//*[@id='createUserPanel_firstNameField']");
	private By lastNameTextField=By.xpath("//*[@*='createUserPanel_lastNameField']");
	private By emailTextField=By.xpath("//*[@*='createUserPanel_emailField']");
	private By saveButton=By.xpath("//*[text()='Save & Send Invitation']");
	private By closeButton=By.xpath("//*[@class='closeLink']//*[text()='Close'])[1]");

	public TC02_createUser(WebDriver driver) {
		this.driver=driver;
	}

	public void createUserExecute() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(userLink));
		driver.findElement(userLink).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(newUserButton));
		driver.findElement(newUserButton).click();
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameTextField));
		driver.findElement(firstNameTextField).sendKeys("Aryan");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameTextField));
		driver.findElement(lastNameTextField).sendKeys("Nahak");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextField));
		driver.findElement(emailTextField).sendKeys("aryannahak78@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
		driver.findElement(saveButton).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(closeButton));
		driver.findElement(closeButton).click();
	}
}
