package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base
{

	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//Navigate to the INPUT FORM page 
		
		//WebElement is a pre defined interface like WebDriver
		WebElement messagebox=driver.findElement(By.id("single-input-field"));//locating the webelement MESSAGEBOX we created a webelement and assigned in a variable messagebox
		
		//WebElement Command-sendKeys()-to send values to text box
		messagebox.sendKeys("test message");
		
		//click()
		WebElement showbutton=driver.findElement(By.id("button-one"));//locating SHOW MESSAGE button using ID
		showbutton.click();
		
		//getText()-to fetch a text from the webpage
		WebElement yourmessage=driver.findElement(By.id("message-one"));//locating YOUR MESSAGE element using ID
		System.out.println(yourmessage.getText());//print the fetched text
		
		//clear()--to create the element from a text box
		messagebox.clear();
		
		
	}
	public static void main(String[] args) 
	{
	   HandlingWebElementCommands commands=new HandlingWebElementCommands();
	   commands.browserLaunch();
	   commands.verifyWebElement();

	}

}
