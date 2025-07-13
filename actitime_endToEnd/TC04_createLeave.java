package actitime_endToEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC04_createLeave {
	public WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	private By settingIcon=By.xpath("(//*[@*='menu_icon'])[2]");
	private By leaveTypesLink=By.xpath("//*[text()='Leave Types']");	
	private By newTypeLink=By.xpath("//*[text()='New Type']");	
	private By enterNameTextField=By.xpath("//*[@placeholder='Enter name']");	
	private By saveButton=By.xpath("//*[text()='Save']");
	
	public TC04_createLeave(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createLeaveExecute() throws InterruptedException {
		Thread.sleep(2500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(settingIcon));
		driver.findElement(settingIcon).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(leaveTypesLink));
		driver.findElement(leaveTypesLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(newTypeLink));
		driver.findElement(newTypeLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(enterNameTextField));
		driver.findElement(enterNameTextField).sendKeys("Aryan");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
		driver.findElement(saveButton).click();
		
	}
}
