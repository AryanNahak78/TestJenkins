package actitime_endToEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC06_createProject {
	public WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	private By addNewButton=By.xpath("//*[@*='addNewButton']");
	private By newProject=By.xpath("//*[text()='New Project']");
	private By projectNameTextField=By.xpath("(//*[@placeholder='Enter Project Name'])[2]");
	private By dropdownButton=By.xpath("//*[@*='emptySelection']");
	private By dropDownOptionClick=By.xpath("//*[@*='searchItemList']//*[text()='Aryan']");
	private By createProjectButton=By.xpath("//*[text()='Create Project']");

	public TC06_createProject(WebDriver driver) {
		this.driver=driver;
	}

	public void createProjectExecute() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addNewButton));
		driver.findElement(addNewButton).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(newProject));
		driver.findElement(newProject).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(projectNameTextField));
	    driver.findElement(projectNameTextField).sendKeys("AryanProject");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(createProjectButton));
		driver.findElement(createProjectButton).click();
	}
}
