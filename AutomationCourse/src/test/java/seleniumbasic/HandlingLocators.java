package seleniumbasic;

import org.openqa.selenium.By;

public class HandlingLocators extends Base
{

	public void verifyLocators()
	{
		driver.findElement(By.id("single-input-field"));//locating using ID
		
		driver.findElement(By.className("form-control"));//locating element using classname
		
		driver.findElement(By.tagName("input"));//locating element using tag name
		
		driver.findElement(By.name("viewport"));//locating element using name attribute value
		
		driver.findElement(By.linkText("Radio Buttons Demo"));//locating element using text associated with the test associated with the link
		
		driver.findElement(By.partialLinkText("Radio"));
		
		driver.findElement(By.cssSelector("input[id='single-input-field']"));
		
		// /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button--this is the absolute xpath for show message button
		//Absolute xpath select the root to the element.
		//if any value change in between the buton element the absolute xpath will be incorrect for the button show message.That's why we are not usig Absolute xpath
		
		//Relative Xpath--//tagname[@attributename='attributevalue']
		
		
	}
	public static void main(String[] args) 
	{
	

	}

}
