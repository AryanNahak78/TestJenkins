package actitime_endToEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC03_createWork {
	public WebDriver driver;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	private By settingIcon=By.xpath("(//*[@*='menu_icon'])[2]");
	private By typesOfWorkLink=By.xpath("//*[text()='Types of Work']");
	private By newTypeLink=By.xpath("//*[text()='New Type']");
	private By workNameTextField=By.xpath("//*[@id='title']");
	private By saveButton=By.xpath("//*[@type='submit']");

	public TC03_createWork(WebDriver driver) {
		this.driver=driver;
	}
	public void createWorkExecute() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(settingIcon));
		driver.findElement(settingIcon).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(typesOfWorkLink));
		driver.findElement(typesOfWorkLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(newTypeLink));
		driver.findElement(newTypeLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(workNameTextField));
		driver.findElement(workNameTextField).sendKeys("Aryan");
		wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
		driver.findElement(saveButton).click();

	}
}
