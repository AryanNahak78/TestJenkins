package testCases_endToEnd;

import org.testng.annotations.Test;

import Utility.Actitime_utility;
import actitime_endToEnd.TC01_login;
import actitime_endToEnd.TC02_createUser;

public class TC02  extends Actitime_utility {

	@Test
	public void createUser() throws InterruptedException {
	
		TC01_login TC01_login=new TC01_login(driver);
		TC01_login.loginExecute();
		
		TC02_createUser tc02_createUser=new TC02_createUser(driver);
		tc02_createUser.createUserExecute();
		
	}
}
