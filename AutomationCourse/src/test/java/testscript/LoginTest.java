package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import seleniumbasic.TestNGBase;

public class LoginTest extends TestNGBase
{
	@Test
	public void verifyUserLoginwithValidCredentials()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		
		WebElement submitbutton=driver.findElement(By.id("login-button"));
		submitbutton.click();
	}
	
	@Test
	public void verifyUserLoginwithValidUsernameandInvalidpassword()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_");
		
		WebElement submitbutton=driver.findElement(By.id("login-button"));
		submitbutton.click();
	}
	
	@Test
	public void verifyUserLoginwithInvalidUsernameandValidpassword()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard");
		
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		
		WebElement submitbutton=driver.findElement(By.id("login-button"));
		submitbutton.click();
	}
	
	@Test
	public void verifyUserLoginwithInvalidUsernameandInvalidpassword()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_");
		
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_");
		
		WebElement submitbutton=driver.findElement(By.id("login-button"));
		submitbutton.click();
	}
	
	
}
