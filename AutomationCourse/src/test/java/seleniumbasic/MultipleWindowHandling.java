package seleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base
{
	
public void verifyMultipleWindow()
{
	driver.navigate().to("https://demo.guru99.com/popup.php");
	String firstwindow=driver.getWindowHandle();
	WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
	clickhere.click();
	Set <String> handleid=driver.getWindowHandles();
	Iterator<String> it=handleid.iterator();
	while (it.hasNext())
		{
		 		String currentid=it.next();
		 		if(!currentid.equals(firstwindow))
		 				{
		 					driver.switchTo().window(currentid);
		 					WebElement emailid=driver.findElement(By.name("emailid"));
		 					emailid.sendKeys("nila@gmail.com");
		 					WebElement button=driver.findElement(By.name("btnLogin"));
		 					button.click();
		 
		 				}
		
		}
	
}

	public static void main(String[] args) 
	{
		MultipleWindowHandling multiwindow=new MultipleWindowHandling();
		multiwindow.browserLaunch();
		multiwindow.verifyMultipleWindow();
			

	}

}
