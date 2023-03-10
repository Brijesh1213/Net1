package test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test(priority =1)
	public void verifyPageTitleTest() throws Throwable {
		test = extent.createTest("verifyPage TitleTest").assignAuthor("Brijesh").assignCategory("Smoke").assignDevice("Windows");
		String title= basePage.getInstancePage(LoginPage.class).getTitle();
		Assert.assertEquals(title, "Netsweeper WebAdmin");//updated
	}
	 
	
	@Test(priority =2)
	public void verifyLogo() {
		test = extent.createTest("verify Logo").assignAuthor("Brijesh").assignCategory("Smoke").assignDevice("Windows");
		basePage.getInstancePage(LoginPage.class).doLogin();
		Assert.assertTrue(basePage.getInstancePage(LoginPage.class).logo());
	}
	

}

	
	
	
	

