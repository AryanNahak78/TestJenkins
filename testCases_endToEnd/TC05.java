package testCases_endToEnd;

import org.testng.annotations.Test;

import Utility.Actitime_utility;
import actitime_endToEnd.TC01_login;
import actitime_endToEnd.TC05_createCustomer;

public class TC05 extends Actitime_utility{

	@Test
	public void createCustomer() {
	
		TC01_login login=new TC01_login(driver);
		login.loginExecute();

		TC05_createCustomer createCustomer=new TC05_createCustomer(driver);
		createCustomer.createCustomerExecute();

	}
}
