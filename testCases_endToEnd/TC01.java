package testCases_endToEnd;

import org.testng.annotations.Test;

import Utility.Actitime_utility;
import actitime_endToEnd.TC01_login;


public class TC01 extends Actitime_utility {

@Test
public void logIn() {
	
	TC01_login TC01_login=new TC01_login(driver);
	TC01_login.loginExecute();
	
}

}
