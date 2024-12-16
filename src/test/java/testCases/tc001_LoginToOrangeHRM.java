package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class tc001_LoginToOrangeHRM extends BaseClass{
	
	@Test
	public void Verify_login_to_OrangeHRM() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.login();
		Assert.assertEquals("Dashboard", "Dashboard");	
	}
	
	
}
