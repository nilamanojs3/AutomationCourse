package testscript;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasic.TestNGBase;
import utilities.ExcelUtilities;

public class LoginTest extends TestNGBase
{
	@Test
	public void verifyUserLoginwithValidCredentials() throws IOException
	{
		//WebElement usernamefield=driver.findElement(By.id("user-name"));
		//usernamefield.sendKeys("standard_user");
		
		//WebElement passwordfield=driver.findElement(By.id("password"));
		//passwordfield.sendKeys("secret_sauce");
		
		//WebElement submitbutton=driver.findElement(By.id("login-button"));
		//submitbutton.click();
		String usrname=ExcelUtilities.readStringData(0, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(0, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usrname);
		login.enterPasswordOnPasswordField(password);
		login.clickSubmitButton();
	}
	
	@Test
	public void verifyUserLoginwithValidUsernameandInvalidpassword() throws IOException
	{
		String usrname=ExcelUtilities.readStringData(1, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usrname);
		login.enterPasswordOnPasswordField(password);
		login.clickSubmitButton();
	}
	
	@Test
	public void verifyUserLoginwithInvalidUsernameandValidpassword() throws IOException
	{
		String usrname=ExcelUtilities.readStringData(1, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(2, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usrname);
		login.enterPasswordOnPasswordField(password);
		login.clickSubmitButton();
	}
	
	@Test
	public void verifyUserLoginwithInvalidUsernameandInvalidpassword() throws IOException
	{
		String usrname=ExcelUtilities.readStringData(3, 0,"LoginPage");
		String password=ExcelUtilities.readStringData(3, 1, "LoginPage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUsernameField(usrname);
		login.enterPasswordOnPasswordField(password);
		login.clickSubmitButton();
	}
	
	
}
