package testCases_endToEnd;

import org.testng.annotations.Test;

import Utility.Actitime_utility;
import actitime_endToEnd.TC01_login;
import actitime_endToEnd.TC03_createWork;

public class TC03 extends Actitime_utility {

	@Test
	public void createWork() throws InterruptedException {

		TC01_login login=new TC01_login(driver);
		login.loginExecute();
		
		TC03_createWork createWork=new TC03_createWork(driver);
		createWork.createWorkExecute();
		
	}
}
