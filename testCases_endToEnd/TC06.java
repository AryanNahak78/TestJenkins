package testCases_endToEnd;

import org.testng.annotations.Test;

import Utility.Actitime_utility;
import actitime_endToEnd.TC01_login;
import actitime_endToEnd.TC06_createProject;

public class TC06 extends Actitime_utility {

	@Test
	public void createProject() throws InterruptedException {
		
		TC01_login login=new TC01_login(driver);
		login.loginExecute();
	
		TC06_createProject createProject=new TC06_createProject(driver);
		createProject.createProjectExecute();
		
	}
}
