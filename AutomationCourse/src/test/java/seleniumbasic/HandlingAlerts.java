package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base
{
    public void verifySimpleAlert()
    {
    	 driver.navigate().to("https://demoqa.com/alerts");
    	 WebElement simplealert=driver.findElement(By.id("alertButton"));
    	 simplealert.click();
    	 Alert al=driver.switchTo().alert();//Alert is an interface,switchTo method is using to jump to the pop up page
    	 al.accept();//to click okay using accept() method
    }
    
    public void verifyConfirmAlert()
    {
    	driver.navigate().to("https://demoqa.com/alerts");
    	WebElement confirmalert=driver.findElement(By.id("confirmButton"));
    	confirmalert.click();
    	Alert al=driver.switchTo().alert();
    	al.dismiss();
    	
    }
    
    public void verifyPromptAlert()
    {
    	driver.navigate().to("https://demoqa.com/alerts");
    	WebElement promptalert=driver.findElement(By.id("promtButton"));
    	promptalert.click();
    	Alert al=driver.switchTo().alert();
    	al.sendKeys("Nila");
    	al.accept();
    	
    }
	public static void main(String[] args) 
	{
		HandlingAlerts alert=new HandlingAlerts();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();

	}

}
