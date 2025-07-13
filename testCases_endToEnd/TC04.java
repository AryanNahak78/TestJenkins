package testCases_endToEnd;

import org.testng.annotations.Test;

import Utility.Actitime_utility;
import actitime_endToEnd.TC01_login;
import actitime_endToEnd.TC04_createLeave;

public class TC04  extends Actitime_utility{

	@Test
	public void createLeave() throws InterruptedException {

		TC01_login login=new TC01_login(driver);
		login.loginExecute();
		
		TC04_createLeave createLeave=new TC04_createLeave(driver);
		createLeave.createLeaveExecute();
		
	}
}
